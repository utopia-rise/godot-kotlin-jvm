package godot.runtime

import godot.core.CONSTRUCTOR_MAX_ARGS
import godot.core.KtClass
import godot.core.KtConstructor
import godot.core.KtEnumProperty
import godot.core.KtFunction
import godot.core.KtFunction0
import godot.core.KtFunction1
import godot.core.KtFunction2
import godot.core.KtFunction3
import godot.core.KtFunction4
import godot.core.KtFunction5
import godot.core.KtFunctionInfo
import godot.core.KtObject
import godot.core.KtProperty
import godot.core.KtPropertyInfo
import godot.core.KtSignalInfo
import godot.core.PropertyHint
import godot.core.TypeManager
import godot.core.VariantType
import godot.util.camelToSnakeCase
import kotlin.reflect.KClass
import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4
import kotlin.reflect.KFunction5
import kotlin.reflect.KFunction6
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty

@Suppress("UNCHECKED_CAST")
class KtPropertyInfoBuilderDsl {
    var type: VariantType? = null
    var name: String = ""
    var className: String? = null
    var hint: PropertyHint = PropertyHint.NONE
    var hintString: String = ""
    var rpcModeId: Int = 0

    internal fun build() = KtPropertyInfo(checkNotNull(type), name, checkNotNull(className), hint, hintString, rpcModeId)
}

data class KtFunctionArgument(
    val type: VariantType,
    val className: String,
    val name: String = "" //empty for return type
) {
    internal fun toKtPropertyInfo() = KtPropertyInfo(
        type,
        name,
        className,
        PropertyHint.NONE,
        "", //always empty. Only used for properties
    0 // always RPCMode.DISABLED. Only used for properties
    )
}


class ClassBuilderDsl<T : KtObject>(
    @PublishedApi internal val name: String,
    private val registeredName: String,
    private val superClass: String,
    private val baseGodotClass: String
) {
    private val constructors = mutableMapOf<Int, KtConstructor<T>>()

    private val functions = mutableMapOf<String, KtFunction<T, *>>()

    @PublishedApi
    internal val properties = mutableMapOf<String, KtProperty<T, *>>()

    private val signals = mutableMapOf<String, KtSignalInfo>()

    fun constructor(constructor: KtConstructor<T>) {
        require(!constructors.containsKey(constructor.parameterCount)) {
            "A constructor with ${constructor.parameterCount} argument(s) already exists."
        }
        require(constructor.parameterCount <= CONSTRUCTOR_MAX_ARGS) {
            "Cannot register a constructor with ${constructor.parameterCount} arguments, max argument count is $CONSTRUCTOR_MAX_ARGS"
        }
        constructors[constructor.parameterCount] = constructor
    }

    fun <P : Any?> property(
        kProperty: KMutableProperty1<T, P>,
        variantType: VariantType,
        type: VariantType,
        className: String,
        hint: PropertyHint = PropertyHint.NONE,
        hintString: String = "",
        defaultArgument: () -> P?,
        rpcModeId: Int = 0,
        isRef: Boolean = false
    ) {
        val propertyName = kProperty.name.camelToSnakeCase()
        require(!properties.contains(propertyName)) {
            "Found two properties with name $propertyName for class $name"
        }
        properties[propertyName] = KtProperty(
            KtPropertyInfo(
                type,
                propertyName,
                className,
                hint,
                hintString,
                rpcModeId
            ),
            kProperty,
            variantType,
            defaultArgument,
            isRef
        )
    }

    inline fun <reified P : Enum<P>> enumProperty(
        kProperty: KMutableProperty1<T, P>,
        noinline defaultValue: () -> P,
        rpcModeId: Int = 0
    ) {
        val propertyName = kProperty.name.camelToSnakeCase()
        require(!properties.contains(propertyName)) {
            "Found two properties with name $propertyName for class $name"
        }

        properties[propertyName] = KtEnumProperty(
            KtPropertyInfo(
                VariantType.LONG,
                propertyName,
                "Int",
                PropertyHint.ENUM,
                enumValues<P>().joinToString { it.name },
                rpcModeId
            ),
            kProperty,
            //TODO change when nullable enum are here.
            defaultValue,
            { enum: P? -> enum?.ordinal ?: 1 },
            { i -> enumValues<P>()[i] }
        )
    }

    //TODO: uncomment and fixup once collections are supported in KtVariant
//    inline fun <reified P : Enum<P>> enumListProperty(
//        kProperty: KMutableProperty1<T, Collection<P>>
//    ) {
//        val propertyName = kProperty.name.camelToSnakeCase()
//        require(!properties.contains(propertyName)) {
//            "Found two properties with name $propertyName for class $name"
//        }
//
//        properties[propertyName] = KtProperty(
//            KtPropertyInfo(
//                VariantType.LONG,
//                propertyName,
//                "Int",
//                PropertyHint.ENUM,
//                "2/3:${enumValues<P>().joinToString(",") { it.name }}" //2 = VariantType.LONG.ordinal | 3 = PropertyHint.ENUM.ordinal
//            ),
//            kProperty,
//            { enumList ->
//                KtVariant(enumList.map { it.ordinal } as Collection)
//            },
//            { ktVariant -> enumValues<P>()[ktVariant.asInt()] }
//        )
//    }

    @JvmName("enumFlagPropertyMutable")
    @Suppress("UNCHECKED_CAST")
    inline fun <reified P : Enum<P>> enumFlagProperty(
        kProperty: KMutableProperty1<T, MutableSet<P>>,
        noinline defaultValue: () -> MutableSet<P>,
        rpcModeId: Int
    ) = enumFlagProperty(kProperty as KMutableProperty1<T, Set<P>>, defaultValue, rpcModeId)

    inline fun <reified P : Enum<P>> enumFlagProperty(
        kProperty: KMutableProperty1<T, Set<P>>,
        noinline defaultValue: () -> Set<P>,
        rpcModeId: Int
    ) {
        val propertyName = kProperty.name.camelToSnakeCase()
        require(!properties.contains(propertyName)) {
            "Found two properties with name $propertyName for class $name"
        }

        properties[propertyName] = KtEnumProperty(
            KtPropertyInfo(
                    VariantType.LONG,
                propertyName,
                "Int",
                PropertyHint.FLAGS,
                enumValues<P>().joinToString { it.name },
                rpcModeId
            ),
            kProperty,
            //TODO : Change when null default values are supported
            defaultValue,
            { enumSet ->
                var intFlag = 0
                enumSet?.forEach { enum ->
                    intFlag += 1 shl enum.ordinal
                }
                intFlag
            },
            { value ->
                val intFlag = (value as P).ordinal

                val enums = mutableSetOf<P>()
                var bit = 1

                for (i in 0 until Int.SIZE_BITS) {
                    if ((intFlag and bit) > 0) {
                        val element = enumValues<P>().firstOrNull { it.ordinal == i }
                        if (element != null) {
                            enums.add(element)
                        }
                    }
                    bit = bit shl 1
                    if (bit > intFlag) break
                }

                enums
            }
        )
    }

    fun <P: Any?> property(
        kProperty: KMutableProperty1<T, P>,
        variantType: VariantType,
        isRef: Boolean = false,
        defaultArgument: () -> P,
        rpcModeId: Int = 0,
        pib: KtPropertyInfoBuilderDsl.() -> Unit
    ) {
        val builder = KtPropertyInfoBuilderDsl()
        builder.name = kProperty.name.camelToSnakeCase()
        builder.rpcModeId = rpcModeId
        builder.pib()
        val property = builder.build()
        require(!properties.contains(property.name)) {
            "Found two properties with name ${property.name} for class $name"
        }
        properties[property.name] = KtProperty(property, kProperty, variantType, defaultArgument, isRef)
    }

    fun <R: Any?> function(
        func: KFunction1<T, R>,
        variantType: VariantType,
        returnType: KtFunctionArgument,
        rpcModeId: Int = 0
    ) {
        appendFunction(
            KtFunction0(
                KtFunctionInfo(
                    func.name.camelToSnakeCase(),
                    listOf(),
                    KtPropertyInfo(
                        returnType.type,
                        "",
                        returnType.className,
                        PropertyHint.NONE,
                        "",
                        0 // always RPCMode.DISABLED. Only used for properties
                    ),
                    rpcModeId
                ),
                func,
                variantType
            )
        )
    }

    fun <R: Any?> function(
        func: KFunction1<T, R>,
        variantType: VariantType,
        returns: KtPropertyInfoBuilderDsl.() -> Unit,
        rpcModeId: Int = 0
    ) {
        val returnBuilder = KtPropertyInfoBuilderDsl()
        returnBuilder.returns()
        appendFunction(
            KtFunction0(
                KtFunctionInfo(func.name.camelToSnakeCase(), listOf(), returnBuilder.build(), rpcModeId),
                func,
                variantType
            )
        )
    }

    fun <P0, R: Any?> function(
        func: KFunction2<T, P0, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p0: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcModeId: Int = 0
    ) {
        appendFunction(
            KtFunction1(
                KtFunctionInfo(
                    func.name.camelToSnakeCase(),
                    listOf(
                        p0.toKtPropertyInfo()
                    ),
                    returnType.toKtPropertyInfo(),
                    rpcModeId
                ),
                func,
                variantType,
                p0Type
            )
        )
    }

    fun <P0, R: Any?> function(
        func: KFunction2<T, P0, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        arg: KtPropertyInfoBuilderDsl.() -> Unit,
        returns: KtPropertyInfoBuilderDsl.() -> Unit,
        rpcModeId: Int = 0
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, arg)
        appendFunction(
            KtFunction1(
                KtFunctionInfo(func.name.camelToSnakeCase(), arguments, returnType, rpcModeId),
                func,
                variantType,
                p0Type
            )
        )
    }

    fun <P0, P1, R: Any?> function(
        func: KFunction3<T, P0, P1, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcModeId: Int = 0
    ) {
        appendFunction(
            KtFunction2(
                KtFunctionInfo(
                    func.name.camelToSnakeCase(),
                    listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                    ),
                    returnType.toKtPropertyInfo(),
                    rpcModeId
                ),
                func,
                variantType,
                p0Type,
                p1Type
            )
        )
    }

    fun <P0, P1, R: Any?> function(
        func: KFunction3<T, P0, P1, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
        returns: KtPropertyInfoBuilderDsl.() -> Unit,
        rpcModeId: Int = 0
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 2) {
            "Function ${func.name.camelToSnakeCase()} should have 2 arguments, found ${args.size}"
        }
        appendFunction(
            KtFunction2(
                KtFunctionInfo(func.name.camelToSnakeCase(), arguments, returnType, rpcModeId),
                func,
                variantType,
                p0Type,
                p1Type
            )
        )
    }

    fun <P0, P1, P2, R: Any?> function(
        func: KFunction4<T, P0, P1, P2, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        p2Type: Pair<VariantType, Boolean>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcModeId: Int = 0
    ) {
        appendFunction(
            KtFunction3(
                KtFunctionInfo(
                    func.name.camelToSnakeCase(),
                    listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                    ),
                    returnType.toKtPropertyInfo(),
                    rpcModeId
                ),
                func,
                variantType,
                p0Type,
                p1Type,
                p2Type
            )
        )
    }

    fun <P0, P1, P2, R: Any?> function(
        func: KFunction4<T, P0, P1, P2, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        p2Type: Pair<VariantType, Boolean>,
        args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
        returns: KtPropertyInfoBuilderDsl.() -> Unit,
        rpcModeId: Int = 0
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 3) {
            "Function ${func.name.camelToSnakeCase()} should have 3 arguments, found ${args.size}"
        }
        appendFunction(
            KtFunction3(
                KtFunctionInfo(func.name.camelToSnakeCase(), arguments, returnType, rpcModeId),
                func,
                variantType,
                p0Type,
                p1Type,
                p2Type
            )
        )
    }

    fun <P0, P1, P2, P3, R: Any?> function(
        func: KFunction5<T, P0, P1, P2, P3, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        p2Type: Pair<VariantType, Boolean>,
        p3Type: Pair<VariantType, Boolean>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcModeId: Int = 0
    ) {
        appendFunction(
            KtFunction4(
                KtFunctionInfo(
                    func.name.camelToSnakeCase(),
                    listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                    ),
                    returnType.toKtPropertyInfo(),
                    rpcModeId
                ),
                func,
                variantType,
                p0Type,
                p1Type,
                p2Type,
                p3Type
            )
        )
    }

    fun <P0, P1, P2, P3, R: Any?> function(
        func: KFunction5<T, P0, P1, P2, P3, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        p2Type: Pair<VariantType, Boolean>,
        p3Type: Pair<VariantType, Boolean>,
        args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
        returns: KtPropertyInfoBuilderDsl.() -> Unit,
        rpcModeId: Int = 0
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 4) {
            "Function ${func.name.camelToSnakeCase()} should have 4 arguments, found ${args.size}"
        }
        appendFunction(
            KtFunction4(
                KtFunctionInfo(func.name.camelToSnakeCase(), arguments, returnType, rpcModeId),
                func,
                variantType,
                p0Type,
                p1Type,
                p2Type,
                p3Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, R: Any?> function(
        func: KFunction6<T, P0, P1, P2, P3, P4, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        p2Type: Pair<VariantType, Boolean>,
        p3Type: Pair<VariantType, Boolean>,
        p4Type: Pair<VariantType, Boolean>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcModeId: Int = 0
    ) {
        appendFunction(
            KtFunction5(
                KtFunctionInfo(
                    func.name.camelToSnakeCase(),
                    listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo()
                    ),
                    returnType.toKtPropertyInfo(),
                    rpcModeId
                ),
                func,
                variantType,
                p0Type,
                p1Type,
                p2Type,
                p3Type,
                p4Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, R: Any?> function(
        func: KFunction6<T, P0, P1, P2, P3, P4, R>,
        variantType: VariantType,
        p0Type: Pair<VariantType, Boolean>,
        p1Type: Pair<VariantType, Boolean>,
        p2Type: Pair<VariantType, Boolean>,
        p3Type: Pair<VariantType, Boolean>,
        p4Type: Pair<VariantType, Boolean>,
        args: Array<KtPropertyInfoBuilderDsl.() -> Unit>,
        returns: KtPropertyInfoBuilderDsl.() -> Unit,
        rpcModeId: Int = 0
    ) {
        val (arguments, returnType) = argumentsAndReturnType(returns, *args)
        require(args.size == 5) {
            "Function ${func.name.camelToSnakeCase()} should have 5 arguments, found ${args.size}"
        }
        appendFunction(
            KtFunction5(
                KtFunctionInfo(func.name.camelToSnakeCase(), arguments, returnType, rpcModeId),
                func,
                variantType,
                p0Type,
                p1Type,
                p2Type,
                p3Type,
                p4Type
            )
        )
    }

    fun <T> signal(kProperty: KProperty<T>) {
        appendSignal(
            KtSignalInfo(kProperty.name.removePrefix("signal").camelToSnakeCase(), listOf())
        )
    }

    fun <T> signal(
        kProperty: KProperty<T>,
        p0: KtFunctionArgument
    ) {
        appendSignal(
            KtSignalInfo(
                kProperty.name.removePrefix("signal").camelToSnakeCase(),
                listOf(
                    p0.toKtPropertyInfo()
                )
            )
        )
    }

    fun <T> signal(
        kProperty: KProperty<T>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument
    ) {
        appendSignal(
            KtSignalInfo(
                kProperty.name.removePrefix("signal").camelToSnakeCase(),
                listOf(
                    p0.toKtPropertyInfo(),
                    p1.toKtPropertyInfo()
                )
            )
        )
    }

    fun <T> signal(
        kProperty: KProperty<T>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument
    ) {
        appendSignal(
            KtSignalInfo(
                kProperty.name.removePrefix("signal").camelToSnakeCase(),
                listOf(
                    p0.toKtPropertyInfo(),
                    p1.toKtPropertyInfo(),
                    p2.toKtPropertyInfo()
                )
            )
        )
    }

    fun <T> signal(
        kProperty: KProperty<T>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument
    ) {
        appendSignal(
            KtSignalInfo(
                kProperty.name.removePrefix("signal").camelToSnakeCase(),
                listOf(
                    p0.toKtPropertyInfo(),
                    p1.toKtPropertyInfo(),
                    p2.toKtPropertyInfo(),
                    p3.toKtPropertyInfo()
                )
            )
        )
    }

    fun <T> signal(
        kProperty: KProperty<T>,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument
    ) {
        appendSignal(
            KtSignalInfo(
                kProperty.name.removePrefix("signal").camelToSnakeCase(),
                listOf(
                    p0.toKtPropertyInfo(),
                    p1.toKtPropertyInfo(),
                    p2.toKtPropertyInfo(),
                    p3.toKtPropertyInfo(),
                    p4.toKtPropertyInfo()
                )
            )
        )
    }

    fun <T> signal(kProperty: KProperty<T>, args: Array<KtPropertyInfoBuilderDsl.() -> Unit> = arrayOf()) {
        appendSignal(
            KtSignalInfo(kProperty.name.removePrefix("signal").camelToSnakeCase(), args.applyArgumentsDsl())
        )
    }

    private fun argumentsAndReturnType(
        returns: KtPropertyInfoBuilderDsl.() -> Unit,
        vararg args: KtPropertyInfoBuilderDsl.() -> Unit
    ): Pair<List<KtPropertyInfo>, KtPropertyInfo> {
        val returnBuilder = KtPropertyInfoBuilderDsl()
        returnBuilder.returns()
        val returnInfo = returnBuilder.build()

        return args.applyArgumentsDsl() to returnInfo
    }

    private fun <R: Any?> appendFunction(function: KtFunction<T, R>) {
        require(!functions.containsKey(function.functionInfo.name)) {
            "A method with ${function.functionInfo.name} already exists."
        }
        functions[function.functionInfo.name] = function
    }

    @PublishedApi
    internal fun appendSignal(signalInfo: KtSignalInfo) {
        require(!signals.containsKey(signalInfo.name)) {
            "A signal with ${signalInfo.name} already exists."
        }
        signals[signalInfo.name] = signalInfo
    }

    internal fun build(): KtClass<T> {
        check(constructors.isNotEmpty()) { "Please provide at least one constructor." }
        // CONSTRUCTOR_MAX_ARGS + 1 because we have no arg constructor.
        val constructorArray = arrayOfNulls<KtConstructor<T>>(CONSTRUCTOR_MAX_ARGS + 1)
        constructors.forEach {
            constructorArray[it.key] = it.value
        }
        return KtClass(name, registeredName, superClass, constructorArray, properties, functions, signals, baseGodotClass)
    }

    @PublishedApi
    internal fun Array<out KtPropertyInfoBuilderDsl.() -> Unit>.applyArgumentsDsl(): List<KtPropertyInfo> {
        val argumentsCheckList = mutableSetOf<String>()
        return map {
            val builder = KtPropertyInfoBuilderDsl()
            builder.it()
            val propertyInfo = builder.build()
            require(!argumentsCheckList.contains(propertyInfo.name)) {
                "Cannot have two arguments with name ${propertyInfo.name}"
            }
            require(propertyInfo.name.isNotEmpty()) { "Function parameters should have names." }
            argumentsCheckList.add(propertyInfo.name)
            propertyInfo
        }
    }
}

class ClassRegistry {
    val classes = mutableListOf<KtClass<*>>()

    fun <T : KtObject> registerClass(
        resPath: String,
        superClass: String,
        kClass: KClass<out KtObject>,
        isTool: Boolean = false,
        baseGodotClass: String,
        registeredName: String = resPath.replace('.', '_'),
        cb: ClassBuilderDsl<T>.() -> Unit
    ) {
        val builder = ClassBuilderDsl<T>(resPath, registeredName, superClass, baseGodotClass)
        builder.cb()
        TypeManager.registerUserType(resPath, kClass)
        registerClass(builder.build())
    }

    private fun <T : KtObject> registerClass(cls: KtClass<T>) {
        classes.add(cls)
    }
}

interface ClassRegistrar {
    fun register(registry: ClassRegistry)
}

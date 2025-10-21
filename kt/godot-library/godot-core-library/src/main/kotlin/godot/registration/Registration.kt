package godot.registration

import godot.common.extensions.convertToSnakeCase
import godot.common.interop.VariantConverter
import godot.core.KtClass
import godot.core.KtConstructor
import godot.core.KtEnumListProperty
import godot.core.KtEnumFlagProperty
import godot.core.KtFunction
import godot.core.KtFunction0
import godot.core.KtFunction1
import godot.core.KtFunction10
import godot.core.KtFunction11
import godot.core.KtFunction12
import godot.core.KtFunction13
import godot.core.KtFunction14
import godot.core.KtFunction15
import godot.core.KtFunction16
import godot.core.KtFunction2
import godot.core.KtFunction3
import godot.core.KtFunction4
import godot.core.KtFunction5
import godot.core.KtFunction6
import godot.core.KtFunction7
import godot.core.KtFunction8
import godot.core.KtFunction9
import godot.core.KtFunctionInfo
import godot.core.KtObject
import godot.core.KtProperty
import godot.core.KtPropertyInfo
import godot.core.KtRpcConfig
import godot.core.KtSignalInfo
import godot.core.PropertyHint
import godot.internal.reflection.TypeManager
import godot.core.VariantParser
import godot.core.toVariantArray
import godot.core.variantArrayOf
import godot.common.constants.Constraints
import godot.core.VariantCaster
import godot.core.enumFromGodotOrdinal
import godot.core.godotOrdinal
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction10
import kotlin.reflect.KFunction11
import kotlin.reflect.KFunction12
import kotlin.reflect.KFunction13
import kotlin.reflect.KFunction14
import kotlin.reflect.KFunction15
import kotlin.reflect.KFunction16
import kotlin.reflect.KFunction17
import kotlin.reflect.KFunction2
import kotlin.reflect.KFunction3
import kotlin.reflect.KFunction4
import kotlin.reflect.KFunction5
import kotlin.reflect.KFunction6
import kotlin.reflect.KFunction7
import kotlin.reflect.KFunction8
import kotlin.reflect.KFunction9
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty

data class KtFunctionArgument(
    val type: VariantConverter,
    val className: String,
    val name: String = "" //empty for return type
) {
    internal fun toKtPropertyInfo() = KtPropertyInfo(
        type,
        name,
        className,
        PropertyHint.NONE,
        "", //always empty. Only used for properties
    )
}


class ClassBuilderDsl<T : KtObject>(
    @PublishedApi internal val registeredName: String,
    private val fqdn: String,
    private val compilationTimeRelativeRegistrationFilePath: String,
    private val superClasses: List<String>,
    private val baseGodotClass: String
) {
    private lateinit var constructorField: KtConstructor<T>

    private val functions = mutableMapOf<String, KtFunction<T, *>>()
    private var notificationFunctions = listOf<Any.(Int) -> Unit>()

    @PublishedApi
    internal val properties = mutableMapOf<String, KtProperty<T, *>>()

    private val signals = mutableMapOf<String, KtSignalInfo>()

    fun constructor(constructor: KtConstructor<T>) {
        constructorField = constructor
    }

    fun <P : Any?> property(
        kProperty: KMutableProperty1<T, P>,
        variantType: VariantConverter,
        type: VariantConverter,
        className: String,
        hint: PropertyHint = PropertyHint.NONE,
        hintString: String = "",
        usage: Long
    ) = property(
        kProperty.name.convertToSnakeCase(),
        { instance: T -> kProperty.get(instance) },
        { instance: T, p: P -> kProperty.set(instance, p) },
        variantType,
        type,
        className,
        hint,
        hintString,
        usage
    )

    fun <P : Any?> property(
        name: String,
        getter: (T) -> P,
        setter: (T, P) -> Unit,
        variantType: VariantConverter,
        type: VariantConverter,
        className: String,
        hint: PropertyHint = PropertyHint.NONE,
        hintString: String = "",
        usage: Long
    ) {
        require(!properties.contains(name)) {
            "Found two properties with name $name for class $registeredName"
        }
        properties[name] = KtProperty(
            KtPropertyInfo(
                type,
                name,
                className,
                hint,
                hintString,
                usage
            ),
            getter,
            setter,
            variantType
        )
    }

    inline fun <reified P : Enum<P>, L : Collection<P>> enumListProperty(
        name: String,
        noinline getter: (T) -> L,
        noinline setter: (T, L) -> Unit,
        usage: Long,
        hintString: String
    ) {
        require(!properties.contains(name)) {
            "Found two properties with name $name for class $registeredName"
        }

        properties[name] = KtEnumListProperty(
            KtPropertyInfo(
                VariantParser.ARRAY,
                name,
                "Int",
                PropertyHint.ENUM,
                hintString,
                usage,
            ),
            getter,
            setter,
            { enumList: Collection<P>? ->
                (enumList
                    ?.map { it.godotOrdinal.toInt() }
                    ?.toVariantArray()
                    ?: variantArrayOf())
            },
            { enumOrdinalVariantArray ->
                @Suppress("UNCHECKED_CAST")
                (enumOrdinalVariantArray.map { enumFromGodotOrdinal<P>(it) } as L)
            }
        )
    }

    inline fun <reified P : Enum<P>, L : Collection<P>> enumListProperty(
        kProperty: KMutableProperty1<T, L>,
        usage: Long,
        hintString: String
    ) = enumListProperty(
        kProperty.name.convertToSnakeCase(),
        { instance: T -> kProperty.get(instance) },
        { instance: T, l: L -> kProperty.set(instance, l) },
        usage,
        hintString
    )

    @JvmName("enumFlagPropertyMutable")
    @Suppress("UNCHECKED_CAST")
    inline fun <reified P : Enum<P>> enumFlagProperty(
        kProperty: KMutableProperty1<T, MutableSet<P>>,
        usage: Long,
        hintString: String
    ) = enumFlagProperty(
        kProperty as KMutableProperty1<T, Set<P>>,
        usage,
        hintString,
        )

    inline fun <reified P : Enum<P>> enumFlagProperty(
        name: String,
        noinline getter: (T) -> Set<P>,
        noinline setter: (T, Set<P>) -> Unit,
        usage: Long,
        hintString: String
    ) {
        require(!properties.contains(name)) {
            "Found two properties with name $name for class $registeredName"
        }

        val variantCaster = VariantCaster.ENUM(enumValues<P>())

        properties[name] = KtEnumFlagProperty(
            KtPropertyInfo(
                variantCaster,
                name,
                "Int",
                PropertyHint.FLAGS,
                hintString,
                usage,
            ),
            getter,
            setter,
            { enumSet ->
                var intFlag = 0
                enumSet?.forEach { enum ->
                    intFlag += 1 shl enum.godotOrdinal.toInt()
                }
                intFlag
            },
            { value ->
                val intFlag = (value as P).godotOrdinal.toInt()

                val enums = mutableSetOf<P>()
                var bit = 1

                for (i in 0 until Int.SIZE_BITS) {
                    if ((intFlag and bit) > 0) {
                        val element = enumValues<P>().firstOrNull { it.godotOrdinal.toInt() == i }
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

    inline fun <reified P : Enum<P>> enumFlagProperty(
        kProperty: KMutableProperty1<T, Set<P>>,
        usage: Long,
        hintString: String
    ) = enumFlagProperty(
        kProperty.name.convertToSnakeCase(),
        { instance: T -> kProperty.get(instance) },
        { instance: T, set: Set<P> -> kProperty.set(instance, set) },
        usage,
        hintString
    )

    /**
     * Notification functions of class hierarchy
     *
     * Order: child to parent
     *
     * Only present if the notification function is registered and is overriding [KtObject._notification].
     *
     * **Note:** Manually declared functions with name `_notification` are not supposed to be added to this list even if
     * the return type and parameters match!
     */
    fun notificationFunctions(
        notificationFunctionsOfClassHierarchy: List<Any.(Int) -> Unit>
    ) {
        notificationFunctions = notificationFunctionsOfClassHierarchy
    }

    fun <R : Any?> function(
        func: KFunction1<T, R>,
        variantType: VariantConverter,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction0(
                KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                func,
                variantType
            )
        )
    }

    fun <P0, R : Any?> function(
        func: KFunction2<T, P0, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p0: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction1(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type
            )
        )
    }

    fun <P0, P1, R : Any?> function(
        func: KFunction3<T, P0, P1, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction2(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type
            )
        )
    }

    fun <P0, P1, P2, R : Any?> function(
        func: KFunction4<T, P0, P1, P2, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction3(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type
            )
        )
    }

    fun <P0, P1, P2, P3, R : Any?> function(
        func: KFunction5<T, P0, P1, P2, P3, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction4(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, R : Any?> function(
        func: KFunction6<T, P0, P1, P2, P3, P4, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction5(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, R : Any?> function(
        func: KFunction7<T, P0, P1, P2, P3, P4, P5, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction6(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, R : Any?> function(
        func: KFunction8<T, P0, P1, P2, P3, P4, P5, P6, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction7(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, R : Any?> function(
        func: KFunction9<T, P0, P1, P2, P3, P4, P5, P6, P7, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction8(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, R : Any?> function(
        func: KFunction10<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction9(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, R : Any?> function(
        func: KFunction11<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p9Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        p9: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction10(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo(),
                        p9.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type,
                p9Type = p9Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R : Any?> function(
        func: KFunction12<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p9Type: VariantConverter,
        p10Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        p9: KtFunctionArgument,
        p10: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction11(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo(),
                        p9.toKtPropertyInfo(),
                        p10.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type,
                p9Type = p9Type,
                p10Type = p10Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R : Any?> function(
        func: KFunction13<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p9Type: VariantConverter,
        p10Type: VariantConverter,
        p11Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        p9: KtFunctionArgument,
        p10: KtFunctionArgument,
        p11: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction12(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo(),
                        p9.toKtPropertyInfo(),
                        p10.toKtPropertyInfo(),
                        p11.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type,
                p9Type = p9Type,
                p10Type = p10Type,
                p11Type = p11Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R : Any?> function(
        func: KFunction14<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p9Type: VariantConverter,
        p10Type: VariantConverter,
        p11Type: VariantConverter,
        p12Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        p9: KtFunctionArgument,
        p10: KtFunctionArgument,
        p11: KtFunctionArgument,
        p12: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction13(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo(),
                        p9.toKtPropertyInfo(),
                        p10.toKtPropertyInfo(),
                        p11.toKtPropertyInfo(),
                        p12.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type,
                p9Type = p9Type,
                p10Type = p10Type,
                p11Type = p11Type,
                p12Type = p12Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R : Any?> function(
        func: KFunction15<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p9Type: VariantConverter,
        p10Type: VariantConverter,
        p11Type: VariantConverter,
        p12Type: VariantConverter,
        p13Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        p9: KtFunctionArgument,
        p10: KtFunctionArgument,
        p11: KtFunctionArgument,
        p12: KtFunctionArgument,
        p13: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction14(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo(),
                        p9.toKtPropertyInfo(),
                        p10.toKtPropertyInfo(),
                        p11.toKtPropertyInfo(),
                        p12.toKtPropertyInfo(),
                        p13.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type,
                p9Type = p9Type,
                p10Type = p10Type,
                p11Type = p11Type,
                p12Type = p12Type,
                p13Type = p13Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R : Any?> function(
        func: KFunction16<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p9Type: VariantConverter,
        p10Type: VariantConverter,
        p11Type: VariantConverter,
        p12Type: VariantConverter,
        p13Type: VariantConverter,
        p14Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        p9: KtFunctionArgument,
        p10: KtFunctionArgument,
        p11: KtFunctionArgument,
        p12: KtFunctionArgument,
        p13: KtFunctionArgument,
        p14: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction15(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo(),
                        p9.toKtPropertyInfo(),
                        p10.toKtPropertyInfo(),
                        p11.toKtPropertyInfo(),
                        p12.toKtPropertyInfo(),
                        p13.toKtPropertyInfo(),
                        p14.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type,
                p9Type = p9Type,
                p10Type = p10Type,
                p11Type = p11Type,
                p12Type = p12Type,
                p13Type = p13Type,
                p14Type = p14Type
            )
        )
    }

    fun <P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R : Any?> function(
        func: KFunction17<T, P0, P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>,
        variantType: VariantConverter,
        p0Type: VariantConverter,
        p1Type: VariantConverter,
        p2Type: VariantConverter,
        p3Type: VariantConverter,
        p4Type: VariantConverter,
        p5Type: VariantConverter,
        p6Type: VariantConverter,
        p7Type: VariantConverter,
        p8Type: VariantConverter,
        p9Type: VariantConverter,
        p10Type: VariantConverter,
        p11Type: VariantConverter,
        p12Type: VariantConverter,
        p13Type: VariantConverter,
        p14Type: VariantConverter,
        p15Type: VariantConverter,
        p0: KtFunctionArgument,
        p1: KtFunctionArgument,
        p2: KtFunctionArgument,
        p3: KtFunctionArgument,
        p4: KtFunctionArgument,
        p5: KtFunctionArgument,
        p6: KtFunctionArgument,
        p7: KtFunctionArgument,
        p8: KtFunctionArgument,
        p9: KtFunctionArgument,
        p10: KtFunctionArgument,
        p11: KtFunctionArgument,
        p12: KtFunctionArgument,
        p13: KtFunctionArgument,
        p14: KtFunctionArgument,
        p15: KtFunctionArgument,
        returnType: KtFunctionArgument,
        rpcConfig: KtRpcConfig
    ) {
        appendFunction(
            KtFunction16(
                functionInfo = KtFunctionInfo(
                    name = func.name.convertToSnakeCase(),
                    _arguments = listOf(
                        p0.toKtPropertyInfo(),
                        p1.toKtPropertyInfo(),
                        p2.toKtPropertyInfo(),
                        p3.toKtPropertyInfo(),
                        p4.toKtPropertyInfo(),
                        p5.toKtPropertyInfo(),
                        p6.toKtPropertyInfo(),
                        p7.toKtPropertyInfo(),
                        p8.toKtPropertyInfo(),
                        p9.toKtPropertyInfo(),
                        p10.toKtPropertyInfo(),
                        p11.toKtPropertyInfo(),
                        p12.toKtPropertyInfo(),
                        p13.toKtPropertyInfo(),
                        p14.toKtPropertyInfo(),
                        p15.toKtPropertyInfo()
                    ),
                    returnVal = returnType.toKtPropertyInfo(),
                    rpcConfig = rpcConfig
                ),
                function = func,
                variantType = variantType,
                p0Type = p0Type,
                p1Type = p1Type,
                p2Type = p2Type,
                p3Type = p3Type,
                p4Type = p4Type,
                p5Type = p5Type,
                p6Type = p6Type,
                p7Type = p7Type,
                p8Type = p8Type,
                p9Type = p9Type,
                p10Type = p10Type,
                p11Type = p11Type,
                p12Type = p12Type,
                p13Type = p13Type,
                p14Type = p14Type,
                p15Type = p15Type
            )
        )
    }

    fun <T> signal(kProperty: KProperty<T>, vararg parameters: KtFunctionArgument) = signal(
        kProperty.name.convertToSnakeCase(),
        *parameters
    )

    fun <T> signal(kFunction: KFunction<T>, vararg parameters: KtFunctionArgument) = signal(
        kFunction.name.convertToSnakeCase(),
        *parameters
    )

    private fun signal(name: String, vararg parameters: KtFunctionArgument) {
        appendSignal(
            KtSignalInfo(
                name,
                parameters
                    .map { it.toKtPropertyInfo() }
            )
        )
    }

    private fun <R : Any?> appendFunction(function: KtFunction<T, R>) {
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
        check(this::constructorField.isInitialized) {
            "Please provide a default constructor."
        }
        return KtClass(
            registeredName = registeredName,
            fqdn = fqdn,
            compilationTimeRelativeRegistrationFilePath = compilationTimeRelativeRegistrationFilePath,
            _registeredSupertypes = superClasses,
            constructor = constructorField,
            _properties = properties,
            _functions = functions,
            _notificationFunctions = notificationFunctions,
            _signalInfos = signals,
            baseGodotClass = baseGodotClass
        )
    }
}

class ClassRegistry(
    private val projectName: String,
    private val isDependency: Boolean,
) {
    private val _classes = mutableListOf<KtClass<*>>()
    val classes: List<KtClass<*>> = _classes

    fun <T : KtObject> registerClass(
        superClass: List<String>,
        kClass: KClass<out KtObject>,
        isTool: Boolean = false,
        baseGodotClass: String,
        registeredName: String,
        fqdn: String,
        compilationTimeRelativeRegistrationFilePath: String,
        cb: ClassBuilderDsl<T>.() -> Unit
    ) {
        val builder = ClassBuilderDsl<T>(registeredName, fqdn, compilationTimeRelativeRegistrationFilePath, superClass, baseGodotClass)
        builder.cb()
        TypeManager.registerUserType(registeredName, kClass)
        registerClass(builder.build())
    }

    private fun <T : KtObject> registerClass(cls: KtClass<T>) {
        _classes.add(cls)
    }
}

interface ClassRegistrar {
    fun register(registry: ClassRegistry)
}

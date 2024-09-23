package godot.registration

import godot.PropertyHint
import godot.core.KtClass
import godot.core.KtConstructor
import godot.core.KtEnumListProperty
import godot.core.KtEnumProperty
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
import godot.core.TypeManager
import godot.core.VariantConverter
import godot.core.VariantParser
import godot.core.toVariantArray
import godot.core.variantArrayOf
import godot.tools.common.constants.Constraints
import godot.util.camelToSnakeCase
import kotlin.reflect.KClass
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
        PropertyHint.PROPERTY_HINT_NONE,
        "", //always empty. Only used for properties
    )
}


class ClassBuilderDsl<T : KtObject>(
    @PublishedApi internal val registeredName: String,
    private val relativeSourcePath: String,
    private val compilationTimeRelativeRegistrationFilePath: String,
    private val superClasses: List<String>,
    private val baseGodotClass: String
) {
    private val constructors = mutableMapOf<Int, KtConstructor<T>>()

    private val functions = mutableMapOf<String, KtFunction<T, *>>()
    private var notificationFunctions = listOf<Any.(Int) -> Unit>()

    @PublishedApi
    internal val properties = mutableMapOf<String, KtProperty<T, *>>()

    private val signals = mutableMapOf<String, KtSignalInfo>()

    fun constructor(constructor: KtConstructor<T>) {
        require(!constructors.containsKey(constructor.parameterCount)) {
            "A constructor with ${constructor.parameterCount} argument(s) already exists."
        }
        require(constructor.parameterCount <= Constraints.MAX_CONSTRUCTOR_ARG_COUNT) {
            "Cannot register a constructor with ${constructor.parameterCount} arguments, max argument count is ${Constraints.MAX_CONSTRUCTOR_ARG_COUNT}"
        }
        constructors[constructor.parameterCount] = constructor
    }

    fun <P : Any?> property(
        kProperty: KMutableProperty1<T, P>,
        variantType: VariantConverter,
        type: VariantConverter,
        className: String,
        hint: PropertyHint = PropertyHint.PROPERTY_HINT_NONE,
        hintString: String = "",
        usage: Long
    ) {
        val propertyName = kProperty.name.camelToSnakeCase()
        require(!properties.contains(propertyName)) {
            "Found two properties with name $propertyName for class $registeredName"
        }
        properties[propertyName] = KtProperty(
            KtPropertyInfo(
                type,
                propertyName,
                className,
                hint,
                hintString,
                usage
            ),
            kProperty,
            variantType
        )
    }

    inline fun <reified P : Enum<P>> enumProperty(
        kProperty: KMutableProperty1<T, P>,
        usage: Long,
        hintString: String
    ) {
        val propertyName = kProperty.name.camelToSnakeCase()
        require(!properties.contains(propertyName)) {
            "Found two properties with name $propertyName for class $registeredName"
        }

        properties[propertyName] = KtEnumProperty(
            KtPropertyInfo(
                VariantParser.LONG,
                propertyName,
                "Int",
                PropertyHint.PROPERTY_HINT_ENUM,
                hintString,
                usage,
            ),
            kProperty,
            { enum: P? -> enum?.ordinal ?: 1 },
            { i -> enumValues<P>()[i] }
        )
    }

    inline fun <reified P : Enum<P>, L : Collection<P>> enumListProperty(
        kProperty: KMutableProperty1<T, L>,
        usage: Long,
        hintString: String
    ) {
        val propertyName = kProperty.name.camelToSnakeCase()
        require(!properties.contains(propertyName)) {
            "Found two properties with name $propertyName for class $registeredName"
        }

        properties[propertyName] = KtEnumListProperty(
            KtPropertyInfo(
                VariantParser.ARRAY,
                propertyName,
                "Int",
                PropertyHint.PROPERTY_HINT_ENUM,
                hintString,
                usage,
            ),
            kProperty,
            { enumList: Collection<P>? ->
                enumList
                    ?.map { it.ordinal }
                    ?.toVariantArray()
                    ?: variantArrayOf()
            },
            { enumOrdinalVariantArray ->
                @Suppress("UNCHECKED_CAST")
                enumOrdinalVariantArray.map { enumValues<P>()[it] } as L
            }
        )
    }

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
        kProperty: KMutableProperty1<T, Set<P>>,
        usage: Long,
        hintString: String
    ) {
        val propertyName = kProperty.name.camelToSnakeCase()
        require(!properties.contains(propertyName)) {
            "Found two properties with name $propertyName for class $registeredName"
        }

        properties[propertyName] = KtEnumProperty(
            KtPropertyInfo(
                VariantParser.LONG,
                propertyName,
                "Int",
                PropertyHint.PROPERTY_HINT_FLAGS,
                hintString,
                usage,
            ),
            kProperty,
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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
                    name = func.name.camelToSnakeCase(),
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

    fun <T> signal(kProperty: KProperty<T>) {
        appendSignal(
            KtSignalInfo(kProperty.name.camelToSnakeCase(), listOf())
        )
    }

    fun <T> signal(
        kProperty: KProperty<T>,
        p0: KtFunctionArgument
    ) {
        appendSignal(
            KtSignalInfo(
                kProperty.name.camelToSnakeCase(),
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
                kProperty.name.camelToSnakeCase(),
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
                kProperty.name.camelToSnakeCase(),
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
                kProperty.name.camelToSnakeCase(),
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
                kProperty.name.camelToSnakeCase(),
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
        check(constructors.isNotEmpty()) { "Please provide at least one constructor." }
        // Constraints.MAX_CONSTRUCTOR_ARG_COUNT + 1 because we have no arg constructor.
        val constructorArray = arrayOfNulls<KtConstructor<T>>(Constraints.MAX_CONSTRUCTOR_ARG_COUNT + 1)
        constructors.forEach {
            constructorArray[it.key] = it.value
        }
        return KtClass(
            registeredName = registeredName,
            relativeSourcePath = relativeSourcePath,
            compilationTimeRelativeRegistrationFilePath = compilationTimeRelativeRegistrationFilePath,
            _registeredSupertypes = superClasses,
            _constructors = constructorArray.toList(),
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
        relativeSourcePath: String,
        compilationTimeRelativeRegistrationFilePath: String,
        cb: ClassBuilderDsl<T>.() -> Unit
    ) {
        val builder = ClassBuilderDsl<T>(registeredName, relativeSourcePath, compilationTimeRelativeRegistrationFilePath, superClass, baseGodotClass)
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

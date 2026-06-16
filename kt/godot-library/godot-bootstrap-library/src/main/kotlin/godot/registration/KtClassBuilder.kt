package godot.registration

import godot.common.extensions.convertToSnakeCase
import godot.common.interop.VariantConverter
import godot.core.*
import kotlin.reflect.*

class KtClassBuilder<T : KtObject>(
    @PublishedApi
    internal val registeredName: String,
    private val superClasses: List<String>,
    private val baseGodotClass: String,
    private val kClassField: KClass<T>,
) {
    private lateinit var constructorField: KtConstructor<T>

    private val functions = mutableMapOf<String, KtFunction<T, *>>()
    private var notificationFunctions = listOf<NotificationFunction<out KtObject>>()

    @PublishedApi
    internal val properties = mutableMapOf<String, KtProperty<T, *>>()

    private val signals = mutableMapOf<String, KtSignalInfo>()

    fun constructor(constructor: () -> T) {
        constructorField = KtConstructor(constructor)
    }

    fun argument(
        type: VariantConverter,
        className: String,
        name: String,
    ): KtPropertyInfo = KtPropertyInfo(type, className, name)

    fun returns(
        type: VariantConverter,
        className: String,
    ): KtPropertyInfo = KtPropertyInfo(type, className)

    fun rpc(
        rpcMode: Enum<*>,
        callLocal: Boolean,
        transferMode: Enum<*>,
        channel: Int,
    ): KtRpcConfig = KtRpcConfig(rpcMode.ordinal, callLocal, transferMode.ordinal, channel)

    fun <P : Any?> property(
        kProperty: KProperty1<T, P>,
        variantType: VariantConverter,
        className: String,
        hint: PropertyHint = PropertyHint.NONE,
        hintString: String = "",
        usage: PropertyUsageFlags
    ) = property(
        kProperty.name.convertToSnakeCase(),
        { instance: T -> kProperty.get(instance) },
        (kProperty as? KMutableProperty1<T, P>)?.let { mutableProperty ->
            { instance: T, p: P -> mutableProperty.set(instance, p) }
        },
        variantType,
        className,
        hint,
        hintString,
        usage
    )

    fun <P : Any?> property(
        name: String,
        getter: (T) -> P,
        setter: ((T, P) -> Unit)? = null,
        variantType: VariantConverter,
        className: String,
        hint: PropertyHint = PropertyHint.NONE,
        hintString: String = "",
        usage: PropertyUsageFlags
    ) {
        require(!properties.contains(name)) {
            "Found two properties with name $name for class $registeredName"
        }
        properties[name] = KtProperty(
            KtPropertyInfo(
                variantType,
                name,
                className,
                hint,
                hintString,
                propertyUsage(usage, setter != null)
            ),
            getter,
            setter,
            variantType
        )
    }

    inline fun <reified P : Enum<P>, L : Collection<P>> enumListProperty(
        name: String,
        noinline getter: (T) -> L,
        noinline setter: ((T, L) -> Unit)? = null,
        usage: PropertyUsageFlags,
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
                propertyUsage(usage, setter != null),
            ),
            getter,
            setter,
            { enumList: Collection<P>? ->
                (enumList
                    ?.map { it.godotValue.toInt() }
                    ?.toVariantArray()
                    ?: variantArrayOf())
            },
            { enumOrdinalVariantArray ->
                @Suppress("UNCHECKED_CAST")
                (enumOrdinalVariantArray.map { it.toLong().toEnum<P>() } as L)
            }
        )
    }

    inline fun <reified P : Enum<P>, L : Collection<P>> enumListProperty(
        kProperty: KProperty1<T, L>,
        usage: PropertyUsageFlags,
        hintString: String
    ) = enumListProperty(
        kProperty.name.convertToSnakeCase(),
        { instance: T -> kProperty.get(instance) },
        (kProperty as? KMutableProperty1<T, L>)?.let { mutableProperty ->
            { instance: T, l: L -> mutableProperty.set(instance, l) }
        },
        usage,
        hintString
    )

    fun <E : Enum<E>> bitFieldProperty(
        name: String,
        getter: (T) -> BitField<E>,
        setter: ((T, BitField<E>) -> Unit)? = null,
        usage: PropertyUsageFlags,
        hintString: String
    ) {
        require(!properties.contains(name)) {
            "Found two properties with name $name for class $registeredName"
        }

        properties[name] = KtBitFieldProperty(
            KtPropertyInfo(
                VariantCaster.INT,
                name,
                "Int",
                PropertyHint.FLAGS,
                hintString,
                propertyUsage(usage, setter != null),
            ),
            getter,
            setter,
            { bitField -> bitField?.flag?.toInt() ?: 0 },
            { value -> BitField<E>(value.toLong()) }
        )
    }

    fun <E : Enum<E>> bitFieldProperty(
        kProperty: KProperty1<T, BitField<E>>,
        usage: PropertyUsageFlags,
        hintString: String
    ) = bitFieldProperty(
        kProperty.name.convertToSnakeCase(),
        { instance: T -> kProperty.get(instance) },
        (kProperty as? KMutableProperty1<T, BitField<E>>)?.let { mutableProperty ->
            { instance: T, value: BitField<E> -> mutableProperty.set(instance, value) }
        },
        usage,
        hintString
    )

    @PublishedApi
    internal fun propertyUsage(usage: PropertyUsageFlags, isMutable: Boolean): Long =
        if (isMutable) usage.flag else usage.flag or PropertyUsageFlags.READ_ONLY

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
        notificationFunctionsOfClassHierarchy: List<NotificationFunction<out KtObject>>
    ) {
        notificationFunctions = notificationFunctionsOfClassHierarchy
    }

    @Suppress("UNCHECKED_CAST")
    fun function(
        func: KFunction<*>,
        rpcConfig: KtRpcConfig,
        returnType: KtPropertyInfo,
        vararg arguments: KtPropertyInfo,
    ) {
        val functionInfo = KtFunctionInfo(
            name = func.name.convertToSnakeCase(),
            _arguments = arguments.toList(),
            returnVal = returnType,
            rpcConfig = rpcConfig
        )

        val function = when (arguments.size) {
            0 -> KtFunction0(functionInfo, func as KFunction1<T, Any?>)
            1 -> KtFunction1(functionInfo, func as KFunction2<T, Any?, Any?>)
            2 -> KtFunction2(functionInfo, func as KFunction3<T, Any?, Any?, Any?>)
            3 -> KtFunction3(functionInfo, func as KFunction4<T, Any?, Any?, Any?, Any?>)
            4 -> KtFunction4(functionInfo, func as KFunction5<T, Any?, Any?, Any?, Any?, Any?>)
            5 -> KtFunction5(functionInfo, func as KFunction6<T, Any?, Any?, Any?, Any?, Any?, Any?>)
            6 -> KtFunction6(functionInfo, func as KFunction7<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?>)
            7 -> KtFunction7(functionInfo, func as KFunction8<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>)
            8 -> KtFunction8(functionInfo, func as KFunction9<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>)
            9 -> KtFunction9(
                functionInfo,
                func as KFunction10<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            10 -> KtFunction10(
                functionInfo,
                func as KFunction11<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            11 -> KtFunction11(
                functionInfo,
                func as KFunction12<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            12 -> KtFunction12(
                functionInfo,
                func as KFunction13<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            13 -> KtFunction13(
                functionInfo,
                func as KFunction14<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            14 -> KtFunction14(
                functionInfo,
                func as KFunction15<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            15 -> KtFunction15(
                functionInfo,
                func as KFunction16<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            16 -> KtFunction16(
                functionInfo,
                func as KFunction17<T, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?, Any?>
            )

            else -> error("Unsupported function arity ${arguments.size} for ${func.name}")
        }

        require(!functions.containsKey(function.functionInfo.name)) {
            "A method with ${function.functionInfo.name} already exists."
        }
        functions[function.functionInfo.name] = function
    }

    fun signal(name: String, vararg parameters: KtPropertyInfo) {
        val signalInfo = KtSignalInfo(
            name.convertToSnakeCase(),
            parameters.toList()
        )
        require(!signals.containsKey(signalInfo.name)) {
            "A signal with ${signalInfo.name} already exists."
        }
        signals[signalInfo.name] = signalInfo
    }

    internal fun build(): KtClass<T> {
        check(this::constructorField.isInitialized) {
            "Please provide a default constructor."
        }
        val fqdn = requireNotNull(kClassField.qualifiedName) {
            "Registered class $registeredName must have a qualified name."
        }
        return KtClass(
            registeredName = registeredName,
            fqdn = fqdn,
            kClass = kClassField,
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

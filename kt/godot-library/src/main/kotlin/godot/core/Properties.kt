package godot.core

import kotlin.reflect.KMutableProperty1

data class KtPropertyInfo(
    val _type: VariantType,
    val name: String,
    val className: String,
    val _hint: PropertyHint,
    val hintString: String,
    val visibleInEditor: Boolean,
) {
    val type: Int
        get() = _type.ordinal

    val hint: Int
        get() = _hint.ordinal
}

open class KtProperty<T : KtObject, P : Any?>(
    val ktPropertyInfo: KtPropertyInfo,
    protected val kProperty: KMutableProperty1<T, P>,
    protected val variantType: VariantType,
    internal val _defaultValueProvider: () -> P?,
    val isRef: Boolean
) {
    open fun getDefaultValue() {
        TransferContext.writeReturnValue(_defaultValueProvider(), variantType)
    }

    open fun callGet(instance: T) {
        TransferContext.writeReturnValue(kProperty.get(instance), variantType)
    }

    open fun callSet(instance: T) {
        val arg = extractSetterArgument<P>()
        kProperty.set(instance, arg)
    }

    protected fun <P> extractSetterArgument(): P {
        val argsSize = TransferContext.buffer.int
        require(argsSize == 1) { "Setter should be called with only one argument." }
        //TODO: manage nullable argument of enum setter (only for objects)
        val arg = TransferContext.readSingleArgument(variantType)
        TransferContext.buffer.rewind()
        @Suppress("UNCHECKED_CAST")
        return arg as P
    }
}

class KtEnumProperty<T : KtObject, P : Any>(
    ktPropertyInfo: KtPropertyInfo,
    kProperty: KMutableProperty1<T, P>,
    defaultValue: () -> P,
    val getValueConverter: (P?) -> Int,
    val setValueConverter: (Int) -> P
) : KtProperty<T, P>(
    ktPropertyInfo,
    kProperty,
    VariantType.JVM_INT,
    defaultValue,
    false
) {
    override fun getDefaultValue() {
        TransferContext.writeReturnValue(getValueConverter(_defaultValueProvider()), VariantType.JVM_INT)
    }

    override fun callGet(instance: T) {
        TransferContext.writeReturnValue(getValueConverter(kProperty.get(instance)), VariantType.JVM_INT)
    }

    override fun callSet(instance: T) {
        val arg = extractSetterArgument<Int>()
        kProperty.set(instance, setValueConverter(arg))
    }
}

class KtEnumListProperty<T : KtObject, P : Enum<P>, L : Collection<P>>(
    ktPropertyInfo: KtPropertyInfo,
    kProperty: KMutableProperty1<T, L>,
    defaultValueProvider: () -> L,
    val getValueConverter: (L?) -> VariantArray<Int>,
    val setValueConverter: (VariantArray<Int>) -> L
) : KtProperty<T, L>(
    ktPropertyInfo,
    kProperty,
    VariantType.ARRAY,
    defaultValueProvider,
    false
) {
    override fun getDefaultValue() {
        TransferContext.writeReturnValue(getValueConverter(_defaultValueProvider()), VariantType.ARRAY)
    }

    override fun callGet(instance: T) {
        TransferContext.writeReturnValue(getValueConverter(kProperty.get(instance)), VariantType.ARRAY)
    }

    override fun callSet(instance: T) {
        val arg = extractSetterArgument<VariantArray<Int>>()
        kProperty.set(instance, setValueConverter(arg))
    }
}


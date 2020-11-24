package godot.core

import kotlin.reflect.KMutableProperty1

data class KtPropertyInfo(
        val _type: VariantType,
        val name: String,
        val className: String,
        val _hint: PropertyHint,
        val hintString: String
) {
    val type: Int
        get() = _type.ordinal

    val hint: Int
        get() = _hint.ordinal
}

open class KtProperty<T : KtObject, P: Any?>(
    val ktPropertyInfo: KtPropertyInfo,
    protected val kProperty: KMutableProperty1<T, P>,
    protected val variantType: VariantType,
    protected val _defaultValue: P,
    val isRef: Boolean
) {
    open fun getDefaultValue() {
        TransferContext.writeReturnValue(_defaultValue, variantType)
    }

    open fun callGet(instance: T) {
        TransferContext.writeReturnValue(kProperty.get(instance), variantType)
    }

    open fun callSet(instance: T) {
        val argsSize = TransferContext.buffer.int
        require(argsSize == 1) { "Setter should be called with only one argument." }
        val arg = TransferContext.readSingleArgument(variantType)
        TransferContext.buffer.rewind()
        kProperty.set(instance, arg as P)
    }
}

class KtEnumProperty<T : KtObject, P : Any>(
        ktPropertyInfo: KtPropertyInfo,
        kProperty: KMutableProperty1<T, P>,
        defaultValue: P,
        val getValueConverter: (P) -> Int,
        val setValueConverter: (Int) -> P
) : KtProperty<T, P>(
        ktPropertyInfo,
        kProperty,
        VariantType.JVM_INT,
        defaultValue,
        false
) {
    override fun getDefaultValue() {
        TransferContext.writeReturnValue(getValueConverter(_defaultValue), VariantType.JVM_INT)
    }

    override fun callGet(instance: T) {
        TransferContext.writeReturnValue(getValueConverter(kProperty.get(instance)), VariantType.JVM_INT)
    }

    override fun callSet(instance: T) {
        val argsSize = TransferContext.buffer.int
        require(argsSize == 1) { "Setter should be called with only one argument." }
        val arg = TransferContext.readSingleArgument(VariantType.JVM_INT)
        TransferContext.buffer.rewind()
        kProperty.set(instance, setValueConverter(arg as Int))
    }
}

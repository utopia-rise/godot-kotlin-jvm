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

class KtProperty<T : KtObject, P>(
    val ktPropertyInfo: KtPropertyInfo,
    private val kProperty: KMutableProperty1<T, P>,
    private val getValueConverter: (P) -> Pair<VariantType, Any>,
    private val setValueConverter: ((Any) -> P),
    private val _defaultValue: P,
    val isRef: Boolean
) {
    val defaultValue: Unit
        get() {
            val converted = getValueConverter(_defaultValue)
            TransferContext.writeReturnValue(converted)
        }

    fun callGet(instance: T): Unit {
        val converted = getValueConverter(kProperty.get(instance))
        TransferContext.writeReturnValue(converted)
    }

    fun callSet(instance: T) {
        val arg = TransferContext.readArguments()
        require(arg.size == 1) { "Setter should be called with only one argument." }
        kProperty.set(instance, setValueConverter(arg[0]))
    }
}

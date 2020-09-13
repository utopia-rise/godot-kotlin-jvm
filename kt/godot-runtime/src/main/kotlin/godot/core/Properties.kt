package godot.core

import kotlin.reflect.KMutableProperty1

data class KtPropertyInfo(
        val _type: KtVariant.Type,
        val name: String,
        val className: String,
        val _hint: PropertyHint,
        val hintString: String
) {
    val type: Int
        get() = (KtVariant.TYPE_TO_WIRE_VALUE_TYPE[_type] ?: error("Unknown mapping to Wire type for ${_type.name}"))
                .number

    val hint: Int
        get() = _hint.ordinal
}

class KtProperty<T: KtObject, P>(
        val ktPropertyInfo: KtPropertyInfo,
        private val kProperty: KMutableProperty1<T, P>,
        private val getValueConverter: (P) -> KtVariant,
        private val setValueConverter: ((KtVariant) -> P)
) {
    fun callGet(instance: T): Boolean {
        return TransferContext.writeReturnValue(getValueConverter(kProperty.get(instance)))
    }

    fun callSet(instance: T) {
        val arg = TransferContext.readArguments()
        require(arg.size == 1) { "Setter should be called with only one argument." }
        kProperty.set(instance, setValueConverter(arg[0]))
    }
}
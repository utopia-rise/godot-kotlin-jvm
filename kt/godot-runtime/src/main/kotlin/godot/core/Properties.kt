package godot.core

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
        private val getMethod: (T) -> P,
        private val setMethod: ((T, P) -> Unit)? = null,
        private val getValueConverter: (P) -> KtVariant,
        private val setValueConverter: ((KtVariant) -> P)?
) {
    fun callGet(instance: T): Boolean {
        return TransferContext.writeReturnValue(getValueConverter(getMethod(instance)))
    }

    fun callSet(instance: T) {
        val set = checkNotNull(setMethod) {
            "Cannot call setter for property ${ktPropertyInfo.name}."
        }
        val arg = TransferContext.readArguments()
        require(arg.size == 1) { "Setter should be called with only one argument." }
        set(instance, setValueConverter!!(arg[0]))
    }
}
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

//TODO implement call
class KtProperty(val ktPropertyInfo: KtPropertyInfo)
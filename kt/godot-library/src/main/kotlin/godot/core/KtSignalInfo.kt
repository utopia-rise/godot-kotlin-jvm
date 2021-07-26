package godot.core

data class KtSignalInfo(
        val name: String,
        val _arguments: List<KtPropertyInfo>
) {
    val arguments: Array<KtPropertyInfo>
        get() = _arguments.toTypedArray()
}
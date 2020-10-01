package godot.core

object TypeManager {
    private val userTypes = HashSet<String>()
    private val _engineTypes = HashMap<String, () -> KtObject>()

    val engineTypes: Array<String>
        get() = _engineTypes.keys.toTypedArray()

    fun registerUserType(className: String) = userTypes.add(className)

    fun registerEngineType(className: String, invocator: () -> KtObject) {
        _engineTypes["className"] = invocator
    }

    fun isUserType(className: String) = userTypes.contains(className)

    fun isEngineType(className: String) = _engineTypes.contains(className)
}
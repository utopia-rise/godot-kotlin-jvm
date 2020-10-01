package godot.core

object TypeManager {
    private val userTypes = HashSet<String>()
    private val engineTypes = HashMap<String, () -> KtObject>()

    fun registerUserType(className: String) = userTypes.add(className)

    fun registerEngineType(className: String, invocator: () -> KtObject) {
        engineTypes["className"] = invocator
    }

    fun isUserType(className: String) = userTypes.contains(className)

    fun isEngineType(className: String) = engineTypes.contains(className)
}
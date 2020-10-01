package godot.core

object TypeManager {
    private val userTypes = HashSet<String>()
    val engineTypes = HashMap<String, () -> KtObject>()

    fun registerUserType(className: String) = userTypes.add(className)

    fun <T: KtObject> registerEngineType(className: String, invocator: () -> T) {
        engineTypes[className] = invocator
    }

    fun isUserType(className: String) = userTypes.contains(className)

    fun isEngineType(className: String) = engineTypes.contains(className)
}
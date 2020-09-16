package godot.core

object TypeManager {
    private val userTypes = HashSet<String>()

    fun registerUserType(className: String) {
        userTypes.add(className)
    }

    fun isUserType(className: String): Boolean {
        return userTypes.contains(className)
    }
}
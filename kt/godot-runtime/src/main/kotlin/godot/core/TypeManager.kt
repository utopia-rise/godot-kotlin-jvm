package godot.core

import godot.util.VoidPtr

object TypeManager {
    val userTypeNames = LinkedHashSet<String>()
    val userTypeConstructors = mutableListOf<(VoidPtr) -> KtObject>()

    val engineTypeNames = LinkedHashSet<String>()
    val engineTypeConstructors = mutableListOf<() -> KtObject>()

    fun <T: KtObject> registerUserType(className: String, invocator: (rawPtr: VoidPtr) -> T) {
        userTypeConstructors.add(invocator)
        userTypeNames.add(className)
    }

    fun <T: KtObject> registerEngineType(className: String, invocator: () -> T) {
        engineTypeConstructors.add(invocator)
        engineTypeNames.add(className)
    }

    fun isUserType(className: String) = userTypeNames.contains(className)

    fun isEngineType(className: String) = engineTypeNames.contains(className)
}

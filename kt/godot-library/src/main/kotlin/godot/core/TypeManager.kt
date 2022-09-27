package godot.core

import kotlin.reflect.KClass

internal object TypeManager {
    internal val userTypeToId = mutableMapOf<KClass<out KtObject>, Int>()

    val userTypes = LinkedHashSet<String>()
    val engineTypeNames = LinkedHashSet<String>()
    val engineSingletonsNames = LinkedHashSet<String>()
    val engineTypesConstructors = mutableListOf<() -> KtObject>()
    val engineTypeMethod = mutableListOf<Pair<Int, String>>()

    fun registerUserType(className: String, kclass: KClass<out KtObject>) {
        userTypes.add(className)
        userTypeToId[kclass] = userTypes.size - 1
    }

    fun <T : KtObject> registerEngineType(className: String, invocator: () -> T) {
        engineTypesConstructors.add(invocator)
        engineTypeNames.add(className)
    }

    fun registerSingleton(singletonName: String) {
        engineSingletonsNames.add(singletonName)
    }

    fun isUserType(className: String) = userTypes.contains(className)

    fun isEngineType(className: String) = engineTypeNames.contains(className)
}

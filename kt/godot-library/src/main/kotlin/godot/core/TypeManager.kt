package godot.core

import godot.Object
import godot.util.VoidPtr
import kotlin.reflect.KClass

internal object TypeManager {
    internal val userTypeToId = mutableMapOf<KClass<out KtObject>, Int>()
    internal val engineTypeToId = mutableMapOf<KClass<out Object>, Int>()

    val userTypes = LinkedHashSet<String>()
    val engineTypeNames = LinkedHashSet<String>()
    val engineSingletonsNames = LinkedHashSet<String>()
    val engineTypesConstructors = mutableListOf<() -> KtObject>()

    fun registerUserType(className: String, kclass: KClass<out KtObject>) {
        userTypes.add(className)
        userTypeToId[kclass] = userTypes.size - 1
    }

    fun <T : KtObject> registerEngineType(className: String, clazz: KClass<out Object>, invocator: () -> T) {
        engineTypesConstructors.add(invocator)
        engineTypeNames.add(className)
        engineTypeToId[clazz] = engineTypeNames.size - 1
    }

    fun registerSingleton(singletonName: String) {
        engineSingletonsNames.add(singletonName)
    }

    fun isUserType(className: String) = userTypes.contains(className)

    fun isEngineType(className: String) = engineTypeNames.contains(className)

    fun clearUserTypes() {
        userTypeToId.clear()
        userTypes.clear()
    }

    internal external fun getMethodBindPtr(className: String, methodName: String, hash: Long): VoidPtr
}

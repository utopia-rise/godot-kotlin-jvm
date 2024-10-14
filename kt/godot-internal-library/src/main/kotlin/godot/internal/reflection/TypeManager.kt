package godot.internal.reflection

import godot.common.interop.IdentityPointer
import godot.common.interop.VoidPtr
import kotlin.reflect.KClass

object TypeManager {
    val userTypeToId = mutableMapOf<KClass<out IdentityPointer>, Int>()
    val engineTypeToId = mutableMapOf<KClass<out IdentityPointer>, Int>()

    val userTypes = LinkedHashSet<String>()
    val engineTypeNames = LinkedHashSet<String>()
    val engineSingletonsNames = LinkedHashSet<String>()
    val engineTypesConstructors = mutableListOf<() -> IdentityPointer>()

    fun registerUserType(className: String, kclass: KClass<out IdentityPointer>) {
        userTypes.add(className)
        userTypeToId[kclass] = userTypes.size - 1
    }

    fun <T : IdentityPointer> registerEngineType(className: String, clazz: KClass<out IdentityPointer>, invocator: () -> T) {
        engineTypesConstructors.add(invocator)
        engineTypeNames.add(className)
        engineTypeToId[clazz] = engineTypeNames.size - 1
    }

    fun registerSingleton(singletonName: String) {
        engineSingletonsNames.add(singletonName)
    }

    fun clearUserTypes() {
        userTypeToId.clear()
        userTypes.clear()
    }

    external fun getMethodBindPtr(className: String, methodName: String, hash: Long): VoidPtr
}

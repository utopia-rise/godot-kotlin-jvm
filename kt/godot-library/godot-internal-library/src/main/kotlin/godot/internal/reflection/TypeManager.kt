package godot.internal.reflection

import godot.common.interop.NativeWrapper
import godot.common.interop.VoidPtr
import kotlin.reflect.KClass

object TypeManager {
    val userTypeToId = mutableMapOf<KClass<out NativeWrapper>, Int>()
    val engineTypeToId = mutableMapOf<KClass<out NativeWrapper>, Int>()

    val userTypes = LinkedHashSet<String>()
    val engineTypeNames = LinkedHashSet<String>()
    val engineSingletonsNames = LinkedHashSet<String>()
    val engineTypesConstructors = mutableListOf<() -> NativeWrapper>()

    fun registerUserType(className: String, kClass: KClass<out NativeWrapper>) {
        userTypes.add(className)
        userTypeToId[kClass] = userTypes.size - 1
    }

    fun <T : NativeWrapper> registerEngineType(className: String, clazz: KClass<out NativeWrapper>, invocator: () -> T) {
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

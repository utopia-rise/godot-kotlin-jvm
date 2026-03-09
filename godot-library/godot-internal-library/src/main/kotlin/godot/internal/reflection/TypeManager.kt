package godot.internal.reflection

import godot.common.interop.NativeWrapper
import godot.common.interop.VoidPtr
import kotlin.reflect.KClass

object TypeManager {
    val engineTypeToId = mutableMapOf<KClass<out NativeWrapper>, Int>()

    private val scriptClassCache = mutableListOf<KClass<out NativeWrapper>>()
    val userClassToScriptPtr = mutableMapOf<KClass<out NativeWrapper>, VoidPtr>()

    val userTypes = LinkedHashSet<String>()
    val engineTypeNames = LinkedHashSet<String>()
    val engineSingletonsNames = LinkedHashSet<String>()

    val engineTypesConstructors = mutableListOf<(() -> NativeWrapper)?>()
    val singletonsConstructors = mutableListOf<() -> NativeWrapper>()

    fun registerUserType(className: String, kClass: KClass<out NativeWrapper>) {
        userTypes.add(className)
        scriptClassCache.add(kClass)
    }

    fun registerEngineType(className: String, clazz: KClass<out NativeWrapper>, invoke: (() -> NativeWrapper)?) {
        engineTypesConstructors.add(invoke)
        engineTypeNames.add(className)
        engineTypeToId[clazz] = engineTypeNames.size - 1
    }

    fun registerSingleton(singletonName: String, invocator: () -> NativeWrapper) {
        engineSingletonsNames.add(singletonName)
        singletonsConstructors.add(invocator)
    }

    fun clearUserTypes() {
        scriptClassCache.clear()
        userClassToScriptPtr.clear()
        userTypes.clear()
    }

    fun clearScriptClassCache() {
        scriptClassCache.clear()
    }

    fun assignScriptToClass(index: Int, scriptPtr: VoidPtr) {
        userClassToScriptPtr[scriptClassCache[index]] = scriptPtr
    }

    external fun getMethodBindPtr(className: String, methodName: String, hash: Long): VoidPtr
}

package godot.intellij.plugin.data.cache.classname

import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import godot.intellij.plugin.extension.GodotRoot
import godot.intellij.plugin.extension.getGodotRoot

object RegisteredClassNameCacheProvider {
    private val registeredClassNameCaches: MutableMap<GodotRoot, RegisteredClassNameCache> = mutableMapOf()

    fun provide(godotRoot: GodotRoot): RegisteredClassNameCache {
        var checker = registeredClassNameCaches[godotRoot]
        if (checker == null) {
            registeredClassNameCaches[godotRoot] = RegisteredClassNameCache()
            checker = registeredClassNameCaches[godotRoot]
        }
        return requireNotNull(checker)
    }

    fun disposeForProject(project: Project) {
        ModuleManager.getInstance(project).modules.forEach {
            registeredClassNameCaches.remove(it.getGodotRoot())
        }
    }
}

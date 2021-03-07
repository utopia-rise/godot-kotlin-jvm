package godot.intellij.plugin.data.cache.classname

import com.intellij.openapi.project.Project
import godot.intellij.plugin.data.cache.godotroot.GodotRoot

object RegisteredClassNameCacheProvider {
    private val registeredClassNameCaches: MutableMap<Project, MutableMap<GodotRoot, RegisteredClassNameCache>> =
        mutableMapOf()

    fun provide(project: Project, godotRoot: GodotRoot): RegisteredClassNameCache {
        val projectCaches = registeredClassNameCaches[project] ?: run {
            registeredClassNameCaches[project] = mutableMapOf()
            registeredClassNameCaches[project]!!
        }

        var checker = projectCaches[godotRoot]
        if (checker == null) {
            projectCaches[godotRoot] = RegisteredClassNameCache()
            checker = projectCaches[godotRoot]
        }
        return requireNotNull(checker)
    }

    fun disposeForProject(project: Project) {
        registeredClassNameCaches.remove(project)
    }
}

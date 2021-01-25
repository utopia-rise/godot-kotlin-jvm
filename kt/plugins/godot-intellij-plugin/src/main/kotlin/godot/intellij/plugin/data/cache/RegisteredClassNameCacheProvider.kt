package godot.intellij.plugin.data.cache

import com.intellij.openapi.project.Project

object RegisteredClassNameCacheProvider {
    private val registeredClassNameCaches: MutableMap<Project, RegisteredClassNameCache> = mutableMapOf()

    fun provide(project: Project): RegisteredClassNameCache {
        var checker = registeredClassNameCaches[project]
        if (checker == null) {
            registeredClassNameCaches[project] = RegisteredClassNameCache()
            checker = registeredClassNameCaches[project]
        }
        return requireNotNull(checker)
    }

    fun disposeForProject(project: Project) {
        registeredClassNameCaches.remove(project)
    }
}

package godot.intellij.plugin.data.cache.signalconnection

import com.intellij.openapi.project.Project
import godot.intellij.plugin.data.cache.godotroot.GodotRoot

object SignalConnectionCacheProvider {
    private val signalConnectionCache: MutableMap<Project, MutableMap<GodotRoot, SignalConnectionCache>> =
        mutableMapOf()

    fun provide(project: Project, godotRoot: GodotRoot): SignalConnectionCache {
        val projectCaches = signalConnectionCache[project] ?: run {
            signalConnectionCache[project] = mutableMapOf()
            signalConnectionCache[project]!!
        }

        var checker = projectCaches[godotRoot]
        if (checker == null) {
            projectCaches[godotRoot] = SignalConnectionCache()
            checker = projectCaches[godotRoot]
        }
        return requireNotNull(checker)
    }

    fun disposeForProject(project: Project) {
        signalConnectionCache.remove(project)
    }
}

package godot.intellij.plugin.data.cache.signalconnection

import com.intellij.openapi.project.Project

object SignalConnectionCacheProvider {
    private val signalConnectionCache: MutableMap<Project, SignalConnectionCache> = mutableMapOf()

    fun provide(project: Project): SignalConnectionCache {
        var checker = signalConnectionCache[project]
        if (checker == null) {
            signalConnectionCache[project] = SignalConnectionCache()
            checker = signalConnectionCache[project]
        }
        return requireNotNull(checker)
    }

    fun disposeForProject(project: Project) {
        signalConnectionCache.remove(project)
    }
}

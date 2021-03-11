package godot.intellij.plugin.data.cache.signalconnection

import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import godot.intellij.plugin.extension.GodotRoot
import godot.intellij.plugin.extension.getGodotRoot

object SignalConnectionCacheProvider {
    private val signalConnectionCache: MutableMap<GodotRoot, SignalConnectionCache> = mutableMapOf()

    fun provide(godotRoot: GodotRoot): SignalConnectionCache {
        var checker = signalConnectionCache[godotRoot]
        if (checker == null) {
            signalConnectionCache[godotRoot] = SignalConnectionCache()
            checker = signalConnectionCache[godotRoot]
        }
        return requireNotNull(checker)
    }

    fun disposeForProject(project: Project) {
        ModuleManager.getInstance(project).modules.forEach {
            signalConnectionCache.remove(it.getGodotRoot())
        }
    }
}

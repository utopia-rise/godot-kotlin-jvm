package godot.intellij.plugin

import com.intellij.openapi.components.service
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ModuleRootManager
import godot.intellij.plugin.project.GodotRoot
import java.io.File
import java.util.*
import java.util.concurrent.ConcurrentHashMap

class GodotProjectScopeService {
    private val godotRootCache = ConcurrentHashMap<Module, Optional<GodotRoot>>()

    fun provideGodotRoot(module: Module): GodotRoot? {
        val cachedRoot = godotRootCache[module]
        if (cachedRoot != null) {
            return cachedRoot.orElse(null)
        }

        godotRootCache[module] = Optional.empty()

        val resolvedRoot = Optional.ofNullable(
            if (!module.isDisposed) {
                ModuleRootManager
                    .getInstance(module)
                    .contentRoots
                    .asSequence()
                    .mapNotNull { contentRoot ->
                        File(contentRoot.path).findFileRecursively(dirsToIgnore) { file -> file.name == godotProjectFileName }
                    }
                    .firstOrNull()
                    ?.let { GodotRoot(it.parentFile) }
            } else {
                null
            }
        )

        godotRootCache[module] = resolvedRoot
        return resolvedRoot.orElse(null)
    }

    private fun File.findFileRecursively(excludedDirs: List<String>, filter: (File) -> Boolean): File? {
        val queue: Queue<File> = LinkedList()
        queue.offer(this)

        while (queue.isNotEmpty()) {
            val currentDir = queue.poll()
            val (dirs, files) = currentDir.listFiles()?.partition { it.isDirectory } ?: continue

            files.firstOrNull(filter)?.let { return it }

            dirs
                .filter { it.name !in excludedDirs }
                .forEach(queue::offer)
        }

        return null
    }

    companion object {
        fun getInstance(project: Project): GodotProjectScopeService = project.service()

        private val dirsToIgnore = listOf(
            ".gradle",
            ".idea",
            ".git",
            "build",
            "gradle"
        )
        private const val godotProjectFileName = "project.godot"
    }
}

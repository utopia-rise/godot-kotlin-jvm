package godot.intellij.plugin.project

import com.intellij.openapi.Disposable
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCache
import godot.intellij.plugin.data.cache.signalconnection.SignalConnectionCache
import godot.intellij.plugin.data.model.GodotRoot
import godot.intellij.plugin.listener.GodotSceneBulkFileListener
import godot.intellij.plugin.listener.PsiTreeListener
import org.jetbrains.kotlin.idea.base.util.isGradleModule
import org.jetbrains.plugins.gradle.util.GradleUtil
import java.io.File
import java.util.*
import java.util.concurrent.ConcurrentHashMap
import kotlin.jvm.optionals.getOrNull

class GodotKotlinJvmProjectServiceImpl(val project: Project) : GodotKotlinJvmProjectService, Disposable {
    private val signalConnectionCache: MutableMap<Module, SignalConnectionCache> = mutableMapOf()
    private val registeredClassNameCache: MutableMap<Module, RegisteredClassNameCache> = mutableMapOf()
    private val godotRootCache: MutableMap<Module, Optional<GodotRoot>> = ConcurrentHashMap<Module, Optional<GodotRoot>>()

    private val caches = listOf(
        signalConnectionCache,
        registeredClassNameCache,
        godotRootCache
    )

    private val indexer = listOf(
        GodotSceneBulkFileListener(project, ::provideSignalConnectionCache),
        PsiTreeListener(::provideRegisteredClassNameCache)
    )

    init {
        DumbService.getInstance(project).runWhenSmart {
            indexer.forEach { indexer ->
                indexer.initialIndex(
                    parentDisposable = this,
                    project = project
                )
            }
        }
    }

    override fun dispose() {
        indexer.forEach { indexer ->
            indexer.dispose(project)
        }
        caches.forEach { cache ->
            cache.clear()
        }
    }

    override fun provideSignalConnectionCache(module: Module): SignalConnectionCache {
        return signalConnectionCache[module] ?: run {
            val cache = SignalConnectionCache()
            signalConnectionCache[module] = cache
            cache
        }
    }


    override fun provideRegisteredClassNameCache(module: Module): RegisteredClassNameCache {
        return registeredClassNameCache[module] ?: run {
            val cache = RegisteredClassNameCache()
            registeredClassNameCache[module] = cache
            cache
        }
    }

    private val dirsToIgnore = listOf(
        "build",
        "gradle"
    )
    private val godotProjectFile = "project.godot"
    override fun provideGodotRoot(module: Module): GodotRoot? {
        val godotRootOptions = godotRootCache[module] ?: run {
            // fast init as finding a godot root takes time, and we don't want to trigger the init multiple times if other threads/coroutines call this function in the meantime
            godotRootCache[module] = Optional.ofNullable(null)

            val cache = Optional.ofNullable(
                if (!module.isDisposed && module.isGradleModule) {
                    @Suppress("UnstableApiUsage")
                    GradleUtil.findGradleModuleData(module)?.data?.let { moduleData ->
                        val gradleRoot = File(moduleData.linkedExternalProjectPath)
                        val godotProjectFile = gradleRoot
                            .listFiles()
                            ?.firstOrNull { file -> file.name == godotProjectFile } // usually the godot.project file resides in the gradle root
                            ?: gradleRoot // if not, we search the project top down
                                .findFileRecursively(dirsToIgnore) { file -> file.name == godotProjectFile }

                        godotProjectFile?.let { GodotRoot(it.parentFile) }
                    }
                } else null
            )

            godotRootCache[module] = cache
            cache
        }

        return godotRootOptions.getOrNull()
    }

    /**
     * Performs a breadth-first search from the `File` receiver to find a file that satisfies the provided `filter`.
     * It also excludes specific directories from the search based on the `excludedDirs` parameter.
     *
     * Starting from the receiver `File` (the root directory), this extension function first evaluates all files in the directory against
     * the `filter`. If no file passes the `filter`, it checks the subdirectories, excluding those named in `excludedDirs`.
     * The search continues until a file that satisfies the `filter` is found or all directories have been checked.
     *
     * @receiver the root directory starting point for the search.
     * @param filter a lambda function that is applied to check each file in the directory and its subdirectories.
     * @param excludedDirs optional list of directory names to exclude from the search.
     *
     * @return a `File` object representing the found file that satisfies the `filter`. If multiple files satisfy,
     *         the first found is returned. Returns `null` if no file satisfying the `filter` was found.
     *
     * @throws SecurityException - If a security manager exists and its SecurityManager.checkRead(java.lang.String)
     *         method denies read access to the directory or subdirectory.
     *         An exception indicates files/directories can't be listed due to lack of permission.
     */
    private fun File.findFileRecursively(excludedDirs: List<String> = emptyList(), filter: (File) -> Boolean): File? {
        val queue: Queue<File> = LinkedList()

        queue.offer(this)

        while (queue.isNotEmpty()) {
            val currentDir = queue.poll()

            val (dirs, files) = currentDir.listFiles()
                ?.partition { it.isDirectory } ?: continue

            files.firstOrNull(filter)?.let { return it }

            dirs.filter { it.name !in excludedDirs }
                .forEach { queue.offer(it) }
        }

        return null
    }
}

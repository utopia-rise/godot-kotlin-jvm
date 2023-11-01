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
import kotlin.jvm.optionals.getOrNull

class GodotKotlinJvmProjectServiceImpl(val project: Project) : GodotKotlinJvmProjectService, Disposable {
    private val signalConnectionCache: MutableMap<Module, SignalConnectionCache> = mutableMapOf()
    private val registeredClassNameCache: MutableMap<Module, RegisteredClassNameCache> = mutableMapOf()
    private val godotRootCache: MutableMap<Module, Optional<GodotRoot>> = mutableMapOf()

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

    override fun provideGodotRoot(module: Module): GodotRoot? {
        val godotRootOptions = godotRootCache[module] ?: run {
            val cache = Optional.ofNullable(
                if (!module.isDisposed && module.isGradleModule) {
                    @Suppress("UnstableApiUsage")
                    GradleUtil.findGradleModuleData(module)?.data?.let { moduleData ->
                        File(moduleData.linkedExternalProjectPath)
                            .walkTopDown()
                            .firstOrNull { file -> file.name == "project.godot" }
                            ?.parentFile
                            ?.let { godotRootDir -> GodotRoot(godotRootDir = godotRootDir) }
                    }
                } else null
            )

            godotRootCache[module] = cache
            cache
        }

        return godotRootOptions.getOrNull()
    }
}

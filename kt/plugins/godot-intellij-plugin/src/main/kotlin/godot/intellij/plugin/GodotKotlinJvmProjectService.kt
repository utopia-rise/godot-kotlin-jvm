package godot.intellij.plugin

import com.intellij.openapi.Disposable
import com.intellij.openapi.components.service
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import java.util.concurrent.atomic.AtomicBoolean

class GodotKotlinJvmProjectService(val project: Project) : Disposable {
    private val registeredClassNameCache: MutableMap<Module, RegisteredClassNameCache> = mutableMapOf()
    private val caches = listOf(registeredClassNameCache)
    private val started = AtomicBoolean(false)

    private val indexer = listOf(
        PsiTreeListener(::provideRegisteredClassNameCache)
    )

    fun start() {
        if (!started.compareAndSet(false, true)) return

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

    fun provideRegisteredClassNameCache(module: Module): RegisteredClassNameCache {
        return registeredClassNameCache[module] ?: run {
            val cache = RegisteredClassNameCache()
            registeredClassNameCache[module] = cache
            cache
        }
    }

    companion object {
        fun getInstance(module: Module): GodotKotlinJvmProjectService = module.project.service()
    }
}

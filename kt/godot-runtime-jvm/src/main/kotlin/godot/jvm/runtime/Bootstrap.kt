package godot.jvm.runtime

import godot.core.KtClass
import godot.core.KtVariantFactory
import godot.jvm.core.JvmGlue
import godot.jvm.core.JvmKtVariantFactory
import godot.runtime.ClassRegistry
import godot.runtime.Entry
import java.net.URL
import java.net.URLClassLoader
import java.nio.file.FileSystems
import java.nio.file.Paths
import java.nio.file.StandardWatchEventKinds
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

class Bootstrap {
    class JvmContext(override val variantFactory: KtVariantFactory,
                     override val registry: ClassRegistry
    ) : Entry.Context

    private lateinit var registry: JvmClassRegistry
    private lateinit var classloader: URLClassLoader
    private lateinit var serviceLoader: ServiceLoader<Entry>
    private var executor: ScheduledExecutorService? = null

    fun init(isEditor: Boolean, projectDir: String) {
        val mainJarPath = Paths.get(projectDir, "build/libs/main.jar")
        val mainJarUrl = mainJarPath.toUri().toURL()
        doInit(mainJarUrl)

        if (isEditor) {
            val watchKey = mainJarPath.register(
                FileSystems.getDefault().newWatchService(),
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY,
            )

            executor = Executors.newSingleThreadScheduledExecutor { runnable ->
                val thread = Thread(runnable)
                thread.isDaemon = true
                thread
            }

            executor!!.schedule({
                val events = watchKey.pollEvents()
                if (events.isNotEmpty()) {
                    unloadClasses(registry.classes.toTypedArray())
                    doInit(mainJarUrl)
                }
            }, 3, TimeUnit.SECONDS)
        }
    }

    fun terminate() {
        executor?.shutdown()
        unloadClasses(registry.classes.toTypedArray())
    }

    /**
     * This must be called when this class is called in editor mode, i.e the game is not running.
     */
    fun bindClassLoader() {
        Thread.currentThread().contextClassLoader = classloader
    }

    private fun doInit(mainJar: URL) {
        registry = JvmClassRegistry()
        classloader = URLClassLoader(arrayOf(mainJar), this::class.java.classLoader)
        Thread.currentThread().contextClassLoader = classloader
        serviceLoader = ServiceLoader.load(Entry::class.java, classloader)
        val entry = serviceLoader.findFirst()

        if (entry.isPresent) {
            entry.get().init(JvmContext(JvmKtVariantFactory, registry), JvmGlue)
            loadClasses(registry.classes.toTypedArray())
        } else {
            System.err.println("Unable to find Entry class, no classes will be loaded")
        }
    }

    private external fun loadClasses(classes: Array<KtClass<*>>)
    private external fun unloadClasses(classes: Array<KtClass<*>>)
}
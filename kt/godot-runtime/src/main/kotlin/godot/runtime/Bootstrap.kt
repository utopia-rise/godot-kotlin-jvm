package godot.runtime

import godot.core.KtClass
import java.net.URL
import java.net.URLClassLoader
import java.nio.file.FileSystems
import java.nio.file.Paths
import java.nio.file.StandardWatchEventKinds
import java.nio.file.WatchService
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

class Bootstrap {
    private lateinit var registry: ClassRegistry
    private lateinit var classloader: URLClassLoader
    private lateinit var serviceLoader: ServiceLoader<Entry>
    private var executor: ScheduledExecutorService? = null
    private var watchService: WatchService? = null;

    fun init(isEditor: Boolean, projectDir: String) {
        val libsDir = Paths.get(projectDir, "build/libs")
        val mainJarPath = libsDir.resolve("main.jar")
        val mainJarUrl = mainJarPath.toUri().toURL()
        doInit(mainJarUrl)

        if (isEditor) {
            watchService = FileSystems.getDefault().newWatchService()
            val watchKey = libsDir.register(
                watchService,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY,
            )

            executor = Executors.newSingleThreadScheduledExecutor { runnable ->
                val thread = Thread(runnable)
                thread.isDaemon = true
                thread
            }

            executor!!.scheduleAtFixedRate({
                val events = watchKey.pollEvents()
                if (events.isNotEmpty()) {
                    println("Changes detected, reloading classes ...")
                    // unloadClasses(registry.classes.toTypedArray())
                    doInit(mainJarUrl)
                }
            }, 3, 3, TimeUnit.SECONDS)
        }
    }

    fun terminate() {
        executor?.shutdown()
        watchService?.close()
        // unloadClasses(registry.classes.toTypedArray())
    }

    /**
     * This must be called when this class is called in editor mode, i.e the game is not running.
     */
    fun bindClassLoader() {
        Thread.currentThread().contextClassLoader = classloader
    }

    private fun doInit(mainJar: URL) {
        registry = ClassRegistry()
        classloader = URLClassLoader(arrayOf(mainJar), this::class.java.classLoader)
        Thread.currentThread().contextClassLoader = classloader
        serviceLoader = ServiceLoader.load(Entry::class.java, classloader)
        val entry = serviceLoader.findFirst()

        if (entry.isPresent) {
            with(entry.get()) {
                Entry.Context(registry).init()
            }
            println("Loading classes: ${registry.classes.map { it.name }}")
            // loadClasses(registry.classes.toTypedArray())
        } else {
            System.err.println("Unable to find Entry class, no classes will be loaded")
        }
    }

    private external fun loadClasses(classes: Array<KtClass<*>>)
    private external fun unloadClasses(classes: Array<KtClass<*>>)
}
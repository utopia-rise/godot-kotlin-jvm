package godot.runtime

import godot.registration.KtClass
import godot.core.TypeManager
import godot.core.VariantParser
import godot.core.variantMapper
import godot.registration.ClassRegistry
import godot.registration.Entry
import godot.util.JVMLogging
import java.io.File
import java.net.URL
import java.net.URLClassLoader
import java.nio.file.FileSystems
import java.nio.file.StandardWatchEventKinds
import java.nio.file.WatchService
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit


internal class Bootstrap {
    private val classRegistries: MutableList<ClassRegistry> = mutableListOf()
    private lateinit var classloader: ClassLoader
    private lateinit var serviceLoader: ServiceLoader<Entry>
    private var executor: ScheduledExecutorService? = null
    private var watchService: WatchService? = null
    private var engineTypesRegistered: Boolean = false

    /** projectRootDir is empty if not in editor (only used for reloading)
     * userCodePath is empty if usercode loaded as part of the VM
     * loader is empty if usercode loaded as part of the VM
     **/
    fun init(projectRootDir: String, userCodePath: String, loader: ClassLoader?) {
        if (loader == null) {
            doInitGraal()
        } else {
            val userCodeFile = File(userCodePath)

            if (userCodeFile.exists()) {
                doInit(userCodeFile.toURI().toURL(), loader)
            } else {
                if (projectRootDir.isNotEmpty()) {
                    JVMLogging::warning
                } else {
                    JVMLogging::error
                }.invoke("No main.jar detected at $userCodeFile. No script will be loaded. Build the gradle project to load scripts.")
            }

            if (projectRootDir.isNotEmpty()) {
                watchService = FileSystems.getDefault().newWatchService()
                val watchKey = getBuildLockDir(projectRootDir).toPath().register(
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
                        if (File(getBuildLockDir(projectRootDir), "buildLock.lock").exists()) {
                            JVMLogging.info("Build lock present. Not reloading...")
                            return@scheduleAtFixedRate
                        }
                        JVMLogging.info("Changes detected, reloading classes ...")

                        if (::serviceLoader.isInitialized) {
                            clearClassesCache()
                            serviceLoader.reload()
                        }

                        if (userCodeFile.exists()) {
                            doInit(userCodeFile.toURI().toURL(), null) //no classloader so new main jar gets loaded
                        } else {
                            JVMLogging.warning("No main.jar detected. No classes will be loaded. Build the project to load classes")
                        }
                    }
                }, 3, 3, TimeUnit.SECONDS)
            }
        }
    }

    fun finish() {
        executor?.shutdown()
        watchService?.close()
        clearClassesCache()
        serviceLoader.reload()
    }

    private fun doInit(mainJar: URL, classLoader: ClassLoader?) {
        classloader = classLoader ?: URLClassLoader(arrayOf(mainJar), this::class.java.classLoader)
        Thread.currentThread().contextClassLoader = classloader
        serviceLoader = ServiceLoader.load(Entry::class.java, classloader)
        initializeUsingEntry()
    }

    private fun doInitGraal() {
        serviceLoader = ServiceLoader.load(Entry::class.java)
        initializeUsingEntry()
    }

    private fun initializeUsingEntry() {
        val entryIterator = serviceLoader.iterator()
        if (!entryIterator.hasNext()) {
            JVMLogging.error("Unable to find Entry class, no classes will be loaded")
        }

        val entries = buildList {
            while (entryIterator.hasNext()) {
                add(entryIterator.next())
            }
        }

        // the entry with the most class registrars is always the "main" entry. All other entries are from dependencies
        // reason: the "main" compilation generates the registration files from all class registrars (its own AND all from dependencies). Hence, it will always be the one with the highest registrar count
        val mainEntry = entries.maxBy { entry -> entry.classRegistrarCount }

        entries.forEach { entry ->
            val isMainEntry = entry == mainEntry

            val registry = ClassRegistry(
                projectName = entry.projectName,
                isDependency = !isMainEntry,
            )
            classRegistries.add(registry)

            val context = Entry.Context(registry)

            with(entry) {
                if (!engineTypesRegistered && isMainEntry) {
                    context.initEngineTypes()
                    for (clazz in context.getRegisteredClasses()) {
                        variantMapper[clazz] = VariantParser.OBJECT
                    }
                    registerManagedEngineTypes(
                        TypeManager.engineTypeNames.toTypedArray(),
                        TypeManager.engineSingletonsNames.toTypedArray()
                    )
                    engineTypesRegistered = true
                }

                context.init()
            }
        }

        val classes = classRegistries
            .flatMap { registry -> registry.classes }
            .toTypedArray()

        // START: order matters!
        loadClasses(classes)
        forceJvmInitializationOfSingletons()
        // END: order matters!
    }

    private fun getBuildLockDir(projectDir: String): File {
        val name = "${File(projectDir).name}_buildLockDir" //keep the same in the gradle plugin!
        val tmpDir = System.getProperty("java.io.tmpdir")
        val lockDir = File(tmpDir, name)

        return if (lockDir.exists() && lockDir.isDirectory) {
            lockDir
        } else {
            lockDir.delete()
            lockDir.mkdirs()
            lockDir
        }
    }

    private fun clearClassesCache() {
        classRegistries.clear()
        TypeManager.clearUserTypes()
    }

    private fun forceJvmInitializationOfSingletons() {
        TypeManager.engineSingletonsNames.forEachIndexed { index, _ ->
            TypeManager.engineTypesConstructors[index]()
        }
    }

    private external fun loadClasses(classes: Array<KtClass<*>>)

    private external fun registerManagedEngineTypes(
        engineTypesNames: Array<String>,
        engineSingletonNames: Array<String>
    )
}

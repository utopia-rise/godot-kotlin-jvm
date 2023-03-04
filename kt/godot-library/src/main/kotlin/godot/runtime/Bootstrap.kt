package godot.runtime

import godot.core.KtClass
import godot.core.TypeManager
import godot.core.VariantType
import godot.core.variantMapper
import godot.registration.ClassRegistry
import godot.registration.Entry
import godot.util.err
import godot.util.info
import godot.util.warning
import java.io.File
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


internal class Bootstrap {
    private val classRegistries: MutableList<ClassRegistry> = mutableListOf()
    private lateinit var classloader: ClassLoader
    private lateinit var serviceLoader: ServiceLoader<Entry>
    private var executor: ScheduledExecutorService? = null
    private var watchService: WatchService? = null
    private var engineTypesRegistered: Boolean = false

    fun init(isEditor: Boolean, projectRootDir: String, jarRootDir: String, jarFile: String, loader: ClassLoader?) {
        if (jarFile == "graal_usercode") {
            doInitGraal()
        } else {
            val libsDir = Paths.get(jarRootDir)
            val mainJarPath = libsDir.resolve(jarFile)

            if (File(mainJarPath.toString()).exists()) {
                doInit(mainJarPath.toUri().toURL(), loader)
            } else {
                if (isEditor) {
                    ::warning
                } else {
                    ::err
                }.invoke("No main.jar detected. No classes will be loaded. Build the gradle project to load classes")
            }

            if (isEditor) {
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
                            info("Build lock present. Not reloading...")
                            return@scheduleAtFixedRate
                        }
                        info("Changes detected, reloading classes ...")
                        clearClassesCache()
                        serviceLoader.reload()

                        if (File(mainJarPath.toString()).exists()) {
                            doInit(mainJarPath.toUri().toURL(), null) //no classloader so new main jar get's loaded
                        } else {
                            warning("No main.jar detected. No classes will be loaded. Build the project to load classes")
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

    /**
     * This must be called when this class is called in editor mode, i.e the game is not running.
     */
    fun bindClassLoader() {
        Thread.currentThread().contextClassLoader = classloader
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
            err("Unable to find Entry class, no classes will be loaded")
        }

        val entries = buildList {
            while (entryIterator.hasNext()) {
                add(entryIterator.next())
            }
        }

        // the entry with the most dependencies is always the "main" entry. All other entries are from dependencies
        // reason: the "main" entry file combines all dependencies. Hence, it will always be the one with the highest dependency count
        val mainEntry = entries.maxBy { entry -> entry.dependencyCount }

        entries.forEach { entry ->
            val isMainEntry = entry == mainEntry

            val registry = ClassRegistry(
                projectName = entry.projectName,
                isDependency = !isMainEntry,
                baseResourcePath = mainEntry.userScriptResourcePathPrefix
            )
            classRegistries.add(registry)

            val context = Entry.Context(registry)

            with(entry) {
                if (!engineTypesRegistered) {
                    context.initEngineTypes()
                    for (clazz in context.getRegisteredClasses()) {
                        variantMapper[clazz] = VariantType.OBJECT
                    }
                    registerManagedEngineTypes(
                        TypeManager.engineTypeNames.toTypedArray(),
                        TypeManager.engineSingletonsNames.toTypedArray(),
                        TypeManager.engineTypeMethod.map { it.second }.toTypedArray(),
                        TypeManager.engineTypeMethod.map { it.first }.toTypedArray()
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
        registerUserTypesNames(TypeManager.userTypes.toTypedArray())
        registerUserTypesMembers()
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
        val classes = classRegistries
            .flatMap { registry -> registry.classes }
            .toTypedArray()

        unloadClasses(classes)
        classRegistries.clear()
    }

    private fun forceJvmInitializationOfSingletons() {
        TypeManager.engineSingletonsNames.forEachIndexed { index, _ ->
            TypeManager.engineTypesConstructors[index]()
        }
    }

    private external fun loadClasses(classes: Array<KtClass<*>>)
    private external fun unloadClasses(classes: Array<KtClass<*>>)

    private external fun registerManagedEngineTypes(
        engineTypesNames: Array<String>,
        engineSingletonNames: Array<String>,
        engineTypeMethodNames: Array<String>,
        typeOfMethods: Array<Int>
    )

    private external fun registerUserTypesNames(userTypesNames: Array<String>)
    private external fun registerUserTypesMembers()
}

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
    private var registry: ClassRegistry? = null
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
    }

    /**
     * This must be called when this class is called in editor mode, i.e the game is not running.
     */
    fun bindClassLoader() {
        Thread.currentThread().contextClassLoader = classloader
    }

    private fun doInit(mainJar: URL, classLoader: ClassLoader?) {
        registry = ClassRegistry()
        classloader = classLoader ?: URLClassLoader(arrayOf(mainJar), this::class.java.classLoader)
        Thread.currentThread().contextClassLoader = classloader
        serviceLoader = ServiceLoader.load(Entry::class.java, classloader)
        initializeUsingEntry()
    }

    private fun doInitGraal() {
        registry = ClassRegistry()
        serviceLoader = ServiceLoader.load(Entry::class.java)
        initializeUsingEntry()
    }

    private fun initializeUsingEntry() {
        val entryIterator = serviceLoader.iterator()
        if (!entryIterator.hasNext()) {
            err("Unable to find Entry class, no classes will be loaded")
        }
        var dependencyResourcePathRebinds: Map<String, String>? = null
        while (entryIterator.hasNext()) {
            with(entryIterator.next()) {
                val context = Entry.Context(registry!!)

                // the entry with the most rebind definitions is always the "main" entry. All other entries are from dependencies
                // reason: the "main" entry file combines all needed rebinds from all dependencies. Hence, it will always be the one with the most rebinds or 0 in case there are no dependencies which require rebinds
                if (dependencyResourcePathRebinds == null || context.dependencyRebinds().size > dependencyResourcePathRebinds!!.size) {
                    dependencyResourcePathRebinds = context.dependencyRebinds()
                }

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


        // START: order matters!
        rebindClasses(dependencyResourcePathRebinds) // has to be the firs step!
        loadClasses(registry!!.classes.toTypedArray())
        registerUserTypesNames(
            TypeManager
                .userTypes
                .map { resPath ->
                    // rebinds the resource path for dependencies where necessary
                    dependencyResourcePathRebinds?.get(resPath) ?: resPath
                }
                .toTypedArray()
        )
        registerUserTypesMembers()
        forceJvmInitializationOfSingletons()
        // END: order matters!
    }

    /**
     * This rebinds the registered resource path from dependencies to a new one defined by the "main" compilation
     *
     * This has to be done BEFORE any load/reload logic takes place so the cpp side only sees the "new"/"correct" resource path's
     */
    private fun rebindClasses(resourcePathRebindings: Map<String, String>?) {
        val reboundClasses = registry!!.classes.map { ktClass ->
            val rebind = resourcePathRebindings?.get(ktClass.name)
            if (rebind != null) {
                ktClass.copy(name = rebind)
            } else {
                ktClass
            }
        }

        registry!!.classes.apply {
            clear()
            addAll(reboundClasses)
        }
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
        registry?.let {
            unloadClasses(it.classes.toTypedArray())
            it.classes.clear()
        }
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

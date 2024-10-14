package godot.runtime

import godot.core.KtClass
import godot.core.TypeManager
import godot.core.VariantParser
import godot.core.variantMapper
import godot.registration.ClassRegistry
import godot.registration.Entry
import godot.core.JVMLogging
import java.io.File
import java.net.URL
import java.net.URLClassLoader
import java.util.*


internal class Bootstrap {
    private lateinit var classloader: ClassLoader
    private lateinit var serviceLoader: ServiceLoader<Entry>

    /** projectRootDir is empty if not in editor (only used for reloading)
     * userCodePath is empty if usercode loaded as part of the VM
     * loader is empty if usercode loaded as part of the VM
     **/
    fun init(projectRootDir: String, userCodePath: String, loader: ClassLoader?) {
        if (loader == null) {
            doInitGraal()
        } else {
            val userCodeFile = File(userCodePath)
            doInit(userCodeFile.toURI().toURL(), loader)
        }
    }

    fun finish() {
        Thread.currentThread().contextClassLoader = null
        clearClassesCache()
        serviceLoader.reload()
    }

    private fun doInit(mainJar: URL, classLoader: ClassLoader?) {
        classloader = classLoader ?: URLClassLoader(arrayOf(mainJar), this::class.java.classLoader)
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
        val classRegistries = mutableListOf<ClassRegistry>()

        entries.forEach { entry ->
            val isMainEntry = entry == mainEntry

            val registry = ClassRegistry(
                projectName = entry.projectName,
                isDependency = !isMainEntry,
            )

            classRegistries.add(registry)
            val context = Entry.Context(registry)

            with(entry) {
                if (isMainEntry) {
                    context.initEngineTypes()
                    registerManagedEngineTypes(
                        TypeManager.engineTypeNames.toTypedArray(),
                        TypeManager.engineSingletonsNames.toTypedArray()
                    )
                }
                for (clazz in context.getRegisteredClasses()) {
                    variantMapper[clazz] = VariantParser.OBJECT
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

    private fun clearClassesCache() {
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

package godot.runtime

import godot.core.KtClass
import godot.core.VariantParser
import godot.core.variantMapper
import godot.internal.logging.JVMLogging
import godot.internal.reflection.TypeManager
import godot.registration.ClassRegistry
import godot.registration.Entry
import godot.utils.GodotBuildProperties
import java.util.*


internal class Bootstrap {
    private lateinit var serviceLoader: ServiceLoader<Entry>


    fun initJar(loader: ClassLoader) {
        serviceLoader = ServiceLoader.load(Entry::class.java, loader)
        initializeUsingEntry()
    }

    fun initNativeImage() {
        serviceLoader = ServiceLoader.load(Entry::class.java)
        initializeUsingEntry()
    }

    fun getVersion(): String{
        // we cannot use the assembled version here as it includes the git hash on local dev builds which is not present
        // on the cpp side
        // hence we assemble it manually here
        return "${GodotBuildProperties.godotKotlinJvmVersion}-${GodotBuildProperties.godotVersion}"
    }

    fun finish() {
        Thread.currentThread().contextClassLoader = null
        clearClassesCache()
        serviceLoader.reload()
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

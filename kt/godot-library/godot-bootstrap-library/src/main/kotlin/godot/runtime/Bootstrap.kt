package godot.runtime

import godot.common.GODOT_KOTLIN_VERSION
import godot.core.KtClass
import godot.core.VariantParser
import godot.core.variantMapper
import godot.internal.logging.JVMLogging
import godot.internal.reflection.TypeManager
import godot.registerEngineTypeMethods
import godot.registerEngineTypes
import godot.registerVariantMapping
import godot.registration.ClassRegistry
import godot.registration.Entry
import java.util.ServiceLoader

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

    fun getVersion(): String {
        // we cannot use the assembled version here as it includes the git hash on local dev builds which is not present
        // on the cpp side
        // hence we assemble it manually here
        return GODOT_KOTLIN_VERSION
    }

    fun finish() {
        clearClassesCache()
        serviceLoader.reload()
    }

    fun initializeEngineTypes() {
        registerVariantMapping()
        registerEngineTypes()
        registerEngineTypeMethods()

        registerManagedEngineTypes(
            TypeManager.engineTypeNames.toTypedArray(),
            TypeManager.engineSingletonsNames.toTypedArray()
        )
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

        val classRegistries = mutableListOf<ClassRegistry>()

        entries.forEach { entry ->
            val registry = ClassRegistry()

            classRegistries.add(registry)

            with(entry) {
                for (clazz in registry.getRegisteredClasses()) {
                    variantMapper[clazz] = VariantParser.OBJECT
                }
                registry.init()
            }
        }

        val classes = classRegistries
            .flatMap { registry -> registry.classes }
            .toTypedArray()

        // START: order matters!
        loadClasses(classes)

        TypeManager.clearScriptClassCache()
        
        forceJvmInitializationOfSingletons()
        // END: order matters!

        fun forceJvmInitializationOfScripts() {
            // Has to run after all classes are initialized in case a static block needs a Godot type
            entries.zip(classRegistries).forEach { (entry, registry) ->
                with(entry) {
                    registry.getRegisteredClasses().forEach { clazz ->
                    // Force init of the class so any static block runs.
                    Class.forName(clazz.java.name, true, clazz.java.classLoader)
                }
                }
            }
        }

        forceJvmInitializationOfScripts()
    }

    private fun clearClassesCache() {
        TypeManager.clearUserTypes()
    }

    private fun forceJvmInitializationOfSingletons() {
        TypeManager.singletonsConstructors.forEach {
            it()
        }
    }

    private external fun loadClasses(classes: Array<KtClass<*>>)

    private external fun registerManagedEngineTypes(
        engineTypesNames: Array<String>,
        engineSingletonNames: Array<String>
    )
}

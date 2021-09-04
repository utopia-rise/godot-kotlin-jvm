package godot.runtime

import godot.core.KtClass
import godot.core.KtObject
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

    fun init() {
        registry = ClassRegistry()
        try {
            val entryFile = Class.forName("godot.Entry").declaredConstructors.first().newInstance() as Entry

            with(entryFile) {
                val context = Entry.Context(registry!!)

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

                context.init()
            }
            loadClasses(registry!!.classes.toTypedArray())
            registerUserTypesNames(TypeManager.userTypes.toTypedArray())
            registerUserTypesMembers()
        } catch (e: Throwable) {
            err("Unable to find Entry class, no classes will be loaded")
        }
    }

    fun finish() {
        registry?.let {
            unloadClasses(it.classes.toTypedArray())
            it.classes.clear()
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

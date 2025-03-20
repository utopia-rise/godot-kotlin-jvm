package godot.codegen.generation.rule

import com.squareup.kotlinpoet.MemberName
import godot.codegen.generation.Context
import godot.codegen.generation.task.RegistrationTask
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.godotCorePackage

class RegistrationRule() : GodotApiRule<RegistrationTask>() {
    override fun apply(task: RegistrationTask, context: Context) {
        val types = context
            .classRepository
            .listTypes()

        val coreTypes = types
            .filter { it.isCoreClass() }

        val apiTypes = types
            .filter { !it.isCoreClass() }
            .filter {  //Remove class extending singletons
                val parent = it.parent
                parent == null || parent.isSingleton == false
            }

        (coreTypes + apiTypes)
            .filter { clazz ->  //Remove class extending singletons
                val parent = clazz.parent
                parent == null || parent.isSingleton == false
            }.onEach { clazz ->
                task.addVariantMapping(clazz)
                task.addClassRegistering(clazz)
                task.addMethodBindings(clazz)
            }
    }

    fun RegistrationTask.addVariantMapping(enrichedClass: EnrichedClass) {
        variantMapper.addStatement(
            "%M[%T::class] = %T",
            MemberName(godotCorePackage, "variantMapper"),
            enrichedClass.getClassName(),
            enrichedClass.getVariantConverter()
        )
    }

    fun RegistrationTask.addClassRegistering(clazz: EnrichedClass) {
        val formatString: String
        if (clazz.isSingleton) {
            engineTypes.addStatement("%T.registerSingleton(%S)·{·%T·}", TYPE_MANAGER, clazz.identifier, clazz.getClassName())
            formatString = "%T.registerEngineType(%S,·%T::class)·{·%T·}"
        } else {
            formatString = "%T.registerEngineType(%S,·%T::class,·::%T)"
        }
        engineTypes.addStatement(
            formatString,
            TYPE_MANAGER,
            clazz.identifier,
            clazz.getClassName(),
            clazz.getClassName()
        )
    }

    fun RegistrationTask.addMethodBindings(clazz: EnrichedClass) {
        engineMethods.addStatement(
            "%T",
            clazz.getClassName().nestedClass(methodBindingsInnerClassName)
        )
    }
}

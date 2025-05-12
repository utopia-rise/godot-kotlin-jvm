package godot.codegen.generation.rule

import com.squareup.kotlinpoet.MemberName
import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.ApiTask
import godot.codegen.generation.task.RegistrationTask
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.godotCorePackage

class RegistrationRule() : GodotApiRule<ApiTask>() {
    override fun apply(task: ApiTask, context: GenerationContext) {
        val coreTypes = context.classList
            .filter { it.isCoreClass() }

        val apiTypes = context.classList
            .filter { !it.isCoreClass() }
            .filter {  //Remove class extending singletons
                val parent = it.parent
                parent == null || parent.isSingleton == false
            }

        val registrationTask = RegistrationTask()
        (coreTypes + apiTypes)
            .filter { clazz ->  //Remove class extending singletons
                val parent = clazz.parent
                parent == null || parent.isSingleton == false
            }.onEach { clazz ->
                registrationTask.addVariantMapping(clazz)
                registrationTask.addClassRegistering(clazz)
                registrationTask.addMethodBindings(clazz)
            }

        task.registrationFiles.add(registrationTask)
    }

    fun RegistrationTask.addVariantMapping(enrichedClass: EnrichedClass) {
        variantMapper.addStatement(
            "%M(%T::class, %T)",
            MemberName(godotCorePackage, "addVariantMapping"),
            enrichedClass.className,
            enrichedClass.getVariantConverter()
        )
    }

    fun RegistrationTask.addClassRegistering(clazz: EnrichedClass) {
        val formatString: String
        if (clazz.isSingleton) {
            engineTypes.addStatement("%T.registerSingleton(%S)·{·%T·}", TYPE_MANAGER, clazz.identifier, clazz.className)
            formatString = "%T.registerEngineType(%S,·%T::class)·{·%T·}"
        } else {
            formatString = "%T.registerEngineType(%S,·%T::class,·::%T)"
        }
        engineTypes.addStatement(
            formatString,
            TYPE_MANAGER,
            clazz.identifier,
            clazz.className,
            clazz.className
        )
    }

    fun RegistrationTask.addMethodBindings(clazz: EnrichedClass) {
        engineMethods.addStatement(
            "%T",
            clazz.className.nestedClass(methodBindingsInnerClassName)
        )
    }
}

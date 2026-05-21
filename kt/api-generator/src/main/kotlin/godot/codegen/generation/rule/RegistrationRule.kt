package godot.codegen.generation.rule

import com.squareup.kotlinpoet.CodeBlock
import godot.codegen.constants.API
import godot.codegen.constants.Internal
import godot.codegen.constants.Utils
import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.ApiTask
import godot.codegen.generation.task.RegistrationTask
import godot.codegen.models.enriched.EnrichedClass

class RegistrationRule : GodotApiRule<ApiTask>() {
    override fun apply(task: ApiTask, context: GenerationContext) {
        val coreTypes = context
            .classList
            .filter { it.isCoreModule() }

        val apiTypes = context
            .classList
            .filter { !it.isCoreModule() }

        val registrationTask = RegistrationTask()
        (coreTypes + apiTypes)
            .filter { clazz ->
                val parent = clazz.parent
                parent == null || !parent.isSingleton
            }
            .onEach { clazz ->
                registrationTask.addVariantMapping(clazz)
                registrationTask.addClassRegistering(clazz)
                registrationTask.addMethodBindings(clazz)
            }

        task.registrationFiles.add(registrationTask)
    }

    private fun RegistrationTask.addVariantMapping(enrichedClass: EnrichedClass) {
        variantMapper.addStatement(
            "%M(%T::class, %M)",
            Utils.addVariantMapping,
            enrichedClass.className,
            enrichedClass.getVariantConverter()
        )
    }

    private fun RegistrationTask.addClassRegistering(clazz: EnrichedClass) {
        val typeManager = Internal.typeManager

        if (clazz.isSingleton) {
            engineTypes.addCode(
                CodeBlock.builder()
                    .add("%T.registerSingleton(", typeManager)
                    .add("%S", clazz.identifier)
                    .add(")·{·%T·}\n", clazz.className)
                    .build()
            )
            engineTypes.addCode(
                CodeBlock.builder()
                    .add("%T.registerEngineType(", typeManager)
                    .add("%S,·", clazz.identifier)
                    .add("%T::class", clazz.className)
                    .add(")·{·%T·}\n", clazz.className)
                    .build()
            )
        } else if (clazz.isAbstract) {
            engineTypes.addStatement(
                "%T.registerEngineType(%S,·%T::class,·::%T)",
                typeManager,
                clazz.identifier,
                clazz.className,
                clazz.abstractDummyClassName,
            )
        } else {
            engineTypes.addStatement(
                "%T.registerEngineType(%S,·%T::class,·::%T)",
                typeManager,
                clazz.identifier,
                clazz.className,
                clazz.className
            )
        }
    }

    private fun RegistrationTask.addMethodBindings(clazz: EnrichedClass) {
        engineMethods.addStatement(
            "%T",
            clazz.className.nestedClass(API.methodBindingsInnerClassName)
        )
    }
}

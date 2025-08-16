package godot.codegen.generation.rule

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.EnrichedClassTask
import godot.codegen.generation.task.EnrichedConstantTask
import godot.codegen.generation.task.EnrichedEnumTask
import godot.codegen.generation.task.EnrichedMethodTask
import godot.codegen.generation.task.EnrichedPropertyTask
import godot.codegen.generation.task.SignalTask
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.traits.addKdoc
import godot.tools.common.constants.GODOT_BASE_TYPE
import godot.tools.common.constants.KT_OBJECT
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.VOID_PTR


class MemberRule : GodotApiRule<EnrichedClassTask>() {
    override fun apply(task: EnrichedClassTask, context: GenerationContext) = configure(task.builder) {
        val clazz = task.clazz

        for (constant in clazz.constants) {
            task.constants.add(EnrichedConstantTask(constant))
        }

        for (signal in clazz.signals) {
            task.signals.add(SignalTask(signal))
        }

        for (method in clazz.methods) {
            if(!canGenerateMethod(context, method)) continue

            if (method.isStatic) {
                task.enrichedStaticMethods.add(EnrichedMethodTask(method, clazz))
            } else {
                task.enrichedMethods.add(EnrichedMethodTask(method, clazz))
            }
        }

        for (property in clazz.properties) {
            if (property.getterMethod == null && property.setterMethod == null) {
                continue
            }
            task.enrichedProperties.add(EnrichedPropertyTask(property))
        }

        for (enum in clazz.enums) {
            task.enums.add(EnrichedEnumTask(enum))
        }

        val baseClass = task.clazz.parent?.className ?: KT_OBJECT
        superclass(baseClass)

        if (task.clazz.isSingleton) {
            generateSingletonConstructor(context)
        } else {
            if (clazz.isAbstract) {
                addModifiers(KModifier.ABSTRACT)
            } else {
                addModifiers(KModifier.OPEN)
            }
            generateClassConstructor(clazz.isInstantiable,  context)
        }

        addKdoc(clazz)
        addAnnotation(GODOT_BASE_TYPE)

        val parent = task.clazz.parent?: return@configure
        for (method in parent.methods.filter { it.isAbstract }) {
            if(!canGenerateMethod(context, method)) continue
            val overrideMethod = method.override()
            task.enrichedMethods.add(EnrichedMethodTask(overrideMethod, clazz))
        }
    }

    private fun canGenerateMethod(context: GenerationContext, method: EnrichedMethod): Boolean {
        if (context.isNativeStructure(method.type.identifier)) {
            return false
        }
        for (argument in method.arguments) {
            if (context.isNativeStructure(argument.type.identifier)) {
                return false
            }
        }
        return true
    }

    private fun TypeSpec.Builder.generateClassConstructor(
        isInstantiable: Boolean,
        context: GenerationContext
    ): TypeSpec.Builder {

        if (!isInstantiable) {
            primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .build()
            )
        }

        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Unit::class)
                .addStatement(
                    "createNativeObject(${context.getNextEngineClassIndex()}, scriptIndex)"
                )
                .build()
        )
        return this
    }

    private fun TypeSpec.Builder.generateSingletonConstructor(context: GenerationContext): TypeSpec.Builder {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Unit::class)
                .addStatement(
                    "getSingleton(${context.getNextSingletonIndex()})"
                )
                .build()
        )
        return this
    }

}

class BindingRule : GodotApiRule<EnrichedClassTask>() {
    override fun apply(task: EnrichedClassTask, context: GenerationContext) = configure(task.builder) {
        val clazz = task.clazz
        clazz.methods
            .filter { !it.isVirtual }
            .onEach {
                task.bindings.addProperty(
                    PropertySpec
                        .builder(it.voidPtrVariableName, VOID_PTR)
                        .addModifiers(KModifier.INTERNAL)
                        .initializer(
                            "%T.getMethodBindPtr(%S,·%S,·%L)",
                            TYPE_MANAGER,
                            clazz.identifier,
                            it.originalName,
                            it.hash
                        )
                        .build()
                )
            }
    }
}

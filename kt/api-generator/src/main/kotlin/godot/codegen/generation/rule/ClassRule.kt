package godot.codegen.generation.rule

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.extensions.getClassName
import godot.codegen.generation.Context
import godot.codegen.generation.task.ClassTask
import godot.codegen.generation.task.ConstantTask
import godot.codegen.generation.task.EnumTask
import godot.codegen.generation.task.MethodTask
import godot.codegen.generation.task.PropertyTask
import godot.codegen.generation.task.SignalTask
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.GODOT_BASE_TYPE
import godot.tools.common.constants.KT_OBJECT
import godot.tools.common.constants.TYPE_MANAGER
import godot.tools.common.constants.VOID_PTR


class MemberRules : GodotApiRule<ClassTask>() {
    override fun apply(task: ClassTask, context: Context) = task.configure {
        val clazz = task.clazz

        for (constant in clazz.constants) {
            task.constants.add(ConstantTask(constant))
        }

        for (signal in clazz.signals) {
            task.signals.add(SignalTask(signal))
        }

        for (method in clazz.methods) {
            if (context.nativeStructureRepository.findMatchingType(method) != null) {
                continue
            }
            var shouldGenerate = true
            for (argument in method.arguments) {
                if (context.nativeStructureRepository.findMatchingType(argument) != null) {
                    shouldGenerate = false
                    break
                }
            }
            if (!shouldGenerate) {
                continue
            }

            if (method.isStatic) {
                task.staticMethods.add(MethodTask(method, clazz))
            } else {
                task.methods.add(MethodTask(method, clazz))
            }
        }

        for (property in clazz.properties) {
            if (property.getterMethod == null && property.setterMethod == null) {
                continue
            }
            task.properties.add(PropertyTask(property))
        }

        for (enum in clazz.enums) {
            task.enums.add(EnumTask(enum))
        }

        val baseClass = task.clazz.parent?.getClassName() ?: KT_OBJECT
        superclass(baseClass)

        if (task.clazz.isSingleton) {
            generateSingletonConstructor(context)
        } else {
            addModifiers(KModifier.OPEN)
            generateClassConstructor(task.clazz.isInstantiable, context)
        }

        addKdoc(clazz)
        addAnnotation(GODOT_BASE_TYPE)
    }

    private fun TypeSpec.Builder.generateClassConstructor(isInstantiable: Boolean, context: Context): TypeSpec.Builder {
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
                    "createNativeObject(${context.nextEngineClassIndex}, scriptIndex)"
                )
                .build()
        )
        ++context.nextEngineClassIndex
        return this
    }

    private fun TypeSpec.Builder.generateSingletonConstructor(context: Context): TypeSpec.Builder {
        addFunction(
            FunSpec.builder("new")
                .addModifiers(KModifier.OVERRIDE)
                .addParameter("scriptIndex", Int::class)
                .returns(Unit::class)
                .addStatement(
                    "getSingleton(${context.nextSingletonIndex})"
                )
                .build()
        )
        ++context.nextEngineClassIndex
        ++context.nextSingletonIndex
        return this
    }

}

class BindingRule : GodotApiRule<ClassTask>() {
    override fun apply(classTask: ClassTask, context: Context) = classTask.configure {
        val clazz = classTask.clazz
        (classTask.methods + classTask.staticMethods).map { it.method }
            .filter { !it.isVirtual }
            .onEach {
                classTask.bindings.addProperty(
                    PropertySpec
                        .builder(it.voidPtrVariableName, VOID_PTR)
                        .addModifiers(KModifier.INTERNAL)
                        .initializer(
                            "%T.getMethodBindPtr(%S,·%S,·%L)",
                            TYPE_MANAGER,
                            clazz.type,
                            it.godotName,
                            it.hash
                        )
                        .build()
                )
            }
    }
}

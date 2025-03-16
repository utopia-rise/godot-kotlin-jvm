package godot.codegen.generation.task

import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.extensions.getClassName
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.services.impl.methodBindingsInnerClassName


class ClassTask(
    val clazz: EnrichedClass
) : GenerationTask<TypeSpec.Builder, TypeSpec>() {

    override val generator = if (clazz.isSingleton) TypeSpec.objectBuilder(clazz.getClassName()) else TypeSpec.classBuilder(clazz.getClassName())

    val companion = if (clazz.isSingleton) generator else TypeSpec.companionObjectBuilder()

    val enums by subTask<EnumTask, _, _> { task, output -> addType(output) }

    val signals by subTask<SignalTask, _, _> { task, output ->
        addProperty(output)
    }
    val properties by subTask<PropertyTask, _, _> { task, output ->
        addProperty(output)
    }
    val methods by subTask<MethodTask, _, _> { task, output ->
        addFunction(output)
    }

    val constants by subTask<ConstantTask, _, _> { task, output ->
        companion.addProperty(output)
    }

    val staticMethods by subTask<MethodTask, _, _> { task, output ->
        companion.addFunction(output)
    }

    val bindings = TypeSpec.objectBuilder(clazz.getClassName().nestedClass(methodBindingsInnerClassName))

    override fun executeSingle(): TypeSpec {
        if (!clazz.isSingleton) {
            generator.addType(companion.build())
        }
        generator.addType(bindings.build())
        return generator.build()
    }
}


package godot.codegen.generation.task

import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.extensions.getClassName
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.common.util.back


class EnrichedClassTask(
    val clazz: EnrichedClass
) : ClassTask() {

    override val generator = if (clazz.isSingleton) TypeSpec.objectBuilder(clazz.getClassName()) else TypeSpec.classBuilder(clazz.getClassName())
    override val companion = if (clazz.isSingleton) generator else TypeSpec.companionObjectBuilder()
    val bindings = TypeSpec.objectBuilder(clazz.getClassName().nestedClass(methodBindingsInnerClassName))

    val enums by back<EnrichedEnumTask>(innerClasses)
    val signals by back<SignalTask>(properties)
    val enrichedProperties by back<EnrichedPropertyTask>(properties)
    val enrichedMethods by back<EnrichedMethodTask>(methods)
    val constants by back<EnrichedConstantTask>(staticProperties)
    val enrichedStaticMethods by back<EnrichedMethodTask>(staticMethods)

    override fun executeSingle(): TypeSpec {
        if (!clazz.isSingleton) {
            generator.addType(companion.build())
        }
        generator.addType(bindings.build())
        return generator.build()
    }
}


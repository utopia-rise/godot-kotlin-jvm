package godot.codegen.generation.task

import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.common.util.back


class EnrichedClassTask(
    val clazz: EnrichedClass
) : ClassTask() {

    override val builder = if (clazz.isSingleton) TypeSpec.objectBuilder(clazz.className) else TypeSpec.classBuilder(clazz.className)
    override val companion = if (clazz.isSingleton) builder else TypeSpec.companionObjectBuilder()
    val bindings = TypeSpec.objectBuilder(clazz.className.nestedClass(methodBindingsInnerClassName))

    val enums by back<EnrichedEnumTask>(innerClasses)
    val signals by back<SignalTask>(properties)
    val enrichedProperties by back<EnrichedPropertyTask>(properties)
    val enrichedMethods by back<EnrichedMethodTask>(methods)
    val constants by back<EnrichedConstantTask>(staticProperties)
    val enrichedStaticMethods by back<EnrichedMethodTask>(staticMethods)

    override fun executeSingle(): TypeSpec {
        if (!clazz.isSingleton) {
            builder.addType(companion.build())
        }
        builder.addType(bindings.build())
        return builder.build()
    }
}


package godot.codegen.generation.task

import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.enriched.EnrichedClass

class AbstractClassDummyTask(
    val clazz: EnrichedClass
) : ClassTask() {

    override val builder = TypeSpec.classBuilder(clazz.abstractDummyClassName)

    override fun executeSingle(): TypeSpec = builder.build()
}

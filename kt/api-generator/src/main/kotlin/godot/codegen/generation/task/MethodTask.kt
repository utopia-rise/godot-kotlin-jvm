package godot.codegen.generation.task

import com.squareup.kotlinpoet.FunSpec
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod

class MethodTask(
    val method: EnrichedMethod,
    val owner: EnrichedClass,
) : GenerationTask<FunSpec.Builder, FunSpec>() {

    override val generator = FunSpec.builder(method.name)

    override fun executeSingle() = generator.build()
}

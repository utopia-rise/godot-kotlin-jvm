package godot.codegen.generation.task

import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.models.enriched.EnrichedEnum

class EnrichedEnumTask(
    val enum: EnrichedEnum
) : ClassTask() {

    override val builder = if (enum.isEnum()) TypeSpec.enumBuilder(enum.className) else TypeSpec.classBuilder(enum.className)

    override fun executeSingle() = builder.build()
}

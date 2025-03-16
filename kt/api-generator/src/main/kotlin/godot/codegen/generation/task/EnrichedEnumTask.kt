package godot.codegen.generation.task

import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.extensions.getClassName
import godot.codegen.extensions.isEnum
import godot.codegen.models.enriched.EnrichedEnum

class EnrichedEnumTask(
    val enum: EnrichedEnum
) : ClassTask() {

    override val generator = if (enum.isEnum()) TypeSpec.enumBuilder(enum.getClassName()) else TypeSpec.classBuilder(enum.getClassName())

    override fun executeSingle() = generator.build()
}

package godot.codegen.generation.task

import com.squareup.kotlinpoet.FileSpec
import godot.codegen.extensions.getClassName
import godot.codegen.traits.TypedTrait

class FileTask(
    val type: TypedTrait
) : GenerationTask<FileSpec>() {

    val builder = FileSpec.builder(type.getClassName().packageName, type.getClassName().simpleName)

    val classes= subTask<EnrichedClassTask, _> { output -> builder.addType(output) }
    val enums= subTask<EnrichedEnumTask, _> { output -> builder.addType(output) }

    override fun executeSingle() = builder.build()
}

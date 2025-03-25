package godot.codegen.generation.task

import com.squareup.kotlinpoet.FileSpec
import godot.codegen.models.traits.TypeGenerationTrait

class FileTask(
    val type: TypeGenerationTrait
) : GenerationTask<FileSpec>() {

    val builder = run {
        val className = type.className
        FileSpec.builder(className.packageName, className.simpleName)
    }

    val classes = subTask<EnrichedClassTask, _> { output -> builder.addType(output) }
    val enums = subTask<EnrichedEnumTask, _> { output -> builder.addType(output) }

    override fun executeSingle() = builder.build()
}

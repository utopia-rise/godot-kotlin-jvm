package godot.codegen.generation.task

import com.squareup.kotlinpoet.FileSpec
import godot.codegen.extensions.getClassName
import godot.codegen.traits.TypedTrait

class FileTask(
    val type: TypedTrait
) : GenerationTask<FileSpec.Builder, FileSpec>() {

    override val generator = FileSpec.builder(type.getClassName().packageName, type.getClassName().simpleName)

    val classes by subTask<ClassTask, _, _> { task, output -> addType(output) }
    val enums by subTask<EnumTask, _, _> { task, output -> addType(output) }

    override fun executeSingle() = generator.build()
}

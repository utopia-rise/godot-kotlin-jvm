package godot.codegen.generation.task

import java.io.File


class ApiTask(
    val directory: File,
) : GenerationTask<Unit, Unit>() {

    override val generator = Unit

    val files by subTask<FileTask, _, _> { task, output ->
        output.writeTo(directory)
    }

    override fun executeSingle() = Unit
}

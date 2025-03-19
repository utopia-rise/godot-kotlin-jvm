package godot.codegen.generation.task

import java.io.File


class ApiTask(
    val directory: File,
) : GenerationTask<Unit>() {

    val builder = Unit

    val files = subTask<FileTask, _> { output ->
        output.writeTo(directory)
    }

    override fun executeSingle() = Unit
}

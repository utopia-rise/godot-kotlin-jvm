package godot.annotation.processor.classgraph

object ErrorsDatabase {
    val errors = mutableListOf<String>()

    fun add(error: String) = errors.add(error)
    fun isEmpty() = errors.isEmpty()
}

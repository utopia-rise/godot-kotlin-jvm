package godot.codegen.generation.task

import kotlin.properties.ReadOnlyProperty

abstract class GenerationTask<GENERATOR : Any, OUTPUT : Any> {

    abstract val generator: GENERATOR
    private val subtasks = mutableListOf<Pair<List<GenerationTask<*, *>>, GENERATOR.(Any, Any) -> Unit>>()

    @Suppress("UNCHECKED_CAST")
    fun <S : GenerationTask<T, U>, T : Any, U : Any> subTask(
        block: GENERATOR.(S, U) -> Unit
    ): ReadOnlyProperty<GenerationTask<GENERATOR, OUTPUT>, MutableList<S>> {
        val list = mutableListOf<S>()
        subtasks += (list to (block as GENERATOR.(Any, Any) -> Unit))
        return ReadOnlyProperty { _, _ -> list }
    }

    fun execute(): OUTPUT {
        for ((listTasks, block) in subtasks) {
            for (task in listTasks) {
                val output = task.execute()
                generator.block(task, output)
            }
        }
        return executeSingle()
    }

    protected abstract fun executeSingle(): OUTPUT
}

package godot.codegen.generation.task

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.common.util.AddOnlyCollection

abstract class GenerationTask<OUTPUT : Any> {

    private val subtasks = mutableListOf<Pair<AddOnlyCollection<GenerationTask<*>>, (Any) -> Unit>>()

    @Suppress("UNCHECKED_CAST")
    fun <S : GenerationTask<U>, U : Any> subTask(
        block: (U) -> Unit
    ): AddOnlyCollection<S> {
        val list = AddOnlyCollection<S>()
        subtasks += (list as AddOnlyCollection<GenerationTask<*>>) to (block as (Any) -> Unit)
        return list
    }

    fun execute(): OUTPUT {
        for ((listTasks, block) in subtasks) {
            for (task in listTasks) {
                val output = task.execute()
                block(output)
            }
        }
        return executeSingle()
    }

    protected abstract fun executeSingle(): OUTPUT
}

abstract class ClassTask : GenerationTask<TypeSpec>() {
    abstract val builder: TypeSpec.Builder
    open val companion = TypeSpec.companionObjectBuilder()

    val innerClasses = subTask<ClassTask, _> { output ->
        builder.addType(output)
    }

    val properties = subTask<PropertyTask, _> { output ->
        builder.addProperty(output)
    }

    val methods = subTask<MethodTask, _> { output ->
        builder.addFunction(output)
    }

    val staticProperties = subTask<PropertyTask, _> { output ->
        companion.addProperty(output)
    }

    val staticMethods = subTask<MethodTask, _> { output ->
        companion.addFunction(output)
    }
}

abstract class MethodTask : GenerationTask<FunSpec>() {
    abstract val builder: FunSpec.Builder
}

abstract class PropertyTask : GenerationTask<PropertySpec>() {
    abstract val builder: PropertySpec.Builder
}

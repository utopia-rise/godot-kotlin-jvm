package godot.codegen.generation.task

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import godot.common.util.AddOnlyCollection
import kotlin.properties.ReadOnlyProperty

abstract class GenerationTask<GENERATOR : Any, OUTPUT : Any> {

    abstract val generator: GENERATOR
    private val subtasks = mutableListOf<Pair<AddOnlyCollection<GenerationTask<*, *>>, GENERATOR.(Any, Any) -> Unit>>()

    @Suppress("UNCHECKED_CAST")
    fun <S : GenerationTask<T, U>, T : Any, U : Any> subTask(
        block: GENERATOR.(S, U) -> Unit
    ): ReadOnlyProperty<GenerationTask<GENERATOR, OUTPUT>, AddOnlyCollection<S>> {
        val list = AddOnlyCollection<S>()
        subtasks += (list as AddOnlyCollection<GenerationTask<*, *>>) to (block as GENERATOR.(Any, Any) -> Unit)
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

abstract class ClassTask : GenerationTask<TypeSpec.Builder, TypeSpec>() {
    open val companion = TypeSpec.companionObjectBuilder()

    val innerClasses by subTask<ClassTask, _, _> { task, output ->
        addType(output)
    }

    val properties by subTask<PropertyTask, _, _> { task, output ->
        addProperty(output)
    }
    val methods by subTask<MethodTask, _, _> { task, output ->
        addFunction(output)
    }

    val staticProperties by subTask<PropertyTask, _, _> { task, output ->
        companion.addProperty(output)
    }

    val staticMethods by subTask<MethodTask, _, _> { task, output ->
        companion.addFunction(output)
    }
}

abstract class MethodTask : GenerationTask<FunSpec.Builder, FunSpec>()
abstract class PropertyTask : GenerationTask<PropertySpec.Builder, PropertySpec>()

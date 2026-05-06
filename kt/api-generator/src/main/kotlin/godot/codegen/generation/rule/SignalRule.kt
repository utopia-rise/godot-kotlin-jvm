package godot.codegen.generation.rule

import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.SignalTask
import godot.codegen.models.traits.addKdoc
import godot.tools.common.names.CoreType

class SignalRule : GodotApiRule<SignalTask>() {
    override fun apply(task: SignalTask, context: GenerationContext) = configure(task.builder) {
        addKdoc(task.signal)
        delegate("%T", CoreType.signal(task.signal.genericParameters.size))
    }
}


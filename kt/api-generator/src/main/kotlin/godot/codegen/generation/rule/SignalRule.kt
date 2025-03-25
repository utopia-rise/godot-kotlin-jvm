package godot.codegen.generation.rule

import com.squareup.kotlinpoet.ClassName
import godot.codegen.generation.GenerationContext
import godot.codegen.generation.task.SignalTask
import godot.codegen.models.traits.addKdoc
import godot.tools.common.constants.godotCorePackage

class SignalRule : GodotApiRule<SignalTask>() {
    override fun apply(task: SignalTask, context: GenerationContext) = configure(task.builder) {
        addKdoc(task.signal)
        delegate("%T", ClassName(godotCorePackage, "Signal" + task.signal.genericParameters.size))
    }
}

package godot.codegen.generation.rule

import com.squareup.kotlinpoet.ClassName
import godot.codegen.generation.Context
import godot.codegen.generation.task.SignalTask
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.godotCorePackage

class SignalRule : GodotApiRule<SignalTask>() {
    override fun apply(task: SignalTask, context: Context) = configure(task.builder) {
        addKdoc(task.signal)
        delegate("%T", ClassName(godotCorePackage, "Signal" + task.signal.arguments.size))
    }
}

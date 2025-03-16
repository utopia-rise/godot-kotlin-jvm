package godot.codegen.generation.task

import com.squareup.kotlinpoet.PropertySpec
import godot.codegen.extensions.getTypeName
import godot.codegen.models.enriched.EnrichedSignal

class SignalTask(
    val signal: EnrichedSignal,
) : PropertyTask() {

    override val generator = PropertySpec.builder(signal.name, signal.getTypeName())

    override fun executeSingle() = generator.build()
}

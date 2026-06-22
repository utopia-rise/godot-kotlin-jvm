package godot.registrar.generator.generator.hint

import godot.core.PropertyHint as GodotPropertyHint

internal class StaticHintGenerator(
    private val typeHint: GodotPropertyHint,
    private val hintString: String,
) : HintGenerator {
    override fun generate(): GeneratedPropertyHint = GeneratedPropertyHint(typeHint, hintString)
}

package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.model.RegisteredProperty


class EnumHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {

    override fun getHintString(): String =
        ""//throw UnsupportedOperationException("Hint string for enums is handled by the binding at runtime.")
}

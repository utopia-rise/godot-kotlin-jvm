package godot.registrar.generator.generator.hintstring

internal class EmptyHintStringGenerator : HintStringGenerator {
    override fun generate(): String = ""
}

internal class PrimitiveHintStringGenerator(
    private val text: String,
) : HintStringGenerator {
    override fun generate(): String = text
}

internal class ObjectHintStringGenerator(
    private val text: String,
) : HintStringGenerator {
    override fun generate(): String = text
}

package godot.registrar.generator.generator.hintstring

import godot.core.VariantParser
import godot.registration.model.RegisteredProperty

internal class DictionaryHintStringGenerator(
    private val keyGenerator: HintStringGenerator?,
    private val valueGenerator: HintStringGenerator?,
    private val isUntyped: Boolean = false,
) : HintStringGenerator {
    constructor(
        registeredProperty: RegisteredProperty,
        keyGenerator: HintStringGenerator?,
        valueGenerator: HintStringGenerator?,
    ) : this(
        keyGenerator = keyGenerator,
        valueGenerator = valueGenerator,
        isUntyped = registeredProperty.type.genericArguments.firstOrNull()?.fqName == Any::class.qualifiedName,
    )

    override fun generate(): String {
        if (isUntyped) {
            return ""
        }

        val subHintString = listOfNotNull(
            keyGenerator?.generate(),
            valueGenerator?.generate(),
        ).joinToString(";")

        return if (subHintString.isEmpty()) {
            VariantParser.DICTIONARY.id.toString()
        } else {
            "${VariantParser.DICTIONARY.id}/$subHintString"
        }
    }
}

package godot.registrar.generator.generator.hintstring

import godot.core.VariantParser
import godot.registrar.generator.ext.getAsVariantTypeOrdinal
import godot.registration.model.RegisteredProperty

internal class ArrayHintStringGenerator(
    private val elementGenerator: HintStringGenerator?,
    private val prefix: String = "",
    private val isUntyped: Boolean = false,
) : HintStringGenerator {
    constructor(
        registeredProperty: RegisteredProperty,
        elementGenerator: HintStringGenerator?,
    ) : this(
        elementGenerator = elementGenerator,
        prefix = propertyPrefix(registeredProperty),
        isUntyped = isUntypedProperty(registeredProperty),
    )

    override fun generate(): String = if (isUntyped) {
        ""
    } else {
        "$prefix${VariantParser.ARRAY.id}${elementGenerator?.generate().orEmpty()}"
    }

    companion object {
        private fun propertyPrefix(registeredProperty: RegisteredProperty): String {
            val elementType = registeredProperty.type.genericArguments.firstOrNull()
            if (elementType != null) {
                return ""
            }

            val compatibleListType = registeredProperty.type.getAsVariantTypeOrdinal()
            return if (compatibleListType != VariantParser.ARRAY.id) {
                ":$compatibleListType"
            } else {
                ""
            }
        }

        private fun isUntypedProperty(registeredProperty: RegisteredProperty): Boolean =
            registeredProperty.type.genericArguments.firstOrNull()?.fqName == Any::class.qualifiedName
    }
}

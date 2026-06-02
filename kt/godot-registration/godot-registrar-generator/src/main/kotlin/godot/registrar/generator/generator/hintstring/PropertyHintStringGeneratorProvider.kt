package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.isCompatibleList
import godot.registrar.generator.ext.isDictionary
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isNodeType
import godot.registration.model.ext.isRefCounted
import godot.registration.model.hint.property.*


object PropertyHintStringGeneratorProvider {

    fun provide(
        registeredProperty: RegisteredProperty,
        context: GeneratorContext,
    ): PropertyHintStringGenerator<out PropertyHint> {
        val hintAnnotations = registeredProperty
            .hints
            .filterIsInstance<PropertyHint>()
            .distinctBy { it::class } // GH-731: when hint annotations are declared higher up in the hierarchy, we can get the same hint annotation multiple times. But we're only interested in one type of hint annotation for this check

        if (hintAnnotations.size > 1) {
            context.logger.error(
                "RegisteredProperty has more than one Hint annotation: ${hintAnnotations.joinToString()}",
                registeredProperty
            )
        }

        return when (hintAnnotations.firstOrNull()) {
            is ColorNoAlphaHint -> ColorNoAlphaHintStringGenerator(registeredProperty, context)

            is DirHint -> DirHintStringGenerator(registeredProperty, context)
            is EnumFlagHintStringHint, is EnumHintStringHint -> EnumHintStringGenerator(registeredProperty, context)

            is EnumListHintStringHint -> ArrayAndDictionaryHintStringGenerator(registeredProperty, context)

            is ExpEasingHint -> ExpEasingHintStringGenerator(registeredProperty, context)
            is FileHint -> FileHintStringGenerator(registeredProperty, context)
            is IntFlagHint -> IntFlagHintStringGenerator(registeredProperty, context)
            is MultilineTextHint -> MultilineTextHintStringGenerator(registeredProperty, context)

            is PlaceHolderTextHint -> PlaceHolderTextHintStringGenerator(registeredProperty, context)

            is RangeHint<*> -> RangeHintStringGenerator(registeredProperty, context)
            null -> when {
                registeredProperty.type.isNodeType() -> NodeTypeHintStringGenerator(registeredProperty, context)

                registeredProperty.type.isRefCounted() -> ResourceHintStringGenerator(registeredProperty, context)

                registeredProperty.type.isCompatibleList() -> ArrayAndDictionaryHintStringGenerator(registeredProperty, context)

                registeredProperty.type.isDictionary() -> ArrayAndDictionaryHintStringGenerator(registeredProperty, context)

                else -> object :
                    PropertyHintStringGenerator<PropertyHint>(registeredProperty, context) {
                    override fun getHintString(): String {
                        return ""
                    }
                }
            }
        }
    }
}

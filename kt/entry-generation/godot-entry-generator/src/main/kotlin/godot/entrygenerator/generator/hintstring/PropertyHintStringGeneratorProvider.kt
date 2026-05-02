package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isDictionary
import godot.entrygenerator.ext.isNodeType
import godot.entrygenerator.ext.isRefCounted
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.EnumFlagHintStringAnnotation
import godot.entrygenerator.model.EnumHintStringAnnotation
import godot.entrygenerator.model.EnumListHintStringAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.settings.Settings


object PropertyHintStringGeneratorProvider {

    fun provide(
        registeredProperty: RegisteredProperty,
        settings: Settings,
    ): PropertyHintStringGenerator<out PropertyHintAnnotation> {
        val hintAnnotations = registeredProperty
            .annotations
            .filterIsInstance<PropertyHintAnnotation>()
            .distinctBy { it::class } // GH-731: when hint annotations are declared higher up in the hierarchy, we can get the same hint annotation multiple times. But we're only interested in one type of hint annotation for this check

        if (hintAnnotations.size > 1) {
            EntryGenerator.logger.error(
                "RegisteredProperty has more than one Hint annotation: ${hintAnnotations.joinToString()}",
                registeredProperty
            )
        }

        return when(hintAnnotations.firstOrNull()) {
            is ColorNoAlphaHintAnnotation -> ColorNoAlphaHintStringGenerator(registeredProperty, settings)
            is DirHintAnnotation -> DirHintStringGenerator(registeredProperty, settings)
            is EnumFlagHintStringAnnotation,
            is EnumHintStringAnnotation -> EnumHintStringGenerator(registeredProperty, settings)
            is EnumListHintStringAnnotation -> ArrayAndDictionaryHintStringGenerator(registeredProperty, settings)
            is ExpEasingHintAnnotation -> ExpEasingHintStringGenerator(registeredProperty, settings)
            is FileHintAnnotation -> FileHintStringGenerator(registeredProperty, settings)
            is IntFlagHintAnnotation -> IntFlagHintStringGenerator(registeredProperty, settings)
            is MultilineTextHintAnnotation -> MultilineTextHintStringGenerator(registeredProperty, settings)
            is PlaceHolderTextHintAnnotation -> PlaceHolderTextHintStringGenerator(registeredProperty, settings)
            is RangeHintAnnotation<*> -> RangeHintStringGenerator(registeredProperty, settings)
            null -> when {
                registeredProperty.type.isNodeType() -> NodeTypeHintStringGenerator(registeredProperty, settings)
                registeredProperty.type.isRefCounted() -> ResourceHintStringGenerator(registeredProperty, settings)
                registeredProperty.type.isCompatibleList() -> ArrayAndDictionaryHintStringGenerator(registeredProperty, settings)
                registeredProperty.type.isDictionary() -> ArrayAndDictionaryHintStringGenerator(registeredProperty, settings)
                else -> object : PropertyHintStringGenerator<PropertyHintAnnotation>(registeredProperty, settings) {
                    override fun getHintString(): String {
                        return ""
                    }
                }
            }
        }
    }
}

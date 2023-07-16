package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isNodeType
import godot.entrygenerator.ext.isReference
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


object PropertyHintStringGeneratorProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): PropertyHintStringGenerator<out PropertyHintAnnotation> {
        val hintAnnotations = registeredProperty.annotations.filterIsInstance<PropertyHintAnnotation>()
        if (hintAnnotations.size > 1) {
            EntryGenerator.logger.error(registeredProperty, "RegisteredProperty has more than one Hint annotation: ${hintAnnotations.joinToString()}")
        }

        return when(hintAnnotations.firstOrNull()) {
            is ColorNoAlphaHintAnnotation -> ColorNoAlphaHintStringGenerator(registeredProperty)
            is DirHintAnnotation -> DirHintStringGenerator(registeredProperty)
            is EnumFlagHintStringAnnotation,
            is EnumHintStringAnnotation -> EnumHintStringGenerator(registeredProperty)
            is EnumListHintStringAnnotation -> ArrayHintStringGenerator(registeredProperty)
            is ExpEasingHintAnnotation -> ExpEasingHintStringGenerator(registeredProperty)
            is FileHintAnnotation -> FileHintStringGenerator(registeredProperty)
            is IntFlagHintAnnotation -> IntFlagHintStringGenerator(registeredProperty)
            is MultilineTextHintAnnotation -> MultilineTextHintStringGenerator(registeredProperty)
            is PlaceHolderTextHintAnnotation -> PlaceHolderTextHintStringGenerator(registeredProperty)
            is RangeHintAnnotation<*> -> RangeHintStringGenerator(registeredProperty)
            null -> when {
                registeredProperty.type.isNodeType() -> NodeTypeHintStringGenerator(registeredProperty)
                registeredProperty.type.isReference() -> ResourceHintStringGenerator(registeredProperty)
                registeredProperty.type.isCompatibleList() -> ArrayHintStringGenerator(registeredProperty)
                else -> object : PropertyHintStringGenerator<PropertyHintAnnotation>(registeredProperty) {
                    override fun getHintString(): String {
                        return ""
                    }
                }
            }
        }
    }
}

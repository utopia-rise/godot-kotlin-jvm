package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.ext.isReference
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.EnumFlagHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.ExpRangeHintAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.FloatRangeHintAnnotation
import godot.entrygenerator.model.IntFlagHintAnnotation
import godot.entrygenerator.model.IntRangeHintAnnotation
import godot.entrygenerator.model.LongRangeHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind


object PropertyHintStringGeneratorProvider {

    fun provide(
        registeredProperty: RegisteredProperty
    ): PropertyHintStringGenerator<out PropertyHintAnnotation> {
        val hintAnnotations = registeredProperty.annotations.filterIsInstance<PropertyHintAnnotation>()
        if (hintAnnotations.size > 1) {
            EntryGenerator.logger.error("RegisteredProperty ${registeredProperty.fqName} has more than one Hint annotation: ${hintAnnotations.joinToString()}")
        }

        return when(hintAnnotations.firstOrNull()) {
            ColorNoAlphaHintAnnotation -> ColorNoAlphaHintStringGenerator(registeredProperty)
            is DirHintAnnotation -> DirHintStringGenerator(registeredProperty)
            EnumFlagHintAnnotation -> throw UnsupportedOperationException("Hint string for enums is handled by the binding at runtime.")
            is ExpEasingHintAnnotation -> ExpEasingHintStringGenerator(registeredProperty)
            is FileHintAnnotation -> FileHintStringGenerator(registeredProperty)
            is IntFlagHintAnnotation -> IntFlagHintStringGenerator(registeredProperty)
            MultilineTextHintAnnotation -> MultilineTextHintStringGenerator(registeredProperty)
            PlaceHolderTextHintAnnotation -> PlaceHolderTextHintStringGenerator(registeredProperty)
            is DoubleRangeHintAnnotation -> DoubleRangeHintStringGenerator(registeredProperty)
            is ExpRangeHintAnnotation -> ExpRangeHintStringGenerator(registeredProperty)
            is FloatRangeHintAnnotation -> FloatRangeHintStringGenerator(registeredProperty)
            is IntRangeHintAnnotation -> IntRangeHintStringGenerator(registeredProperty)
            is LongRangeHintAnnotation -> LongRangeHintStringGenerator(registeredProperty)
            null -> when {
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

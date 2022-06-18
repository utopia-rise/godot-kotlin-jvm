package godot.entrygenerator.generator.typehint.primitives

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongPropertyAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.ExpRangeHintAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.FloatRangeHintAnnotation
import godot.entrygenerator.model.IntRangeHintAnnotation
import godot.entrygenerator.model.LongRangeHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class JvmPrimitivesTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
            is IntRangeHintAnnotation,
            is FloatRangeHintAnnotation,
            is LongRangeHintAnnotation,
            is DoubleRangeHintAnnotation -> ClassName("godot.core.PropertyHint", "RANGE")
            is ExpRangeHintAnnotation -> ClassName("godot.core.PropertyHint", "EXP_RANGE")
            is ExpEasingHintAnnotation -> ClassName("godot.core.PropertyHint", "EXP_EASING")
            is FileHintAnnotation -> if (propertyHintAnnotation.global) {
                ClassName("godot.core.PropertyHint", "GLOBAL_FILE")
            } else {
                ClassName("godot.core.PropertyHint", "FILE")
            }
            is DirHintAnnotation -> if (propertyHintAnnotation.global) {
                ClassName("godot.core.PropertyHint", "GLOBAL_DIR")
            } else {
                ClassName("godot.core.PropertyHint", "DIR")
            }
            is MultilineTextHintAnnotation -> ClassName("godot.core.PropertyHint", "MULTILINE_TEXT")
            is PlaceHolderTextHintAnnotation -> ClassName("godot.core.PropertyHint", "PLACE_HOLDER_TEXT")
            null -> ClassName("godot.core.PropertyHint", "NONE")

            else -> throw WrongPropertyAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}

package godot.entrygenerator.generator.typehint.primitives

import com.squareup.kotlinpoet.MemberName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.tools.common.names.CoreType

class JvmPrimitivesTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): MemberName {
        return when (propertyHintAnnotation) {
            is RangeHintAnnotation<*> -> CoreType.propertyHint("RANGE")
            is ExpEasingHintAnnotation -> CoreType.propertyHint("EXP_EASING")
            is FileHintAnnotation -> if (propertyHintAnnotation.global) {
                CoreType.propertyHint("GLOBAL_FILE")
            } else {
                CoreType.propertyHint("FILE")
            }

            is DirHintAnnotation -> if (propertyHintAnnotation.global) {
                CoreType.propertyHint("GLOBAL_DIR")
            } else {
                CoreType.propertyHint("DIR")
            }

            is MultilineTextHintAnnotation -> CoreType.propertyHint("MULTILINE_TEXT")
            is PlaceHolderTextHintAnnotation -> CoreType.propertyHint("PLACE_HOLDER_TEXT")
            null -> CoreType.propertyHint("NONE")

            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}


package godot.entrygenerator.generator.typehint.primitives

import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.utils.asEnumName

class JvmPrimitivesTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): MemberName {
        return when (propertyHintAnnotation) {
            is RangeHintAnnotation<*> -> PropertyHint.RANGE.asEnumName()
            is ExpEasingHintAnnotation -> PropertyHint.EXP_EASING.asEnumName()
            is FileHintAnnotation -> if (propertyHintAnnotation.global) {
                PropertyHint.GLOBAL_FILE.asEnumName()
            } else {
                PropertyHint.FILE.asEnumName()
            }

            is DirHintAnnotation -> if (propertyHintAnnotation.global) {
                PropertyHint.GLOBAL_DIR.asEnumName()
            } else {
                PropertyHint.DIR.asEnumName()
            }

            is MultilineTextHintAnnotation -> PropertyHint.MULTILINE_TEXT.asEnumName()
            is PlaceHolderTextHintAnnotation -> PropertyHint.PLACEHOLDER_TEXT.asEnumName()
            null -> PropertyHint.NONE.asEnumName()

            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}


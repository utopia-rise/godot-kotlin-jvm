package godot.entrygenerator.generator.typehint.primitives

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.DirHintAnnotation
import godot.entrygenerator.model.ExpEasingHintAnnotation
import godot.entrygenerator.model.FileHintAnnotation
import godot.entrygenerator.model.MultilineTextHintAnnotation
import godot.entrygenerator.model.PlaceHolderTextHintAnnotation
import godot.entrygenerator.model.RangeHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotPackage

class JvmPrimitivesTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
            is RangeHintAnnotation<*> -> ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_RANGE")
            is ExpEasingHintAnnotation -> ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_EXP_EASING")
            is FileHintAnnotation -> if (propertyHintAnnotation.global) {
                ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_GLOBAL_FILE")
            } else {
                ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_FILE")
            }
            is DirHintAnnotation -> if (propertyHintAnnotation.global) {
                ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_GLOBAL_DIR")
            } else {
                ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_DIR")
            }
            is MultilineTextHintAnnotation -> ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_MULTILINE_TEXT")
            is PlaceHolderTextHintAnnotation -> ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_PLACE_HOLDER_TEXT")
            null -> ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_NONE")

            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}

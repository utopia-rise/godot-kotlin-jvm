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
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotPackage

class JvmPrimitivesTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
            is RangeHintAnnotation<*> -> ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "RANGE")
            is ExpEasingHintAnnotation -> ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "EXP_EASING")
            is FileHintAnnotation -> if (propertyHintAnnotation.global) {
                ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "GLOBAL_FILE")
            } else {
                ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "FILE")
            }
            is DirHintAnnotation -> if (propertyHintAnnotation.global) {
                ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "GLOBAL_DIR")
            } else {
                ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "DIR")
            }
            is MultilineTextHintAnnotation -> ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "MULTILINE_TEXT")
            is PlaceHolderTextHintAnnotation -> ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "PLACE_HOLDER_TEXT")
            null -> ClassName("$godotCorePackage.${GodotTypes.propertyHint}", "NONE")

            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}

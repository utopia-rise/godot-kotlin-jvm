package godot.entrygenerator.generator.typehint.coretypes

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotPackage

class JvmCoreTypeTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
            is ColorNoAlphaHintAnnotation -> ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_COLOR_NO_ALPHA")
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ClassName("$godotPackage.${GodotTypes.propertyHint}", "PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}

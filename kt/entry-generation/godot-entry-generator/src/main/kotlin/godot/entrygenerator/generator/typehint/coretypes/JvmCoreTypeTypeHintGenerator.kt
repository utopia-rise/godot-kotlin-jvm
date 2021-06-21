package godot.entrygenerator.generator.typehint.coretypes

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.RegisteredProperty

class JvmCoreTypeTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation) {
//            "godot.annotation.ColorNoAlpha" ->
//                ClassName("godot.core.PropertyHint", "COLOR_NO_ALPHA")
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ClassName("godot.core.PropertyHint", "NONE")
            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}

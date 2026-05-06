package godot.entrygenerator.generator.typehint.coretypes

import com.squareup.kotlinpoet.MemberName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.typehint.PropertyTypeHintGenerator
import godot.entrygenerator.model.ColorNoAlphaHintAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.tools.common.names.CoreType

class JvmCoreTypeTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): MemberName {
        return when (propertyHintAnnotation) {
            is ColorNoAlphaHintAnnotation -> CoreType.propertyHint("COLOR_NO_ALPHA")
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> CoreType.propertyHint("NONE")
            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}


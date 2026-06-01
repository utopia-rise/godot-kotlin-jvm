package godot.registrar.generator.generator.typehint.coretypes

import com.squareup.kotlinpoet.MemberName
import godot.core.PropertyHint
import godot.registrar.generator.exceptions.WrongAnnotationUsageException
import godot.registrar.generator.generator.typehint.PropertyTypeHintGenerator
import godot.registrar.generator.utils.asEnumName
import godot.registration.model.RegisteredProperty
import godot.registration.model.hint.property.ColorNoAlphaHint

class JvmCoreTypeTypeHintGenerator(
    private val registeredProperty: RegisteredProperty
) : PropertyTypeHintGenerator(registeredProperty) {
    override fun getPropertyTypeHint(): MemberName {
        return when (propertyHintAnnotation) {
            is ColorNoAlphaHint -> PropertyHint.COLOR_NO_ALPHA.asEnumName()
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> PropertyHint.NONE.asEnumName()
            else -> throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation)
        }
    }
}


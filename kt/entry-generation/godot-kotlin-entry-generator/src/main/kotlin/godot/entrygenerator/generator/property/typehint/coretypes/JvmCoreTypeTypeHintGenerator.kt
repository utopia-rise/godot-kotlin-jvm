package godot.entrygenerator.generator.property.typehint.coretypes

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintGenerator
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

class JvmCoreTypeTypeHintGenerator(
    private val propertyDescriptor: PropertyDescriptor
) : PropertyTypeHintGenerator(propertyDescriptor) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            "godot.annotation.ColorNoAlpha" ->
                ClassName("godot.core.PropertyHint", "COLOR_NO_ALPHA")
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ClassName("godot.core.PropertyHint", "NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }
}

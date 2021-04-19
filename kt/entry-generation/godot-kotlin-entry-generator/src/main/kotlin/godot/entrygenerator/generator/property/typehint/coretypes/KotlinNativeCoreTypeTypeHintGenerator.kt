package godot.entrygenerator.generator.property.typehint.coretypes

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintGenerator
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

class KotlinNativeCoreTypeTypeHintGenerator(
    private val propertyDescriptor: PropertyDescriptor
) : PropertyTypeHintGenerator(propertyDescriptor) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            "godot.annotation.ColorNoAlpha" ->
                ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_COLOR_NO_ALPHA")
            //TODO: implement ImageCompressLossy
            //TODO: implement ImageCompressLossLess
            //TODO: implement NodePathToEditedNode
            //TODO: implement NodePathValidTypes
            null -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }
}

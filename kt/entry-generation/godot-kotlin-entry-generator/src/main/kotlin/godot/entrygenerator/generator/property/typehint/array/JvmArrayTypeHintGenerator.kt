package godot.entrygenerator.generator.property.typehint.array

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintGenerator
import org.jetbrains.kotlin.descriptors.PropertyDescriptor

class JvmArrayTypeHintGenerator(
    private val propertyDescriptor: PropertyDescriptor
) : PropertyTypeHintGenerator(propertyDescriptor) {
    override fun getPropertyTypeHint(): ClassName {
        return when (propertyHintAnnotation?.fqName?.asString()) {
            null -> ClassName("godot.core.PropertyHint", "NONE")
            else -> throw WrongAnnotationUsageException(propertyDescriptor, propertyHintAnnotation)
        }
    }
}

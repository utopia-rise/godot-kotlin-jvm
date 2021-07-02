package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RegisteredProperty
import java.util.*

class DoubleRangeHintStringGenerator(registeredProperty: RegisteredProperty):
    PropertyHintStringGenerator<DoubleRangeHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        if (registeredProperty.type.fqName != Double::class.qualifiedName) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, Double::class.qualifiedName)
        }
        if (propertyHintAnnotation == null) {
            return ""
        }

        val argumentsForStringTemplate = mutableListOf<Any>()

        argumentsForStringTemplate.add(propertyHintAnnotation.start)
        argumentsForStringTemplate.add(propertyHintAnnotation.end)

        if (propertyHintAnnotation.step >= 0) {
            argumentsForStringTemplate.add(propertyHintAnnotation.step)
        }

        if (propertyHintAnnotation.or != Range.NONE) {
            argumentsForStringTemplate.add(propertyHintAnnotation.or.name.lowercase(Locale.ENGLISH))
        }

        return argumentsForStringTemplate.joinToString(",")
    }
}

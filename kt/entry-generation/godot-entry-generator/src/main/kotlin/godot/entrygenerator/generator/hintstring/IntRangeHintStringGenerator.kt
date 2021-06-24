package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.IntRangeHintAnnotation
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RegisteredProperty
import java.util.*

class IntRangeHintStringGenerator(registeredProperty: RegisteredProperty):
    PropertyHintStringGenerator<IntRangeHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        if (registeredProperty.type.fqName != Int::class.qualifiedName) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, Int::class.qualifiedName)
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

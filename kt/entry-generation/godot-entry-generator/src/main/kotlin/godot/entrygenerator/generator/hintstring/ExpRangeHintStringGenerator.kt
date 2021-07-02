package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.exceptions.WrongAnnotationUsageException
import godot.entrygenerator.model.DoubleRangeHintAnnotation
import godot.entrygenerator.model.ExpRangeHintAnnotation
import godot.entrygenerator.model.Range
import godot.entrygenerator.model.RegisteredProperty
import java.util.*

class ExpRangeHintStringGenerator(registeredProperty: RegisteredProperty):
    PropertyHintStringGenerator<ExpRangeHintAnnotation>(registeredProperty) {
    override fun getHintString(): String {
        if (!listOf(Float::class.qualifiedName, Double::class.qualifiedName).contains(registeredProperty.type.fqName)) {
            throw WrongAnnotationUsageException(registeredProperty, propertyHintAnnotation, Float::class.qualifiedName)
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

        return argumentsForStringTemplate.joinToString(",")
    }
}

package godot.entrygenerator.exceptions

import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class WrongAnnotationUsageException(
    registeredProperty: RegisteredProperty,
    propertyHintAnnotation: PropertyHintAnnotation?,
    effectiveType: String? = null
) : Exception(
    "You annotated ${registeredProperty.fqName} with @${propertyHintAnnotation?.let { it::class.qualifiedName }?.substringAfterLast(".")?.removeSuffix("HintAnnotation")} which ${if (effectiveType != null) "is only applicable to properties of type $effectiveType" else "cannot be applied on properties of type ${registeredProperty.type.fqName}"}"
)

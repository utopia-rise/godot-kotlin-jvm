package godot.entrygenerator.exceptions

import godot.entrygenerator.model.PropertyHintAnnotation
import godot.entrygenerator.model.RegisteredProperty

class WrongAnnotationUsageException(
    registeredProperty: RegisteredProperty,
    propertyHintAnnotation: PropertyHintAnnotation?,
    effectiveTypes: Set<String>? = null
) : Exception(
    "You annotated ${registeredProperty.fqName} with @${propertyHintAnnotation?.let { it::class.qualifiedName }?.substringAfterLast(".")?.removeSuffix("HintAnnotation")} which ${if (effectiveTypes != null) "is only applicable to properties of type $effectiveTypes" else "cannot be applied on properties of type ${registeredProperty.type.fqName}"}"
)

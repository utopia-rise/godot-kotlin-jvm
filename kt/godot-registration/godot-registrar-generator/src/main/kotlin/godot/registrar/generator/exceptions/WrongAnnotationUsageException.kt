package godot.registrar.generator.exceptions

import godot.registration.model.RegisteredProperty
import godot.registration.model.exceptions.RegistrationException
import godot.registration.model.hint.property.PropertyHint

class WrongAnnotationUsageException(
    registeredProperty: RegisteredProperty,
    propertyHintAnnotation: PropertyHint?,
    effectiveTypes: Set<String>? = null
) : RegistrationException(
    "You annotated ${registeredProperty.fqName} with @${
        propertyHintAnnotation?.let { it::class.qualifiedName }?.substringAfterLast(".")?.removeSuffix("Hint")
    } which ${if (effectiveTypes != null) "is only applicable to properties of type $effectiveTypes" else "cannot be applied on properties of type ${registeredProperty.type.fqName}"}"
)

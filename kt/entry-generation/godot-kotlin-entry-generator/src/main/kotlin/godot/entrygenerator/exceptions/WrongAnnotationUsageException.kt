package godot.entrygenerator.exceptions

import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

class WrongAnnotationUsageException(
    propertyDescriptor: PropertyDescriptor,
    propertyHintAnnotation: AnnotationDescriptor?,
    effectiveType: String? = null
) : Exception(
    "You annotated ${propertyDescriptor.fqNameSafe} with @${propertyHintAnnotation?.fqName?.asString()?.split(".")
        ?.last()} which ${if (effectiveType != null) "is only applicable to properties of type $effectiveType" else "cannot be applied on properties of type ${propertyDescriptor.type}"}"
)

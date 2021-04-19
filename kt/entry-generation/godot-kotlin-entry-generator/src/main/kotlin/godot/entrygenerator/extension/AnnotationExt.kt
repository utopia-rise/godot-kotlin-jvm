package godot.entrygenerator.extension

import org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor
import org.jetbrains.kotlin.descriptors.annotations.Annotations
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name

fun <T> Annotations.getAnnotationValue(
    annotation: String,
    key: String,
    defaultValue: T
): T {
    return this
        .findAnnotation(FqName(annotation))
        ?.let { annotationDescriptor ->
            @Suppress("UNCHECKED_CAST")
            annotationDescriptor
                .allValueArguments
                .entries
                .firstOrNull { it.key == Name.identifier(key) }
                ?.value
                ?.value as T
                ?: defaultValue
        }
        ?: defaultValue
}

fun <T> AnnotationDescriptor.getAnnotationValue(
    key: String,
    defaultValue: T
): T {
    @Suppress("UNCHECKED_CAST")
    return this
        .allValueArguments
        .entries
        .firstOrNull { it.key == Name.identifier(key) }
        ?.value
        ?.value as T
        ?: defaultValue
}

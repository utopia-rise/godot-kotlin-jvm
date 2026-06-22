package godot.annotation.processor.classgraph.extensions

import io.github.classgraph.AnnotationInfo

fun Collection<AnnotationInfo>.withMetaAnnotations(
    metaAnnotationsOf: (AnnotationInfo) -> List<AnnotationInfo>,
): List<AnnotationInfo> {
    val annotations = mutableListOf<AnnotationInfo>()
    val seenNames = mutableSetOf<String>()
    for (annotation in this) {
        if (seenNames.add(annotation.name)) {
            annotations += annotation
        }
        for (metaAnnotation in metaAnnotationsOf(annotation)) {
            if (seenNames.add(metaAnnotation.name)) {
                annotations += metaAnnotation
            }
        }
    }
    return annotations
}

fun AnnotationInfo.metaAnnotations(): List<AnnotationInfo> =
    collectMetaAnnotations(mutableSetOf(name))

private fun AnnotationInfo.collectMetaAnnotations(visitedAnnotationNames: MutableSet<String>): List<AnnotationInfo> {
    val collected = mutableListOf<AnnotationInfo>()
    for (metaAnnotation in classInfo.annotationInfo) {
        if (!visitedAnnotationNames.add(metaAnnotation.name)) {
            continue
        }

        collected += metaAnnotation
        collected += metaAnnotation.collectMetaAnnotations(visitedAnnotationNames)
    }
    return collected
}

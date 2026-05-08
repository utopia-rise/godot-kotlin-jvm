package godot.annotation.processor.classgraph.extensions

import godot.annotation.processor.classgraph.Context
import io.github.classgraph.AnnotationInfo

fun AnnotationInfo.getAnnotationChain(): Set<AnnotationInfo> {
    val cachedMetaAnnotationChain = Context.annotationChainByAnnotationName[name] ?: run {
        val metaAnnotationChain = mutableSetOf<AnnotationInfo>()
        for (metaAnnotation in classInfo.annotationInfo) {
            metaAnnotationChain += metaAnnotation
            metaAnnotationChain += metaAnnotation.getMetaAnnotationChain(mutableSetOf(name))
        }
        Context.annotationChainByAnnotationName[name] = metaAnnotationChain
        metaAnnotationChain
    }

    val annotationChain = cachedMetaAnnotationChain.toMutableSet()
    annotationChain.add(this)
    return annotationChain
}

private fun AnnotationInfo.getMetaAnnotationChain(visitedAnnotationNames: MutableSet<String>): Set<AnnotationInfo> {
    val annotationChain = mutableSetOf<AnnotationInfo>()
    for (metaAnnotation in classInfo.annotationInfo) {
        if (!visitedAnnotationNames.add(metaAnnotation.name)) {
            continue
        }

        annotationChain += metaAnnotation
        annotationChain += metaAnnotation.getMetaAnnotationChain(visitedAnnotationNames)
    }
    return annotationChain
}

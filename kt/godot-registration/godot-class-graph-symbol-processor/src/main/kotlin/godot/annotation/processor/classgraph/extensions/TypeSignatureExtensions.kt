package godot.annotation.processor.classgraph.extensions

import io.github.classgraph.TypeSignature

fun TypeSignature.toStringWithoutAnnotations(): String {
    if (typeAnnotationInfo == null) return toString()

    var result = toString()
    typeAnnotationInfo.forEach {
        result = result.removePrefix(it.toString())
    }
    return result.trim()
}

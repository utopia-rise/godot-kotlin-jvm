package godot.annotation.processor.classgraph.extensions

import io.github.classgraph.TypeSignature

fun TypeSignature.toStringWithoutAnnotations(): String {
    var result = this.toString()

    if (typeAnnotationInfo == null) return result

    typeAnnotationInfo.forEach {
        result = result.removePrefix(it.toString())
    }
    return result.trim()
}

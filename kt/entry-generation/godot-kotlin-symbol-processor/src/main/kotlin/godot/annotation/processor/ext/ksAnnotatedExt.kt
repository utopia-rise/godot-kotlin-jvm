package godot.annotation.processor.ext

import com.google.devtools.ksp.isAnnotationPresent
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import godot.annotation.Member
import godot.annotation.GodotScript
import kotlin.reflect.KClass

fun <T : Annotation> KSAnnotated.hasAnnotation(annotationClass: KClass<T>): Boolean {
    return isAnnotationPresent(annotationClass) || annotations
        .any { ksAnnotation ->
            ksAnnotation
                .annotationType
                .resolve()
                .declaration
                .annotations
                .any { it.hasAnnotation(annotationClass) }
        }
}

fun <T : Annotation> KSAnnotation.hasAnnotation(annotationClass: KClass<T>, alreadyEvaluated: MutableList<KSAnnotation> = mutableListOf()): Boolean {
    val annotationsOnAnnotation = this
        .annotationType
        .resolve()
        .declaration
        .annotations
        .filterNot { alreadyEvaluated.contains(it) }
        .toList()

    return this.fqNameUnsafe == annotationClass.qualifiedName || annotationsOnAnnotation.any { it.hasAnnotation(annotationClass, alreadyEvaluated.apply { add(this@hasAnnotation) }) }
}

fun KSAnnotated.hasRegistrationAnnotation(): Boolean {
    return hasAnnotation(GodotScript::class)
        || hasAnnotation(Member::class)
}

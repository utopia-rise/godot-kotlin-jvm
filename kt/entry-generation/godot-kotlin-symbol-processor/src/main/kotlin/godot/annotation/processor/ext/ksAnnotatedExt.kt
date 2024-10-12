package godot.annotation.processor.ext

import com.google.devtools.ksp.isAnnotationPresent
import com.google.devtools.ksp.symbol.KSAnnotated
import com.google.devtools.ksp.symbol.KSAnnotation
import godot.annotation.GodotMember
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

fun <T : Annotation> KSAnnotation.hasAnnotation(annotationClass: KClass<T>): Boolean {
    return this.fqNameUnsafe == annotationClass.qualifiedName || this
        .annotationType
        .annotations
        .toList()
        .any { it.hasAnnotation(annotationClass) }
}

fun KSAnnotated.hasRegistrationAnnotation(): Boolean {
    return hasAnnotation(GodotScript::class)
        || hasAnnotation(GodotMember::class)
}

package godot.intellij.plugin.extension

import godot.tools.common.constants.GodotKotlinJvmTypes
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtValueArgumentList
import org.jetbrains.kotlin.psi.KtValueArgumentName

/**
 * Gets custom name defined in `@RegisterClass` annotation if defined, fqName otherwise
 *
 * @return fqName to registered class name or `null` if not annotated with `@RegisterClass`
 */
fun KtClass.getRegisteredClassName(): Pair<String, String>? {
    // the whole `@RegisterClass(...)` annotation
    val ktAnnotationEntry = annotationEntries
        .firstOrNull { it.shortName?.asString() == GodotKotlinJvmTypes.Annotations.registerClass }

    val fqName = fqName?.asString()

    if (ktAnnotationEntry == null || fqName == null) {
        return null
    }

    val lastChild = ktAnnotationEntry.lastChild
    val registeredClassName = if (lastChild is KtValueArgumentList) { // if (...) present in `@RegisterClass(...)`
        lastChild
            .children
            .firstOrNull { it.firstChild is KtValueArgumentName && it.firstChild.text == "className" } // named; position not relevant
            ?.children
            ?.lastOrNull()
            ?.text
            ?.removeSurrounding("\"")
            ?: lastChild
                .children
                .firstOrNull() // not named; first position
                ?.text
                ?.removeSurrounding("\"")
    } else { // just registered as `@RegisterClass` without constructor params
        null
    }
        // we already know the annotation is present. So if no custom name was define in the annotation, the class is registered with the fqName
        ?: fqName

    return fqName to registeredClassName
}

fun KtClass.anyFunctionHasAnnotation(annotationFqName: String) = this
    .declarations
    .any { declaration ->
        declaration.findAnnotation(FqName(annotationFqName)) != null
    }

fun KtClass.anyPropertyHasAnnotation(annotationFqName: String) = this
    .getProperties()
    .any { ktProperty ->
        ktProperty.findAnnotation(FqName(annotationFqName)) != null
    }

package godot.intellij.plugin.extension

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
        .firstOrNull { it.shortName?.asString() == "RegisterClass" }

    val fqName = fqName?.asString()

    if (ktAnnotationEntry == null || fqName == null) {
        return null
    }

    val lastChild = ktAnnotationEntry.lastChild
    val registeredClassName = if (lastChild is KtValueArgumentList) { // if (...) present in `@RegisterClass(...)`
        // case: `@RegisterClass(customClassName = "Something")`
        val customNameDefinedWithNamedValue = lastChild
            .children
            .firstOrNull { it.firstChild is KtValueArgumentName && it.firstChild.text == "customClassName" }
            ?.children
            ?.lastOrNull()
            ?.text
            ?.removeSurrounding("\"")

        // if not defined with a named param, it has to be the last child in the parameter list when the parameter list
        // is greater than 1 (the first parameter being the `isTool` flag.
        // Otherwise no custom name was defined
        if (customNameDefinedWithNamedValue == null && lastChild.children.size > 1) {
            lastChild
                .children
                .lastOrNull()
                ?.text
                ?.removeSurrounding("\"")
        } else {
            customNameDefinedWithNamedValue
        }
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

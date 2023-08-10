package godot.intellij.plugin.extension

import com.intellij.psi.PsiAnnotationOwner
import com.intellij.psi.PsiClass
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.gradle.GodotKotlinJvmSettings
import godot.tools.common.constants.FileExtensions
import org.jetbrains.kotlin.asJava.toLightClass
import org.jetbrains.kotlin.idea.base.psi.kotlinFqName
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.konan.properties.suffix
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtValueArgumentList
import org.jetbrains.kotlin.psi.KtValueArgumentName
import org.jetbrains.kotlin.util.prefixIfNot
import org.jetbrains.kotlin.util.suffixIfNot

/**
 * Gets custom name defined in `@RegisterClass` annotation if defined, fqName or simple name otherwise
 *
 * @return fqName to registered class name or `null` if not annotated with `@RegisterClass`
 */
fun KtClass.getRegisteredClassName(): Pair<String, String>? = this.toLightClass()?.getRegisteredClassName()

fun PsiClass.getRegisteredClassName(): Pair<String, String>? {
    val fqName = qualifiedName ?: return null
    val isFqNameRegistrationEnabled = GodotKotlinJvmSettings[module].isFqNameRegistrationEnabled

    // the whole `@RegisterClass(...)` annotation
    val ktAnnotationEntry = annotations
        .firstOrNull { annotation -> annotation.qualifiedName == REGISTER_CLASS_ANNOTATION }

    // if `isFqNameRegistrationEnabled` is true we take the fqName, otherwise we'll use the simpleName
    val defaultRegistrationName = if (isFqNameRegistrationEnabled) {
        fqName
    } else {
        name
    }

    if (ktAnnotationEntry == null || defaultRegistrationName == null) {
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
        ?: defaultRegistrationName

    return fqName to registeredClassName
}

fun KtClass.getRegistrationFilePath(): String? = this.toLightClass()?.getRegistrationFilePath()

fun PsiClass.getRegistrationFilePath(): String? {
    return if (annotations.any { annotation -> annotation.qualifiedName == REGISTER_CLASS_ANNOTATION }) {
        val fqName = qualifiedName ?: return null
        val registeredName = getRegisteredClassName()?.second ?: return null

        val isRegistrationFileHierarchyEnabled = GodotKotlinJvmSettings[module].isRegistrationFileHierarchyEnabled

        if (isRegistrationFileHierarchyEnabled) {
            registeredName
        } else {
            fqName
                .replace(".", "/")
                .substringBeforeLast("/")
                .suffixIfNot("/")
                .suffix(registeredName)
                .suffix(".")
        }
            .prefixIfNot("res://")
            .suffix(FileExtensions.GodotKotlinJvm.registrationFile)
    } else {
        null
    }
}

fun PsiClass.anyFunctionHasAnnotation(annotationFqName: String) = this
    .ownDeclarations
    .filterIsInstance<PsiAnnotationOwner>()
    .any { declaration ->
        declaration.findAnnotation(annotationFqName) != null
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

val KtClass.isRegistered: Boolean
    get() = annotations
        .any { annotation -> annotation.kotlinFqName?.asString() == REGISTER_CLASS_ANNOTATION }

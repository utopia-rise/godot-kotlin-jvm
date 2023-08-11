package godot.intellij.plugin.extension

import com.intellij.psi.PsiClass
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.gradle.GodotKotlinJvmSettings
import godot.tools.common.constants.FileExtensions
import org.jetbrains.kotlin.asJava.toLightClass
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.konan.properties.suffix
import org.jetbrains.kotlin.psi.KtClass
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

    // if `isFqNameRegistrationEnabled` is true we take the fqName, otherwise we'll use the simpleName
    val defaultRegistrationName = if (isFqNameRegistrationEnabled) {
        fqName
    } else {
        name
    }

    val customName = getAnnotation(REGISTER_CLASS_ANNOTATION)
        ?.findAttributeValue("className")
        ?.text
        ?.removeSurrounding("\"")
        ?.ifBlank { null }

    val registeredName = customName ?: defaultRegistrationName ?: return null

    return fqName to registeredName
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

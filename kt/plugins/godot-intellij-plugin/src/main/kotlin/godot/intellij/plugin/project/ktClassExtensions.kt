package godot.intellij.plugin.project

import com.intellij.psi.PsiClass
import godot.intellij.plugin.analysis.REGISTER_CLASS_ANNOTATION
import org.jetbrains.kotlin.asJava.toLightClass
import org.jetbrains.kotlin.psi.KtClass

fun PsiClass.getRegisteredClassName(): Pair<String, String>? {
    val fqName = qualifiedName ?: return null
    val customName = getAnnotation(REGISTER_CLASS_ANNOTATION)
        ?.findAttributeValue("className")
        ?.text
        ?.removeSurrounding("\"")
        ?.ifBlank { null }

    val registeredName = customName ?: name ?: return null

    return fqName to registeredName
}

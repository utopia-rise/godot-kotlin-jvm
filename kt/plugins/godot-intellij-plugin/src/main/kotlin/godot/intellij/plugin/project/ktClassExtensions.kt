package godot.intellij.plugin.project

import com.intellij.psi.PsiClass
import godot.tools.common.names.Annotation
import godot.tools.common.names.qualifiedName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtValueArgument

fun KtClass.getRegisteredClassName(): Pair<String, String>? {
    val fqName = fqName?.asString() ?: return null
    val registerClassAnnotation = findAnnotation(Annotation.registerClass.asClassId())
    val customName = registerClassAnnotation
        ?.valueArgumentList
        ?.arguments
        ?.firstNamedOrPositionalClassNameArgument()
        ?.getArgumentExpression()
        ?.text
        ?.removeSurrounding("\"")
        ?.ifBlank { null }

    val registeredName = customName ?: name ?: return null
    return fqName to registeredName
}

fun PsiClass.getRegisteredClassName(): Pair<String, String>? {
    val fqName = qualifiedName ?: return null
    val customName = getAnnotation(Annotation.registerClass.qualifiedName)
        ?.findAttributeValue("className")
        ?.text
        ?.removeSurrounding("\"")
        ?.ifBlank { null }

    val registeredName = customName ?: name ?: return null

    return fqName to registeredName
}

private fun List<KtValueArgument>.firstNamedOrPositionalClassNameArgument(): KtValueArgument? {
    return firstOrNull { argument -> argument.getArgumentName()?.asName?.asString() == "className" }
        ?: firstOrNull { argument -> !argument.isNamed() }
}

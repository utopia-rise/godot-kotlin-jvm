package godot.intellij.plugin.project

import com.intellij.psi.PsiClass
import godot.annotation.RegisterClass
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtValueArgument
import org.jetbrains.kotlin.scripting.resolve.classId

fun KtClass.getRegisteredClassName(): Pair<String, String>? {
    val fqName = fqName?.asString() ?: return null
    val registerClassAnnotation = findAnnotation(RegisterClass::class.classId)
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
    val customName = getAnnotation(RegisterClass::class.qualifiedName!!)
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

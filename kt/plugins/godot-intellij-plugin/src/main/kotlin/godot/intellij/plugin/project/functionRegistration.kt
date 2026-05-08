package godot.intellij.plugin.project

import com.intellij.psi.PsiMethod
import godot.tools.common.names.Annotation
import godot.tools.common.names.qualifiedName
import org.jetbrains.kotlin.asJava.toLightMethods
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtNamedFunction

fun KtNamedFunction.isGodotRegisteredFunction(): Boolean {
    return findAnnotation(Annotation.register.asClassId()) != null ||
        findAnnotation(Annotation.rpc.asClassId()) != null ||
        toLightMethods().any { it.isGodotRegisteredFunction() }
}

fun PsiMethod.isGodotRegisteredFunction(): Boolean {
    return getAnnotation(Annotation.register.qualifiedName) != null ||
        getAnnotation(Annotation.rpc.qualifiedName) != null ||
        isOverrideOfGodotBaseMethod()
}

private fun PsiMethod.isOverrideOfGodotBaseMethod(): Boolean {
    return findDeepestSuperMethods().any { superMethod ->
        superMethod.containingClass?.getAnnotation(Annotation.godotBaseType.qualifiedName) != null
    }
}

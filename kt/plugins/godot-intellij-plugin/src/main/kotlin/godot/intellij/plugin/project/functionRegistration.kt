package godot.intellij.plugin.project

import com.intellij.psi.PsiMethod
import godot.tools.common.names.Registration
import godot.tools.common.names.qualifiedName
import org.jetbrains.kotlin.asJava.toLightMethods
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtNamedFunction

fun KtNamedFunction.isGodotRegisteredFunction(): Boolean {
    return findAnnotation(Registration.register.asClassId()) != null ||
        findAnnotation(Registration.rpc.asClassId()) != null ||
        toLightMethods().any { it.isGodotRegisteredFunction() }
}

fun PsiMethod.isGodotRegisteredFunction(): Boolean {
    return getAnnotation(Registration.register.qualifiedName) != null ||
        getAnnotation(Registration.rpc.qualifiedName) != null ||
        isOverrideOfGodotBaseMethod()
}

private fun PsiMethod.isOverrideOfGodotBaseMethod(): Boolean {
    return findDeepestSuperMethods().any { superMethod ->
        superMethod.containingClass?.getAnnotation(Registration.godotBaseType.qualifiedName) != null
    }
}

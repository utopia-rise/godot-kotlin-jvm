package godot.intellij.plugin.analysis.jvm

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiMethod
import godot.common.constants.Constraints
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.tools.common.names.API
import godot.tools.common.names.Annotation
import godot.tools.common.names.qualifiedName

object RegisterMethodAnalyzer {
    fun analyze(method: PsiMethod): List<GodotProblem> {
        return buildList {
            if (
                method.containingClass?.getAnnotation(Annotation.registerClass.qualifiedName) != null &&
                API.notificationFunctions.any { it.simpleName == method.name } &&
                method.getAnnotation(Annotation.registerFunction.qualifiedName) == null
            ) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.function.notificationFunctionNotRegistered"),
                        method.nameIdentifier ?: method.navigationElement
                    )
                )
            }

            if (method.getAnnotation(Annotation.registerFunction.qualifiedName) != null) {
                addAll(GenericRegistrationAnalyzer.analyze(method))
                if (method.parameterList.parametersCount > Constraints.MAX_FUNCTION_ARG_COUNT) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.function.toManyParams", Constraints.MAX_FUNCTION_ARG_COUNT),
                            physicalAnchor(
                                method.parameterList,
                                method.navigationElement,
                                method.nameIdentifier
                            )
                        )
                    )
                }
            }
        }
    }

    private fun physicalAnchor(vararg candidates: PsiElement?): PsiElement {
        return candidates.firstOrNull { candidate -> candidate?.isPhysical == true }
            ?: candidates.firstOrNull { candidate -> candidate?.isValid == true }
            ?: candidates.first()
            ?: throw IllegalStateException("Expected at least one anchor candidate")
    }
}

package godot.intellij.plugin.analysis.jvm

import godot.common.constants.Constraints
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.analysis.REGISTER_FUNCTION_ANNOTATION
import godot.tools.common.constants.GodotTypes
import com.intellij.psi.PsiMethod

object RegisterMethodAnalyzer {
    fun analyze(method: PsiMethod): List<GodotProblem> {
        return buildList {
            if (
                method.containingClass?.getAnnotation(REGISTER_CLASS_ANNOTATION) != null &&
                GodotTypes.notificationFunctions.contains(method.name) &&
                method.getAnnotation(REGISTER_FUNCTION_ANNOTATION) == null
            ) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.function.notificationFunctionNotRegistered"),
                        method.nameIdentifier ?: method.navigationElement
                    )
                )
            }

            if (method.getAnnotation(REGISTER_FUNCTION_ANNOTATION) != null) {
                addAll(GenericRegistrationAnalyzer.analyze(method))
                if (method.parameterList.parametersCount > Constraints.MAX_FUNCTION_ARG_COUNT) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.function.toManyParams", Constraints.MAX_FUNCTION_ARG_COUNT),
                            method.parameterList
                        )
                    )
                }
            }
        }
    }
}

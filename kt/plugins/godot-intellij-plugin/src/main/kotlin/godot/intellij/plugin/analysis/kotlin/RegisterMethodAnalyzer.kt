package godot.intellij.plugin.analysis.kotlin

import godot.common.constants.Constraints
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.isGodotRegisteredFunction
import godot.tools.common.names.Registration
import godot.tools.common.names.API
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass

object RegisterMethodAnalyzer {
    fun analyze(function: KtNamedFunction): List<GodotProblem> {
        return buildList {
            if (
                function.containingClass()?.findAnnotation(Registration.registerClass.asClassId()) != null &&
                API.notificationFunctions.any { it.simpleName == function.name } &&
                !function.isGodotRegisteredFunction()
            ) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.function.notificationFunctionNotRegistered"),
                        function.nameIdentifier ?: function.navigationElement
                    )
                )
            }

            if (function.isGodotRegisteredFunction()) {
                if (function.typeParameters.isNotEmpty()) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.general.cannotRegisterGenerics"),
                            function.typeParameterList ?: function.navigationElement
                        )
                    )
                }
                if (function.valueParameters.size > Constraints.MAX_FUNCTION_ARG_COUNT) {
                    add(
                        GodotProblem(
                            GodotPluginBundle.message("problem.function.toManyParams", Constraints.MAX_FUNCTION_ARG_COUNT),
                            function.valueParameterList ?: function.navigationElement
                        )
                    )
                }
            }
        }
    }
}

package godot.intellij.plugin.analysis.kotlin

import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.quickfix.FunctionNotRegisteredQuickFix
import godot.tools.common.names.Annotation
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass

object RegisterFunctionAnalyzer {
    private val functionNotRegisteredQuickFix = FunctionNotRegisteredQuickFix()

    fun analyze(function: KtNamedFunction): List<GodotProblem> {
        return buildList {
            if (overriddenRegisteredAbstractFunctionNotRegistered(function)) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.function.overriddenAbstractFunctionNotRegistered"),
                        function.nameIdentifier ?: function.navigationElement,
                        arrayOf(functionNotRegisteredQuickFix),
                        com.intellij.codeInspection.ProblemHighlightType.WEAK_WARNING
                    )
                )
            }
        }
    }

    private fun overriddenRegisteredAbstractFunctionNotRegistered(element: KtNamedFunction): Boolean {
        val hasRegisterAnnotation = analyze(element) {
            element.symbol.allOverriddenSymbols.any { it.annotations.contains(Annotation.registerFunction.asClassId()) }
        }
        return element.containingClass()?.findAnnotation(Annotation.registerClass.asClassId()) != null &&
            element.findAnnotation(Annotation.registerFunction.asClassId()) == null &&
            hasRegisterAnnotation
    }
}

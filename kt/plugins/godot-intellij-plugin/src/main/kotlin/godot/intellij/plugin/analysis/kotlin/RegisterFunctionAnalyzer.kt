package godot.intellij.plugin.analysis.kotlin

import godot.annotation.Register
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.quickfix.FunctionNotRegisteredQuickFix
import godot.intellij.plugin.registration.RegistrationPolicy
import org.jetbrains.kotlin.analysis.api.analyze
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.scripting.resolve.classId

object RegisterAnalyzer {
    private val functionNotRegisteredQuickFix = FunctionNotRegisteredQuickFix()

    fun analyze(function: KtNamedFunction): List<GodotProblem> {
        return buildList {
            if (overriddenRegisteredAbstractFunctionNotRegistered(function)) {
                add(
                    GodotProblem(
                        GodotPluginBundle.message("problem.function.overriddenAbstractFunctionNotRegistered"),
                        function.nameIdentifier ?: function.navigationElement,
                        arrayOf(functionNotRegisteredQuickFix)
                    )
                )
            }
        }
    }

    private fun overriddenRegisteredAbstractFunctionNotRegistered(element: KtNamedFunction): Boolean {
        val hasRegisterAnnotation = analyze(element) {
            element.symbol.allOverriddenSymbols.any { it.annotations.contains(Register::class.classId) }
        }
        return element.containingClass()?.let(RegistrationPolicy::registersClass) == true &&
            RegistrationPolicy.requiresInheritedRegistrationAnnotation(element) &&
            !RegistrationPolicy.registersFunction(element) &&
            hasRegisterAnnotation
    }
}



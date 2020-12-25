package godot.intellij.plugin.inspections.registration.inspector

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.intellij.plugin.inspections.registration.quickfix.EngineFunctionNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.containingClass

class RegisterFunctionInspection : AbstractKotlinInspection() {
    private val engineFunctionNotRegisteredQuickFix by lazy { EngineFunctionNotRegisteredQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return namedFunctionVisitor { ktNamedFunction ->
            if (
                ktNamedFunction.containingClass()?.findAnnotation(FqName(RegisterClass::class.java.canonicalName)) != null
                && engineFunctions.contains(ktNamedFunction.name)
                && ktNamedFunction.findAnnotation(FqName(RegisterFunction::class.java.canonicalName)) == null
            ) {
                holder.registerProblem(
                    ktNamedFunction.navigationElement,
                    "Overridden engine function which is not registered will not be called by Godot. Using engine functions for other purposes than to be called from Godot is considered a bad practise. Either register it or move your logic to a custom function you defined",
                    ProblemHighlightType.WARNING,
                    engineFunctionNotRegisteredQuickFix
                )
            }
        }
    }

    private val engineFunctions = listOf(
        //TODO: add all engine functions or find a better way of checking all -> maybe add godot-library as a dependency and query engine functions through reflection or generate during compilation of the plugin
        "_ready",
        "_process"
    )
}

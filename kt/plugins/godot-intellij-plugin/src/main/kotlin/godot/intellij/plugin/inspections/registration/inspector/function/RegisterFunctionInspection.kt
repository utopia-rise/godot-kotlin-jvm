package godot.intellij.plugin.inspections.registration.inspector.function

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.quickfix.NotificationFunctionNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.namedFunctionVisitor
import org.jetbrains.kotlin.psi.psiUtil.containingClass

class RegisterFunctionInspection : AbstractKotlinInspection() {
    private val notificationFunctionNotRegisteredQuickFix by lazy { NotificationFunctionNotRegisteredQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return namedFunctionVisitor { ktNamedFunction ->
            if (
                ktNamedFunction.containingClass()?.findAnnotation(FqName("godot.annotation.RegisterClass")) != null &&
                notificationFunctions.contains(ktNamedFunction.name) &&
                ktNamedFunction.findAnnotation(FqName("godot.annotation.RegisterFunction")) == null
            ) {
                holder.registerProblem(
                    ktNamedFunction.navigationElement,
                    """
                        Overridden notification function which is not registered will not be called by Godot.
                        Using notification functions for other purposes than to be called from Godot is considered a bad practise.
                        Either register it or move your logic to a custom function you defined
                    """.trimIndent(),
                    ProblemHighlightType.WARNING,
                    notificationFunctionNotRegisteredQuickFix
                )
            }
        }
    }

    // TODO: find a better way of checking all -> maybe add godot-library as a dependency and query notification functions through reflection or generate during compilation of the plugin
    private val notificationFunctions = listOf(
        "_ready",
        "_enter_tree",
        "_exit_tree",
        "_process",
        "_physics_process",
        "_input",
        "_unhandled_input",
        "_draw",
    )
}

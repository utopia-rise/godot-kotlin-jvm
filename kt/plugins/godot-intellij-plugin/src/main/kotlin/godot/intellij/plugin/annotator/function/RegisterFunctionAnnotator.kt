package godot.intellij.plugin.annotator.function

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.NotificationFunctionNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass

class RegisterFunctionAnnotator : Annotator {
    private val notificationFunctionNotRegisteredQuickFix by lazy { NotificationFunctionNotRegisteredQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (
            element is KtNamedFunction &&
            element.containingClass()?.findAnnotation(FqName("godot.annotation.RegisterClass")) != null &&
            notificationFunctions.contains(element.name) &&
            element.findAnnotation(FqName("godot.annotation.RegisterFunction")) == null
        ) {
            holder.registerProblem(
                """
                    Overridden notification function which is not registered will not be called by Godot.
                    Using notification functions for other purposes than to be called from Godot is considered a bad practise.
                    Either register it or move your logic to a custom function you defined
                """.trimIndent(),
                element.navigationElement,
                notificationFunctionNotRegisteredQuickFix
            )
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

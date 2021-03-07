package godot.intellij.plugin.annotator.function

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.cache.godotroot.isInGodotRoot
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.NotificationFunctionNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass

class RegisterFunctionAnnotator : Annotator {
    private val notificationFunctionNotRegisteredQuickFix by lazy { NotificationFunctionNotRegisteredQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtNamedFunction) {
            if (
                element.containingClass()?.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION)) != null &&
                notificationFunctions.contains(element.name) &&
                element.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION)) == null
            ) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.function.notificationFunctionNotRegistered"),
                    element.navigationElement,
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

package godot.intellij.plugin.annotator.function

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.isRegistered
import godot.intellij.plugin.extension.registerProblem
import godot.common.constants.Constraints
import org.jetbrains.kotlin.asJava.toLightMethods
import org.jetbrains.kotlin.psi.KtNamedFunction

class RegisterFunctionAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtNamedFunction) {
            if (element.isRegistered()) {
                checkNotGeneric(element.toLightMethods().first(), holder)
                checkFunctionParameterCount(element, holder)
            }
        }
    }

    private fun checkFunctionParameterCount(element: KtNamedFunction, holder: AnnotationHolder) {
        if (element.valueParameters.size > Constraints.MAX_FUNCTION_ARG_COUNT) {
            holder.registerProblem(
                GodotPluginBundle.message("problem.function.toManyParams", Constraints.MAX_FUNCTION_ARG_COUNT),
                element
                    .valueParameterList
                    ?.psiOrParent
                    ?: element.nameIdentifier
                    ?: element.navigationElement
            )
        }
    }
}

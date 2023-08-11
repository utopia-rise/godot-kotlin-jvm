package godot.intellij.plugin.annotator.function

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.data.model.REGISTER_CLASS_ANNOTATION
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.FunctionNotRegisteredQuickFix
import godot.tools.common.constants.Constraints
import godot.tools.common.constants.GodotTypes
import org.jetbrains.kotlin.asJava.toLightMethods
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass

class RegisterFunctionAnnotator : Annotator {
    private val functionNotRegisteredQuickFix by lazy { FunctionNotRegisteredQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtNamedFunction) {
            when {
                overriddenNotificationFunctionNotRegistered(element) -> holder.registerProblem(
                    GodotPluginBundle.message("problem.function.notificationFunctionNotRegistered"),
                    element.navigationElement,
                    functionNotRegisteredQuickFix
                )
                overriddenRegisteredAbstractFunctionNotRegistered(element) -> holder.registerProblem(
                    GodotPluginBundle.message("problem.function.overriddenAbstractFunctionNotRegistered"),
                    element.nameIdentifier ?: element.navigationElement,
                    functionNotRegisteredQuickFix,
                    problemHighlightType = ProblemHighlightType.WEAK_WARNING
                )
            }

            if (element.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION)) != null) {
                checkNotGeneric(element.toLightMethods().first(), holder)
                checkFunctionParameterCount(element, holder)
            }
        }
    }

    private fun overriddenRegisteredAbstractFunctionNotRegistered(element: KtNamedFunction): Boolean {
        return element.containingClass()?.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION)) != null &&
            element.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION)) == null &&
            element.resolveToDescriptorIfAny()?.overriddenDescriptors?.any { it.annotations.hasAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION)) } == true
    }

    private fun overriddenNotificationFunctionNotRegistered(element: KtNamedFunction) =
        element.containingClass()?.findAnnotation(FqName(REGISTER_CLASS_ANNOTATION)) != null &&
            GodotTypes.notificationFunctions.contains(element.name) &&
            element.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION)) == null


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

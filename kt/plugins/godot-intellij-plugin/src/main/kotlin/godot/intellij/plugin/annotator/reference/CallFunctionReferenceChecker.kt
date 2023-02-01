package godot.intellij.plugin.annotator.reference

import com.intellij.lang.annotation.AnnotationHolder
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.TargetFunctionNotRegisteredQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotApiPackage
import org.jetbrains.kotlin.idea.refactoring.fqName.fqName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.isExtensionDeclaration
import org.jetbrains.kotlin.types.typeUtil.supertypes
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

object CallFunctionReferenceChecker {
    private val functionNames = listOf(
        "call",
        "callRawName",
        "callDeferred",
        "callDeferredRawName",
        "callv",
        "callvRawName",
        "connect",
        "connectRawName",
        "disconnect",
        "disconnectRawName"
    )

    fun checkGeneralTargetFunction(element: KtCallableReferenceExpression, holder: AnnotationHolder) {
        val relevantParent = element.parent.parent.parent
        val callReference = relevantParent.children.firstIsInstanceOrNull<KtNameReferenceExpression>()
        val containingClass = (callReference?.resolve() as? KtNamedFunction)?.containingClass()
        if (
            relevantParent is KtCallExpression &&
            functionNames.contains(callReference?.text) &&
            isGodotFunction(containingClass, callReference)
        ) {
            val targetFunction = element
                .callableReference
                .resolve() as? KtNamedFunction

            val registerFunctionAnnotation = targetFunction?.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION))
            if (targetFunction != null && registerFunctionAnnotation == null) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.general.calledFunctionNotRegistered"),
                    element,
                    TargetFunctionNotRegisteredQuickFix()
                )
            }
        }
    }

    private fun isGodotFunction(containingClass: KtClass?, callReference: KtNameReferenceExpression?) =
        containingClass?.fqName?.asString() == "$godotApiPackage.${GodotKotlinJvmTypes.obj}" ||
            containingClass?.type()?.supertypes()?.map { it.fqName?.asString() }?.any { it == "$godotApiPackage.${GodotKotlinJvmTypes.obj}" } == true ||
            isGodotExtensionFunction(callReference)

    private fun isGodotExtensionFunction(callReference: KtNameReferenceExpression?): Boolean {
        return (callReference?.resolve() as? KtNamedFunction)?.isExtensionDeclaration() == true &&
            (callReference.resolve() as? KtNamedFunction)?.fqName?.asString() == "$godotApiPackage.${callReference.text}"
    }
}

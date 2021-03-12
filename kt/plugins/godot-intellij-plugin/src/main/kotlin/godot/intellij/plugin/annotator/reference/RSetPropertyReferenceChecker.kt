package godot.intellij.plugin.annotator.reference

import com.intellij.lang.annotation.AnnotationHolder
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_PROPERTY_ANNOTATION
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.TargetFunctionNotRegisteredQuickFix
import org.jetbrains.kotlin.idea.refactoring.fqName.getKotlinFqName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtValueArgument
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.getChildOfType
import org.jetbrains.kotlin.psi.psiUtil.getChildrenOfType
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

object RSetPropertyReferenceChecker {
    private val rsetFunctionNames = listOf(
        "rset",
        "rsetId",
        "rsetUnreliable",
        "rsetUnreliableId",
    )

    fun checkRpcTargetProperty(element: KtCallableReferenceExpression, holder: AnnotationHolder) {
        val relevantParent = element.parent.parent.parent
        val propertyReference = relevantParent.children.firstIsInstanceOrNull<KtNameReferenceExpression>()
        if (
            relevantParent is KtCallExpression &&
            rsetFunctionNames.contains(propertyReference?.text) &&
            (propertyReference?.resolve() as? KtNamedFunction)?.containingClass()?.fqName?.asString() == "godot.Node"
        ) {
            val targetProperty = element
                .callableReference
                .resolve() as? KtProperty

            val registerPropertyAnnotation = targetProperty?.findAnnotation(FqName(REGISTER_PROPERTY_ANNOTATION))
            if (targetProperty != null && registerPropertyAnnotation == null) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.rpc.calledPropertyNotRegistered"),
                    element,
                    TargetFunctionNotRegisteredQuickFix()
                )
            } else {
                if (
                    registerPropertyAnnotation?.valueArguments?.isEmpty() == true ||
                    registerPropertyAnnotation
                        ?.valueArgumentList
                        ?.getChildrenOfType<KtValueArgument>()
                        ?.mapNotNull { ktValueArgument ->
                            ktValueArgument
                                .getArgumentExpression()
                                ?.getChildOfType<KtNameReferenceExpression>()
                                ?.resolve()
                                ?.getKotlinFqName()
                                ?.asString()
                        }
                        ?.filter { fqName ->
                            fqName.startsWith("godot.MultiplayerAPI.RPCMode")
                        }
                        ?.any { fqName ->
                            fqName == "godot.MultiplayerAPI.RPCMode.DISABLED"
                        } == true
                ) {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.rpc.calledPropertyNotAccessible"),
                        element
                    )
                }
            }
        }
    }
}

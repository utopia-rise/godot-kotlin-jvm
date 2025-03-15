package godot.intellij.plugin.annotator.reference


import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.util.parentOfType
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.extension.asClassId
import godot.intellij.plugin.extension.isOrInheritsType
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.TargetFunctionNotRegisteredQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.idea.references.KtSimpleNameReference
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

object SignalFunctionReferenceChecker {
    // signalTest.connect(this, ::testFuncRef)
    fun checkSignalConnectionFunction(
        element: KtCallableReferenceExpression,
        holder: AnnotationHolder
    ) {
        val signalElement = element
            .parentOfType<KtDotQualifiedExpression>()
            ?.receiverExpression
            ?.references
            ?.firstIsInstanceOrNull<KtSimpleNameReference>()
            ?.resolve() as? KtProperty

        val isSignal = signalElement?.isOrInheritsType(asClassId("$godotCorePackage.${GodotKotlinJvmTypes.signal}")) == true

        if (isSignal) {
            val targetFunction = element
                .callableReference
                .mainReference
                .resolve() as? KtNamedFunction

            if (targetFunction != null && targetFunction.findAnnotation(asClassId(REGISTER_FUNCTION_ANNOTATION)) == null) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.signal.connection.connectedFunctionNotRegistered"),
                    element,
                    TargetFunctionNotRegisteredQuickFix()
                )
            }
        }
    }
}

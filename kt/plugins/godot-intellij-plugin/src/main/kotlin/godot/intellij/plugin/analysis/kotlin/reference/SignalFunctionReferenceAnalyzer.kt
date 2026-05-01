package godot.intellij.plugin.analysis.kotlin.reference

import com.intellij.psi.util.parentOfType
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.analysis.GodotProblem
import godot.intellij.plugin.analysis.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.project.asClassId
import godot.intellij.plugin.project.isOrInheritsType
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

object SignalFunctionReferenceAnalyzer {
    // signalTest.connect(this, ::testFuncRef)
    fun analyze(element: KtCallableReferenceExpression): List<GodotProblem> {
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
                return listOf(
                    GodotProblem(
                        GodotPluginBundle.message("problem.signal.connection.connectedFunctionNotRegistered"),
                        element,
                        arrayOf(TargetFunctionNotRegisteredQuickFix())
                    )
                )
            }
        }

        return emptyList()
    }
}

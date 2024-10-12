package godot.intellij.plugin.annotator.reference

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.psi.util.parentOfType
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.GODOT_MEMBER_ANNOTATION
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.extension.type
import godot.intellij.plugin.quickfix.TargetFunctionNotRegisteredQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.idea.references.KtSimpleNameReference
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getKotlinTypeFqName
import org.jetbrains.kotlin.name.FqName


import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.types.typeUtil.supertypes
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

object SignalFunctionReferenceChecker {
    // signalTest.connect(this, ::testFuncRef)
    fun checkSignalConnectionFunction(
        element: KtCallableReferenceExpression,
        holder: AnnotationHolder
    ) {
        val type = (
            element
                .parentOfType<KtDotQualifiedExpression>()
                ?.receiverExpression
                ?.references
                ?.firstIsInstanceOrNull<KtSimpleNameReference>()
                ?.resolve() as? KtProperty
            )?.type()

        if (
            type?.getKotlinTypeFqName(false) == "$godotCorePackage.${GodotKotlinJvmTypes.signal}" ||
            type?.supertypes()?.map { it.getKotlinTypeFqName(false) }?.any { it == "$godotCorePackage.${GodotKotlinJvmTypes.signal}" } == true
        ) {
            val targetFunction = element
                .callableReference
                .mainReference
                .resolve() as? KtNamedFunction

            if (targetFunction != null && targetFunction.findAnnotation(FqName(GODOT_MEMBER_ANNOTATION)) == null) {
                holder.registerProblem(
                    GodotPluginBundle.message("problem.signal.connection.connectedFunctionNotRegistered"),
                    element,
                    TargetFunctionNotRegisteredQuickFix()
                )
            }
        }
    }
}

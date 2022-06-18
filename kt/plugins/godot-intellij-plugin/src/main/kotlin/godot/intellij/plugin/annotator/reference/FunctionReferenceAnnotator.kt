package godot.intellij.plugin.annotator.reference

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.extension.isInGodotRoot
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression

class FunctionReferenceAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        when (element) {
            is KtCallableReferenceExpression -> {
                SignalFunctionReferenceChecker.checkSignalConnectionFunction(element, holder)
                RpcFunctionReferenceChecker.checkRpcTargetFunction(element, holder)
                CallFunctionReferenceChecker.checkGeneralTargetFunction(element, holder)
            }
        }
    }
}

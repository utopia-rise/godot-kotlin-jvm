package godot.intellij.plugin.annotator.signal

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.annotator.general.checkNotGeneric
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.isSignal
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.extension.type
import godot.intellij.plugin.quickfix.RegisterSignalInitializerQuickFix
import godot.intellij.plugin.quickfix.RegisterSignalMutabilityQuickFix
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.js.descriptorUtils.getKotlinTypeFqName
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstance

class RegisterSignalAnnotator : Annotator {
    private val mutabilityQuickFix by lazy { RegisterSignalMutabilityQuickFix() }
    private val useDelegateQuickFix by lazy { RegisterSignalInitializerQuickFix() }

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        if (element is KtProperty && element.isSignal()) {
            checkNotGeneric(element.toLightElements().firstIsInstance(), holder)
            checkMutability(element, holder)
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: AnnotationHolder) {
        if (ktProperty.isVar) {
            holder.registerProblem(
                message = GodotPluginBundle.message("problem.signal.mutability"),
                errorLocation = ktProperty.valOrVarKeyword,
                quickFixes = arrayOf(mutabilityQuickFix),
                problemHighlightType = ProblemHighlightType.WARNING,
            )
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) = ktProperty
        .initializer
        ?.psiOrParent
        ?: ktProperty
            .nameIdentifier
        ?: ktProperty
            .navigationElement
}

package godot.intellij.plugin.inspections.registration.inspector

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.annotation.RegisterSignal
import godot.intellij.plugin.inspections.registration.quickfix.RegisterSignalInitializerQuickFix
import godot.intellij.plugin.inspections.registration.quickfix.RegisterSignalMutabilityQuickFix
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.*

class RegisterSignalInspection : AbstractKotlinInspection() {
    private val mutabilityQuickFix by lazy { RegisterSignalMutabilityQuickFix() }
    private val useDelegateQuickFix by lazy { RegisterSignalInitializerQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return propertyVisitor { ktProperty ->
            if (ktProperty.findAnnotation(FqName(RegisterSignal::class.java.canonicalName)) != null) {
                checkMutability(ktProperty, holder)
                checkRegisteredType(ktProperty, holder)
            }
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: ProblemsHolder) {
        if (ktProperty.isVar) {
            holder.registerProblem(ktProperty.valOrVarKeyword, "Registered signals should not be mutable", ProblemHighlightType.WARNING, mutabilityQuickFix)
        }
    }

    private fun checkRegisteredType(ktProperty: KtProperty, holder: ProblemsHolder) {
        val type = ktProperty.type() ?: return
        if (!type.getJetTypeFqName(false).startsWith("godot.signals.Signal")) {
            holder.registerProblem(
                getInitializerProblemLocation(ktProperty),
                "Not of type signal. Properties annotated with @RegisterSignal have to be of type signal. Consider using one of the \"by signal\" delegates",
                useDelegateQuickFix
            )
        }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) = ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
}

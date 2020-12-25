package godot.intellij.plugin.inspections.registration.property.inspector

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.property.quickfix.ClassNotRegisteredQuickFix
import godot.intellij.plugin.inspections.registration.property.quickfix.RegisterPropertyMutabilityQuickFix
import godot.intellij.plugin.inspections.registration.property.quickfix.RegisterSignalInitializerQuickFix
import godot.intellij.plugin.inspections.registration.property.quickfix.RegisterSignalMutabilityQuickFix
import org.jetbrains.kotlin.backend.common.serialization.findPackage
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.callUtil.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.typeUtil.*

class RegisterSignalInspection : AbstractKotlinInspection() {
    private val mutabilityQuickFix by lazy { RegisterSignalMutabilityQuickFix() }
    private val useDelegateQuickFix by lazy { RegisterSignalInitializerQuickFix() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return propertyVisitor { ktProperty ->
            if (ktProperty.findAnnotation(FqName("godot.annotation.RegisterSignal")) != null) {
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

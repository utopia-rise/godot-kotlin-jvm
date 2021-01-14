package godot.intellij.plugin.inspections.registration.inspector.property

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.quickfix.RegisterPropertyMutabilityQuickFix
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.type
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.propertyVisitor

class RegisterPropertiesInspection : AbstractKotlinInspection() {
    private val mutabilityQuickFix by lazy { RegisterPropertyMutabilityQuickFix() }
    private val ktExpressionConstantChecker by lazy { KtExpressionConstantChecker() }
    private val propertyHintAnnotationChecker by lazy { PropertyHintAnnotationChecker() }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return propertyVisitor { ktProperty ->
            if (ktProperty.findAnnotation(FqName("godot.annotation.RegisterProperty")) != null) {
                checkMutability(ktProperty, holder)
                checkRegisteredType(ktProperty, holder)
                checkIfDefaultValueIsConstant(ktProperty, holder)
            }
            // outside to check if the property is also registered
            propertyHintAnnotationChecker.checkPropertyHintAnnotations(ktProperty, holder)
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: ProblemsHolder) {
        if (!ktProperty.isVar) {
            holder.registerProblem(ktProperty.valOrVarKeyword, "Registered properties have to be mutable", mutabilityQuickFix)
        }
    }

    private fun checkRegisteredType(ktProperty: KtProperty, holder: ProblemsHolder) {
        val type = ktProperty.type() ?: return
        // enum flag is the only case where registering a kotlin collection is allowed
        if (type.getJetTypeFqName(false).startsWith("kotlin.collections") && ktProperty.findAnnotation(FqName("godot.annotation.EnumFlag")) == null) {
            // TODO: add quick fix
            holder.registerProblem(getInitializerProblemLocation(ktProperty), "Kotlin collections cannot be registered as default values. Consider using one of the godot collections. There are handy conversion functions available")
        }
    }

    private fun checkIfDefaultValueIsConstant(ktProperty: KtProperty, holder: ProblemsHolder) {
        ktProperty
            .initializer
            ?.let {
                if (!it.isConstant() && !ktExpressionConstantChecker.isConstantEnoughForRegistration(it)) {
                    holder.registerProblem(getInitializerProblemLocation(ktProperty), "Default values of registered properties have to be compile time constants or direct constructor calls")
                }
            }
    }

    private fun getInitializerProblemLocation(ktProperty: KtProperty) = ktProperty.initializer?.psiOrParent ?: ktProperty.nameIdentifier ?: ktProperty.navigationElement
}

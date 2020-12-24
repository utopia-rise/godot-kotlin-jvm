package godot.intellij.plugin.inspections.registration.property.inspector

import com.intellij.codeInspection.ProblemsHolder
import com.intellij.psi.PsiElementVisitor
import godot.intellij.plugin.inspections.registration.property.quickfix.RegisterPropertyMutabilityQuickFix
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.propertyVisitor

class RegisterPropertiesInspection : AbstractKotlinInspection() {
    private val quickFix = RegisterPropertyMutabilityQuickFix()

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return propertyVisitor { ktProperty ->
            if (ktProperty.findAnnotation(FqName("godot.annotation.RegisterProperty")) != null) {
                checkMutability(ktProperty, holder)
            }
        }
    }

    private fun checkMutability(ktProperty: KtProperty, holder: ProblemsHolder) {
        if (!ktProperty.isVar) {
            holder.registerProblem(ktProperty.valOrVarKeyword, "Registered properties have to be mutable", quickFix)
        }
    }
}

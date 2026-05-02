package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.annotation.RegisterProperty
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.scripting.resolve.classId
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtProperty

class TargetPropertyNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.property.connectedPropertyNotRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktProperty = (descriptor.psiElement as? KtCallableReferenceExpression)
            ?.callableReference
            ?.mainReference
            ?.resolve() as? KtProperty

        ktProperty?.addAnnotation(RegisterProperty::class.classId)
    }
}

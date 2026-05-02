package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.annotation.RegisterProperty
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.scripting.resolve.classId
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.psi.KtModifierListOwner
import org.jetbrains.kotlin.psi.KtProperty

class PropertyNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.property.notRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktProperty = descriptor.psiElement as? KtProperty ?: descriptor.psiElement.parent
        ktProperty
            .let { it as? KtModifierListOwner }
            ?.addAnnotation(RegisterProperty::class.classId)
    }
}

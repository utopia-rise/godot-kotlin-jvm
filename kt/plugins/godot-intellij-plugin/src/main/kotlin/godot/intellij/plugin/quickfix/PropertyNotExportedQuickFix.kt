package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.EXPORT_ANNOTATION
import godot.intellij.plugin.extension.asClassId
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.psi.KtModifierListOwner
import org.jetbrains.kotlin.psi.KtProperty

class PropertyNotExportedQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.property.notExported.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktProperty = if (descriptor.psiElement is KtProperty) {
            descriptor.psiElement
        } else {
            descriptor.psiElement.parent
        }

        ktProperty
            .let { it as? KtModifierListOwner }
            ?.addAnnotation(asClassId(EXPORT_ANNOTATION))
    }
}

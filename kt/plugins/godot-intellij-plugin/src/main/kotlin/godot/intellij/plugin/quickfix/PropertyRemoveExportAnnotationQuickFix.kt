package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.annotation.Export
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.scripting.resolve.classId
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.psi.KtProperty

class PropertyRemoveExportAnnotationQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.property.removeExportAnnotation.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktProperty = descriptor.psiElement as? KtProperty ?: descriptor.psiElement.parent
        (ktProperty as? KtProperty)?.findAnnotation(Export::class.classId)?.delete()
    }
}

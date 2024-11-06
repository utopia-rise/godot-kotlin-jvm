package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiClass
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.GODOT_SCRIPT_ANNOTATION
import org.jetbrains.kotlin.asJava.classes.KtUltraLightClass
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.name.FqName

class ClassNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.class.notRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val psiClass = if (descriptor.psiElement is PsiClass) {
            descriptor.psiElement as? PsiClass
        } else {
            descriptor.psiElement.parent as? PsiClass
        } ?: return

        when(psiClass) {
            is KtUltraLightClass -> psiClass.kotlinOrigin.addAnnotation(FqName(GODOT_SCRIPT_ANNOTATION))
            else -> psiClass.modifierList?.addAnnotation(GODOT_SCRIPT_ANNOTATION)
        }
    }
}

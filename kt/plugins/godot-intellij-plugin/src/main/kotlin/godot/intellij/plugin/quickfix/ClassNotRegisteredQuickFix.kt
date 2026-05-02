package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiClass
import godot.annotation.RegisterClass
import godot.intellij.plugin.GodotPluginBundle
import org.jetbrains.kotlin.asJava.classes.KtUltraLightClass
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.scripting.resolve.classId

class ClassNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.class.notRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val psiClass = if (descriptor.psiElement is PsiClass) {
            descriptor.psiElement as? PsiClass
        } else {
            descriptor.psiElement.parent as? PsiClass
        } ?: return

        when (psiClass) {
            is KtUltraLightClass -> psiClass.kotlinOrigin.addAnnotation(RegisterClass::class.classId)
            else -> psiClass.modifierList?.addAnnotation(RegisterClass::class.qualifiedName!!)
        }
    }
}

package godot.intellij.plugin.inspections.registration.property.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.project.Project
import godot.annotation.RegisterFunction
import org.jetbrains.kotlin.idea.util.addAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.resolve.ImportPath

class EngineFunctionNotRegisteredQuickFix : LocalQuickFix {
    override fun getFamilyName(): String {
        return "Add @RegisterFunction annotation"
    }

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val ktNamedFunction = descriptor.psiElement as KtNamedFunction
        ktNamedFunction.addAnnotation(FqName(RegisterFunction::class.java.canonicalName))
    }
}

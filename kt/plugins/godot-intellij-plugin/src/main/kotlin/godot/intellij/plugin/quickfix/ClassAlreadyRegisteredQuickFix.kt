package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.OpenFileDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.popup.JBPopupFactory
import com.intellij.psi.PsiClass
import com.intellij.psi.util.findParentOfType
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.RegisteredClassDataContainer
import godot.intellij.plugin.project.registeredClassNameCache
import org.jetbrains.kotlin.idea.base.psi.getLineNumber
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.idea.codeinsight.utils.findExistingEditor
import org.jetbrains.kotlin.idea.core.util.toPsiFile
import org.jetbrains.kotlin.psi.KtClass

class ClassAlreadyRegisteredQuickFix(private val registeredClassName: String) : LocalQuickFix {
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.class.alreadyRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val psiElement = descriptor.psiElement
        val registeredClassNameCache = psiElement
            .module
            ?.registeredClassNameCache
            ?: return

        val containers = registeredClassNameCache.getContainersByName(registeredClassName)
        val containingClassFqName = psiElement.findParentOfType<PsiClass>()?.qualifiedName

        if (containers.size == 2 && containers.map { it.fqName }.contains(containingClassFqName)) {
            val targetContainer = containers.first { it.fqName != containingClassFqName }
            val line = getSourceCodeLineOfClassDefinition(targetContainer, project)
            FileEditorManager
                .getInstance(project)
                .openTextEditor(OpenFileDescriptor(project, targetContainer.vFile, line ?: 0, 0), true)
        } else {
            @Suppress("DialogTitleCapitalization")
            val popup = JBPopupFactory
                .getInstance()
                .createPopupChooserBuilder(containers.map { it.fqName }.toList())
                .setTitle(GodotPluginBundle.message("quickFix.class.alreadyRegistered.popup.title"))
                .setItemChosenCallback { chosenFqName ->
                    val container = registeredClassNameCache.getContainerByFqName(chosenFqName) ?: return@setItemChosenCallback
                    val line = getSourceCodeLineOfClassDefinition(container, project)
                    FileEditorManager
                        .getInstance(project)
                        .openTextEditor(OpenFileDescriptor(project, container.vFile, line ?: 0, 0), true)
                }
                .createPopup()

            val editor = psiElement.findExistingEditor()
            if (editor != null) {
                popup.showInBestPositionFor(editor)
            } else {
                popup.showInFocusCenter()
            }
        }
    }

    private fun getSourceCodeLineOfClassDefinition(
        container: RegisteredClassDataContainer,
        project: Project,
    ): Int? {
        return container
            .vFile
            .toPsiFile(project)
            ?.children
            ?.firstOrNull { child -> child is KtClass && child.fqName?.asString() == container.fqName }
            ?.getLineNumber()
    }
}

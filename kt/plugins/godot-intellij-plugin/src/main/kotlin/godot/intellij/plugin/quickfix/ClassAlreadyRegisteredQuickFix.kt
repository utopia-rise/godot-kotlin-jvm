package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.OpenFileDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.popup.JBPopupFactory
import godot.intellij.plugin.annotator.clazz.RegisteredClassNameCheckerProvider
import org.jetbrains.kotlin.idea.core.util.getLineNumber
import org.jetbrains.kotlin.idea.core.util.toPsiFile
import org.jetbrains.kotlin.idea.inspections.findExistingEditor
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtElement
import org.jetbrains.kotlin.psi.psiUtil.containingClass

/**
 * Not really a quick fix.
 *
 * Shows a popup if more than two classes are registered with the same containing all classes registered with that name.
 * Once an entry in the popup is selected, jumps to the selected class.
 *
 * Jumps directly to other class if only two classes are registered with the same name.
 */
class ClassAlreadyRegisteredQuickFix(private val registeredClassName: String) : LocalQuickFix {
    override fun getFamilyName(): String = "Show classes registered with same name"

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val psiElement = descriptor.psiElement

        val containers = RegisteredClassNameCheckerProvider
            .provide(project)
            .getContainersByName(registeredClassName)

        val containingClassFqName = if (psiElement is KtElement) {
            psiElement.containingClass()?.fqName?.asString()
        } else null

        if (containers.size == 2 && containers.map { it.fqName }.contains(containingClassFqName)) {
            val targetContainer = containers
                .first { it.fqName != containingClassFqName }

            val line = targetContainer
                .vFile
                .toPsiFile(project)
                ?.children
                ?.firstOrNull { child ->
                    child is KtClass && child.fqName?.asString() == targetContainer.fqName
                }
                ?.getLineNumber()

            FileEditorManager
                .getInstance(project)
                .openTextEditor(OpenFileDescriptor(project, targetContainer.vFile, line ?: 0, 0), true)
        } else {
            val popup = JBPopupFactory
                .getInstance()
                .createPopupChooserBuilder(
                    RegisteredClassNameCheckerProvider
                        .provide(project)
                        .getContainersByName(registeredClassName)
                        .map { container -> container.fqName }
                        .toList()
                )
                .setItemChosenCallback { chosenFqName ->
                    val container = RegisteredClassNameCheckerProvider
                        .provide(project)
                        .getContainerByFqName(chosenFqName) ?: return@setItemChosenCallback

                    val line = container
                        .vFile
                        .toPsiFile(project)
                        ?.children
                        ?.firstOrNull { child ->
                            child is KtClass && child.fqName?.asString() == container.fqName
                        }
                        ?.getLineNumber()

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
}

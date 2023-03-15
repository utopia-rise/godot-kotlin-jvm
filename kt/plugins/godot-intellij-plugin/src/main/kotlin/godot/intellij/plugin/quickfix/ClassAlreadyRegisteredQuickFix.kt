package godot.intellij.plugin.quickfix

import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemDescriptor
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.fileEditor.OpenFileDescriptor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.popup.JBPopupFactory
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.cache.classname.RegisteredClassNameCacheProvider
import godot.intellij.plugin.data.model.RegisteredClassDataContainer
import godot.intellij.plugin.extension.getGodotRoot
import org.jetbrains.kotlin.idea.base.psi.getLineNumber
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
    override fun getFamilyName(): String = GodotPluginBundle.message("quickFix.class.alreadyRegistered.familyName")

    override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
        val psiElement = descriptor.psiElement
        val godotRoot = psiElement.getGodotRoot() ?: return

        val containers = RegisteredClassNameCacheProvider
            .provide(godotRoot)
            .getContainersByName(registeredClassName)

        val containingClassFqName = if (psiElement is KtElement) {
            psiElement.containingClass()?.fqName?.asString()
        } else null

        // when only two classes are registered with the same name and on of those is the class that triggered this quick fix,
        // we don't need to show a popup with all classes that are registered with this name as there are only two,
        // we can directly jump to the other class that also uses this name
        if (containers.size == 2 && containers.map { it.fqName }.contains(containingClassFqName)) {
            val targetContainer = containers
                .first { it.fqName != containingClassFqName }

            val line = getSourceCodeLineOfClassDefinition(targetContainer, project)

            FileEditorManager
                .getInstance(project)
                .openTextEditor(OpenFileDescriptor(project, targetContainer.vFile, line ?: 0, 0), true)
        } else {
            val popup = JBPopupFactory
                .getInstance()
                .createPopupChooserBuilder(
                    RegisteredClassNameCacheProvider
                        .provide(godotRoot)
                        .getContainersByName(registeredClassName)
                        .map { container -> container.fqName }
                        .toList()
                )
            .setTitle(@Suppress("DialogTitleCapitalization") GodotPluginBundle.message("quickFix.class.alreadyRegistered.popup.title"))
                .setItemChosenCallback { chosenFqName ->
                    val container = RegisteredClassNameCacheProvider
                        .provide(godotRoot)
                        .getContainerByFqName(chosenFqName) ?: return@setItemChosenCallback

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
        project: Project
    ): Int? {
        return container
            .vFile
            .toPsiFile(project)
            ?.children
            ?.firstOrNull { child ->
                child is KtClass && child.fqName?.asString() == container.fqName
            }
            ?.getLineNumber()
    }
}

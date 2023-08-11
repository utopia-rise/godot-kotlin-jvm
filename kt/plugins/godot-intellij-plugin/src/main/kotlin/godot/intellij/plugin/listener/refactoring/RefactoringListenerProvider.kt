package godot.intellij.plugin.listener.refactoring

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.refactoring.listeners.RefactoringElementListener
import com.intellij.refactoring.listeners.RefactoringElementListenerProvider
import godot.intellij.plugin.data.model.ResPath
import godot.intellij.plugin.refactor.SceneAction
import org.jetbrains.kotlin.asJava.toLightClass
import org.jetbrains.kotlin.idea.base.util.module
import org.jetbrains.kotlin.idea.core.getFqNameByDirectory
import org.jetbrains.kotlin.idea.core.getPackage
import org.jetbrains.kotlin.j2k.getContainingClass
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtFile

class RefactoringListenerProvider : RefactoringElementListenerProvider {
    override fun getListener(element: PsiElement?): RefactoringElementListener? {
        return when(element) {
            is PsiClass -> element.qualifiedName?.let { fqName -> PsiClassRefactoringListenerSingle(fqName) }
            is KtClass -> element.fqName?.asString()?.let { fqName -> PsiClassRefactoringListenerSingle(fqName) }
            is PsiFile -> element.getFqNameByDirectory().asString().let { packagePath -> PsiClassRefactoringListenerBatch(packagePath) }
            is PsiDirectory -> element.getPackage()?.toString()?.let { packagePath -> PsiClassRefactoringListenerBatch(packagePath) }
            else -> null
        }
    }
}

private class PsiClassRefactoringListenerSingle(
    private val oldFqName: String
) : RefactoringElementListener {
    override fun elementMoved(newElement: PsiElement) {
        elementRefactored(newElement)
    }

    override fun elementRenamed(newElement: PsiElement) {
        elementRefactored(newElement)
    }

    private fun elementRefactored(element: PsiElement) {
        val psiClass: PsiClass = when(element) {
            is PsiClass -> element
            is KtClass -> element.toLightClass() ?: return
            else -> return
        }

        val module = psiClass.module ?: return
        val newFqName = psiClass.qualifiedName ?: return

        val oldResPath = ResPath.fromFqName(oldFqName, module)
        val newResPath = ResPath.fromFqName(newFqName, module)

        SceneAction.scriptMoved(
            module = module,
            oldResPath = oldResPath,
            newResPath = newResPath
        )
    }
}

private class PsiClassRefactoringListenerBatch(
    private val oldPackagePath: String
) : RefactoringElementListener {
    override fun elementMoved(newElement: PsiElement) {
        elementRefactored(newElement)
    }

    override fun elementRenamed(newElement: PsiElement) {
        elementRefactored(newElement)
    }

    private fun collectClassesFromDirectory(psiDirectory: PsiDirectory): List<PsiClass> {
        return listOf(
            *psiDirectory.files.toList().flatMap { file ->
                when(file) {
                    is KtFile -> file.classes.toList()
                    is PsiFile -> file.getContainingClass()?.let { listOf(it) } ?: emptyList()
                    else -> emptyList()
                }
            }.toTypedArray(),
            *psiDirectory.subdirectories.flatMap { directory -> collectClassesFromDirectory(directory) }.toTypedArray()
        )
    }

    private fun elementRefactored(element: PsiElement) {
        val classes: List<PsiClass> = when(element) {
            is PsiFile -> element.getContainingClass()?.let { listOf(it) } ?: emptyList()
            is PsiDirectory -> collectClassesFromDirectory(element)
            else -> emptyList()
        }

        classes.forEach { psiClass ->
            val module = psiClass.module ?: return@forEach
            val newFqName = psiClass.qualifiedName ?: return@forEach
            val simpleName = newFqName.substringAfterLast(".")
            val oldFqName = "${oldPackagePath}.${simpleName}"

            val oldResPath = ResPath.fromFqName(oldFqName, module)
            val newResPath = ResPath.fromFqName(newFqName, module)

            SceneAction.scriptMoved(
                module = module,
                oldResPath = oldResPath,
                newResPath = newResPath
            )
        }
    }
}

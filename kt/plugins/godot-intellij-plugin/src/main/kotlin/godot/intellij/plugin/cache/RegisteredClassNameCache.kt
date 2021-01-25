package godot.intellij.plugin.cache

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import godot.intellij.plugin.data.model.RegisteredClassDataContainer
import godot.intellij.plugin.extension.getRegisteredClassName
import org.jetbrains.kotlin.psi.KtClass

class RegisteredClassNameCache {
    private val fqNameToRegisteredName: MutableMap<String, RegisteredClassDataContainer> = mutableMapOf()

    fun getContainersByName(registeredName: String): Set<RegisteredClassDataContainer> =
        fqNameToRegisteredName
            .entries
            .groupBy { it.value.registeredName }[registeredName]
            ?.map { it.value }
            ?.toSet()
            ?: emptySet()

    fun getContainerByFqName(fqName: String): RegisteredClassDataContainer? = fqNameToRegisteredName[fqName]

    fun psiFileChanged(psiFile: PsiFile) {
        psiFile.accept(
            object : PsiRecursiveElementWalkingVisitor() {
                override fun visitElement(element: PsiElement) {
                    super.visitElement(element)

                    if (element is KtClass) {
                        val (fqName, registeredName) = element.getRegisteredClassName() ?: run {
                            fqNameToRegisteredName.remove(element.fqName?.asString())
                            return
                        }
                        fqNameToRegisteredName[fqName] = RegisteredClassDataContainer(
                            fqName,
                            registeredName,
                            element.containingFile.virtualFile
                        )
                    }
                }
            }
        )
    }

    fun psiFileRemoved(psiFile: PsiFile) {
        psiFile.accept(
            object : PsiRecursiveElementWalkingVisitor() {
                override fun visitElement(element: PsiElement) {
                    super.visitElement(element)

                    if (element is KtClass) {
                        fqNameToRegisteredName.remove(element.fqName?.asString())
                    }
                }
            }
        )
    }
}

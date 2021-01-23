package godot.intellij.plugin.inspections.registration.inspector.clazz

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import godot.intellij.plugin.extension.getFqNameToRegisteredClassNamePair
import org.jetbrains.kotlin.psi.KtClass

class RegisteredClassNameChecker {
    private val fqNameToRegisteredName: MutableMap<String, String> = mutableMapOf()

    fun getFqNamesRegisteredWithName(registeredName: String): Set<String> =
        fqNameToRegisteredName
            .entries
            .groupBy { it.value }[registeredName]
            ?.map { it.key }
            ?.toSet()
            ?: emptySet()

    fun psiFileChanged(psiFile: PsiFile) {
        psiFile.accept(object : PsiRecursiveElementWalkingVisitor() {
            override fun visitElement(element: PsiElement) {
                super.visitElement(element)

                if (element is KtClass) {
                    val (fqName, registeredName) = element.getFqNameToRegisteredClassNamePair() ?: run {
                        fqNameToRegisteredName.remove(element.fqName?.asString())
                        return
                    }
                    fqNameToRegisteredName[fqName] = registeredName
                }
            }
        })
    }

    fun psiFileRemoved(psiFile: PsiFile) {
        psiFile.accept(object : PsiRecursiveElementWalkingVisitor() {
            override fun visitElement(element: PsiElement) {
                super.visitElement(element)

                if (element is KtClass) {
                    fqNameToRegisteredName.remove(element.fqName?.asString())
                }
            }
        })
    }
}

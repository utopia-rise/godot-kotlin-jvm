package godot.intellij.plugin

import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.PsiRecursiveElementWalkingVisitor
import godot.intellij.plugin.project.getRegisteredClassName
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

                    val registeredClass = when (element) {
                        is KtClass -> element.getRegisteredClassName()
                            ?.let { (fqName, registeredName) ->
                                Triple(fqName, registeredName, element.containingFile.virtualFile)
                            }

                        is PsiClass -> element.getRegisteredClassName()
                            ?.let { (fqName, registeredName) ->
                                Triple(fqName, registeredName, element.containingFile.virtualFile)
                            }

                        else -> return
                    }

                    if (registeredClass == null) {
                        when (element) {
                            is KtClass -> element.fqName?.asString()?.let(fqNameToRegisteredName::remove)
                            is PsiClass -> element.qualifiedName?.let(fqNameToRegisteredName::remove)
                        }
                        return
                    }

                    val (fqName, registeredName, vFile) = registeredClass
                    fqNameToRegisteredName[fqName] = RegisteredClassDataContainer(
                        fqName,
                        registeredName,
                        vFile
                    )
                }
            }
        )
    }

    fun psiFileRemoved(psiFile: PsiFile) {
        psiFile.accept(
            object : PsiRecursiveElementWalkingVisitor() {
                override fun visitElement(element: PsiElement) {
                    super.visitElement(element)

                    val fqName = when (element) {
                        is KtClass -> element.fqName?.asString()
                        is PsiClass -> element.qualifiedName
                        else -> return
                    }

                    fqName?.let(fqNameToRegisteredName::remove)
                }
            }
        )
    }
}

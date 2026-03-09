package godot.intellij.plugin.annotator.base

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.psi.KtElement

interface BaseAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        when (element) {
            is KtElement -> element
                .toLightElements()
                .forEach { psiNamedElement ->
                    checkElement(psiNamedElement, holder)
                }

            else -> checkElement(element, holder)
        }
    }

    fun checkElement(element: PsiElement, holder: AnnotationHolder)
}

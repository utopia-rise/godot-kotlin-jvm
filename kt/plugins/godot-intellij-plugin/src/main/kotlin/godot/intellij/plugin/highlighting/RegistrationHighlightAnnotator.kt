package godot.intellij.plugin.highlighting

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.components.service
import com.intellij.openapi.util.TextRange
import com.intellij.psi.JavaTokenType
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiField
import com.intellij.psi.PsiMethod
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.PsiTreeUtil
import godot.intellij.plugin.project.isInGodotRoot
import godot.intellij.plugin.registration.RegistrationSettings
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty

class RegistrationHighlightAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.project.service<RegistrationSettings>().state.registrationHighlightsEnabled) return
        if (!element.isInGodotRoot()) return

        val (anchor, body, highlight) = when (element) {
            is KtClass ->
                Triple(element.nameIdentifier, element.body, RegistrationHighlightClassifier.classify(element))

            is KtProperty ->
                Triple(
                    element.nameIdentifier,
                    listOfNotNull(element.equalsToken, element.delegate, element.getter, element.setter)
                        .minByOrNull { it.textOffset },
                    RegistrationHighlightClassifier.classify(element)
                )

            is KtNamedFunction ->
                Triple(
                    element.nameIdentifier,
                    element.equalsToken ?: element.bodyExpression,
                    RegistrationHighlightClassifier.classify(element)
                )

            is PsiClass ->
                Triple(element.nameIdentifier, element.lBrace, RegistrationHighlightClassifier.classify(element))

            is PsiField ->
                Triple(element.nameIdentifier, element.initializer, RegistrationHighlightClassifier.classify(element))

            is PsiMethod ->
                Triple(element.nameIdentifier, element.body, RegistrationHighlightClassifier.classify(element))

            else -> return
        }

        highlightRegistrationDeclaration(element, anchor, body, highlight, holder)
    }
}

internal fun highlightRegistrationDeclaration(
    element: PsiElement,
    anchor: PsiElement?,
    body: PsiElement?,
    highlight: RegistrationHighlight?,
    holder: AnnotationHolder
) {
    if (anchor == null || highlight == null) return
    val document = element.containingFile.viewProvider.document ?: return
    val line = document.getLineNumber(anchor.textOffset)
    val declarationEnd = body
        ?.let { boundary ->
            var lastSignatureToken = PsiTreeUtil.prevVisibleLeaf(boundary)
            if (lastSignatureToken?.node?.elementType == JavaTokenType.EQ) {
                lastSignatureToken = PsiTreeUtil.prevVisibleLeaf(lastSignatureToken)
            }
            lastSignatureToken?.textRange?.endOffset
        }
        ?: element.textRange.endOffset
    val lineStart = element.containingFile.findElementAt(document.getLineStartOffset(line))
    val firstDeclarationToken =
        if (lineStart is PsiWhiteSpace) PsiTreeUtil.nextVisibleLeaf(lineStart) else lineStart
    val declarationStart = firstDeclarationToken?.textRange?.startOffset ?: anchor.textOffset
    val declarationRange = TextRange(
        maxOf(declarationStart, element.textRange.startOffset),
        declarationEnd
    )

    holder
        .newSilentAnnotation(HighlightSeverity.INFORMATION)
        .range(declarationRange)
        .enforcedTextAttributes(highlight.textAttributes)
        .create()
}

package godot.intellij.plugin.extension

import com.intellij.codeInspection.InspectionManager
import com.intellij.codeInspection.LocalQuickFix
import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.psi.PsiElement

fun AnnotationHolder.registerProblem(message: String, errorLocation: PsiElement, quickFix: LocalQuickFix? = null, problemHighlightType: ProblemHighlightType = ProblemHighlightType.GENERIC_ERROR) {
    val annotationBuilder = newAnnotation(highlightSeverityFromHighlightType(problemHighlightType), message)
    if (quickFix != null) {
        annotationBuilder
            .newLocalQuickFix(
                quickFix,
                getProblemDescriptor(errorLocation, quickFix, problemHighlightType)
            )
            .registerFix()
    }
    annotationBuilder
        .range(errorLocation)
        .highlightType(problemHighlightType)
        .create()
}

private fun getProblemDescriptor(element: PsiElement, quickFix: LocalQuickFix, problemHighlightType: ProblemHighlightType) = InspectionManager
    .getInstance(element.project)
    .createProblemDescriptor(
        element,
        "unused",
        quickFix,
        problemHighlightType,
        true
    )

private fun highlightSeverityFromHighlightType(problemHighlightType: ProblemHighlightType): HighlightSeverity {
    return when (problemHighlightType) {
        ProblemHighlightType.GENERIC_ERROR_OR_WARNING -> HighlightSeverity.ERROR
        ProblemHighlightType.LIKE_UNKNOWN_SYMBOL -> HighlightSeverity.WARNING
        ProblemHighlightType.LIKE_DEPRECATED -> HighlightSeverity.WARNING
        ProblemHighlightType.LIKE_UNUSED_SYMBOL -> HighlightSeverity.WARNING
        ProblemHighlightType.ERROR -> HighlightSeverity.ERROR
        ProblemHighlightType.WARNING -> HighlightSeverity.WARNING
        ProblemHighlightType.GENERIC_ERROR -> HighlightSeverity.ERROR
        ProblemHighlightType.WEAK_WARNING -> HighlightSeverity.WEAK_WARNING
        ProblemHighlightType.INFORMATION -> HighlightSeverity.INFORMATION
        ProblemHighlightType.LIKE_MARKED_FOR_REMOVAL -> HighlightSeverity.WARNING
        else -> HighlightSeverity.INFORMATION
    }
}

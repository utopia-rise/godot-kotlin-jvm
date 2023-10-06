package godot.intellij.plugin.annotator.copy

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiClass
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiField
import com.intellij.psi.PsiMethod
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.CORE_TYPE_HELPER_ANNOTATION
import godot.intellij.plugin.data.model.CORE_TYPE_LOCAL_COPY_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import org.jetbrains.kotlin.asJava.toLightElements
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.idea.references.resolveToDescriptors

import org.jetbrains.kotlin.lexer.KtSingleValueToken

import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtBlockExpression
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtElement
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode

class CopyModificationAnnotator : Annotator {
    private val singleValueTokensToCheck = listOf("=", "+=", "-=", "*=", "/=", "%=")

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        return // TODO: enable again after fixing the case `transformMutate { basis.x = Vector3.ZERO }` being flagged falsely as not allowed
        if (!element.isInGodotRoot()) return

        val isCoreTypeCopyAssignment = when(element) {
            // examples:
            //      something = 1
            //      something += 2
            is KtBinaryExpression -> {
                val operation = element.operationToken

                if (operation is KtSingleValueToken && singleValueTokensToCheck.contains(operation.value)) {
                    element.left?.let { leftOperand ->
                        if (leftOperand is KtDotQualifiedExpression) {
                            hasLocalCopyAnnotationInDotQualifiedChain(leftOperand)
                        } else false
                    } ?: false
                } else false
            }
            // examples:
            //      |-this-------|
            //      something.else.apply { x = 1.0 }
            //                |-or this-|
            //      something.else.apply { x = 1.0 }
            is KtDotQualifiedExpression -> hasLocalCopyAnnotationInDotQualifiedChain(element)
            else -> false
        }

        if (isCoreTypeCopyAssignment) {
            val relevantParent = getRelevantParent(element)
            holder.registerProblem(
                GodotPluginBundle.message("problem.general.modificationOfCoreTypeCopy"),
                relevantParent ?: element,
                problemHighlightType = ProblemHighlightType.WEAK_WARNING
            )
        }
    }

    /**
     * Checks whether a local copy of a core type is mutated
     *
     * This function makes the following assumptions:
     * - Checks have already taken place that an assignment takes place on a dotQualifiedExpression.
     *
     *      Example: `position.x += 1` here this function expects to be called for `position.x` and the callee already
     *      checked for the assigment
     *
     * Exampes:
     * ```kotlin
     *     position += Vector3.FORWARD // allowed
     *     position += Vector3.FORWARD // allowed
     *     position.x += 1 // not allowed
     *
     *     val intermediate = position
     *     intermediate.x += 1 // allowed
     *
     *     val intermediate2 = position
     *     intermediate.x += 1 // allowed
     *     position = intermediate2
     *
     *     transform.basis.x { y = 1.0 } // not allowed
     *     transform.basis.x { y = 1.0 } // not allowed
     *     transform.basis { x = Vector3.ZERO } // not allowed
     *
     *     transform = transform.apply { basis { x { y = 1.0 } } } // allowed
     *     transform = transform.apply { basis { x = Vector3.ZERO } } // allowed
     *
     *     node3D.position.x = 1.0 // not allowed
     * ```
     */
    private tailrec fun hasLocalCopyAnnotationInDotQualifiedChain(dotQualifiedExpression: KtDotQualifiedExpression): Boolean {
        // the selector expression is the right hand side of a dot qualifier expression: `left.right`
        val selectorExpression = dotQualifiedExpression.selectorExpression ?: return false
        // the receiver expression is the left hand side of a dot qualifier expression: `left.right`
        val receiverExpression = dotQualifiedExpression.receiverExpression

        // annotations on the selector expression's reference (usually a property of an object)
        val selectorAnnotations = selectorExpression
            .mainReference
            ?.resolveToDescriptors(selectorExpression.analyze(BodyResolveMode.PARTIAL))
            ?.flatMap { declarationDescriptor -> declarationDescriptor.annotations }
            ?.mapNotNull { annotationDescriptor -> annotationDescriptor.fqName?.asString() }
            ?: emptyList()

        // annotations on the receiver expression's reference (usually a property of an object)
        val receiverAnnotations = receiverExpression
            .mainReference
            ?.resolveToDescriptors(selectorExpression.analyze(BodyResolveMode.PARTIAL))
            ?.flatMap { declarationDescriptor -> declarationDescriptor.annotations }
            ?.mapNotNull { annotationDescriptor -> annotationDescriptor.fqName?.asString() }
            ?: emptyList()

        val selectorReferenceHasLocalCopyAnnotation = selectorAnnotations.contains(CORE_TYPE_LOCAL_COPY_ANNOTATION)
        val selectorReferenceHasCoreTypeHelperAnnotation = selectorAnnotations.contains(CORE_TYPE_HELPER_ANNOTATION)

        val receiverReferenceHasLocalCopyAnnotation = receiverAnnotations.contains(CORE_TYPE_LOCAL_COPY_ANNOTATION)

        return when {
            // when the selector reference is a local copy we're definitely modifying a copy (see assumption)
            selectorReferenceHasLocalCopyAnnotation -> true
            // when the receiver has a local copy annotation and the selector has a core type helper annotation, it
            // means that we use the coretype helper on a local copy which is not allowed.
            // Example: `transform.basis { x = Vector3.ZERO }` as `transform` is already a copy
            receiverReferenceHasLocalCopyAnnotation && selectorReferenceHasCoreTypeHelperAnnotation -> true
            // neither the receiver nor the selector had any annotations we care about, so we walk the dot call chain up once more
            receiverExpression is KtDotQualifiedExpression -> hasLocalCopyAnnotationInDotQualifiedChain(receiverExpression)
            // in most cases at this point we are at the end of the dot call chain
            else -> false
        }
    }


    /**
     * Returns the topmost relevant parent or null if no suitable relevant parent was found.
     *
     * The following elements are considered relevant:
     * - Class
     * - Property
     * - Field
     * - Method
     * - MethodBody
     *
     * This is primarily needed to provide an anchor for annotation holder in expressions where the same problem might
     * arise multiple times.
     *
     * For example local copy modifications of core types in dot call chains: `transform.basis.x` here without the
     * common parent, the error would be displayed twice for this single line of code. Once for the element `transform`
     * and once for the element `basis`. But with this function, we use the topmost relevant parent which is the whole
     * line. And thus even as we add the error twice, we add it twice for the same psi element and thus it is only
     * displayed once.
     */
    private tailrec fun getRelevantParent(element: PsiElement, depth: Int = 0, maxDepth: Int = 50): PsiElement? {
        val parent = element.parent

        val localElement = if (parent is KtElement) {
            parent.toLightElements().firstOrNull() ?: parent
        } else {
            parent
        }
        return when(localElement) {
            is KtBlockExpression -> element
            is PsiClass -> element
            is PsiMethod -> element
            is PsiField -> element
            else -> if (depth < maxDepth) {
                getRelevantParent(localElement, depth + 1)
            } else null
        }
    }
}

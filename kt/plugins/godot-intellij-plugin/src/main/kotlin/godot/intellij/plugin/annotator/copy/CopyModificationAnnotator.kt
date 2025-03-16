package godot.intellij.plugin.annotator.copy

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiAnnotationOwner
import com.intellij.psi.PsiElement
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.CORE_TYPE_LOCAL_COPY_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import org.jetbrains.kotlin.idea.references.mainReference
import org.jetbrains.kotlin.lexer.KtSingleValueToken
import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression

class CopyModificationAnnotator : Annotator {
    private val singleValueTokensToCheck = listOf("=", "+=", "-=", "*=", "/=", "%=")

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        val isCoreTypeCopyAssignment = when (element) {
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
            holder.registerProblem(
                GodotPluginBundle.message("problem.general.modificationOfCoreTypeCopy"),
                element,
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
     *      position += Vector3.FORWARD // allowed
     *      position += Vector3.FORWARD // allowed
     *      position.x += 1 // not allowed
     *
     *      val intermediate = position
     *      intermediate.x += 1 // allowed
     *
     *      val intermediate2 = position
     *      intermediate.x += 1 // allowed
     *      position = intermediate2
     *
     *      transform.basis.x { y = 1.0 } // not allowed
     *      transform.basis.x { y = 1.0 } // not allowed
     *      transform.basis { x = Vector3.ZERO } // not allowed
     *
     *      transformMutate { basis = Basis.IDENTITY } // allowed
     *      transformMutate { basis.x = Vector3.ZERO } // not allowed
     *      transformMutate { basis.x.x = 1.0 } // not allowed
     *
     *
     *      transform = transform.apply { basis { x { y = 1.0 } } } // allowed
     *      transform = transform.apply { basis { x = Vector3.ZERO } } // allowed
     *
     *      node3D.globalPosition = globalPosition // allowed
     *      node3D.position.x = 1.0 // not allowed
     *      blubb.transform.basis.x.x = 1.0 // not allowed
     *
     *
     *      val vector3 = Vector3.ZERO
     *      vector3.x = 1.0 // allowed
     *
     *      val testBasis = Basis.IDENTITY
     *      testBasis.x.x = 1.0 // not allowed
     *
     *      val testTransform3D = Transform3D()
     *      testTransform3D.basis.x.x = 1.0 // not allowed
     * ```
     */
    private tailrec fun hasLocalCopyAnnotationInDotQualifiedChain(dotQualifiedExpression: KtDotQualifiedExpression): Boolean {
        // the selector expression is the right hand side of a dot qualifier expression: `left.right`
        val selectorExpression = dotQualifiedExpression.selectorExpression ?: return false
        // the receiver expression is the left hand side of a dot qualifier expression: `left.right`
        val receiverExpression = dotQualifiedExpression.receiverExpression

        // if the receiver is a dot expression, we want to check it's selector for a local copy annotation, in any other case we check the main reference
        // case for dot expression: `basis.[x].x` <- the [x] is the selector of the dot expression [basis.x].[x] we care about
        val receiverReferenceToCheck = ((receiverExpression as? KtDotQualifiedExpression)?.selectorExpression) ?: receiverExpression

        val annotationOwner = receiverReferenceToCheck.mainReference?.resolve() as? PsiAnnotationOwner

        val receiverReferenceHasLocalCopyAnnotation = annotationOwner
            ?.annotations
            ?.any { it.hasQualifiedName(CORE_TYPE_LOCAL_COPY_ANNOTATION) } == true

        return when {
            // when the receiver reference has a local copy annotation, it means we're modifying a local copy (see the assumption in the kdoc!)
            receiverReferenceHasLocalCopyAnnotation -> true

            // the receiver reference did not have any local copy annotation but itself is a dot expression. So we walk up once more to check the rest of the call chain
            receiverExpression is KtDotQualifiedExpression -> hasLocalCopyAnnotationInDotQualifiedChain(
                receiverExpression
            )

            // in most cases at this point we are at the end of the dot call chain
            else -> false
        }
    }
}

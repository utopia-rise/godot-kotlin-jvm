package godot.intellij.plugin.annotator.copy

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import com.intellij.psi.search.searches.ReferencesSearch
import godot.intellij.plugin.extension.registerProblem
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.debugger.sequence.psi.resolveType
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.lexer.KtSingleValueToken
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtArrayAccessExpression
import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtConstructor
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtOperationReferenceExpression
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.KotlinType

class CopyModificationAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val isCoreTypeCopyAssignment = if (element is KtOperationReferenceExpression) {
            val tokenType = element.operationSignTokenType
            if (tokenType is KtSingleValueToken && tokenType.value == "=") {
                when (val parent = element.parent) {
                    is KtBinaryExpression -> {
                        when (val leftExpression = parent.left) {
                            is KtDotQualifiedExpression -> {
                                val receiverExpression = leftExpression.receiverExpression
                                if (receiverExpression is KtNameReferenceExpression) {
                                    val resolvedExpression = receiverExpression.resolve()
                                    if (resolvedExpression is KtProperty) {
                                        resolvedExpression.initializer?.isConstructorCall() == false &&
                                        ReferencesSearch.search(resolvedExpression).none { psiReference ->
                                            val referenceElement = psiReference.element
                                            val expressionWithUsage = referenceElement.parent
                                            expressionWithUsage is KtBinaryExpression && expressionWithUsage.right == referenceElement
                                        }
                                    } else false
                                } else {
                                    leftExpression.receiverExpression.resolveType().isCoreType()
                                }
                            }
                            is KtArrayAccessExpression -> {
                                val arrayExpression = leftExpression.arrayExpression
                                if (arrayExpression is KtNameReferenceExpression) {
                                    val resolvedExpression = arrayExpression.resolve()
                                    if (resolvedExpression is KtProperty) {
                                        resolvedExpression.initializer?.isConstructorCall() == false &&
                                        ReferencesSearch.search(resolvedExpression).none { psiReference ->
                                            val referenceElement = psiReference.element
                                            val expressionWithUsage = referenceElement.parent
                                            expressionWithUsage is KtBinaryExpression && expressionWithUsage.right == referenceElement
                                        }
                                    } else false
                                } else {
                                    leftExpression
                                        .arrayExpression
                                        ?.resolveType()
                                        ?.isCoreType() ?: false
                                }
                            }
                            else -> false
                        }
                    }
                    else -> false
                }
            } else false
        } else false

        if (isCoreTypeCopyAssignment) {
            holder.registerProblem("Test", element)
        }
    }

    private fun KtExpression.isConstructorCall(): Boolean {
        val bindingContext = analyze(BodyResolveMode.FULL)
        return referenceExpression()
            ?.getReferenceTargets(bindingContext)
            ?.firstOrNull()
            ?.let { declarationDescriptor ->
                val psi = declarationDescriptor.findPsi()
                psi is KtConstructor<*> || declarationDescriptor is ClassConstructorDescriptorImpl
            } ?: false
    }
}

private fun KotlinType.isCoreType(): Boolean {
    return coreTypes.contains(getJetTypeFqName(false).removeSuffix("?"))
}

private val coreTypes = listOf(
    "godot.core.Vector2",
    "godot.core.Rect2",
    "godot.core.Vector3",
    "godot.core.Transform2D",
    "godot.core.Plane",
    "godot.core.Quat",
    "godot.core.AABB",
    "godot.core.Basis",
    "godot.core.Transform",
    "godot.core.Color",
    "godot.core.NodePath",
    "godot.core.RID",
    "godot.Object",
    "godot.core.Dictionary",
    "godot.core.PoolByteArray",
    "godot.core.PoolIntArray",
    "godot.core.PoolRealArray",
    "godot.core.PoolStringArray",
    "godot.core.PoolColorArray",
    "godot.core.PoolVector2Array",
    "godot.core.PoolVector3Array",
    "godot.core.VariantArray",
    "godot.core.ObjectArray",
    "godot.core.EnumArray",
    "godot.core.BoolVariantArray",
    "godot.core.IntVariantArray",
    "godot.core.RealVariantArray",
    "godot.core.StringVariantArray",
    "godot.core.AABBArray",
    "godot.core.BasisArray",
    "godot.core.ColorArray",
    "godot.core.NodePathArray",
    "godot.core.PlaneArray",
    "godot.core.QuatArray",
    "godot.core.Rect2Array",
    "godot.core.RIDArray",
    "godot.core.Transform2DArray",
    "godot.core.TransformArray",
    "godot.core.Vector2Array",
    "godot.core.Vector3Array"
)

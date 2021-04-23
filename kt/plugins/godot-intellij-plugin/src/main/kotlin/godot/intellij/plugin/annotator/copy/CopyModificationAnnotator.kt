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
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtConstructor
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtReferenceExpression
import org.jetbrains.kotlin.psi.KtReturnExpression
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.KotlinType

class CopyModificationAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        val isCoreTypeCopyAssignment = if (element is KtBinaryExpression) {
            val tokenType = element.operationToken
            if (tokenType is KtSingleValueToken && tokenType.value == "=") {
                element.left?.let { evaluateExpression(it) } ?: false
            } else false
        } else false

        if (isCoreTypeCopyAssignment) {
            holder.registerProblem("Test", element)
        }
    }

    private fun evaluateExpression(expression: KtExpression) : Boolean {
        return when (expression) {
            is KtDotQualifiedExpression -> {
                when (val receiverExpression = expression.receiverExpression) {
                    is KtNameReferenceExpression -> {
                        evaluateKtNameReferenceExpression(receiverExpression)
                    }
                    is KtCallExpression -> {
                        evaluateKtCallExpression(receiverExpression)
                    }
                    else -> expression.receiverExpression.resolveType().isCoreType()
                }
            }
            is KtArrayAccessExpression -> {
                when (val arrayExpression = expression.arrayExpression) {
                    is KtNameReferenceExpression -> {
                        evaluateKtNameReferenceExpression(arrayExpression)
                    }
                    is KtCallExpression -> {
                        evaluateKtCallExpression(arrayExpression)
                    }
                    else -> arrayExpression?.resolveType()?.isCoreType() ?: false
                }
            }
            is KtNameReferenceExpression -> {
                evaluateKtNameReferenceExpression(expression)
            }
            else -> false
        }
    }

    private fun evaluateKtNameReferenceExpression(ktNameReferenceExpression: KtNameReferenceExpression): Boolean {
        val resolvedExpression = ktNameReferenceExpression.resolve()
        return if (resolvedExpression is KtProperty) {
            val initializer = resolvedExpression.initializer
            //((((resolvedExpression.initializer as KtCallExpression).calleeExpression as KtReferenceExpression).resolve() as KtNamedFunction).getDeclarationBody() as KtBlockExpression).statements.filterIsInstance<KtReturnExpression>().first().returnedExpression
            if (initializer is KtCallExpression) {
                evaluateKtCallExpression(initializer)
            } else {
                resolvedExpression.initializer?.isConstructorCall() == false &&
                    resolvedExpression.initializer !is KtNameReferenceExpression &&
                    ReferencesSearch.search(resolvedExpression).none { psiReference ->
                        val referenceElement = psiReference.element
                        val expressionWithUsage = referenceElement.parent
                        expressionWithUsage is KtBinaryExpression && expressionWithUsage.right == referenceElement
                    }
            }
        } else false
    }

    private fun evaluateKtCallExpression(ktCallExpression: KtCallExpression): Boolean {
        val function = ((ktCallExpression.calleeExpression as? KtReferenceExpression)?.resolve() as? KtNamedFunction)
        return if (function?.hasBlockBody() == true) {
            function
                .bodyBlockExpression
                ?.statements
                ?.filterIsInstance<KtReturnExpression>()
                ?.map { it.returnedExpression }
                ?.mapNotNull { it }
                ?.any { evaluateExpression(it) }
                ?: false
        } else {
            function?.bodyExpression?.let { evaluateExpression(it) } ?: false
        }
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

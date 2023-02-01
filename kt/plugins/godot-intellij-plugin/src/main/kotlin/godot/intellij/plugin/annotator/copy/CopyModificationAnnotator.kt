package godot.intellij.plugin.annotator.copy

import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import com.intellij.psi.search.searches.ReferencesSearch
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.CORE_TYPE_HELPER_ANNOTATION
import godot.intellij.plugin.extension.isInGodotRoot
import godot.intellij.plugin.extension.registerProblem
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotCorePackage
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.idea.util.module
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.lexer.KtSingleValueToken
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtAnnotated
import org.jetbrains.kotlin.psi.KtArrayAccessExpression
import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtConstructor
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.KtPostfixExpression
import org.jetbrains.kotlin.psi.KtProperty
import org.jetbrains.kotlin.psi.KtReferenceExpression
import org.jetbrains.kotlin.psi.KtReturnExpression
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode
import org.jetbrains.kotlin.types.KotlinType

class CopyModificationAnnotator : Annotator {
    private val singleValueTokensToCheck = listOf("=", "+=", "-=", "*=", "/=", "%=")

    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (!element.isInGodotRoot()) return

        val isCoreTypeCopyAssignment = when (element) {
            is KtBinaryExpression -> {
                val tokenType = element.operationToken
                if (tokenType is KtSingleValueToken && singleValueTokensToCheck.contains(tokenType.value)) {
                    element.left?.let { leftExpression ->
                        if (shouldEvaluate(leftExpression)) {
                            evaluateExpression(leftExpression)
                        } else false
                    } ?: false
                } else false
            }
            is KtPostfixExpression -> {
                if (shouldEvaluate(element.baseExpression)) {
                    element.baseExpression?.let { evaluateExpression(it) } ?: false
                } else false
            }
            /*
              check if a core type helper function is used on a copied core type
              example:
              globalTransform.origin {
                  x += 3
              }

              correct would be:
              globalTransform {
                  origin {
                      x += 3
                  }
              }
              or:
              globalTransform {
                  origin.x += 3
              }
             */
            is KtDotQualifiedExpression -> {
                val receiverType = element.receiverExpression.resolveTypeSafe()

                receiverType?.getJetTypeFqName(false) != "$godotCorePackage.${GodotTypes.dictionary}" &&
                    receiverType?.getJetTypeFqName(false) != "$godotCorePackage.${GodotKotlinJvmTypes.variantArray}" &&
                    receiverType?.isCoreType() == true &&
                    (((element.selectorExpression as? KtCallExpression)?.calleeExpression as? KtReferenceExpression)?.resolve() as? KtAnnotated)?.findAnnotation(FqName(CORE_TYPE_HELPER_ANNOTATION)) != null
            }
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

    private fun shouldEvaluate(expression: KtExpression?): Boolean {
        return when {
            expression is KtDotQualifiedExpression &&
                expression.receiverExpression.resolveTypeSafe()?.isCoreType() == false -> false
            expression is KtArrayAccessExpression &&
                expression.arrayExpression?.resolveTypeSafe()?.isCoreType() == false -> false
            else -> true
        }
    }

    private fun evaluateExpression(expression: KtExpression): Boolean {
        return when (expression) {
            is KtDotQualifiedExpression -> when (val receiverExpression = expression.receiverExpression) {
                is KtNameReferenceExpression -> evaluateKtNameReferenceExpression(receiverExpression)
                is KtCallExpression ->
                    if (expression.receiverExpression is KtDotQualifiedExpression &&
                        (expression.receiverExpression as KtDotQualifiedExpression).receiverExpression.resolveTypeSafe()
                            ?.isPoolArray() == true
                    ) {
                        false
                    } else {
                        evaluateKtCallExpression(receiverExpression)
                    }
                is KtDotQualifiedExpression -> if (receiverExpression.receiverExpression.resolveTypeSafe()?.isPoolArray() != true) {
                    if (receiverExpression.isConstructorCall()) {
                        receiverExpression.selectorExpression?.let { evaluateExpression(it) } ?: false
                    } else {
                        // call chain check
                        //
                        // example:
                        // val property = someClass.vectorProperty.x
                        // fun modificationFunction() {
                        //     property = 1f
                        // }
                        //
                        // this is wrong as we're modifying a property of "by value" core type vectorProperty without reassigning it
                        if (receiverExpression.receiverExpression.resolveTypeSafe()?.isCoreType() == true && receiverExpression.selectorExpression is KtReferenceExpression) {
                            true
                        } else {
                            evaluateExpression(receiverExpression)
                        }
                    }
                } else {
                    false
                }

                is KtArrayAccessExpression ->
                    receiverExpression
                        .arrayExpression
                        ?.resolveTypeSafe()
                        ?.isPoolArray() != true && expression
                        .receiverExpression
                        .resolveTypeSafe()
                        ?.isCoreType() == true
                else ->
                    expression
                        .receiverExpression
                        .resolveTypeSafe()
                        ?.isCoreType() == true && expression.receiverExpression.resolveTypeSafe()?.isPoolArray() != true
            }
            is KtArrayAccessExpression -> when (val arrayExpression = expression.arrayExpression) {
                is KtNameReferenceExpression -> evaluateKtNameReferenceExpression(arrayExpression)
                is KtCallExpression -> evaluateKtCallExpression(arrayExpression)
                else -> arrayExpression?.resolveTypeSafe()?.isCoreType() ?: false
            }
            is KtNameReferenceExpression -> evaluateKtNameReferenceExpression(expression)
            is KtCallExpression -> evaluateKtCallExpression(expression)
            else -> false
        }
    }

    private fun evaluateKtNameReferenceExpression(ktNameReferenceExpression: KtNameReferenceExpression): Boolean {
        val resolvedExpression = ktNameReferenceExpression.resolve()
        return if (resolvedExpression is KtProperty) {
            val isUsedAsAssignmentLater = ReferencesSearch.search(resolvedExpression).any { psiReference ->
                val referenceElement = psiReference.element
                val expressionWithUsage = referenceElement.parent
                expressionWithUsage is KtBinaryExpression && expressionWithUsage.right == referenceElement
            }

            when (val initializer = resolvedExpression.initializer) {
                is KtCallExpression -> !isUsedAsAssignmentLater && evaluateKtCallExpression(initializer)
                is KtDotQualifiedExpression ->
                    if (initializer.receiverExpression.isConstructorCall()) {
                        !isUsedAsAssignmentLater && initializer.selectorExpression?.let { evaluateExpression(it) } ?: false
                    } else {
                        !isUsedAsAssignmentLater && evaluateExpression(initializer)
                    }
                null ->
                    !isUsedAsAssignmentLater && resolvedExpression.module?.name?.contains("godot-library") == true
                else ->
                    !initializer.isConstructorCall() &&
                        initializer !is KtNameReferenceExpression &&
                        initializer.resolveTypeSafe()?.isCoreType() == true &&
                        !isUsedAsAssignmentLater
            }
        } else false
    }

    private fun evaluateKtCallExpression(ktCallExpression: KtCallExpression): Boolean {
        return when (val function = (ktCallExpression.calleeExpression as? KtReferenceExpression)?.resolve()) {
            is KtNamedFunction ->
                if (function.hasBlockBody()) {
                    function
                        .bodyBlockExpression
                        ?.statements
                        ?.filterIsInstance<KtReturnExpression>()
                        ?.map { it.returnedExpression }
                        ?.mapNotNull { it }
                        ?.any { evaluateExpression(it) }
                        ?: false
                } else {
                    function.bodyExpression?.let { evaluateExpression(it) } ?: false
                }
            is KtClass -> function.module?.name?.contains("godot-library") == true
            else -> false
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

private fun KotlinType.isCoreType(): Boolean = coreTypes
    .contains(getJetTypeFqName(false).removeSuffix("?"))

private fun KotlinType.isPoolArray(): Boolean = packedArrays
    .contains(getJetTypeFqName(false).removeSuffix("?"))

private fun KtExpression.resolveTypeSafe(): KotlinType? {
    return try {
        // implementation of now deprecated resolveType()
        analyze(BodyResolveMode.PARTIAL).getType(this)
    } catch (e: NullPointerException) {
        null
    }
}

private val coreTypes = GodotTypes.coreTypes.filter { !it.contains("packed", true) }

private val packedArrays = GodotTypes.coreTypes.filter { it.contains("packed", true) }

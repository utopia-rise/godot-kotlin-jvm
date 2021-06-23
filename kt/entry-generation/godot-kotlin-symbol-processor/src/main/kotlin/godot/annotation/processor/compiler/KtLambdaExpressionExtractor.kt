package godot.annotation.processor.compiler

import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtLambdaExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.psiUtil.parents
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

object KtLambdaExpressionExtractor {

    fun extract(bindingContext: BindingContext, expression: KtLambdaExpression): Pair<String, Array<out Any>> {
        expression.parents.forEach { parent ->
            val packagePathOfParent = when (parent) {
                is KtNameReferenceExpression -> parent
                    .referenceExpression()
                    ?.getReferenceTargets(bindingContext)
                    ?.firstOrNull()
                    ?.fqNameSafe
                    ?.asString()
                is KtCallExpression -> parent
                    .referenceExpression()
                    ?.getReferenceTargets(bindingContext)
                    ?.firstOrNull()
                    ?.fqNameSafe
                    ?.asString()
                else -> null
            }

            //we could (and maybe should) check that the user is not using any refs inside the lambda, but IMHO this would be overkill and too much work to catch all edge cases
            //if he uses refs it just does not compile and he has to figure out himself whats wrong. I guess with proper documentation on how this function should be used, that's enough
            if (packagePathOfParent?.matches(Regex("^godot\\.core\\.(EnumArray.*|enumVariantArrayOf)\$")) == true) {
                return "%L" to arrayOf(expression.text)
            }
        }

        throw IllegalStateException("KtLambdaExpressionExtractor could not handle expression: $expression")
    }
}

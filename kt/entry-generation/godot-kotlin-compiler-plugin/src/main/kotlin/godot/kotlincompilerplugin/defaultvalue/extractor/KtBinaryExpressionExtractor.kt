package godot.entrygenerator.generator.property.defaultvalue.extractor

import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.resolve.BindingContext

object KtBinaryExpressionExtractor {

    fun extract(
        bindingContext: BindingContext,
        expression: KtBinaryExpression,
        getDefaultValueTemplateStringWithTemplateArguments: (BindingContext, KtExpression) -> Pair<String, Array<out Any>>?
    ): Pair<String, Array<out Any>> {
        val assignment = expression
            .children
            .map { getDefaultValueTemplateStringWithTemplateArguments(bindingContext, it as KtExpression) }

        if (!assignment.any { it == null }) {
            return assignment.joinToString("·") { it!!.first } to
                assignment.map { it!!.second }.toTypedArray().flatten().toTypedArray()
        }

        throw IllegalStateException("KtBinaryExpressionExtractor could not handle expression: $expression")
    }
}

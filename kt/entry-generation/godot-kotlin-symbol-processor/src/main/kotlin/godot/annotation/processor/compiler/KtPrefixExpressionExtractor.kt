package godot.annotation.processor.compiler

import org.jetbrains.kotlin.psi.KtPrefixExpression

object KtPrefixExpressionExtractor {
    fun extract(expression: KtPrefixExpression): Pair<String, Array<String>> {
        return "%L" to arrayOf(expression.text)
    }
}

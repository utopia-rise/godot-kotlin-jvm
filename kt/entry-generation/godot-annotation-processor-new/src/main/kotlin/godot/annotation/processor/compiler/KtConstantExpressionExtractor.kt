package godot.annotation.processor.compiler

import org.jetbrains.kotlin.psi.KtConstantExpression

object KtConstantExpressionExtractor {
    fun extract(expression: KtConstantExpression): Pair<String, Array<String>> {
        return "%L" to arrayOf(expression.text)
    }
}

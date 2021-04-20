package godot.entrygenerator.generator.property.defaultvalue.extractor

import org.jetbrains.kotlin.psi.KtPrefixExpression

object KtPrefixExpressionExtractor {
    fun extract(expression: KtPrefixExpression): Pair<String, Array<String>> {
        return "%L" to arrayOf(expression.text)
    }
}

package godot.entrygenerator.generator.property.defaultvalue.extractor

import org.jetbrains.kotlin.psi.KtConstantExpression

object KtConstantExpressionExtractor {
    fun extract(expression: KtConstantExpression): Pair<String, Array<String>> {
        return "%L" to arrayOf(expression.text)
    }
}
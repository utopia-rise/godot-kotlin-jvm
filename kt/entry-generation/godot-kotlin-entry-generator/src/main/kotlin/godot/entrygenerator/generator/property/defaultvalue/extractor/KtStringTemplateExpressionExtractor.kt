package godot.entrygenerator.generator.property.defaultvalue.extractor

import org.jetbrains.kotlin.psi.KtStringTemplateExpression

object KtStringTemplateExpressionExtractor {

    fun extract(expression: KtStringTemplateExpression) =
        "%P" to arrayOf(expression.text.removeSurrounding("\""))
}

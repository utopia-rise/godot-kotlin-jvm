package godot.entrygenerator.generator.property.defaultvalue.extractor

import org.jetbrains.kotlin.psi.KtOperationReferenceExpression

object KtOperationReferenceExpressionExtractor {

    fun extract(expression: KtOperationReferenceExpression) = "%L" to arrayOf(expression.text)
}
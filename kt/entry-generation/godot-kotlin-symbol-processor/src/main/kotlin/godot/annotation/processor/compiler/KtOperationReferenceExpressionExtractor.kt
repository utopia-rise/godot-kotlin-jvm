package godot.annotation.processor.compiler

import org.jetbrains.kotlin.psi.KtOperationReferenceExpression

object KtOperationReferenceExpressionExtractor {

    fun extract(expression: KtOperationReferenceExpression) = "%L" to arrayOf(expression.text)
}

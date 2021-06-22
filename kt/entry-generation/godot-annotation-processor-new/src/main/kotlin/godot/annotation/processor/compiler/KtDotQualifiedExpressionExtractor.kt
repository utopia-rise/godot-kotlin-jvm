package godot.annotation.processor.compiler

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.isCompanionObject

object KtDotQualifiedExpressionExtractor {

    fun extract(bindingContext: BindingContext?, expression: KtDotQualifiedExpression): Pair<String, Array<out Any>> {
        val receiver = expression.receiverExpression
        val receiverRef = receiver.getReferenceTargets(bindingContext!!).firstOrNull()

        //Enums
        if (receiverRef != null) {
            val psi = receiverRef.findPsi()
            // TODO: receiver ref might be a deserialized descriptor, fix this once we have core classes
            if (psi is KtClass && psi.isEnum()) {
                val fqName = psi.fqName
                require(fqName != null)
                val pkg = fqName.parent().asString()
                val className = fqName.shortName().asString()
                return "%T.%L" to arrayOf(ClassName(pkg, className), expression.selectorExpression!!.text)
            } else if (receiverRef.isCompanionObject()) { //static ref like Vector3.UP
                val packagePath = requireNotNull(receiverRef.containingDeclaration).fqNameSafe.asString()
                val expr = expression.text.substringAfter(".")
                return "%T.%L" to arrayOf(
                    ClassName(
                        packagePath.substringBeforeLast("."),
                        packagePath.substringAfterLast(".")
                    ),
                    expr
                )
            }
            //multiline strings
        } else if (receiver is KtStringTemplateExpression) {
            val selectorExpression = expression
                .selectorExpression
                ?.referenceExpression()
                ?.getReferenceTargets(bindingContext!!)
                ?.firstOrNull()

            if (selectorExpression?.fqNameSafe?.asString() == "kotlin.text.trimIndent") {
                val packagePath = selectorExpression
                    .fqNameSafe
                    .asString()
                    .replace(".${selectorExpression.name}", "")

                return "%L.%M()" to arrayOf(
                    receiver.text,
                    MemberName(packagePath, selectorExpression.name.asString())
                )
            }
        }

        throw IllegalStateException("KtDotQualifiedExpressionExtractor could not handle expression: $expression")
    }
}

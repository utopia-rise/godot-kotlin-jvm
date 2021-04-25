package godot.entrygenerator.generator.property.defaultvalue

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.assignmentPsi
import godot.entrygenerator.extension.getPropertyHintAnnotation
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtBinaryExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtCallExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtConstantExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtDotQualifiedExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtLambdaExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtNameReferenceExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtOperationReferenceExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtPrefixExpressionExtractor
import godot.entrygenerator.generator.property.defaultvalue.extractor.KtStringTemplateExpressionExtractor
import godot.entrygenerator.model.EXPORT_ANNOTATION
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtConstantExpression
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtLambdaExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtOperationReferenceExpression
import org.jetbrains.kotlin.psi.KtPrefixExpression
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.psi.psiUtil.parents
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

open class DefaultValueExtractor(
    val propertyDescriptor: PropertyDescriptor,
    val bindingContext: BindingContext
) {
    protected val propertyHintAnnotation = propertyDescriptor.getPropertyHintAnnotation()

    init {
        checkHintAnnotationUsage()
    }

    protected fun isVisibleInEditor(): Boolean {
        return propertyDescriptor.annotations.hasAnnotation(FqName(EXPORT_ANNOTATION))
    }

    open fun getDefaultValue(variantClassName: ClassName?): Pair<String, Array<out Any>> {
        if (propertyDescriptor.isLateInit || !isVisibleInEditor()) {
            return "%L" to arrayOf("null")
        }
        val defaultValue = getDefaultValueTemplateStringWithTemplateArguments(propertyDescriptor.assignmentPsi)
            ?: throw IllegalStateException("No default value could be extracted for the property ${propertyDescriptor.name} with the expression:\n${propertyDescriptor.findPsi()?.text}\nThis is a bug (but possibly originated by wrong default value usage on your side). Please report it so we can fix it")

        return if (variantClassName != null) {
            val params = mutableListOf<Any>()
            params.add(variantClassName)
            params.addAll(defaultValue.second)
            "%T(${defaultValue.first})" to params.toTypedArray()
        } else {
            defaultValue
        }
    }

    protected fun getDefaultValueTemplateStringWithTemplateArguments(
        expression: KtExpression
    ): Pair<String, Array<out Any>>? {
        return when {
            //normal constant expression like: val foo = 1
            expression is KtConstantExpression -> KtConstantExpressionExtractor.extract(expression)
            //an example would be a negative number like: val foo = -1
            expression is KtPrefixExpression && expression.baseExpression?.let {
                getDefaultValueTemplateStringWithTemplateArguments(
                    it
                )
            } != null -> KtPrefixExpressionExtractor.extract(expression)
            //string assignments but no string templations like ("${someVarToPutInString}"): val foo = "this is awesome"
            expression is KtStringTemplateExpression -> KtStringTemplateExpressionExtractor.extract(expression)
            expression is KtDotQualifiedExpression -> KtDotQualifiedExpressionExtractor.extract(
                bindingContext,
                expression
            )
            //call expressions like constructor calls or function calls
            expression is KtCallExpression -> KtCallExpressionExtractor.extract(
                bindingContext,
                expression,
                ::getDefaultValueTemplateStringWithTemplateArguments
            )
            //used for flags: val foo = 1 or 3 and 5
            expression is KtBinaryExpression -> KtBinaryExpressionExtractor.extract(
                expression,
                ::getDefaultValueTemplateStringWithTemplateArguments
            )
            //static named reference to a global const for example
            expression is KtNameReferenceExpression -> KtNameReferenceExpressionExtractor.extract(
                bindingContext,
                expression,
                propertyDescriptor
            )
            //operators like the `or` operator
            expression is KtOperationReferenceExpression -> KtOperationReferenceExpressionExtractor.extract(expression)
            //EnumArray -> int to enum mapping function
            expression is KtLambdaExpression && expression.parents.firstOrNull { it is KtNameReferenceExpression || it is KtCallExpression } != null -> KtLambdaExpressionExtractor.extract(
                bindingContext,
                expression
            )
            else -> null
        }
    }

    private fun checkHintAnnotationUsage() {
        if (!propertyDescriptor.annotations.hasAnnotation(FqName(EXPORT_ANNOTATION)) && propertyHintAnnotation != null
        ) {
            throw IllegalStateException("You added the type hint annotation ${propertyHintAnnotation.fqName} to the property ${propertyDescriptor.name}. But either the @RegisterProperty annotation or the @Export annotation is not present")
        }
        if (!propertyDescriptor.isVar) {
            throw IllegalStateException("You try to register the immutable property ${propertyDescriptor.fqNameSafe} with @RegisterProperty. This is not supported! Each property that you register has to be mutable. Use var or lateinit var.")
        }
    }
}

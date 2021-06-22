package godot.annotation.processor.compiler

import com.squareup.kotlinpoet.MemberName
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.isCompanionObject
import org.jetbrains.kotlin.resolve.descriptorUtil.parents

object KtNameReferenceExpressionExtractor {

    fun extract(
        bindingContext: BindingContext,
        expression: KtNameReferenceExpression,
        propertyFqName: String
    ): Pair<String, Array<out Any>> {
        val ref = expression
            .referenceExpression()
            ?.getReferenceTargets(bindingContext)
            ?.firstOrNull()

        if (ref !is PropertyDescriptor) {
            throw IllegalStateException("You tried to register property ${propertyFqName} with a reference (${expression.text}) which is not a property. Default values which are references have to be properties. Functions are not yet supported!")
        }
        if (!ref.visibility.isPublicAPI && ref.visibility.name != "internal") {
            throw IllegalStateException("You tried to register property ${propertyFqName} with a reference (${expression.text}) which is not public. Default values which are references have to be public or at least internal")
        }
        if (!ref.isConst && !ref.parents.first().isCompanionObject()) {
            throw IllegalStateException("You tried to register property $propertyFqName with a reference (${expression.text}) which is not a const or static. Default values which are references have to be compile time constants or have to be static")
        }

        return "%M" to arrayOf(MemberName(ref.fqNameSafe.parent().asString(), ref.name.asString()))
    }
}

package godot.annotation.processor.compiler

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import org.jetbrains.kotlin.backend.common.serialization.findPackage
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtConstructor
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.psiUtil.containingClassOrObject
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.util.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe

object KtCallExpressionExtractor {

    fun extract(
        bindingContext: BindingContext,
        expression: KtCallExpression,
        getDefaultValueTemplateStringWithTemplateArguments: (KtExpression) -> Pair<String, Array<out Any>>?
    ): Pair<String, Array<out Any>> {
        val ref = expression
            .referenceExpression()
            ?.getReferenceTargets(bindingContext)
            ?.firstOrNull()

        if (ref != null) {
            val psi = ref.findPsi()
            val transformedArgs = expression
                .valueArguments
                .mapNotNull { it.getArgumentExpression() }
                .map { getDefaultValueTemplateStringWithTemplateArguments(it) }

            // if an arg is null, then it means that it contained a non static reference
            var hasNullArg = false
            for (arg in transformedArgs) {
                if (arg == null) {
                    hasNullArg = true
                    break
                }
            }

            when {
                //constructor
                psi is KtConstructor<*> && !hasNullArg -> {
                    val fqName = psi.containingClassOrObject!!.fqName
                    require(fqName != null)
                    val pkg = fqName.parent().asString()
                    val className = fqName.shortName().asString()
                    val params = mutableListOf<Any>()
                    params.add(ClassName(pkg, className))
                    transformedArgs.forEach { params.addAll(it!!.second) }
                    return "%T(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                }
                //constructor
                ref is ClassConstructorDescriptor && !hasNullArg -> {
                    val fqName = ref.constructedClass.fqNameSafe
                    val pkg = fqName.parent().asString()
                    val className = fqName.shortName().asString()
                    val params = mutableListOf<Any>()
                    params.add(ClassName(pkg, className))
                    transformedArgs.forEach { params.addAll(it!!.second) }
                    return "%T(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                }
                //godot arrays and kotlin collections
                //Note: kotlin collections only as constructor arguments or function params. TypeToVariantAsClassNameMapper already enshures that they are not registered as property types
                ref is FunctionDescriptor && (
                    ref.fqNameSafe.asString().matches(Regex("^godot\\.core\\..*(ArrayOf|Array)\$"))
                        || ref.fqNameSafe.asString().matches(Regex("^godot\\.core\\..*(dictionaryOf|Dictionary)\$"))
                        || ref.findPackage().fqName.asString() == "kotlin.collections"
                    ) -> {
                    val fqName = ref.fqNameSafe
                    val pkg = fqName.parent().asString()
                    val functionName = fqName.shortName().asString()
                    val params = mutableListOf<Any>()
                    params.add(MemberName(pkg, functionName))
                    transformedArgs.forEach { params.addAll(it!!.second) }
                    return "%M(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                }
                //set's for enum flag registration
                expression.getType(bindingContext)?.let(KotlinBuiltIns::isSetOrNullableSet) == true -> {
                    //setOf -> ref is null in this case
                    val params = mutableListOf<Any>()
                    params.add(expression.children.first().text)
                    transformedArgs.forEach { params.addAll(it!!.second) }
                    return "%L(${transformedArgs.joinToString { it!!.first }})" to params.toTypedArray()
                }
            }
        }

        throw IllegalStateException("KtCallExpressionExtractor could not handle expression: ${expression.text}")
    }
}

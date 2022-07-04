package godot.intellij.plugin.annotator.property

import org.jetbrains.kotlin.backend.common.serialization.findPackage
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.impl.ClassConstructorDescriptorImpl
import org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl
import org.jetbrains.kotlin.idea.caches.resolve.analyze
import org.jetbrains.kotlin.idea.intentions.loopToCallChain.isConstant
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.psi.KtBinaryExpression
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtClass
import org.jetbrains.kotlin.psi.KtConstructor
import org.jetbrains.kotlin.psi.KtDotQualifiedExpression
import org.jetbrains.kotlin.psi.KtExpression
import org.jetbrains.kotlin.psi.KtOperationReferenceExpression
import org.jetbrains.kotlin.psi.KtStringTemplateExpression
import org.jetbrains.kotlin.psi.psiUtil.referenceExpression
import org.jetbrains.kotlin.resolve.bindingContextUtil.getReferenceTargets
import org.jetbrains.kotlin.resolve.calls.util.getType
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.isCompanionObject
import org.jetbrains.kotlin.resolve.lazy.BodyResolveMode

class KtExpressionConstantChecker {
    fun isConstantEnoughForRegistration(ktExpression: KtExpression): Boolean {
        return if (!ktExpression.isConstant()) {
            return when (ktExpression) {
                is KtCallExpression -> checkKtCallExpresion(ktExpression)
                is KtDotQualifiedExpression -> checkKtDotQualifiedExpression(ktExpression)
                is KtStringTemplateExpression -> !ktExpression.hasInterpolation()
                is KtBinaryExpression -> checkKtBinaryExpression(ktExpression)
                else -> false
            }
        } else true
    }

    private fun checkKtCallExpresion(ktExpression: KtCallExpression): Boolean {
        val bindingContext = ktExpression.analyze(BodyResolveMode.FULL)
        return ktExpression
            .referenceExpression()
            ?.getReferenceTargets(bindingContext)
            ?.firstOrNull()
            ?.let { declarationDescriptor ->
                val psi = declarationDescriptor.findPsi()
                val transformedArgs = ktExpression
                    .valueArguments
                    .mapNotNull { valueArgument -> valueArgument.getArgumentExpression() }
                    .map { isConstantEnoughForRegistration(it) }

                // if an arg is false, then it means that it contained a non static reference
                if (transformedArgs.any { !it }) {
                    return false
                }

                when {
                    // constructor
                    psi is KtConstructor<*> || declarationDescriptor is ClassConstructorDescriptorImpl -> true
                    // godot arrays and kotlin collections
                    // Note: kotlin collections only as constructor arguments or function params. checkRegisteredType already ensures that they are not registered as property types
                    declarationDescriptor is SimpleFunctionDescriptorImpl && (
                        declarationDescriptor.fqNameSafe.asString().matches(Regex("^godot\\.core\\..*(ArrayOf|Array)\$")) ||
                            declarationDescriptor.fqNameSafe.asString().matches(Regex("^godot\\.core\\..*(dictionaryOf|Dictionary)\$")) ||
                            declarationDescriptor.findPackage().fqName.asString() == "kotlin.collections"
                        ) -> true
                    // set's for enum flag registration
                    ktExpression.getType(bindingContext)?.let(KotlinBuiltIns::isSetOrNullableSet) == true -> true
                    else -> false
                }
            } ?: false
    }

    private fun checkKtDotQualifiedExpression(ktExpression: KtDotQualifiedExpression): Boolean {
        val bindingContext = ktExpression.analyze(BodyResolveMode.FULL)
        val receiver = ktExpression.receiverExpression
        val receiverRef = receiver.getReferenceTargets(bindingContext).firstOrNull()

        // Enums
        return if (receiverRef != null) {
            val psi = receiverRef.findPsi()
            if (psi is KtClass && psi.isEnum()) {
                true
            } else receiverRef.isCompanionObject()
        } else if (receiver is KtStringTemplateExpression) {
            val selectorExpression = ktExpression
                .selectorExpression
                ?.referenceExpression()
                ?.getReferenceTargets(bindingContext)
                ?.firstOrNull()

            selectorExpression?.fqNameSafe?.asString() == "kotlin.text.trimIndent"
        } else false
    }

    private fun checkKtBinaryExpression(ktExpression: KtBinaryExpression): Boolean {
        val assignment = ktExpression
            .children
            .filterNot { it is KtOperationReferenceExpression } // stuff like the `to` keyword in `key to value`
            .map { isConstantEnoughForRegistration(it as KtExpression) }

        return !assignment.any { !it }
    }
}

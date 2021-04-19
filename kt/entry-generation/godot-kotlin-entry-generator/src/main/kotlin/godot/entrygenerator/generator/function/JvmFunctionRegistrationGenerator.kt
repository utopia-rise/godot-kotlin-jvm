package godot.entrygenerator.generator.function

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.extension.toParameterKtVariantType
import godot.entrygenerator.extension.toReturnKtVariantType
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName

class JvmFunctionRegistrationGenerator : FunctionRegistrationGenerator() {

    override fun getStringTemplate(functionDescriptor: FunctionDescriptor): String {
        return getFunctionTemplateString(functionDescriptor)
    }

    override fun getTemplateArgs(functionDescriptor: FunctionDescriptor, className: ClassName): List<Any> {
        val ktFunctionArgumentClassName = ClassName("godot.runtime", "KtFunctionArgument")
        val returnType = functionDescriptor.returnType

        requireNotNull(returnType) {
            "ReturnType cannot be null. Usually this means there was an error in the kotlin compilation. Try a clean build and submit a bug if this does not help"
        }
        return buildList {
            add(getFunctionReference(functionDescriptor, className))
            add(functionDescriptor.returnType?.toParameterKtVariantType() ?: ClassName("godot.core.VariantType", "NIL"))

            if (functionDescriptor.valueParameters.isNotEmpty()) {
                functionDescriptor.valueParameters.forEach { valueParameter ->
                    add(valueParameter.type.toParameterKtVariantType())
                    add(valueParameter.type.isMarkedNullable)
                }
                functionDescriptor.valueParameters.forEach { valueParameter ->
                    add(ktFunctionArgumentClassName)
                    add(valueParameter.type.toReturnKtVariantType())
                    add(valueParameter.type.getJetTypeFqName(false))
                    add(valueParameter.name.asString())
                }
            }

            add(ktFunctionArgumentClassName)
            add(returnType.toReturnKtVariantType())
            add(returnType.getJetTypeFqName(false))
            add(getRpcModeEnum(functionDescriptor))
        }
    }

    private fun getFunctionTemplateString(
        functionDescriptor: FunctionDescriptor
    ): String {
        return buildString {
            append("function(%L,·%T") //functionReference, returnTypeConverterReference

            if (functionDescriptor.valueParameters.isNotEmpty()) {
                functionDescriptor.valueParameters.forEach { param ->
                    append(",·%T·to·%L") //Variant type
                }
                functionDescriptor.valueParameters.forEach { _ ->
                    append(",·%T(%T,·%S,·%S)") //argument KtFunctionArgument
                }
            }

            append(",·%T(%T,·%S),·%T.id.toInt())") //return KtFunctionArgument
        }
    }

    private fun getFunctionReference(functionDescriptor: FunctionDescriptor, className: ClassName): CodeBlock {
        return className
            .member(functionDescriptor.name.asString())
            .reference()
    }
}

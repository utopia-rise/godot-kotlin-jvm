package godot.entrygenerator.generator.function

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.toParameterKtVariantType
import godot.entrygenerator.extension.toReturnKtVariantType
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION
import godot.entrygenerator.model.REGISTER_FUNCTION_ANNOTATION_RPC_MODE_ARGUMENT
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.ClassId
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.name.Name

object FunctionRegistrationGenerator {

    fun registerFunctions(
        functions: List<FunctionDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        functions.forEach { functionDescriptor ->
            registerClassControlFlow
                .addStatement(
                    getStringTemplate(functionDescriptor),
                    *getTemplateArgs(functionDescriptor, className).toTypedArray()
                )
        }
    }

    private fun getRpcModeEnum(functionDescriptor: FunctionDescriptor): ClassName {
        val compilerRpcModeEnumRepresentation = getCompilerRpcModeEnumRepresentation(functionDescriptor)
        val packagePath = compilerRpcModeEnumRepresentation.first.asString().replace("/", ".")
        val name = compilerRpcModeEnumRepresentation.second
        return ClassName(packagePath, name.asString())
    }

    private fun getCompilerRpcModeEnumRepresentation(functionDescriptor: FunctionDescriptor): Pair<ClassId, Name> {
        return functionDescriptor
            .annotations
            .getAnnotationValue(
                REGISTER_FUNCTION_ANNOTATION,
                REGISTER_FUNCTION_ANNOTATION_RPC_MODE_ARGUMENT,
                Pair(ClassId(FqName("godot.MultiplayerAPI"), Name.identifier("RPCMode")), Name.identifier("DISABLED"))
            )
    }

    private fun getStringTemplate(functionDescriptor: FunctionDescriptor): String {
        return getFunctionTemplateString(functionDescriptor)
    }

    private fun getTemplateArgs(functionDescriptor: FunctionDescriptor, className: ClassName): List<Any> {
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
                functionDescriptor.valueParameters.forEach { _ ->
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

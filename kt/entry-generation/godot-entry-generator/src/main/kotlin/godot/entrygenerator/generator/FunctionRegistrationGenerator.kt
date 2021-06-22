package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.ext.getAnnotationUnsafe
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.model.RegisterFunctionAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RpcMode

object FunctionRegistrationGenerator {
    fun generate(registeredClass: RegisteredClass, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        registeredClass.functions.forEach { registeredFunction ->
            registerClassControlFlow
                .addStatement(
                    getFunctionTemplateString(registeredFunction),
                    *getTemplateArgs(registeredFunction, className).toTypedArray()
                )
        }
    }

    private fun getFunctionTemplateString(registeredFunction: RegisteredFunction) = buildString {
        append("function(%L,·%T") //functionReference, returnTypeConverterReference

        if (registeredFunction.parameters.isNotEmpty()) {
            registeredFunction.parameters.forEach { _ ->
                append(",·%T·to·%L") //Variant type
            }
            registeredFunction.parameters.forEach { _ ->
                append(",·%T(%T,·%S,·%S)") //argument KtFunctionArgument
            }
        }

        append(",·%T(%T,·%S),·%T.id.toInt())") //return KtFunctionArgument
    }

    private fun getTemplateArgs(registeredFunction: RegisteredFunction, className: ClassName): List<Any> {
        val ktFunctionArgumentClassName = ClassName("godot.runtime", "KtFunctionArgument")

        return buildList {
            add(getFunctionReference(registeredFunction, className))
            add(registeredFunction.returnType?.toKtVariantType() ?: ClassName("godot.core.VariantType", "NIL"))

            if (registeredFunction.parameters.isNotEmpty()) {
                registeredFunction.parameters.forEach { parameter ->
                    add(parameter.type.toKtVariantType())
                    add(parameter.type.isNullable)
                }
                registeredFunction.parameters.forEach { valueParameter ->
                    add(ktFunctionArgumentClassName)
                    add(valueParameter.type.toKtVariantType())
                    add(valueParameter.type.fqName)
                    add(valueParameter.name)
                }
            }

            add(ktFunctionArgumentClassName)
            add(registeredFunction.returnType.toKtVariantType())
            add(registeredFunction.returnType?.fqName ?: "kotlin.Unit")
            add(getRpcModeEnum(registeredFunction))
        }
    }

    private fun getFunctionReference(registeredFunction: RegisteredFunction, className: ClassName): CodeBlock {
        return className
            .member(registeredFunction.name)
            .reference()
    }

    private fun getRpcModeEnum(registeredFunction: RegisteredFunction): ClassName {
        return when (registeredFunction.annotations.getAnnotationUnsafe<RegisterFunctionAnnotation>().rpcMode) {
            RpcMode.DISABLED -> ClassName("godot.MultiplayerAPI.RPCMode", "DISABLED")
            RpcMode.REMOTE -> ClassName("godot.MultiplayerAPI.RPCMode", "REMOTE")
            RpcMode.MASTER -> ClassName("godot.MultiplayerAPI.RPCMode", "MASTER")
            RpcMode.PUPPET -> ClassName("godot.MultiplayerAPI.RPCMode", "PUPPET")
            RpcMode.SLAVE -> ClassName("godot.MultiplayerAPI.RPCMode", "SLAVE")
            RpcMode.REMOTE_SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "REMOTESYNC")
            RpcMode.SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "SYNC")
            RpcMode.MASTER_SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "MASTERSYNC")
            RpcMode.PUPPET_SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "PUPPETSYNC")
        }
    }
}

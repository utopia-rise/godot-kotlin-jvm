package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RpcAnnotation
import godot.entrygenerator.model.RpcMode
import godot.entrygenerator.model.Sync
import godot.entrygenerator.model.TransferMode

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

        append(",·%T(%T,·%S),·%T(%T.id.toInt(),·%L,·%T.id.toInt(),·%L))") //return KtFunctionArgument
    }

    private fun getTemplateArgs(registeredFunction: RegisteredFunction, className: ClassName): List<Any> {
        val ktFunctionArgumentClassName = ClassName("godot.registration", "KtFunctionArgument")

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
            add(ClassName("godot.core", "KtRpcConfig"))
            add(getRpcModeEnum(registeredFunction))
            add(getRpcCallLocal(registeredFunction))
            add(getRpcTransferModeEnum(registeredFunction))
            add(getRpcChannel(registeredFunction))
        }
    }

    private fun getFunctionReference(registeredFunction: RegisteredFunction, className: ClassName): CodeBlock {
        return className
            .member(registeredFunction.name)
            .reference()
    }

    private fun getRpcModeEnum(registeredFunction: RegisteredFunction): ClassName {
        return when (registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.rpcMode) {
            null,
            RpcMode.DISABLED -> ClassName("godot.MultiplayerAPI.RPCMode", "RPC_MODE_DISABLED")
            RpcMode.ANY -> ClassName("godot.MultiplayerAPI.RPCMode", "RPC_MODE_ANY_PEER")
            RpcMode.AUTHORITY -> ClassName("godot.MultiplayerAPI.RPCMode", "RPC_MODE_AUTHORITY")
        }
    }

    private fun getRpcTransferModeEnum(registeredFunction: RegisteredFunction): ClassName {
        return when (registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.transferMode) {
            null,
            TransferMode.RELIABLE -> ClassName("godot.MultiplayerPeer.TransferMode", "TRANSFER_MODE_RELIABLE")
            TransferMode.UNRELIABLE -> ClassName("godot.MultiplayerPeer.TransferMode", "TRANSFER_MODE_UNRELIABLE")
            TransferMode.UNRELIABLE_ORDERED -> ClassName("godot.MultiplayerPeer.TransferMode", "TRANSFER_MODE_UNRELIABLE_ORDERED")
        }
    }

    private fun getRpcCallLocal(registeredFunction: RegisteredFunction): Boolean {
        return when(registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.sync) {
            Sync.SYNC -> true
            Sync.NO_SYNC -> false
            null -> false
        }
    }

    private fun getRpcChannel(registeredFunction: RegisteredFunction): Int {
        return registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.transferChannel ?: 0
    }
}

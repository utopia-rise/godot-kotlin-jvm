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
import godot.tools.common.constants.GodotFunctions
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.KOTLIN_LIST_OF
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.godotPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotRegistrationPackage

object FunctionRegistrationGenerator {
    fun generate(registeredClass: RegisteredClass, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        val notificationFunctions = mapOf(
            *registeredClass.functions.filter { registeredFunction ->
                registeredFunction.isNotificationFunction() && registeredFunction.isDeclaredInThisClass
            }.map { registeredClass to it }.toTypedArray(),
            *registeredClass.supertypes.filterIsInstance<RegisteredClass>().flatMap { registeredSuperClass -> registeredSuperClass.functions.filter { registeredSuperClassFunction -> registeredSuperClassFunction.isNotificationFunction() }.map { registeredSuperClass to it } }.toTypedArray()
        )
        val otherFunctions = registeredClass.functions.filter { it.name != GodotFunctions.notification }

        val notificationClasses = notificationFunctions.keys.toList()

        for (i in notificationClasses.indices) {
            val notificationClass = notificationClasses[i]
            registerClassControlFlow
                .addStatement(
                    "val notificationFunctionClass$i = %T()",
                    ClassName(notificationClass.containingPackage, notificationClass.name)
                )
        }

        registerClassControlFlow
            .addStatement(
                "notificationFunctions(%M(${(0..<notificationFunctions.size).joinToString(",·") { _ -> "%L.%L().%L" }}))",
                KOTLIN_LIST_OF,
                *notificationClasses.indices.flatMap {
                    listOf(
                        "notificationFunctionClass${it}",
                        GodotFunctions.notification,
                        "block"
                    )
                }.toTypedArray()
            )

        for (i in notificationClasses.indices) {
            val notificationClass = notificationClasses[i]
            if (notificationClass.inheritsRefCounted) {
                continue
            }
            registerClassControlFlow
                .addStatement("notificationFunctionClass$i.free()")
        }

        otherFunctions.forEach { registeredFunction ->
            registerClassControlFlow
                .addStatement(
                    getFunctionTemplateString(registeredFunction),
                    *getTemplateArgs(registeredFunction, className).toTypedArray()
                )
        }
    }

    private fun RegisteredFunction.isNotificationFunction() =
        this.isOverridee && this.name == GodotFunctions.notification

    private fun getFunctionTemplateString(registeredFunction: RegisteredFunction) = buildString {
        append("function(%L,·%T") //functionReference, returnTypeConverterReference

        if (registeredFunction.parameters.isNotEmpty()) {
            registeredFunction.parameters.forEach { _ ->
                append(",·%T") //Variant type
            }
            registeredFunction.parameters.forEach { _ ->
                append(",·%T(%T,·%S,·%S)") //argument KtFunctionArgument
            }
        }

        append(",·%T(%T,·%S),·%T(%T.id.toInt(),·%L,·%T.id.toInt(),·%L))") //return KtFunctionArgument
    }

    private fun getTemplateArgs(registeredFunction: RegisteredFunction, className: ClassName): List<Any> {
        val ktFunctionArgumentClassName = ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.ktFunctionArgument)

        return buildList {
            add(getFunctionReference(registeredFunction, className))
            add(registeredFunction.returnType?.toKtVariantType() ?: VARIANT_PARSER_NIL)

            if (registeredFunction.parameters.isNotEmpty()) {
                registeredFunction.parameters.forEach { parameter ->
                    add(parameter.type.toKtVariantType())
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
            add(registeredFunction.returnType?.fqName ?: requireNotNull(Unit::class.qualifiedName))
            add(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.ktRpcConfig))
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
            RpcMode.DISABLED -> ClassName("$godotPackage.${GodotTypes.rpcMode}", "RPC_MODE_DISABLED")
            RpcMode.ANY -> ClassName("$godotPackage.${GodotTypes.rpcMode}", "RPC_MODE_ANY_PEER")
            RpcMode.AUTHORITY -> ClassName("$godotPackage.${GodotTypes.rpcMode}", "RPC_MODE_AUTHORITY")
        }
    }

    private fun getRpcTransferModeEnum(registeredFunction: RegisteredFunction): ClassName {
        return when (registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.transferMode) {
            null,
            TransferMode.RELIABLE -> ClassName("$godotPackage.${GodotTypes.transferMode}", "TRANSFER_MODE_RELIABLE")
            TransferMode.UNRELIABLE -> ClassName("$godotPackage.${GodotTypes.transferMode}", "TRANSFER_MODE_UNRELIABLE")
            TransferMode.UNRELIABLE_ORDERED -> ClassName("$godotPackage.${GodotTypes.transferMode}", "TRANSFER_MODE_UNRELIABLE_ORDERED")
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

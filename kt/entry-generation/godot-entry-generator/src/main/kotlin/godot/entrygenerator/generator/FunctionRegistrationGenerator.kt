package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.isEnum
import godot.entrygenerator.ext.toKtVariantMemberName
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RpcAnnotation
import godot.entrygenerator.model.RpcMode
import godot.entrygenerator.model.Sync
import godot.entrygenerator.model.TransferMode
import godot.entrygenerator.model.TypeKind
import godot.tools.common.names.API
import godot.tools.common.names.CoreType
import godot.tools.common.names.Function
import godot.tools.common.names.Kotlin
import godot.tools.common.names.Registration
import godot.tools.common.names.VariantConverter

object FunctionRegistrationGenerator {
    fun generate(registeredClass: RegisteredClass, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        val notificationFunctions = mapOf(
            *registeredClass.functions.filter { registeredFunction ->
                registeredFunction.isNotificationFunction() && registeredFunction.isDeclaredInThisClass
            }.map { registeredClass to it }.toTypedArray(),
            *registeredClass.supertypes.filterIsInstance<RegisteredClass>().flatMap { registeredSuperClass ->
                registeredSuperClass.functions.filter { registeredSuperClassFunction -> registeredSuperClassFunction.isNotificationFunction() }
                    .map { registeredSuperClass to it }
            }.toTypedArray()
        )
        val otherFunctions = registeredClass.functions.filter { it.name != Function.notification.simpleName }

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
                Kotlin.listOf,
                *notificationClasses.indices.flatMap {
                    listOf(
                        "notificationFunctionClass$it",
                        Function.notification.simpleName,
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
        this.isOverridee && this.name == Function.notification.simpleName

    private fun getFunctionTemplateString(registeredFunction: RegisteredFunction) = buildString {
        val variantType = if (registeredFunction.returnType?.isEnum() == true) {
            "%M(%T.entries.toTypedArray())"
        } else {
            "%M"
        }

        append("function(%L,·$variantType")

        if (registeredFunction.parameters.isNotEmpty()) {
            registeredFunction.parameters.forEach { _ ->
                append(",·%M")
            }
            registeredFunction.parameters.forEach { _ ->
                append(",·%T(%M,·%S,·%S)")
            }
        }

        append(",·%T($variantType,·%S),·%T(%M.value.toInt(),·%L,·%M.value.toInt(),·%L))")
    }

    private fun getTemplateArgs(registeredFunction: RegisteredFunction, className: ClassName): List<Any> {
        val ktFunctionArgumentClassName = Registration.ktFunctionArgument

        val returnType = if (registeredFunction.returnType?.kind == TypeKind.ENUM_CLASS) {
            "Int"
        } else {
            registeredFunction.returnType?.fqName ?: requireNotNull(Unit::class.qualifiedName)
        }

        val typeClassName = registeredFunction.returnType?.let { returnTypeInfo ->
            ClassName(
                returnTypeInfo.fqName.substringBeforeLast("."),
                returnTypeInfo.fqName.substringAfterLast("."),
            )
        }

        return buildList {
            add(getFunctionReference(registeredFunction, className))

            if (registeredFunction.returnType?.isEnum() == true) {
                add(registeredFunction.returnType.toKtVariantMemberName())
                typeClassName?.let { add(it) }
            } else {
                add(registeredFunction.returnType?.toKtVariantMemberName() ?: VariantConverter.nil)
            }

            if (registeredFunction.parameters.isNotEmpty()) {
                registeredFunction.parameters.forEach { parameter ->
                    add(parameter.type.toKtVariantMemberName())
                }
                registeredFunction.parameters.forEach { valueParameter ->
                    add(ktFunctionArgumentClassName)
                    add(valueParameter.type.toKtVariantMemberName())
                    add(valueParameter.type.fqName)
                    add(valueParameter.name)
                }
            }

            add(ktFunctionArgumentClassName)

            if (registeredFunction.returnType?.isEnum() == true) {
                add(registeredFunction.returnType.toKtVariantMemberName())
                typeClassName?.let { add(it) }
            } else {
                add(registeredFunction.returnType.toKtVariantMemberName())
            }

            add(returnType)
            add(CoreType.ktRpcConfig)
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

    private fun getRpcModeEnum(registeredFunction: RegisteredFunction): MemberName {
        return when (registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.rpcMode) {
            null,
            RpcMode.DISABLED -> API.rpcMode("DISABLED")

            RpcMode.ANY -> API.rpcMode("ANY_PEER")
            RpcMode.AUTHORITY -> API.rpcMode("AUTHORITY")
        }
    }

    private fun getRpcTransferModeEnum(registeredFunction: RegisteredFunction): MemberName {
        return when (registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.transferMode) {
            null,
            TransferMode.RELIABLE -> API.transferMode("RELIABLE")

            TransferMode.UNRELIABLE -> API.transferMode("UNRELIABLE")
            TransferMode.UNRELIABLE_ORDERED -> API.transferMode("UNRELIABLE_ORDERED")
        }
    }

    private fun getRpcCallLocal(registeredFunction: RegisteredFunction): Boolean {
        return when (registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.sync) {
            Sync.SYNC -> true
            Sync.NO_SYNC -> false
            null -> false
        }
    }

    private fun getRpcChannel(registeredFunction: RegisteredFunction): Int {
        return registeredFunction.annotations.getAnnotation<RpcAnnotation>()?.transferChannel ?: 0
    }
}

package godot.registrar.generator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.annotation.RpcMode
import godot.annotation.Sync
import godot.api.MultiplayerPeer
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.effectiveFunctions
import godot.registrar.generator.ext.flattenedHierarchy
import godot.registrar.generator.ext.inheritsRefCounted
import godot.registrar.generator.ext.toGodotClassName
import godot.registrar.generator.ext.toKtVariantMemberName
import godot.registrar.generator.ext.asEnumName
import godot.registration.model.RegisteredFunction
import godot.registration.model.ext.isEnum
import godot.registration.model.types.ScriptClass
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.kotlinCollectionsPackage
import godot.tools.common.constants.notificationFunction

fun FunSpec.Builder.addNotificationRegistrations(
    registeredClass: ScriptClass,
    context: GeneratorContext,
) {
    val notificationFunctions = mapOf(
        *registeredClass.functions
            .filter { registeredFunction -> registeredFunction.isNotificationFunction() }
            .map { registeredClass to it }
            .toTypedArray(),
        *registeredClass.flattenedHierarchy(context)
            .filterIsInstance<ScriptClass>()
            .flatMap { registeredSuperClass ->
                registeredSuperClass.functions
                    .filter { registeredSuperClassFunction -> registeredSuperClassFunction.isNotificationFunction() }
                    .map { registeredSuperClass to it }
            }
            .toTypedArray()
    )

    val notificationClasses = notificationFunctions.keys.toList()

    for (i in notificationClasses.indices) {
        val notificationClass = notificationClasses[i]
        addStatement(
            "val notificationFunctionClass$i = %T()",
            ClassName(notificationClass.containingPackage, notificationClass.name)
        )
    }

    addStatement(
        "notificationFunctions(%M(${(0 until notificationFunctions.size).joinToString(", ") { "%L.%L().%L" }}))",
        MemberName(kotlinCollectionsPackage, "listOf"),
        *notificationClasses.indices.flatMap {
            listOf(
                "notificationFunctionClass$it",
                notificationFunction,
                "block"
            )
        }.toTypedArray()
    )

    for (i in notificationClasses.indices) {
        val notificationClass = notificationClasses[i]
        if (!notificationClass.inheritsRefCounted()) {
            addStatement("notificationFunctionClass$i.free()")
        }
    }
}

fun FunSpec.Builder.addFunctionRegistrations(
    registeredClass: ScriptClass,
    context: GeneratorContext,
    className: ClassName,
) {
    registeredClass.effectiveFunctions(context)
        .filter { it.name != notificationFunction }
        .forEach { registeredFunction ->
            addStatement(
                getFunctionTemplateString(registeredFunction),
                *getTemplateArgs(registeredFunction, context, className).toTypedArray()
            )
        }
}

private fun RegisteredFunction.isNotificationFunction() =
    name == notificationFunction &&
        parameters.isEmpty() &&
        returnType.fqName == "$godotCorePackage.GodotNotification"

private fun getFunctionTemplateString(registeredFunction: RegisteredFunction) = buildString {
    val variantType = if (registeredFunction.returnType.isEnum()) {
        "%M(%T.entries.toTypedArray())"
    } else {
        "%M"
    }

    append("function(%L, rpc(%M, %L, %M, %L), returns($variantType, %S)")

    if (registeredFunction.parameters.isNotEmpty()) {
        registeredFunction.parameters.forEach { _ ->
            append(", argument(%M, %S, %S)")
        }
    }

    append(")")
}

private fun getTemplateArgs(
    registeredFunction: RegisteredFunction,
    context: GeneratorContext,
    className: ClassName,
): List<Any> {
    val returnType = registeredFunction.returnType.toGodotClassName(context)
    val typeClassName = if (registeredFunction.returnType.isEnum()) {
        ClassName(
            registeredFunction.returnType.fqName.substringBeforeLast("."),
            registeredFunction.returnType.fqName.substringAfterLast("."),
        )
    } else {
        null
    }

    return buildList {
        add(getFunctionReference(registeredFunction, className))
        add(getRpcModeEnum(registeredFunction))
        add(getRpcCallLocal(registeredFunction))
        add(getRpcTransferModeEnum(registeredFunction))
        add(getRpcChannel(registeredFunction))

        if (registeredFunction.returnType.isEnum()) {
            add(registeredFunction.returnType.toKtVariantMemberName())
            typeClassName?.let { add(it) }
        } else {
            add(registeredFunction.returnType.toKtVariantMemberName())
        }

        add(returnType)

        registeredFunction.parameters.forEach { valueParameter ->
            add(valueParameter.type.toKtVariantMemberName())
            add(valueParameter.type.toGodotClassName(context))
            add(valueParameter.name)
        }
    }
}

private fun getFunctionReference(registeredFunction: RegisteredFunction, className: ClassName): CodeBlock {
    return className.member(registeredFunction.name).reference()
}

private fun getRpcModeEnum(registeredFunction: RegisteredFunction) =
    registeredFunction.rpcConfig?.rpcMode?.asEnumName() ?: RpcMode.DISABLED.asEnumName()

private fun getRpcTransferModeEnum(registeredFunction: RegisteredFunction) =
    registeredFunction.rpcConfig?.transferMode?.asEnumName() ?: MultiplayerPeer.TransferMode.RELIABLE.asEnumName()

private fun getRpcCallLocal(registeredFunction: RegisteredFunction): Boolean =
    when (registeredFunction.rpcConfig?.sync) {
        Sync.SYNC -> true
        Sync.NO_SYNC -> false
        null -> false
    }

private fun getRpcChannel(registeredFunction: RegisteredFunction): Int =
    registeredFunction.rpcConfig?.transferChannel ?: 0

package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.asClassName
import godot.annotation.RpcMode
import godot.annotation.Sync
import godot.api.MultiplayerPeer
import godot.entrygenerator.ext.VariantConverterNames
import godot.entrygenerator.ext.getAnnotation
import godot.entrygenerator.ext.isEnum
import godot.entrygenerator.ext.toGodotClassName
import godot.entrygenerator.ext.toKtVariantMemberName
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredFunction
import godot.entrygenerator.model.RpcAnnotation
import godot.entrygenerator.model.TypeKind
import godot.entrygenerator.settings.Settings
import godot.entrygenerator.utils.asEnumName
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotRegistrationPackage
import godot.tools.common.constants.kotlinCollectionsPackage
import godot.tools.common.constants.notificationFunction

object FunctionRegistrationGenerator {
    fun generateNotifications(
        registeredClass: RegisteredClass,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        val notificationFunctions = mapOf(
            *registeredClass.functions.filter { registeredFunction ->
                registeredFunction.isNotificationFunction() && registeredFunction.isDeclaredInThisClass
            }.map { registeredClass to it }.toTypedArray(),
            *registeredClass.supertypes.filterIsInstance<RegisteredClass>().flatMap { registeredSuperClass ->
                registeredSuperClass.functions.filter { registeredSuperClassFunction -> registeredSuperClassFunction.isNotificationFunction() }
                    .map { registeredSuperClass to it }
            }.toTypedArray()
        )
        val otherFunctions = registeredClass.functions.filter { it.name != notificationFunction }

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
            if (notificationClass.inheritsRefCounted) {
                continue
            }
            registerClassControlFlow
                .addStatement("notificationFunctionClass$i.free()")
        }
    }

    fun generateFunctions(
        registeredClass: RegisteredClass,
        settings: Settings,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        registeredClassesByFqName: Map<String, RegisteredClass>,
    ) {
        val otherFunctions = registeredClass.functions.filter { it.name != notificationFunction }

        otherFunctions.forEach { registeredFunction ->
            registerClassControlFlow
                .addStatement(
                    getFunctionTemplateString(registeredFunction),
                    *getTemplateArgs(registeredFunction, settings, className, registeredClassesByFqName).toTypedArray()
                )
        }
    }

    private fun RegisteredFunction.isNotificationFunction() =
        this.name == notificationFunction &&
            this.parameters.isEmpty() &&
            this.returnType?.fqName == "$godotCorePackage.GodotNotification"

    private fun getFunctionTemplateString(registeredFunction: RegisteredFunction) = buildString {
        val variantType = if (registeredFunction.returnType?.isEnum() == true) {
            "%M(%T.entries.toTypedArray())"
        } else {
            "%M"
        }

        append("function(%L,·rpc(%M,·%L,·%M,·%L),·returns($variantType,·%S)")

        if (registeredFunction.parameters.isNotEmpty()) {
            registeredFunction.parameters.forEach { _ ->
                append(",·argument(%M,·%S,·%S)")
            }
        }

        append(")")
    }

    private fun getTemplateArgs(
        registeredFunction: RegisteredFunction,
        settings: Settings,
        className: ClassName,
        registeredClassesByFqName: Map<String, RegisteredClass>,
    ): List<Any> {
        val returnType = registeredFunction.returnType.toGodotClassName(settings, registeredClassesByFqName)

        val typeClassName = registeredFunction.returnType?.let { returnTypeInfo ->
            ClassName(
                returnTypeInfo.fqName.substringBeforeLast("."),
                returnTypeInfo.fqName.substringAfterLast("."),
            )
        }

        return buildList {
            add(getFunctionReference(registeredFunction, className))
            add(getRpcModeEnum(registeredFunction))
            add(getRpcCallLocal(registeredFunction))
            add(getRpcTransferModeEnum(registeredFunction))
            add(getRpcChannel(registeredFunction))

            if (registeredFunction.returnType?.isEnum() == true) {
                add(registeredFunction.returnType.toKtVariantMemberName())
                typeClassName?.let { add(it) }
            } else {
                add(registeredFunction.returnType.toKtVariantMemberName())
            }

            add(returnType)

            if (registeredFunction.parameters.isNotEmpty()) {
                registeredFunction.parameters.forEach { valueParameter ->
                    add(valueParameter.type.toKtVariantMemberName())
                    add(valueParameter.type.toGodotClassName(settings, registeredClassesByFqName))
                    add(valueParameter.name)
                }
            }
        }
    }

    private fun getFunctionReference(registeredFunction: RegisteredFunction, className: ClassName): CodeBlock {
        return className
            .member(registeredFunction.name)
            .reference()
    }

    private fun getRpcModeEnum(registeredFunction: RegisteredFunction) = registeredFunction
        .annotations
        .getAnnotation<RpcAnnotation>()
        ?.rpcMode?.asEnumName()
        ?: RpcMode.DISABLED.asEnumName()

    private fun getRpcTransferModeEnum(registeredFunction: RegisteredFunction) = registeredFunction
        .annotations
        .getAnnotation<RpcAnnotation>()
        ?.transferMode?.asEnumName()
        ?: MultiplayerPeer.TransferMode.RELIABLE.asEnumName()

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

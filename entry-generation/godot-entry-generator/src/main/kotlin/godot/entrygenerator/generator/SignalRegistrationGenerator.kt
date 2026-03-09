package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredSignal
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.VARIANT_CASTER_ANY
import godot.tools.common.constants.godotRegistrationPackage

object SignalRegistrationGenerator {
    fun generate(registeredClass: RegisteredClass, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        registeredClass
            .signals
            .forEach { registeredSignal ->
                registerClassControlFlow
                    .addStatement(
                        getStringTemplate(registeredSignal),
                        *getTemplateArguments(registeredSignal, className)
                    )
            }
    }

    private fun getStringTemplate(registeredSignal: RegisteredSignal): String = buildString {
        append("signal(%L") //signalPropertyReference

        //a KtFunctionArgument per signal argument
        (0 until kotlin.math.max(registeredSignal.parameterTypes.size, registeredSignal.parameterNames.size)).forEach { _ ->
            append(",·%T(%T,·%S,·%S)")
        }

        append(")") //signal closing
    }

    private fun getTemplateArguments(
        registeredSignal: RegisteredSignal,
        className: ClassName
    ) = buildList {
        add(getPropertyReference(registeredSignal, className)) //signalPropertyReference

        if (registeredSignal.parameterTypes.size >= registeredSignal.parameterNames.size) {
            //a KtFunctionArgument per signal argument
            registeredSignal.parameterTypes.forEachIndexed { index, argumentType ->
                val argumentName = registeredSignal.parameterNames.getOrNull(index) ?: "p$index"
                add(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.ktFunctionArgument))
                add(argumentType.toKtVariantType())
                add(argumentType.fqName)
                add(argumentName)
            }
        } else {
            registeredSignal.parameterNames.forEachIndexed { index, argumentName ->
                val argumentTypeVariantType = registeredSignal.parameterTypes.getOrNull(index)?.toKtVariantType() ?: VARIANT_CASTER_ANY
                val argumentTypeFqName = registeredSignal.parameterTypes.getOrNull(index)?.fqName ?: EntryGenerator.jvmTypeFqNamesProvider(JvmType.ANY).first()

                add(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.ktFunctionArgument))
                add(argumentTypeVariantType)
                add(argumentTypeFqName)
                add(argumentName)
            }
        }
    }.toTypedArray()

    private fun getPropertyReference(registeredSignal: RegisteredSignal, className: ClassName): CodeBlock {
        return className
            .member(registeredSignal.name)
            .reference()
    }
}

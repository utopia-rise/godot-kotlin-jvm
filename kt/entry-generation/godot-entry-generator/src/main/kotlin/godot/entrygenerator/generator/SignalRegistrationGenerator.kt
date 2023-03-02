package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredSignal
import godot.tools.common.constants.GodotKotlinJvmTypes
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
        registeredSignal.parameterNameToType.forEach { _ ->
            append(",·%T(%T,·%S,·%L)")
        }

        append(")") //signal closing
    }

    private fun getTemplateArguments(
        registeredSignal: RegisteredSignal,
        className: ClassName
    ) = buildList {
        add(getPropertyReference(registeredSignal, className)) //signalPropertyReference

        //a KtFunctionArgument per signal argument
        registeredSignal.parameterNameToType.entries.forEach { (argumentName, argumentType) ->
            add(ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.ktFunctionArgument))
            add(argumentType.toKtVariantType())
            add(argumentType.fqName)
            add(argumentName)
        }
    }.toTypedArray()

    private fun getPropertyReference(registeredSignal: RegisteredSignal, className: ClassName): CodeBlock {
        return className
            .member(registeredSignal.name)
            .reference()
    }
}

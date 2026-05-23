package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.core.VariantCaster
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.ext.toKtVariantMemberName
import godot.entrygenerator.model.JvmType
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredSignal
import godot.registration.KtFunctionArgument

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
        append(if (registeredSignal.isFunctionReference) "signalFunction(%L" else "signalProperty(%L")
        repeat(kotlin.math.max(registeredSignal.parameterTypes.size, registeredSignal.parameterNames.size)) {
            append(", %T(%M, %S, %S)")
        }
        append(")")
    }

    private fun getTemplateArguments(
        registeredSignal: RegisteredSignal,
        className: ClassName
    ) = buildList {
        add(getPropertyReference(registeredSignal, className))

        if (registeredSignal.parameterTypes.size >= registeredSignal.parameterNames.size) {
            registeredSignal.parameterTypes.forEachIndexed { index, argumentType ->
                val argumentName = registeredSignal.parameterNames.getOrNull(index) ?: "p$index"
                add(KtFunctionArgument::class)
                add(argumentType.toKtVariantMemberName())
                add(argumentType.fqName)
                add(argumentName)
            }
        } else {
            registeredSignal.parameterNames.forEachIndexed { index, argumentName ->
                val argumentTypeVariantType = registeredSignal.parameterTypes.getOrNull(index)?.toKtVariantMemberName()
                    ?: VariantCaster.ANY
                val argumentTypeFqName = registeredSignal.parameterTypes.getOrNull(index)?.fqName
                    ?: EntryGenerator.jvmTypeFqNamesProvider(JvmType.ANY).first()

                add(KtFunctionArgument::class)
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

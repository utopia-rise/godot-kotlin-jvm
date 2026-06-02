package godot.registrar.generator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.core.VariantCaster
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.toGodotClassName
import godot.registrar.generator.ext.toKtVariantMemberName
import godot.registration.model.RegisteredSignal
import godot.registration.model.types.ScriptClass

fun FunSpec.Builder.addSignalRegistrations(
    registeredClass: ScriptClass,
    context: GeneratorContext,
    className: ClassName,
) {
    registeredClass.signals.forEach { registeredSignal ->
        addStatement(
            getSignalTemplate(registeredSignal),
            *getSignalTemplateArguments(registeredSignal, context, className)
        )
    }
}

private fun getSignalTemplate(registeredSignal: RegisteredSignal): String = buildString {
    append(if (registeredSignal.isFunctionReference) "signalFunction(%L" else "signalProperty(%L")
    repeat(maxOf(registeredSignal.parameterTypes.size, registeredSignal.parameterNames.size)) {
        append(", argument(%M, %S, %S)")
    }
    append(")")
}

private fun getSignalTemplateArguments(
    registeredSignal: RegisteredSignal,
    context: GeneratorContext,
    className: ClassName,
): Array<Any> = buildList {
    add(getSignalReference(registeredSignal, className))

    if (registeredSignal.parameterTypes.size >= registeredSignal.parameterNames.size) {
        registeredSignal.parameterTypes.forEachIndexed { index, argumentType ->
            val argumentName = registeredSignal.parameterNames.getOrNull(index) ?: "p$index"
            add(argumentType.toKtVariantMemberName())
            add(argumentType.toGodotClassName(context))
            add(argumentName)
        }
    } else {
        registeredSignal.parameterNames.forEachIndexed { index, argumentName ->
            add(registeredSignal.parameterTypes.getOrNull(index)?.toKtVariantMemberName() ?: VariantCaster.ANY)
            add(registeredSignal.parameterTypes.getOrNull(index)?.toGodotClassName(context) ?: "")
            add(argumentName)
        }
    }
}.toTypedArray()

private fun getSignalReference(registeredSignal: RegisteredSignal, className: ClassName): CodeBlock {
    return className.member(registeredSignal.name).reference()
}

package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.toGodotVariantType
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.generator.hintstring.PropertyHintStringGeneratorProvider
import godot.entrygenerator.generator.typehint.PropertyTypeHintProvider
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind

object PropertyRegistrationGenerator {
    fun generate(
        registeredClass: RegisteredClass,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        registeredClass
            .properties
            .forEach { registeredProperty ->
                when {
                    registeredProperty.type.kind == TypeKind.ENUM_CLASS -> registerEnum(
                        registeredProperty,
                        className,
                        registerClassControlFlow,
                    )
                    registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$")) &&
                        registeredProperty.type.arguments().firstOrNull()?.kind == TypeKind.ENUM_CLASS &&
                        registeredProperty.annotations.hasAnnotation<EnumAnnotation>() -> registerEnumFlag(
                        registeredProperty,
                        className,
                        registerClassControlFlow,
                    )
                    registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*\$")) &&
                        registeredProperty.type.arguments().firstOrNull()?.kind == TypeKind.ENUM_CLASS -> registerEnumList(
                        registeredProperty,
                        className,
                        registerClassControlFlow,
                    )
                    else -> registerProperty(registeredProperty, className, registerClassControlFlow)
                }
            }
    }

    private fun registerProperty(
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        val typeFqNameWithNullability = if (registeredProperty.type.isNullable) {
            "${registeredProperty.type.fqName}?"
        } else {
            registeredProperty.type.fqName
        }

        registerClassControlFlow
            .addStatement(
                "property(%L,·%T,·%T,·%S,·%T,·%S,·%L)",
                getPropertyReference(registeredProperty, className),
                registeredProperty.type.toKtVariantType(),
                registeredProperty.type.toGodotVariantType(),
                typeFqNameWithNullability,
                PropertyTypeHintProvider.provide(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty)
                    .getHintString()
                    .replace("?", ""),
                shouldBeVisibleInEditor(registeredProperty),
            )
    }

    private fun registerEnumList(
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        registerClassControlFlow
            .addStatement(
                "enumListProperty(%L,·%L,·%S)",
                getPropertyReference(registeredProperty, className),
                shouldBeVisibleInEditor(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty)
                    .getHintString()
                    .replace("?", ""),
            )
    }

    private fun registerEnumFlag(
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        registerClassControlFlow
            .addStatement(
                "enumFlagProperty(%L,·%L,·%S)",
                getPropertyReference(registeredProperty, className),
                shouldBeVisibleInEditor(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty)
                    .getHintString()
                    .replace("?", ""),
            )
    }

    private fun registerEnum(
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        registerClassControlFlow
            .addStatement(
                "enumProperty(%L,·%L,·%S)",
                getPropertyReference(registeredProperty, className),
                shouldBeVisibleInEditor(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty)
                    .getHintString()
                    .replace("?", ""),
            )
    }

    private fun getPropertyReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
        return className
            .member(registeredProperty.name)
            .reference()
    }

    private fun shouldBeVisibleInEditor(registeredProperty: RegisteredProperty): Boolean {
        return registeredProperty
            .annotations
            .hasAnnotation<ExportAnnotation>()
    }
}

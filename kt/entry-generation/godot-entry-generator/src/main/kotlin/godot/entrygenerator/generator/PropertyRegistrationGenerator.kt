package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.common.extensions.convertToCamelCase
import godot.common.extensions.convertToSnakeCase
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isEnum
import godot.entrygenerator.ext.isJavaCollection
import godot.entrygenerator.ext.toGodotVariantMemberName
import godot.entrygenerator.ext.toKtVariantMemberName
import godot.entrygenerator.ext.toTypeName
import godot.entrygenerator.generator.hintstring.PropertyHintStringGeneratorProvider
import godot.entrygenerator.generator.typehint.PropertyTypeHintProvider
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind
import godot.entrygenerator.settings.Settings
import godot.tools.common.names.CoreType

object PropertyRegistrationGenerator {
    fun generate(
        registeredClass: RegisteredClass,
        settings: Settings,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        registeredClass.properties.forEach { registeredProperty ->
            when {
                registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set$")) &&
                    registeredProperty.type.arguments().firstOrNull()?.kind == TypeKind.ENUM_CLASS &&
                    registeredProperty.annotations.hasAnnotation<EnumAnnotation>() -> registerEnumFlag(
                    registeredProperty,
                    settings,
                    className,
                    registerClassControlFlow,
                )

                (
                    registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*$")) ||
                        registeredProperty.type.isJavaCollection()
                    ) &&
                    registeredProperty.type.arguments().firstOrNull()?.kind == TypeKind.ENUM_CLASS -> registerEnumList(
                    registeredProperty,
                    settings,
                    className,
                    registerClassControlFlow,
                )

                else -> registerProperty(registeredProperty, settings, className, registerClassControlFlow)
            }
        }
    }

    private fun registerProperty(
        registeredProperty: RegisteredProperty,
        settings: Settings,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        val typeFqName = if (registeredProperty.type.isEnum()) "Int" else registeredProperty.type.fqName
        val typeFqNameWithNullability = if (registeredProperty.type.isNullable) "$typeFqName?" else typeFqName

        val variantType = if (registeredProperty.type.isEnum()) {
            "%M(%T.entries.toTypedArray())"
        } else {
            "%M"
        }

        val typeClassName = registeredProperty.type.toTypeName()

        val variantTypeArguments = buildList {
            if (registeredProperty.type.isEnum()) {
                add(registeredProperty.type.toKtVariantMemberName())
                add(typeClassName)
                add(registeredProperty.type.toGodotVariantMemberName())
                add(typeClassName)
            } else {
                add(registeredProperty.type.toKtVariantMemberName())
                add(registeredProperty.type.toGodotVariantMemberName())
            }
        }

        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            if (registeredProperty.type.isEnum()) {
                registerClassControlFlow.addStatement(
                    "property(%S,·%L,·%L,·%M(%T.entries.toTypedArray()),·%M(%T.entries.toTypedArray()),·%S,·%M,·%S,·%L.flag)",
                    registeredProperty.name.convertToSnakeCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    registeredProperty.type.toKtVariantMemberName(),
                    typeClassName,
                    registeredProperty.type.toGodotVariantMemberName(),
                    typeClassName,
                    typeFqNameWithNullability,
                    PropertyTypeHintProvider.provide(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty, settings)
                        .getHintString()
                        .replace("?", ""),
                    getPropertyUsage(registeredProperty),
                )
            } else {
                registerClassControlFlow.addStatement(
                    "property(%S,·%L,·%L,·%M,·%M,·%S,·%M,·%S,·%L.flag)",
                    registeredProperty.name.convertToSnakeCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    registeredProperty.type.toKtVariantMemberName(),
                    registeredProperty.type.toGodotVariantMemberName(),
                    typeFqNameWithNullability,
                    PropertyTypeHintProvider.provide(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty, settings)
                        .getHintString()
                        .replace("?", ""),
                    getPropertyUsage(registeredProperty),
                )
            }
            return
        }

        registerClassControlFlow.addStatement(
            "property(%L,·$variantType,·$variantType,·%S,·%M,·%S,·%L.flag)",
            getPropertyReference(registeredProperty, className),
            *variantTypeArguments.toTypedArray(),
            typeFqNameWithNullability,
            PropertyTypeHintProvider.provide(registeredProperty),
            PropertyHintStringGeneratorProvider
                .provide(registeredProperty, settings)
                .getHintString()
                .replace("?", ""),
            getPropertyUsage(registeredProperty),
        )
    }

    private fun registerEnumList(
        registeredProperty: RegisteredProperty,
        settings: Settings,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            registerClassControlFlow.addStatement(
                "enumListProperty(%S,·%L,·%L,·%L.flag,·%S)",
                registeredProperty.name.convertToSnakeCase(),
                getGetterReference(registeredProperty, className),
                getSetterReference(registeredProperty, className),
                getPropertyUsage(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty, settings)
                    .getHintString()
                    .replace("?", ""),
            )
            return
        }

        registerClassControlFlow.addStatement(
            "enumListProperty(%L,·%L.flag,·%S)",
            getPropertyReference(registeredProperty, className),
            getPropertyUsage(registeredProperty),
            PropertyHintStringGeneratorProvider
                .provide(registeredProperty, settings)
                .getHintString()
                .replace("?", ""),
        )
    }

    private fun registerEnumFlag(
        registeredProperty: RegisteredProperty,
        settings: Settings,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            registerClassControlFlow.addStatement(
                "enumFlagProperty(%S,·%L,·%L,·%L.flag,·%S)",
                registeredProperty.name.convertToCamelCase(),
                getGetterReference(registeredProperty, className),
                getSetterReference(registeredProperty, className),
                getPropertyUsage(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty, settings)
                    .getHintString()
                    .replace("?", ""),
            )
            return
        }

        registerClassControlFlow.addStatement(
            "enumFlagProperty(%L,·%L.flag,·%S)",
            getPropertyReference(registeredProperty, className),
            getPropertyUsage(registeredProperty),
            PropertyHintStringGeneratorProvider
                .provide(registeredProperty, settings)
                .getHintString()
                .replace("?", ""),
        )
    }

    private fun getPropertyReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
        return className
            .member(registeredProperty.name)
            .reference()
    }

    private fun getGetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
        val getterName = registeredProperty.getterName
        requireNotNull(getterName) {
            "Property ${registeredProperty.fqName} does not have a getter."
        }
        return className.member(getterName).reference()
    }

    private fun getSetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
        val setterName = registeredProperty.setterName
        requireNotNull(setterName) {
            "Property ${registeredProperty.fqName} does not have a setter."
        }
        return className.member(setterName).reference()
    }

    private fun getPropertyUsage(registeredProperty: RegisteredProperty): MemberName {
        return if (registeredProperty.annotations.hasAnnotation<ExportAnnotation>()) {
            CoreType.propertyUsage("DEFAULT")
        } else {
            CoreType.propertyUsage("NONE")
        }
    }
}

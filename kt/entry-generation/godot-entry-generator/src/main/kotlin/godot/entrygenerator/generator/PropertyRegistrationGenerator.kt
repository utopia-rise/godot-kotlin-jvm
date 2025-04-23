package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.common.extensions.convertToCamelCase
import godot.common.extensions.convertToSnakeCase
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.isJavaCollection
import godot.entrygenerator.ext.toGodotVariantType
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.generator.hintstring.PropertyHintStringGeneratorProvider
import godot.entrygenerator.generator.typehint.PropertyTypeHintProvider
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.TypeKind
import godot.tools.common.constants.GodotTypes
import godot.tools.common.constants.godotCorePackage

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

                    (
                        registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$"))
                            || registeredProperty.type.fqName.matches(Regex("^java\\.util\\..*Set\$"))
                    ) &&
                        registeredProperty.type.arguments().firstOrNull()?.kind == TypeKind.ENUM_CLASS &&
                        registeredProperty.annotations.hasAnnotation<EnumAnnotation>() -> registerEnumFlag(
                        registeredProperty,
                        className,
                        registerClassControlFlow,
                    )

                    (
                        registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*\$"))
                            || registeredProperty.type.isJavaCollection()
                    ) &&
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

        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            registerClassControlFlow
                .addStatement(
                    "property(%S,·%L,·%L,·%T,·%T,·%S,·%T,·%S,·%L.flag)",
                    registeredProperty.name.convertToSnakeCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    registeredProperty.type.toKtVariantType(),
                    registeredProperty.type.toGodotVariantType(),
                    typeFqNameWithNullability,
                    PropertyTypeHintProvider.provide(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty)
                        .getHintString()
                        .replace("?", ""),
                    getPropertyUsage(registeredProperty),
                )
            return
        }

        registerClassControlFlow
            .addStatement(
                "property(%L,·%T,·%T,·%S,·%T,·%S,·%L.flag)",
                getPropertyReference(registeredProperty, className),
                registeredProperty.type.toKtVariantType(),
                registeredProperty.type.toGodotVariantType(),
                typeFqNameWithNullability,
                PropertyTypeHintProvider.provide(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty)
                    .getHintString()
                    .replace("?", ""),
                getPropertyUsage(registeredProperty),
            )
    }

    private fun registerEnumList(
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
    ) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            registerClassControlFlow
                .addStatement(
                    "enumListProperty(%S,·%L,·%L,·%L.flag,·%S)",
                    registeredProperty.name.convertToSnakeCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    getPropertyUsage(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty)
                        .getHintString()
                        .replace("?", ""),
                )
            return
        }

        registerClassControlFlow
            .addStatement(
                "enumListProperty(%L,·%L.flag,·%S)",
                getPropertyReference(registeredProperty, className),
                getPropertyUsage(registeredProperty),
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
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            registerClassControlFlow
                .addStatement(
                    "enumFlagProperty(%S,·%L,·%L,·%L.flag,·%S)",
                    registeredProperty.name.convertToCamelCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    getPropertyUsage(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty)
                        .getHintString()
                        .replace("?", ""),
                )
            return
        }

        registerClassControlFlow
            .addStatement(
                "enumFlagProperty(%L,·%L.flag,·%S)",
                getPropertyReference(registeredProperty, className),
                getPropertyUsage(registeredProperty),
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
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            registerClassControlFlow
                .addStatement(
                    "enumProperty(%S,·%L,·%L,·%L.flag,·%S)",
                    registeredProperty.name.convertToSnakeCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    getPropertyUsage(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty)
                        .getHintString()
                        .replace("?", ""),
                )
            return
        }

        registerClassControlFlow
            .addStatement(
                "enumProperty(%L,·%L.flag,·%S)",
                getPropertyReference(registeredProperty, className),
                getPropertyUsage(registeredProperty),
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

    private fun getGetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
        val getterName = registeredProperty.getterName

        requireNotNull(getterName) {
            "Property ${registeredProperty.fqName} does not have a getter."
        }

        return className
            .member(getterName)
            .reference()
    }

    private fun getSetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
        val setterName = registeredProperty.setterName

        requireNotNull(setterName) {
            "Property ${registeredProperty.fqName} does not have a setter."
        }

        return className
            .member(setterName)
            .reference()
    }

    private fun getPropertyUsage(registeredProperty: RegisteredProperty): ClassName {
        return if (registeredProperty.annotations.hasAnnotation<ExportAnnotation>()) {
            ClassName(
                "$godotCorePackage.${GodotTypes.propertyUsage}",
                "DEFAULT"
            )
        } else {
            ClassName(
                "$godotCorePackage.${GodotTypes.propertyUsage}",
                "NONE"
            )
        }
    }
}

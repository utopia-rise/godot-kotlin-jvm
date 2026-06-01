package godot.registrar.generator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.common.extensions.convertToCamelCase
import godot.common.extensions.convertToSnakeCase
import godot.core.PropertyUsageFlags
import godot.registrar.generator.ext.toGodotClassName
import godot.registrar.generator.generator.hintstring.PropertyHintStringGeneratorProvider
import godot.registrar.generator.generator.typehint.PropertyTypeHintProvider
import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isEnum
import godot.registration.model.ext.isJavaCollection
import godot.registration.model.ext.toKtVariantMemberName
import godot.registration.model.ext.toTypeName
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.TypeKind

object PropertyRegistrationGenerator {
    fun generate(
        registeredClass: ScriptClass,
        settings: Settings,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        registeredClassesByFqName: Map<String, ScriptClass>,
    ) {
        registeredClass.properties.forEach { registeredProperty ->
            when {
                registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set$")) &&
                    registeredProperty.type.genericArguments.firstOrNull()?.kind == TypeKind.ENUM &&
                    registeredProperty.hints.any { it is EnumHint } -> registerEnumFlag(
                    registeredProperty,
                    settings,
                    className,
                    registerClassControlFlow,
                    registeredClassesByFqName
                )

                (
                    registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*$")) ||
                        registeredProperty.type.isJavaCollection()
                    ) &&
                    registeredProperty.type.genericArguments.firstOrNull()?.kind == TypeKind.ENUM -> registerClassControlFlow.registerEnumList(
                    registeredProperty,
                    settings,
                    className,
                    registeredClassesByFqName
                )

                else -> registerClassControlFlow.registerProperty(
                    registeredProperty,
                    settings,
                    className,
                    registeredClassesByFqName
                )
            }
        }
    }

    private fun FunSpec.Builder.registerProperty(
        registeredProperty: RegisteredProperty,
        settings: Settings,
        className: ClassName,
        registeredClassesByFqName: Map<String, ScriptClass>
    ) {
        val typeGodotName = if (registeredProperty.type.isEnum()) {
            "int"
        } else {
            registeredProperty.type.toGodotClassName(settings, registeredClassesByFqName)
        }

        val variantType = if (registeredProperty.type.isEnum()) {
            "%M(%T.entries.toTypedArray())"
        } else {
            "%M"
        }

        val typeClassName = registeredProperty.type.toTypeName()

        val variantTypeArguments = buildList {
            add(registeredProperty.type.toKtVariantMemberName())
            if (registeredProperty.type.isEnum()) {
                add(typeClassName)
            }
        }

        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            if (registeredProperty.type.isEnum()) {
                addStatement(
                    "property(%S,·%L,·%L,·%M(%T.entries.toTypedArray()),·%S,·%M,·%S,·%T.%L)",
                    registeredProperty.name.convertToSnakeCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    registeredProperty.type.toKtVariantMemberName(),
                    typeClassName,
                    typeGodotName,
                    PropertyTypeHintProvider.provide(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty, settings, registeredClassesByFqName)
                        .getHintString()
                        .replace("?", ""),
                    PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
                )
            } else {
                addStatement(
                    "property(%S,·%L,·%L,·%M,·%S,·%M,·%S,·%T.%L)",
                    registeredProperty.name.convertToSnakeCase(),
                    getGetterReference(registeredProperty, className),
                    getSetterReference(registeredProperty, className),
                    registeredProperty.type.toKtVariantMemberName(),
                    typeGodotName,
                    PropertyTypeHintProvider.provide(registeredProperty),
                    PropertyHintStringGeneratorProvider
                        .provide(registeredProperty, settings, registeredClassesByFqName)
                        .getHintString()
                        .replace("?", ""),
                    PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
                )
            }
            return
        }

        addStatement(
            "property(%L,·$variantType,·%S,·%M,·%S,·%T.%L)",
            getPropertyReference(registeredProperty, className),
            *variantTypeArguments.toTypedArray(),
            typeGodotName,
            PropertyTypeHintProvider.provide(registeredProperty),
            PropertyHintStringGeneratorProvider
                .provide(registeredProperty, settings, registeredClassesByFqName)
                .getHintString()
                .replace("?", ""),
            PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
        )
    }

    private fun FunSpec.Builder.registerEnumList(
        registeredProperty: RegisteredProperty,
        settings: Settings,
        className: ClassName,
        registeredClassesByFqName: Map<String, ScriptClass>,
    ) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            addStatement(
                "enumListProperty(%S,·%L,·%L,·%T.%L,·%S)",
                registeredProperty.name.convertToSnakeCase(),
                getGetterReference(registeredProperty, className),
                getSetterReference(registeredProperty, className),
                PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty, settings, registeredClassesByFqName)
                    .getHintString()
                    .replace("?", ""),
            )
            return
        }

        addStatement(
            "enumListProperty(%L,·%T.%L,·%S)",
            getPropertyReference(registeredProperty, className),
            PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
            PropertyHintStringGeneratorProvider
                .provide(registeredProperty, settings, registeredClassesByFqName)
                .getHintString()
                .replace("?", ""),
        )
    }

    private fun registerEnumFlag(
        registeredProperty: RegisteredProperty,
        settings: Settings,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        registeredClassesByFqName: Map<String, ScriptClass>,
    ) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        if (getterFqName != null) {
            requireNotNull(setterFqName) {
                "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
            }

            registerClassControlFlow.addStatement(
                "enumFlagProperty(%S,·%L,·%L,·%T.%L,·%S)",
                registeredProperty.name.convertToCamelCase(),
                getGetterReference(registeredProperty, className),
                getSetterReference(registeredProperty, className),
                PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty, settings, registeredClassesByFqName)
                    .getHintString()
                    .replace("?", ""),
            )
            return
        }

        registerClassControlFlow.addStatement(
            "enumFlagProperty(%L,·%T.%L,·%S)",
            getPropertyReference(registeredProperty, className),
            PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
            PropertyHintStringGeneratorProvider
                .provide(registeredProperty, settings, registeredClassesByFqName)
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

    private fun getPropertyUsage(registeredProperty: RegisteredProperty): String {
        return if (registeredProperty.isExported) {
            "DEFAULT"
        } else {
            "NONE"
        }
    }
}

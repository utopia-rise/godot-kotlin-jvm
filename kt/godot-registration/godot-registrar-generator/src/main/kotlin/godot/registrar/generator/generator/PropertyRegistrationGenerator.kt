package godot.registrar.generator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName.Companion.member
import godot.common.extensions.convertToCamelCase
import godot.common.extensions.convertToSnakeCase
import godot.core.PropertyUsageFlags
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.toGodotClassName
import godot.registrar.generator.ext.toKtVariantMemberName
import godot.registrar.generator.ext.toTypeName
import godot.registrar.generator.generator.hintstring.PropertyHintStringGeneratorProvider
import godot.registrar.generator.generator.typehint.PropertyTypeHintProvider
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isEnum
import godot.registration.model.ext.isJavaCollection
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.TypeKind

fun FunSpec.Builder.addPropertyRegistrations(
    registeredClass: ScriptClass,
    context: GeneratorContext,
    className: ClassName,
) {
    registeredClass.properties.forEach { registeredProperty ->
        when {
            registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set$")) &&
                registeredProperty.type.genericArguments.firstOrNull()?.kind == TypeKind.ENUM &&
                registeredProperty.hints.any { it is EnumHint } -> registerEnumFlagProperty(
                registeredProperty,
                context,
                className,
            )

            (
                registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*$")) ||
                    registeredProperty.type.isJavaCollection()
                ) &&
                registeredProperty.type.genericArguments.firstOrNull()?.kind == TypeKind.ENUM -> registerEnumListProperty(
                registeredProperty,
                context,
                className,
            )

            else -> registerProperty(
                registeredProperty,
                context,
                className,
            )
        }
    }
}

private fun FunSpec.Builder.registerProperty(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
    className: ClassName,
) {
    val typeGodotName = if (registeredProperty.type.isEnum()) "int" else registeredProperty.type.toGodotClassName(context)
    val variantType = if (registeredProperty.type.isEnum()) "%M(%T.entries.toTypedArray())" else "%M"
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
                "property(%S, %L, %L, %M(%T.entries.toTypedArray()), %S, %M, %S, %T.%L)",
                registeredProperty.name.convertToSnakeCase(),
                getGetterReference(registeredProperty, className),
                getSetterReference(registeredProperty, className),
                registeredProperty.type.toKtVariantMemberName(),
                typeClassName,
                typeGodotName,
                PropertyTypeHintProvider.provide(registeredProperty),
                buildHintString(registeredProperty, context),
                PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
            )
        } else {
            addStatement(
                "property(%S, %L, %L, %M, %S, %M, %S, %T.%L)",
                registeredProperty.name.convertToSnakeCase(),
                getGetterReference(registeredProperty, className),
                getSetterReference(registeredProperty, className),
                registeredProperty.type.toKtVariantMemberName(),
                typeGodotName,
                PropertyTypeHintProvider.provide(registeredProperty),
                buildHintString(registeredProperty, context),
                PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
            )
        }
        return
    }

    addStatement(
        "property(%L, $variantType, %S, %M, %S, %T.%L)",
        getPropertyReference(registeredProperty, className),
        *variantTypeArguments.toTypedArray(),
        typeGodotName,
        PropertyTypeHintProvider.provide(registeredProperty),
        buildHintString(registeredProperty, context),
        PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
    )
}

private fun FunSpec.Builder.registerEnumListProperty(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
    className: ClassName,
) {
    val getterFqName = registeredProperty.getterFqName
    val setterFqName = registeredProperty.setterFqName
    if (getterFqName != null) {
        requireNotNull(setterFqName) {
            "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
        }

        addStatement(
            "enumListProperty(%S, %L, %L, %T.%L, %S)",
            registeredProperty.name.convertToSnakeCase(),
            getGetterReference(registeredProperty, className),
            getSetterReference(registeredProperty, className),
            PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
            buildHintString(registeredProperty, context),
        )
        return
    }

    addStatement(
        "enumListProperty(%L, %T.%L, %S)",
        getPropertyReference(registeredProperty, className),
        PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
        buildHintString(registeredProperty, context),
    )
}

private fun FunSpec.Builder.registerEnumFlagProperty(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
    className: ClassName,
) {
    val getterFqName = registeredProperty.getterFqName
    val setterFqName = registeredProperty.setterFqName
    if (getterFqName != null) {
        requireNotNull(setterFqName) {
            "Property ${registeredProperty.name} with getter $getterFqName should also have a setter"
        }

        addStatement(
            "enumFlagProperty(%S, %L, %L, %T.%L, %S)",
            registeredProperty.name.convertToCamelCase(),
            getGetterReference(registeredProperty, className),
            getSetterReference(registeredProperty, className),
            PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
            buildHintString(registeredProperty, context),
        )
        return
    }

    addStatement(
        "enumFlagProperty(%L, %T.%L, %S)",
        getPropertyReference(registeredProperty, className),
        PropertyUsageFlags::class, getPropertyUsage(registeredProperty),
        buildHintString(registeredProperty, context),
    )
}

private fun buildHintString(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
): String = PropertyHintStringGeneratorProvider
    .provide(registeredProperty, context)
    .getHintString()
    .replace("?", "")

private fun getPropertyReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
    return className.member(registeredProperty.name).reference()
}

private fun getGetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
    val getterName = requireNotNull(registeredProperty.getterName) {
        "Property ${registeredProperty.fqName} does not have a getter."
    }
    return className.member(getterName).reference()
}

private fun getSetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
    val setterName = requireNotNull(registeredProperty.setterName) {
        "Property ${registeredProperty.fqName} does not have a setter."
    }
    return className.member(setterName).reference()
}

private fun getPropertyUsage(registeredProperty: RegisteredProperty): String =
    if (registeredProperty.isExported) "DEFAULT" else "NONE"

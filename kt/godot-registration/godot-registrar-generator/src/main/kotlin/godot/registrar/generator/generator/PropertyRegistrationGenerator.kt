package godot.registrar.generator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.MemberName
import godot.common.extensions.convertToSnakeCase
import godot.core.PropertyUsageFlags
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.effectiveProperties
import godot.registrar.generator.ext.toGodotClassName
import godot.registrar.generator.ext.toKtVariantMemberName
import godot.registrar.generator.ext.toTypeName
import godot.registrar.generator.generator.hintstring.PropertyHintStringGeneratorProvider
import godot.registrar.generator.generator.typehint.PropertyTypeHintProvider
import godot.registration.model.RegisteredProperty
import godot.registration.model.RegisteredPropertyBindingKind
import godot.registration.model.ext.isBitField
import godot.registration.model.ext.isEnum
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.hint.property.EnumListHintStringHint
import godot.registration.model.types.ScriptClass

fun FunSpec.Builder.addPropertyRegistrations(
    registeredClass: ScriptClass,
    context: GeneratorContext,
    className: ClassName,
) {
    registeredClass.effectiveProperties(context).forEach { registeredProperty ->
        when {
            registeredProperty.type.isBitField() -> registerBitFieldProperty(
                registeredProperty,
                context,
                className,
            )

            registeredProperty.hints.any { it is EnumListHintStringHint } -> registerEnumListProperty(
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

    if (registeredProperty.bindingKind == RegisteredPropertyBindingKind.ACCESSOR_METHODS) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        requireNotNull(getterFqName) {
            "Property ${registeredProperty.name} should have a getter when using accessor binding"
        }
        if (registeredProperty.type.isEnum()) {
            addStatement(
                if (setterFqName == null) {
                    "property(%S, %L, %M(%T.entries.toTypedArray()), %S, %M, %S, %L)"
                } else {
                    "property(%S, %L, %L, %M(%T.entries.toTypedArray()), %S, %M, %S, %L)"
                },
                registeredProperty.name.convertToSnakeCase(),
                getGetterReference(registeredProperty, className),
                *listOfNotNull(
                    setterFqName?.let { getSetterReference(registeredProperty, className) },
                    registeredProperty.type.toKtVariantMemberName(),
                    typeClassName,
                    typeGodotName,
                    PropertyTypeHintProvider.provide(registeredProperty),
                    buildHintStringCode(registeredProperty, context),
                    getPropertyUsage(registeredProperty),
                ).toTypedArray(),
            )
        } else {
            addStatement(
                if (setterFqName == null) {
                    "property(%S, %L, %M, %S, %M, %L, %L)"
                } else {
                    "property(%S, %L, %L, %M, %S, %M, %L, %L)"
                },
                registeredProperty.name.convertToSnakeCase(),
                getGetterReference(registeredProperty, className),
                *listOfNotNull(
                    setterFqName?.let { getSetterReference(registeredProperty, className) },
                    registeredProperty.type.toKtVariantMemberName(),
                    typeGodotName,
                    PropertyTypeHintProvider.provide(registeredProperty),
                    buildHintStringCode(registeredProperty, context),
                    getPropertyUsage(registeredProperty),
                ).toTypedArray(),
            )
        }
        return
    }

    addStatement(
        "property(%L, $variantType, %S, %M, %L, %L)",
        getPropertyReference(registeredProperty, className),
        *variantTypeArguments.toTypedArray(),
        typeGodotName,
        PropertyTypeHintProvider.provide(registeredProperty),
        buildHintStringCode(registeredProperty, context),
        getPropertyUsage(registeredProperty),
    )
}

private fun FunSpec.Builder.registerEnumListProperty(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
    className: ClassName,
) {
    if (registeredProperty.bindingKind == RegisteredPropertyBindingKind.ACCESSOR_METHODS) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        requireNotNull(getterFqName) {
            "Property ${registeredProperty.name} should have a getter when using accessor binding"
        }

        addStatement(
            if (setterFqName == null) {
                "enumListProperty(%S, %L, %L, %L)"
            } else {
                "enumListProperty(%S, %L, %L, %L, %L)"
            },
            registeredProperty.name.convertToSnakeCase(),
            getGetterReference(registeredProperty, className),
            *listOfNotNull(
                setterFqName?.let { getSetterReference(registeredProperty, className) },
                getPropertyUsage(registeredProperty),
                buildHintStringCode(registeredProperty, context),
            ).toTypedArray(),
        )
        return
    }

    addStatement(
        "enumListProperty(%L, %L, %L)",
        getPropertyReference(registeredProperty, className),
        getPropertyUsage(registeredProperty),
        buildHintStringCode(registeredProperty, context),
    )
}

private fun FunSpec.Builder.registerBitFieldProperty(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
    className: ClassName,
) {
    if (registeredProperty.bindingKind == RegisteredPropertyBindingKind.ACCESSOR_METHODS) {
        val getterFqName = registeredProperty.getterFqName
        val setterFqName = registeredProperty.setterFqName
        requireNotNull(getterFqName) {
            "Property ${registeredProperty.name} should have a getter when using accessor binding"
        }

        addStatement(
            if (setterFqName == null) {
                "bitFieldProperty(%S, %L, %L, %L)"
            } else {
                "bitFieldProperty(%S, %L, %L, %L, %L)"
            },
            registeredProperty.name.convertToSnakeCase(),
            getGetterReference(registeredProperty, className),
            *listOfNotNull(
                setterFqName?.let { getSetterReference(registeredProperty, className) },
                getPropertyUsage(registeredProperty),
                buildHintStringCode(registeredProperty, context),
            ).toTypedArray(),
        )
        return
    }

    addStatement(
        "bitFieldProperty(%L, %L, %L)",
        getPropertyReference(registeredProperty, className),
        getPropertyUsage(registeredProperty),
        buildHintStringCode(registeredProperty, context),
    )
}

private val enumHintStringMember = MemberName("godot.registration", "enumHintString")
private val enumListHintStringMember = MemberName("godot.registration", "enumListHintString")

private fun buildHintStringCode(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
): CodeBlock {
    val enumHint = registeredProperty.hints.filterIsInstance<EnumHint>().firstOrNull()
    if (enumHint != null) {
        val enumClassName = ClassName(
            enumHint.enumFqName.substringBeforeLast("."),
            enumHint.enumFqName.substringAfterLast("."),
        )
        val helper = if (enumHint is EnumListHintStringHint) enumListHintStringMember else enumHintStringMember
        return CodeBlock.of("%M(%T.entries.toTypedArray())", helper, enumClassName)
    }

    return CodeBlock.of(
        "%S",
        PropertyHintStringGeneratorProvider
            .provide(registeredProperty, context)
            .getHintString()
            .replace("?", "")
    )
}

private fun getPropertyReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
    return memberReference(className, registeredProperty.name)
}

private fun getGetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
    val getterName = requireNotNull(registeredProperty.getterName) {
        "Property ${registeredProperty.fqName} does not have a getter."
    }
    return memberReference(className, getterName)
}

private fun getSetterReference(registeredProperty: RegisteredProperty, className: ClassName): CodeBlock {
    val setterName = requireNotNull(registeredProperty.setterName) {
        "Property ${registeredProperty.fqName} does not have a setter."
    }
    return memberReference(className, setterName)
}

private fun memberReference(className: ClassName, memberName: String): CodeBlock =
    if (memberName.isPlainKotlinIdentifier()) {
        CodeBlock.of("%T::%L", className, memberName)
    } else {
        CodeBlock.builder()
            .add("%T::", className)
            .add("`")
            .add(memberName)
            .add("`")
            .build()
    }

private fun getPropertyUsage(registeredProperty: RegisteredProperty): CodeBlock {
    val baseUsage = if (registeredProperty.isExported) {
        CodeBlock.of("%T.DEFAULT", PropertyUsageFlags::class)
    } else {
        CodeBlock.of("%T.NONE", PropertyUsageFlags::class)
    }

    if (registeredProperty.isMutable) {
        return baseUsage
    }

    return CodeBlock.of("%L or %T.READ_ONLY", baseUsage, PropertyUsageFlags::class)
}

private fun String.isPlainKotlinIdentifier(): Boolean {
    if (isEmpty()) {
        return false
    }
    if (!(first() == '_' || first().isLetter())) {
        return false
    }
    return drop(1).all { char -> char == '_' || char.isLetterOrDigit() }
}

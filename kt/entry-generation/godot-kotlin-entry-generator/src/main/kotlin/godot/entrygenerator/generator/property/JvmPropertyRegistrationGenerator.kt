package godot.entrygenerator.generator.property

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.extension.toParameterKtVariantType
import godot.entrygenerator.extension.toReturnKtVariantType
import godot.entrygenerator.generator.property.defaultvalue.DefaultValueExtractorProvider
import godot.entrygenerator.generator.property.hintstring.PropertyHintStringGeneratorProvider
import godot.entrygenerator.generator.property.typehint.PropertyTypeHintProvider
import godot.entrygenerator.mapper.RpcModeAnnotationMapper
import godot.entrygenerator.model.RegisteredProperty
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.resolve.BindingContext

class JvmPropertyRegistrationGenerator : PropertyRegistrationGenerator() {
    override fun registerEnumFlag(
        className: ClassName,
        registeredProperty: RegisteredProperty,
        bindingContext: BindingContext,
        classSpecificRegistryBuilder: TypeSpec.Builder,
        registerClassControlFlow: FunSpec.Builder
    ) {
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = DefaultValueExtractorProvider
            .provide(registeredProperty.propertyDescriptor, bindingContext, EntryGenerationType.JVM)
            .getDefaultValue(null)

        if (registeredProperty.isOverriding || !registeredProperty.isInherited) {
            generateDefaultValueProvider(registeredProperty, bindingContext, classSpecificRegistryBuilder)
        }

        registerClassControlFlow
            .addStatement(
                "enumFlagProperty(%L,·{·${defaultValueStringTemplate.replace(" ", "·")}·},·%T.id.toInt())",
                getPropertyReference(registeredProperty.propertyDescriptor, className),
                *defaultValueStringTemplateValues,
                getRpcModeEnum(registeredProperty.propertyDescriptor)
            )
    }

    override fun registerEnumList(className: ClassName, registeredProperty: RegisteredProperty, bindingContext: BindingContext, registerClassControlFlow: FunSpec.Builder) {
        TODO("Not yet implemented")
    }

    override fun registerEnum(className: ClassName, registeredProperty: RegisteredProperty, bindingContext: BindingContext, registerClassControlFlow: FunSpec.Builder) {
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = DefaultValueExtractorProvider
            .provide(registeredProperty.propertyDescriptor, bindingContext, EntryGenerationType.JVM)
            .getDefaultValue(null)

        registerClassControlFlow
            .addStatement(
                "enumProperty(%L,·{·${defaultValueStringTemplate.replace(" ", "·")}·},·%T.id.toInt())",
                getPropertyReference(registeredProperty.propertyDescriptor, className),
                *defaultValueStringTemplateValues,
                getRpcModeEnum(registeredProperty.propertyDescriptor)
            )
    }

    override fun registerProperty(
        className: ClassName,
        registeredProperty: RegisteredProperty,
        bindingContext: BindingContext,
        classSpecificRegistryBuilder: TypeSpec.Builder,
        registerClassControlFlow: FunSpec.Builder
    ) {
        if (registeredProperty.isOverriding || !registeredProperty.isInherited) {
            generateDefaultValueProvider(registeredProperty, bindingContext, classSpecificRegistryBuilder)
        }

        val typeFqNameWithNullability = if (registeredProperty.propertyDescriptor.type.isMarkedNullable) {
            "${registeredProperty.propertyDescriptor.type.getJetTypeFqName(false)}?"
        } else {
            registeredProperty.propertyDescriptor.type.getJetTypeFqName(false)
        }

        registerClassControlFlow
            .addStatement(
                "property(%L,·%T,·%T,·%S,·%T,·%S,·{·${registeredProperty.propertyDescriptor.name}DefaultValue·},·%T.id.toInt())",
                getPropertyReference(registeredProperty.propertyDescriptor, className),
                registeredProperty.propertyDescriptor.type.toParameterKtVariantType(),
                registeredProperty.propertyDescriptor.type.toReturnKtVariantType(),
                typeFqNameWithNullability,
                PropertyTypeHintProvider.provide(registeredProperty.propertyDescriptor, EntryGenerationType.JVM),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty.propertyDescriptor, bindingContext, EntryGenerationType.JVM)
                    .getHintString()
                    .replace("?", ""),
                getRpcModeEnum(registeredProperty.propertyDescriptor)
            )
    }

    private fun generateDefaultValueProvider(
        registeredProperty: RegisteredProperty,
        bindingContext: BindingContext,
        classSpecificRegistryBuilder: TypeSpec.Builder
    ) {
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = DefaultValueExtractorProvider
            .provide(registeredProperty.propertyDescriptor, bindingContext, EntryGenerationType.JVM)
            .getDefaultValue(null)

        val returnType = registeredProperty.propertyDescriptor.returnType
        requireNotNull(returnType)

        val returnTypePackagePath = returnType.getJetTypeFqName(false).substringBeforeLast(".")
        val returnTypeSimpleName = returnType.getJetTypeFqName(false).substringAfterLast(".")
        val tmpClassName = ClassName(returnTypePackagePath, returnTypeSimpleName)
        var returnTypeClassName: TypeName = tmpClassName

        if (returnType.arguments.isNotEmpty()) {
            returnTypeClassName = tmpClassName.parameterizedBy(
                returnType
                    .arguments
                    .map { typeProjection ->
                        val fqName = typeProjection.type.getJetTypeFqName(false)
                        val isNullable = typeProjection.type.isMarkedNullable
                        ClassName(fqName.substringBeforeLast("."), fqName.substringAfterLast("."))
                            .copy(nullable = isNullable)
                    }
            )
        }

        val defaultValuePropertySpec = PropertySpec
            .builder("${registeredProperty.propertyDescriptor.name}DefaultValue", returnTypeClassName.copy(nullable = defaultValueStringTemplateValues.all { it is String && it == "null" }))
            .addModifiers(KModifier.OPEN)
            .delegate("lazy·{·${defaultValueStringTemplate.replace(" ", "·")}·}", *defaultValueStringTemplateValues)

        if (registeredProperty.isOverriding) {
            defaultValuePropertySpec.addModifiers(KModifier.OVERRIDE)
        }

        classSpecificRegistryBuilder
            .addProperty(defaultValuePropertySpec.build())
    }

    private fun getPropertyReference(propertyDescriptor: PropertyDescriptor, className: ClassName): CodeBlock {
        return className
            .member(propertyDescriptor.name.asString())
            .reference()
    }
}

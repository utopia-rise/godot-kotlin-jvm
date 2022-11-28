package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import godot.entrygenerator.ext.getAnnotationUnsafe
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.toGodotVariantType
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.generator.hintstring.PropertyHintStringGeneratorProvider
import godot.entrygenerator.generator.typehint.PropertyTypeHintProvider
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.ExportAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.RpcMode
import godot.entrygenerator.model.TypeKind

object PropertyRegistrationGenerator {
    fun generate(
        registeredClass: RegisteredClass,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        classRegistrarBuilder: TypeSpec.Builder
    ) {
        registeredClass
            .registeredProperties
            .forEach { registeredProperty ->
                when {
                    registeredProperty.type.kind == TypeKind.ENUM_CLASS -> registerEnum(
                        containingRegisteredClass = registeredClass,
                        registeredProperty = registeredProperty,
                        className = className,
                        registerClassControlFlow = registerClassControlFlow,
                        classRegistrarBuilder = classRegistrarBuilder
                    )
                    registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*Set\$")) &&
                        registeredProperty.type.arguments().firstOrNull()?.kind == TypeKind.ENUM_CLASS &&
                        registeredProperty.annotations.hasAnnotation<EnumAnnotation>() -> registerEnumFlag(
                        containingRegisteredClass = registeredClass,
                        registeredProperty = registeredProperty,
                        className = className,
                        registerClassControlFlow = registerClassControlFlow,
                        classRegistrarBuilder = classRegistrarBuilder
                    )
                    registeredProperty.type.fqName.matches(Regex("^kotlin\\.collections\\..*\$")) &&
                        registeredProperty.type.arguments().firstOrNull()?.kind == TypeKind.ENUM_CLASS -> registerEnumList(
                        containingRegisteredClass = registeredClass,
                        registeredProperty = registeredProperty,
                        className = className,
                        registerClassControlFlow = registerClassControlFlow,
                        classRegistrarBuilder = classRegistrarBuilder
                    )
                    else -> registerProperty(
                        containingRegisteredClass = registeredClass,
                        registeredProperty = registeredProperty,
                        className = className,
                        registerClassControlFlow = registerClassControlFlow,
                        classRegistrarBuilder = classRegistrarBuilder
                    )
                }
            }
    }

    fun generateForAbstractClass(
        registeredClass: RegisteredClass,
        classRegistrarBuilder: TypeSpec.Builder
    ) {
        registeredClass
            .registeredProperties
            .forEach { registeredProperty ->
                generateAndProvideDefaultValueProvider(
                    containingRegisteredClass = registeredClass,
                    registeredProperty = registeredProperty,
                    classRegistrarBuilder = classRegistrarBuilder
                )
            }
    }

    private fun registerProperty(
        containingRegisteredClass: RegisteredClass,
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        classRegistrarBuilder: TypeSpec.Builder
    ) {
        val defaultValueProviderVariableName = generateAndProvideDefaultValueProvider(
            containingRegisteredClass = containingRegisteredClass,
            registeredProperty = registeredProperty,
            classRegistrarBuilder = classRegistrarBuilder
        )
        val typeFqNameWithNullability = if (registeredProperty.type.isNullable) {
            "${registeredProperty.type.fqName}?"
        } else {
            registeredProperty.type.fqName
        }

        registerClassControlFlow
            .addStatement(
                "property(%L,·%T,·%T,·%S,·%T,·%S,·$defaultValueProviderVariableName,·%L,·%T.id.toInt())",
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
                getRpcModeEnum(registeredProperty)
            )
    }

    private fun registerEnumList(
        containingRegisteredClass: RegisteredClass,
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        classRegistrarBuilder: TypeSpec.Builder
    ) {
        val defaultValueProvider = generateAndProvideDefaultValueProvider(
            containingRegisteredClass = containingRegisteredClass,
            registeredProperty = registeredProperty,
            classRegistrarBuilder = classRegistrarBuilder
        )

        registerClassControlFlow
            .addStatement(
                "enumListProperty(%L,·$defaultValueProvider,·%L,·%T.id.toInt(),·%S)",
                getPropertyReference(registeredProperty, className),
                shouldBeVisibleInEditor(registeredProperty),
                getRpcModeEnum(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty)
                    .getHintString()
                    .replace("?", ""),
            )
    }

    private fun registerEnumFlag(
        containingRegisteredClass: RegisteredClass,
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        classRegistrarBuilder: TypeSpec.Builder
    ) {
        val defaultValueProvider = generateAndProvideDefaultValueProvider(
            containingRegisteredClass = containingRegisteredClass,
            registeredProperty = registeredProperty,
            classRegistrarBuilder = classRegistrarBuilder
        )

        registerClassControlFlow
            .addStatement(
                "enumFlagProperty(%L,·$defaultValueProvider,·%L,·%T.id.toInt(),·%S)",
                getPropertyReference(registeredProperty, className),
                shouldBeVisibleInEditor(registeredProperty),
                getRpcModeEnum(registeredProperty),
                PropertyHintStringGeneratorProvider
                    .provide(registeredProperty)
                    .getHintString()
                    .replace("?", ""),
            )
    }

    private fun registerEnum(
        containingRegisteredClass: RegisteredClass,
        registeredProperty: RegisteredProperty,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder,
        classRegistrarBuilder: TypeSpec.Builder
    ) {
        val defaultValueProvider = generateAndProvideDefaultValueProvider(
            containingRegisteredClass = containingRegisteredClass,
            registeredProperty = registeredProperty,
            classRegistrarBuilder = classRegistrarBuilder
        )

        registerClassControlFlow
            .addStatement(
                "enumProperty(%L,·$defaultValueProvider,·%L,·%T.id.toInt(),·%S)",
                getPropertyReference(registeredProperty, className),
                shouldBeVisibleInEditor(registeredProperty),
                getRpcModeEnum(registeredProperty),
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

    private fun getRpcModeEnum(registeredProperty: RegisteredProperty): ClassName {
        return when (registeredProperty.annotations.getAnnotationUnsafe<RegisterPropertyAnnotation>().rpcMode) {
            RpcMode.DISABLED -> ClassName("godot.MultiplayerAPI.RPCMode", "DISABLED")
            RpcMode.REMOTE -> ClassName("godot.MultiplayerAPI.RPCMode", "REMOTE")
            RpcMode.MASTER -> ClassName("godot.MultiplayerAPI.RPCMode", "MASTER")
            RpcMode.PUPPET -> ClassName("godot.MultiplayerAPI.RPCMode", "PUPPET")
            RpcMode.SLAVE -> ClassName("godot.MultiplayerAPI.RPCMode", "SLAVE")
            RpcMode.REMOTE_SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "REMOTESYNC")
            RpcMode.SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "SYNC")
            RpcMode.MASTER_SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "MASTERSYNC")
            RpcMode.PUPPET_SYNC -> ClassName("godot.MultiplayerAPI.RPCMode", "PUPPETSYNC")
        }
    }

    private fun generateAndProvideDefaultValueProvider(
        containingRegisteredClass: RegisteredClass,
        registeredProperty: RegisteredProperty,
        classRegistrarBuilder: TypeSpec.Builder
    ): String {
        return if (shouldBeVisibleInEditor(registeredProperty) && !registeredProperty.isLateinit) {
            generateDefaultValueProvider(containingRegisteredClass, registeredProperty, classRegistrarBuilder)
            "${registeredProperty.name}DefaultValueProvider"
        } else {
            "{·null·}"
        }
    }

    private fun generateDefaultValueProvider(
        containingRegisteredClass: RegisteredClass,
        registeredProperty: RegisteredProperty,
        classRegistrarBuilder: TypeSpec.Builder
    ) {
        val (defaultValueStringTemplate, defaultValueStringTemplateValues) = requireNotNull(registeredProperty.defaultValueTemplateAndArgs()) //Fixme

        val returnTypePackagePath = registeredProperty.type.fqName.substringBeforeLast(".")
        val returnTypeSimpleName = registeredProperty.type.fqName.substringAfterLast(".")
        val tmpClassName = ClassName(returnTypePackagePath, returnTypeSimpleName)
        var returnTypeClassName: TypeName = tmpClassName

        if (registeredProperty.type.arguments().isNotEmpty()) {
            returnTypeClassName = tmpClassName.parameterizedBy(
                registeredProperty
                    .type
                    .arguments()
                    .map { typeProjection ->
                        val fqName = typeProjection.fqName
                        val isNullable = typeProjection.isNullable
                        ClassName(fqName.substringBeforeLast("."), fqName.substringAfterLast("."))
                            .copy(nullable = isNullable)
                    }
            )
        }

        val defaultValuePropertySpec = PropertySpec
            .builder(
                "${registeredProperty.name}DefaultValueProvider",
                LambdaTypeName.get(returnType = returnTypeClassName.copy(nullable = defaultValueStringTemplateValues.all { it is String && it == "null" }))
            )
            .addModifiers(KModifier.OPEN)
            .initializer("{·${defaultValueStringTemplate.replace(" ", "·")}·}", *defaultValueStringTemplateValues)

        val overridesPropertyFromInterface = containingRegisteredClass
            .supertypes
            .filter { clazz -> clazz.isInterface }
            .flatMap { clazz -> clazz.properties }
            .any { propertyInInterface -> propertyInInterface.name == registeredProperty.name }

        // issue: https://github.com/utopia-rise/godot-kotlin-jvm/issues/371
        // we don't override default value providers of properties from interfaces as interfaces don't get a ClassRegistrar
        // hence we don't have anything to override in the first place
        if (registeredProperty.isOverridee && !overridesPropertyFromInterface) {
            defaultValuePropertySpec.addModifiers(KModifier.OVERRIDE)
        }

        classRegistrarBuilder.addProperty(defaultValuePropertySpec.build())
    }
}

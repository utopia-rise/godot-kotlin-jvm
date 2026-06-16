package godot.registrar.generator.generator.hintstring

import godot.core.PropertyHint as GodotPropertyHint
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.baseGodotType
import godot.registrar.generator.ext.getAsVariantTypeOrdinal
import godot.registrar.generator.ext.getGodotCoreTypeName
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.ext.isCompatibleList
import godot.registrar.generator.ext.isDictionary
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isCoreType
import godot.registration.model.ext.isGodotPrimitive
import godot.registration.model.ext.isNodeType
import godot.registration.model.ext.isRefCounted
import godot.registration.model.hint.property.*
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.Type


object PropertyHintStringGeneratorProvider {

    fun provide(
        registeredProperty: RegisteredProperty,
        context: GeneratorContext,
    ): PropertyHintStringGenerator<out PropertyHint> {
        val hintAnnotation = registeredProperty
            .hints
            .firstOrNull()

        return when (hintAnnotation) {
            is ColorNoAlphaHint -> ColorNoAlphaHintStringGenerator(registeredProperty, context)

            is DirHint -> DirHintStringGenerator(registeredProperty, context)
            is EnumFlagHintStringHint, is EnumHintStringHint -> EnumHintStringGenerator(registeredProperty, context)

            is EnumListHintStringHint -> arrayPropertyGenerator(registeredProperty, context)

            is ExpEasingHint -> ExpEasingHintStringGenerator(registeredProperty, context)
            is FileHint -> FileHintStringGenerator(registeredProperty, context)
            is IntFlagHint -> IntFlagHintStringGenerator(registeredProperty, context)
            is MultilineTextHint -> MultilineTextHintStringGenerator(registeredProperty, context)

            is PlaceHolderTextHint -> PlaceHolderTextHintStringGenerator(registeredProperty, context)

            is RangeHint<*> -> RangeHintStringGenerator(registeredProperty, context)
            null -> when {
                registeredProperty.type.isNodeType() -> NodeTypeHintStringGenerator(registeredProperty, context)

                registeredProperty.type.isRefCounted() -> ResourceHintStringGenerator(registeredProperty, context)

                registeredProperty.type.isCompatibleList() -> arrayPropertyGenerator(registeredProperty, context)

                registeredProperty.type.isDictionary() -> dictionaryPropertyGenerator(registeredProperty, context)

                else -> object :
                    PropertyHintStringGenerator<godot.registration.model.hint.property.PropertyHint>(registeredProperty, context) {
                    override fun getHintString(): String {
                        return ""
                    }
                }
            }
        }
    }

    internal fun provide(
        type: Type,
        context: GeneratorContext,
    ): HintStringGenerator = when {
        type.isCompatibleList() -> ArrayHintStringGenerator(
            elementGenerator = type.genericArguments.firstOrNull()?.let { child ->
                provide(child, context)
            },
        )

        type.isDictionary() -> DictionaryHintStringGenerator(
            keyGenerator = type.genericArguments.getOrNull(0)?.let { child ->
                provide(child, context)
            },
            valueGenerator = type.genericArguments.getOrNull(1)?.let { child ->
                provide(child, context)
            },
        )

        type.isGodotPrimitive() || type.isCoreType() -> PrimitiveHintStringGenerator(
            "${type.getAsVariantTypeOrdinal()}:${type.getGodotCoreTypeName()}",
        )

        type.isNodeType() -> ObjectHintStringGenerator(toObjectHintString(type, context, GodotPropertyHint.NODE_TYPE))
        type.isRefCounted() -> ObjectHintStringGenerator(toObjectHintString(type, context, GodotPropertyHint.RESOURCE_TYPE))
        else -> EmptyHintStringGenerator()
    }

    private fun arrayPropertyGenerator(
        registeredProperty: RegisteredProperty,
        context: GeneratorContext,
    ): PropertyHintStringGenerator<out PropertyHint> = object :
        PropertyHintStringGenerator<godot.registration.model.hint.property.PropertyHint>(registeredProperty, context) {
        override fun getHintString(): String {
            return ArrayHintStringGenerator(
                registeredProperty = registeredProperty,
                elementGenerator = registeredProperty.type.genericArguments.firstOrNull()?.let { argument ->
                    provide(argument, context)
                },
            ).generate()
        }
    }

    private fun dictionaryPropertyGenerator(
        registeredProperty: RegisteredProperty,
        context: GeneratorContext,
    ): PropertyHintStringGenerator<out PropertyHint> = object :
        PropertyHintStringGenerator<godot.registration.model.hint.property.PropertyHint>(registeredProperty, context) {
        override fun getHintString(): String {
            return DictionaryHintStringGenerator(
                registeredProperty = registeredProperty,
                keyGenerator = registeredProperty.type.genericArguments.getOrNull(0)?.let { argument ->
                    provide(argument, context)
                },
                valueGenerator = registeredProperty.type.genericArguments.getOrNull(1)?.let { argument ->
                    provide(argument, context)
                },
            ).generate()
        }
    }

    private fun toObjectHintString(
        type: Type,
        context: GeneratorContext,
        propertyHint: GodotPropertyHint,
    ): String {
        val className =
            (type as? ScriptClass)
                ?.takeIf { scriptClass -> scriptClass.isRegistered }
                ?.getRegisteredName(context.settings)
                ?: context.registeredClassesByFqName[type.fqName]?.getRegisteredName(context.settings)
                ?: type.baseGodotType()?.fqName?.substringAfterLast(".")

        val subTypeString = if (className != null) {
            "/${propertyHint.value}:$className"
        } else {
            ""
        }

        return "${godot.core.VariantParser.OBJECT.id}$subTypeString"
    }
}

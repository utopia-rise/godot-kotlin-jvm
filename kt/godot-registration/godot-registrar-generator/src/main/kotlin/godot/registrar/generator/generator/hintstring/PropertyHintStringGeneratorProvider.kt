package godot.registrar.generator.generator.hintstring

import godot.registrar.generator.RegistrarGenerator
import godot.registrar.generator.ext.isCompatibleList
import godot.registrar.generator.ext.isDictionary
import godot.registrar.generator.settings.Settings
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isNodeType
import godot.registration.model.ext.isRefCounted
import godot.registration.model.hint.property.*
import godot.registration.model.types.ScriptClass


object PropertyHintStringGeneratorProvider {

    fun provide(
        registeredProperty: RegisteredProperty,
        settings: Settings,
        registeredClassesByFqName: Map<String, ScriptClass>,
    ): PropertyHintStringGenerator<out PropertyHint> {
        val hintAnnotations = registeredProperty
            .hints
            .filterIsInstance<PropertyHint>()
            .distinctBy { it::class } // GH-731: when hint annotations are declared higher up in the hierarchy, we can get the same hint annotation multiple times. But we're only interested in one type of hint annotation for this check

        if (hintAnnotations.size > 1) {
            RegistrarGenerator.logger.error(
                "RegisteredProperty has more than one Hint annotation: ${hintAnnotations.joinToString()}",
                registeredProperty
            )
        }

        return when (hintAnnotations.firstOrNull()) {
            is ColorNoAlphaHint -> ColorNoAlphaHintStringGenerator(
                registeredProperty,
                settings,
                registeredClassesByFqName
            )

            is DirHint -> DirHintStringGenerator(registeredProperty, settings, registeredClassesByFqName)
            is EnumFlagHintStringHint,
            is EnumHintStringHint -> EnumHintStringGenerator(registeredProperty, settings, registeredClassesByFqName)

            is EnumListHintStringHint -> ArrayAndDictionaryHintStringGenerator(
                registeredProperty,
                settings,
                registeredClassesByFqName
            )

            is ExpEasingHint -> ExpEasingHintStringGenerator(registeredProperty, settings, registeredClassesByFqName)
            is FileHint -> FileHintStringGenerator(registeredProperty, settings, registeredClassesByFqName)
            is IntFlagHint -> IntFlagHintStringGenerator(registeredProperty, settings, registeredClassesByFqName)
            is MultilineTextHint -> MultilineTextHintStringGenerator(
                registeredProperty,
                settings,
                registeredClassesByFqName
            )

            is PlaceHolderTextHint -> PlaceHolderTextHintStringGenerator(
                registeredProperty,
                settings,
                registeredClassesByFqName
            )

            is RangeHint<*> -> RangeHintStringGenerator(registeredProperty, settings, registeredClassesByFqName)
            null -> when {
                registeredProperty.type.isNodeType() -> NodeTypeHintStringGenerator(
                    registeredProperty,
                    settings,
                    registeredClassesByFqName
                )

                registeredProperty.type.isRefCounted() -> ResourceHintStringGenerator(
                    registeredProperty,
                    settings,
                    registeredClassesByFqName
                )

                registeredProperty.type.isCompatibleList() -> ArrayAndDictionaryHintStringGenerator(
                    registeredProperty,
                    settings,
                    registeredClassesByFqName
                )

                registeredProperty.type.isDictionary() -> ArrayAndDictionaryHintStringGenerator(
                    registeredProperty,
                    settings,
                    registeredClassesByFqName
                )

                else -> object :
                    PropertyHintStringGenerator<PropertyHint>(registeredProperty, settings, registeredClassesByFqName) {
                    override fun getHintString(): String {
                        return ""
                    }
                }
            }
        }
    }
}

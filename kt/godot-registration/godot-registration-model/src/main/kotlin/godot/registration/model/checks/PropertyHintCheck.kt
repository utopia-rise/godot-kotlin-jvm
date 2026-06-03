package godot.registration.model.checks

import godot.core.Color
import godot.core.Dictionary
import godot.core.VariantArray
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isJavaCollection
import godot.registration.model.ext.isKotlinCollection
import godot.registration.model.hint.property.*
import godot.registration.model.logging.Logger
import godot.registration.model.types.ScriptClass
import godot.registration.model.types.TypeKind

class PropertyHintCheck(logger: Logger, registeredClasses: List<ScriptClass>) : BaseCheck(logger, registeredClasses) {
    override fun execute(): Boolean {
        var hasIssue = false

        registeredClasses
            .flatMap { it.properties }
            .forEach { registeredProperty ->
                registeredProperty.hints
                    .filterIsInstance<PropertyHint>()
                    .distinctBy { it::class }
                    .forEach { hint ->
                        if (!hint.isApplicableTo(registeredProperty)) {
                            hasIssue = true
                            logger.error(
                                "Property hint @${hint.displayName()} cannot be applied to property type ${registeredProperty.type.fqName}",
                                registeredProperty
                            )
                        }
                    }
            }

        return hasIssue
    }

    private fun PropertyHint.isApplicableTo(registeredProperty: RegisteredProperty): Boolean {
        val propertyType = registeredProperty.type

        return when (this) {
            is RangeHint<*> -> propertyType.fqName in numericTypes
            is ExpEasingHint -> propertyType.fqName in fractionalTypes
            is FileHint, is DirHint, is MultilineTextHint, is PlaceHolderTextHint -> propertyType.fqName == stringType
            is IntFlagHint -> propertyType.fqName == intType
            is ColorNoAlphaHint -> propertyType.fqName == colorType
            is EnumHintStringHint -> propertyType.kind == TypeKind.ENUM
            is EnumFlagHintStringHint -> propertyType.kind == TypeKind.BITFIELD
            is EnumListHintStringHint -> propertyType.supportsEnumListHint()
        }
    }

    private fun godot.registration.model.types.Type.supportsEnumListHint(): Boolean =
        isKotlinCollection() ||
            isJavaCollection() ||
            fqName == requireNotNull(VariantArray::class.qualifiedName) ||
            fqName == requireNotNull(Dictionary::class.qualifiedName)

    private fun PropertyHint.displayName(): String =
        this::class.qualifiedName
            ?.substringAfterLast(".")
            ?.removeSuffix("Hint")
            ?: "Unknown"

    companion object {
        private val stringType = requireNotNull(String::class.qualifiedName)
        private val intType = requireNotNull(Int::class.qualifiedName)
        private val colorType = requireNotNull(Color::class.qualifiedName)
        private val numericTypes = setOf(
            requireNotNull(Int::class.qualifiedName),
            requireNotNull(Long::class.qualifiedName),
            requireNotNull(Float::class.qualifiedName),
            requireNotNull(Double::class.qualifiedName),
        )
        private val fractionalTypes = setOf(
            requireNotNull(Float::class.qualifiedName),
            requireNotNull(Double::class.qualifiedName),
        )
    }
}

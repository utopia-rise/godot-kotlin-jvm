package godot.entrygenerator.generator.property.typehint

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.EntryGenerationType
import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.extension.isCoreType
import godot.entrygenerator.extension.isReference
import godot.entrygenerator.generator.property.typehint.array.ArrayTypeHintGeneratorProvider
import godot.entrygenerator.generator.property.typehint.coretypes.CoreTypeTypeHintGeneratorProvider
import godot.entrygenerator.generator.property.typehint.primitives.PrimitivesTypeHintGeneratorProvider
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.types.typeUtil.isEnum

object PropertyTypeHintProvider {

    fun provide(
        propertyDescriptor: PropertyDescriptor,
        entryGenerationType: EntryGenerationType
    ): ClassName {
        return when {
            KotlinBuiltIns.isInt(propertyDescriptor.type) ->
                if (propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.IntFlag"))) {
                    when (entryGenerationType) {
                        EntryGenerationType.KOTLIN_NATIVE -> ClassName("godot.gdnative.godot_property_hint", "GODOT_PROPERTY_HINT_FLAGS")
                        EntryGenerationType.JVM -> ClassName("godot.core.PropertyHint", "FLAGS")
                    }
                } else {
                    PrimitivesTypeHintGeneratorProvider.provide(entryGenerationType, propertyDescriptor).getPropertyTypeHint()
                }

            KotlinBuiltIns.isString(propertyDescriptor.type) ->
                when {
                    propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.MultilineText")) -> {
                        when (entryGenerationType) {
                            EntryGenerationType.KOTLIN_NATIVE -> ClassName(
                                "godot.gdnative.godot_property_hint",
                                "GODOT_PROPERTY_HINT_MULTILINE_TEXT"
                            )
                            EntryGenerationType.JVM -> ClassName(
                                "godot.core.PropertyHint",
                                "MULTILINE_TEXT"
                            )
                        }
                    }
                    propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.PlaceHolderText")) -> {
                        when (entryGenerationType) {
                            EntryGenerationType.KOTLIN_NATIVE -> ClassName(
                                "godot.gdnative.godot_property_hint",
                                "GODOT_PROPERTY_HINT_PLACEHOLDER_TEXT"
                            )
                            EntryGenerationType.JVM -> ClassName(
                                "godot.core.PropertyHint",
                                "PLACEHOLDER_TEXT"
                            )
                        }
                    }
                    else -> {
                        PrimitivesTypeHintGeneratorProvider.provide(entryGenerationType, propertyDescriptor).getPropertyTypeHint()
                    }
                }

            KotlinBuiltIns.isLong(propertyDescriptor.type)
                || KotlinBuiltIns.isFloat(propertyDescriptor.type)
                || KotlinBuiltIns.isDouble(propertyDescriptor.type)
                || KotlinBuiltIns.isBoolean(propertyDescriptor.type) -> PrimitivesTypeHintGeneratorProvider.provide(entryGenerationType, propertyDescriptor).getPropertyTypeHint()

            propertyDescriptor.type.isEnum() -> throw UnsupportedOperationException("Hint type for enum is always the same, so it is handled by binding at runtime")

            propertyDescriptor.type.isCoreType() && !propertyDescriptor.type.isCompatibleList() -> CoreTypeTypeHintGeneratorProvider
                .provide(entryGenerationType, propertyDescriptor)
                .getPropertyTypeHint()

            propertyDescriptor.type.isReference(entryGenerationType) -> when(entryGenerationType) {
                EntryGenerationType.KOTLIN_NATIVE -> ClassName(
                    "godot.gdnative.godot_property_hint",
                    "GODOT_PROPERTY_HINT_RESOURCE_TYPE"
                )
                EntryGenerationType.JVM -> ClassName(
                    "godot.core.PropertyHint",
                    "RESOURCE_TYPE"
                )
            }
            propertyDescriptor.type.isCompatibleList() -> ArrayTypeHintGeneratorProvider.provide(entryGenerationType, propertyDescriptor).getPropertyTypeHint()
            propertyDescriptor.type.getJetTypeFqName(false).matches(Regex("^kotlin\\.collections\\..*Set\$")) -> when(entryGenerationType) {
                EntryGenerationType.KOTLIN_NATIVE -> ClassName(
                    "godot.gdnative.godot_property_hint",
                    "GODOT_PROPERTY_HINT_RESOURCE_TYPE"
                )
                EntryGenerationType.JVM -> ClassName(
                    "godot.core.PropertyHint",
                    "RESOURCE_TYPE"
                )
            }
            else -> ClassName("godot.core.PropertyHint", "NONE")
        }
    }
}

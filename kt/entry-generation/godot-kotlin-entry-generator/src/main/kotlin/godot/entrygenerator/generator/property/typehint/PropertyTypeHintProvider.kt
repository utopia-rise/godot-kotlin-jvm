package godot.entrygenerator.generator.property.typehint

import com.squareup.kotlinpoet.ClassName
import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.extension.isCoreType
import godot.entrygenerator.extension.isReference
import godot.entrygenerator.generator.property.typehint.array.JvmArrayTypeHintGenerator
import godot.entrygenerator.generator.property.typehint.coretypes.JvmCoreTypeTypeHintGenerator
import godot.entrygenerator.generator.property.typehint.primitives.JvmPrimitivesTypeHintGenerator
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.types.typeUtil.isEnum

object PropertyTypeHintProvider {

    fun provide(
        propertyDescriptor: PropertyDescriptor
    ): ClassName {
        return when {
            KotlinBuiltIns.isInt(propertyDescriptor.type) ->
                if (propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.IntFlag"))) {
                    ClassName("godot.core.PropertyHint", "FLAGS")
                } else {
                    JvmPrimitivesTypeHintGenerator(propertyDescriptor).getPropertyTypeHint()
                }

            KotlinBuiltIns.isString(propertyDescriptor.type) ->
                when {
                    propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.MultilineText")) -> {
                        ClassName(
                            "godot.core.PropertyHint",
                            "MULTILINE_TEXT"
                        )
                    }
                    propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.PlaceHolderText")) -> {
                        ClassName(
                            "godot.core.PropertyHint",
                            "PLACEHOLDER_TEXT"
                        )
                    }
                    else -> {
                        JvmPrimitivesTypeHintGenerator(propertyDescriptor).getPropertyTypeHint()
                    }
                }

            KotlinBuiltIns.isLong(propertyDescriptor.type)
                || KotlinBuiltIns.isFloat(propertyDescriptor.type)
                || KotlinBuiltIns.isDouble(propertyDescriptor.type)
                || KotlinBuiltIns.isBoolean(propertyDescriptor.type) -> JvmPrimitivesTypeHintGenerator(
                propertyDescriptor
            ).getPropertyTypeHint()

            propertyDescriptor.type.isEnum() -> throw UnsupportedOperationException("Hint type for enum is always the same, so it is handled by binding at runtime")

            propertyDescriptor.type.isCoreType() && !propertyDescriptor.type.isCompatibleList() -> JvmCoreTypeTypeHintGenerator(
                propertyDescriptor
            )
                .getPropertyTypeHint()

            propertyDescriptor.type.isReference() -> ClassName(
                "godot.core.PropertyHint",
                "RESOURCE_TYPE"
            )
            propertyDescriptor.type.isCompatibleList() -> JvmArrayTypeHintGenerator(propertyDescriptor).getPropertyTypeHint()
            propertyDescriptor.type.getJetTypeFqName(false)
                .matches(Regex("^kotlin\\.collections\\..*Set\$")) -> ClassName(
                "godot.core.PropertyHint",
                "RESOURCE_TYPE"
            )

            else -> ClassName("godot.core.PropertyHint", "NONE")
        }
    }
}

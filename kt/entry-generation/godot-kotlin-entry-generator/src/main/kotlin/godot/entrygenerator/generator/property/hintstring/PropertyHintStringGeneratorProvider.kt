package godot.entrygenerator.generator.property.hintstring

import godot.entrygenerator.extension.isCompatibleList
import godot.entrygenerator.extension.isCoreType
import godot.entrygenerator.extension.isReference
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.typeUtil.isEnum

object PropertyHintStringGeneratorProvider {

    fun provide(
        propertyDescriptor: PropertyDescriptor,
        bindingContext: BindingContext
    ): PropertyHintStringGenerator {
        return when {
            KotlinBuiltIns.isInt(propertyDescriptor.type) ->
                if (propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.IntFlag"))) {
                    IntFlagHintStringGenerator(
                        propertyDescriptor,
                        bindingContext
                    )
                } else {
                    PrimitivesHintStringGenerator(
                        propertyDescriptor,
                        bindingContext
                    )
                }

            KotlinBuiltIns.isString(propertyDescriptor.type) ->
                when {
                    propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.MultilineText")) -> {
                        MultilineTextHintStringGenerator(
                            propertyDescriptor,
                            bindingContext
                        )
                    }
                    propertyDescriptor.annotations.hasAnnotation(FqName("godot.annotation.PlaceHolderText")) -> {
                        PlaceHolderTextHintStringGenerator(
                            propertyDescriptor,
                            bindingContext
                        )
                    }
                    else -> {
                        PrimitivesHintStringGenerator(
                            propertyDescriptor,
                            bindingContext
                        )
                    }
                }

            KotlinBuiltIns.isLong(propertyDescriptor.type)
                || KotlinBuiltIns.isFloat(propertyDescriptor.type)
                || KotlinBuiltIns.isDouble(propertyDescriptor.type)
                || KotlinBuiltIns.isBoolean(propertyDescriptor.type) -> PrimitivesHintStringGenerator(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isEnum() -> EnumHintStringGenerator(propertyDescriptor, bindingContext)
            propertyDescriptor.type.isCoreType() && !propertyDescriptor.type.isCompatibleList() -> CoreTypeHintStringGenerator(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isReference() -> ResourceHintStringGenerator(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.isCompatibleList() -> ArrayHintStringGenerator(
                propertyDescriptor,
                bindingContext
            )
            propertyDescriptor.type.getJetTypeFqName(false)
                .matches(Regex("^kotlin\\.collections\\..*Set\$")) -> EnumHintStringGenerator(
                propertyDescriptor,
                bindingContext
            )
            else -> object : PropertyHintStringGenerator(propertyDescriptor, bindingContext) {
                override fun getHintString(): String {
                    return ""
                }
            }
        }
    }
}

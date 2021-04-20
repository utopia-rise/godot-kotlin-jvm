package godot.entrygenerator.generator.property.hintstring

import godot.entrygenerator.extension.*
import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.types.KotlinType
import org.jetbrains.kotlin.types.typeUtil.isEnum

class ArrayHintStringGenerator(
    propertyDescriptor: PropertyDescriptor,
    bindingContext: BindingContext
) : PropertyHintStringGenerator(propertyDescriptor, bindingContext) {


    /**
     * Hint string array formatting: https://github.com/godotengine/godot/blob/00949f0c5fcc6a4f8382a4a97d5591fd9ec380f8/editor/editor_properties_array_dict.cpp
     */
    override fun getHintString(): String {
        // at this point we know type is a VariantArray
        val type = propertyDescriptor.type

        val elementType = type.arguments.firstOrNull()?.type

        return when {
            elementType != null && KotlinBuiltIns.isAny(elementType) -> ""
            elementType != null && elementType.isEnum() -> {
                // return value is not used, hint is computed at runtime
                ""
            }
            else -> {
                buildString {
                    var currentElementType: KotlinType? = elementType

                    if (currentElementType == null) {
                        val compatibleListType = type.getCompatibleListType()
                        if (compatibleListType.isNotEmpty()) {
                            append(":${compatibleListType}")
                        }
                    }

                    loop@ while (currentElementType != null) {
                        when {
                            currentElementType.isCompatibleList() -> {
                                append(":19") //variant.type.array.ordinal
                                currentElementType = currentElementType.arguments.firstOrNull()?.type
                            }
                            currentElementType
                                .getJetTypeFqName(false)
                                .isGodotPrimitive() || currentElementType.isCoreType() -> {
                                append(":${currentElementType.getJetTypeFqName(false).getAsVariantTypeOrdinal()}")
                                break@loop
                            }
                            else -> {
                                clear()
                                break@loop
                            }
                        }
                    }
                    delete(0, 1)
                }
            }
        }
    }
}

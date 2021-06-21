package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.ext.getAsVariantTypeOrdinal
import godot.entrygenerator.ext.getCompatibleListType
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind

class ArrayHintStringGenerator(
    registeredProperty: RegisteredProperty
) : PropertyHintStringGenerator(registeredProperty) {


    /**
     * Hint string array formatting: https://github.com/godotengine/godot/blob/00949f0c5fcc6a4f8382a4a97d5591fd9ec380f8/editor/editor_properties_array_dict.cpp
     */
    override fun getHintString(): String {
        val elementType = registeredProperty.type.arguments().firstOrNull()

        return when {
            elementType != null && elementType.fqName == "kotlin.Any" -> ""
            elementType != null && elementType.kind == TypeKind.ENUM_CLASS -> {
                // return value is not used, hint is computed at runtime
                ""
            }
            else -> {
                buildString {
                    var currentElementType: Type? = elementType

                    if (currentElementType == null) {
                        val compatibleListType = registeredProperty.type.getCompatibleListType()
                        if (compatibleListType.isNotEmpty()) {
                            append(":${compatibleListType}")
                        }
                    }

                    loop@ while (currentElementType != null) {
                        when {
                            currentElementType.isCompatibleList() -> {
                                append(":19") //variant.type.array.ordinal
                                currentElementType = currentElementType.arguments().firstOrNull()
                            }
                            currentElementType.isGodotPrimitive() || currentElementType.isCoreType() -> {
                                append(":${currentElementType.getAsVariantTypeOrdinal()}")
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

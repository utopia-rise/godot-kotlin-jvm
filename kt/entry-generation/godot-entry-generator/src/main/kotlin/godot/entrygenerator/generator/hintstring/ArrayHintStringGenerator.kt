package godot.entrygenerator.generator.hintstring

import godot.entrygenerator.ext.baseGodotType
import godot.entrygenerator.ext.getAsGodotClassName
import godot.entrygenerator.ext.getAsVariantTypeOrdinal
import godot.entrygenerator.ext.getCompatibleListType
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.ext.isNodeType
import godot.entrygenerator.ext.isResource
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind

class ArrayHintStringGenerator(
    registeredProperty: RegisteredProperty,
) : PropertyHintStringGenerator<EnumAnnotation>(registeredProperty) {


    /**
     * Hint string array formatting: https://github.com/godotengine/godot/blob/00949f0c5fcc6a4f8382a4a97d5591fd9ec380f8/editor/editor_properties_array_dict.cpp
     */
    override fun getHintString(): String {
        val elementType = registeredProperty.type.arguments().firstOrNull()

        return when {
            elementType != null && elementType.fqName == Any::class.qualifiedName -> ""
            elementType != null && elementType.kind == TypeKind.ENUM_CLASS -> {
                propertyHintAnnotation?.enumValueNames?.joinToString(",")?.let { enumValuesHintString ->
                    ":2/2:$enumValuesHintString" //2 = VariantType.LONG.ordinal | 3 = PropertyHint.ENUM.ordinal
                } ?: ""
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

                    // subType/subTypeHint:nextSubtype ... etc.
                    // "2:int"
                    // "24/34:Button"
                    // "24/17:Texture"
                    loop@ while (currentElementType != null) {
                        when {
                            currentElementType.isCompatibleList() -> {
                                append("28") // Variant::ARRAY
                                currentElementType = currentElementType.arguments().firstOrNull()
                            }

                            currentElementType.isGodotPrimitive() || currentElementType.isCoreType() -> {
                                append("${currentElementType.getAsVariantTypeOrdinal()}:${currentElementType.getAsGodotClassName()}")
                                break@loop
                            }

                            currentElementType.isNodeType() || currentElementType.isResource() -> {
                                val objectVariantType = "24" // Variant::OBJECT

                                val propertyType = when {
                                    currentElementType.isNodeType() -> "34" // PropertyHint::PROPERTY_HINT_NODE_TYPE
                                    currentElementType.isResource() -> "17" // PropertyHint::PROPERTY_HINT_RESOURCE_TYPE
                                    else -> ""
                                }
                                val className = currentElementType.registeredName()
                                    ?: currentElementType.baseGodotType()?.fqName?.substringAfterLast(".")

                                val subTypeString = if (className != null) {
                                    "/$propertyType:$className"
                                } else {
                                    ""
                                }

                                append("$objectVariantType$subTypeString")
                                break@loop
                            }

                            else -> {
                                clear()
                                break@loop
                            }
                        }
                    }
                }
            }
        }
    }
}

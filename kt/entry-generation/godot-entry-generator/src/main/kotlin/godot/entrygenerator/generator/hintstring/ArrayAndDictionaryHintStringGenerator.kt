package godot.entrygenerator.generator.hintstring

import godot.core.PropertyHint
import godot.core.VariantParser
import godot.entrygenerator.ext.baseGodotType
import godot.entrygenerator.ext.getAsVariantTypeOrdinal
import godot.entrygenerator.ext.getGodotCoreTypeName
import godot.entrygenerator.ext.isCompatibleList
import godot.entrygenerator.ext.isCoreType
import godot.entrygenerator.ext.isDictionary
import godot.entrygenerator.ext.isGodotPrimitive
import godot.entrygenerator.ext.isNodeType
import godot.entrygenerator.ext.isResource
import godot.entrygenerator.model.EnumAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.RegisteredProperty
import godot.entrygenerator.model.Type
import godot.entrygenerator.model.TypeKind
import godot.entrygenerator.settings.Settings

class ArrayAndDictionaryHintStringGenerator(
    registeredProperty: RegisteredProperty,
    settings: Settings,
    registeredClassesByFqName: Map<String, RegisteredClass>,
) : PropertyHintStringGenerator<EnumAnnotation>(registeredProperty, settings, registeredClassesByFqName) {


    /**
     * Hint string array formatting: https://github.com/godotengine/godot/blob/30b0aadab65fcafb9a160dba2c9abfd005bb62a5/editor/editor_properties_array_dict.cpp#L1085
     */
    override fun getHintString(): String {
        val elementType = registeredProperty.type.arguments.firstOrNull()

        return when {
            // if type is any -> no hint string necessary. it will be untyped
            elementType != null && elementType.fqName == Any::class.qualifiedName -> ""
            elementType != null && elementType.kind == TypeKind.ENUM_CLASS -> {
                // example: 1/1:ENUM_1,ENUM_2,ENUM_3
                propertyHintAnnotation?.enumValueNames?.joinToString(",")?.let { enumValuesHintString ->
                    "${VariantParser.LONG.id}/${VariantParser.LONG.id}:$enumValuesHintString"
                } ?: ""
            }

            else -> {
                // array or dictionary
                // structure of hint string:
                //      array: type/optionalSubtype:godotClassName -> 24/34:Button
                //      dict:  type/optionalSubtype:godotClassName;type/optionalSubtype:godotClassName -> 2:int;24/34:Button
                //          -> dict key value types are separated by ;
                buildString {
                    if (elementType == null) {
                        val compatibleListType = registeredProperty.type.getAsVariantTypeOrdinal()
                        if (compatibleListType != null) {
                            append(":${compatibleListType}")
                        }
                    }

                    append(
                        registeredProperty
                            .type
                            .arguments
                            .joinToString(";") { argument ->
                                argument.generateHintString()
                            }
                    )
                }
            }
        }
    }

    private fun Type.generateHintString(): String {
        return buildString {
            var currentElementType: Type? = this@generateHintString

            // subType/subTypeHint:nextSubtype ... etc.
            // "2:int"
            // "24/34:Button"
            // "24/17:Texture"
            // example: VariantArray<Int>() -> 2:int
            //      -> 2 == int -> variant type ordinal
            // example: Dictionary<Int, Button>() -> 2:int;24/34:Button
            //      -> 24 == Object -> variant type ordinal -> VariantParser.OBJECT.id
            //      -> 34 == Button -> node type property hint ordinal -> PropertyHint.NODE_TYPE.value
            loop@ while (currentElementType != null) {
                when {
                    currentElementType.isCompatibleList() -> {
                        append(VariantParser.ARRAY.id)
                        currentElementType = currentElementType.arguments.firstOrNull()
                    }

                    currentElementType.isDictionary() -> {
                        append(VariantParser.DICTIONARY.id)
                        val subHintString = currentElementType.arguments.joinToString(";") { argument ->
                            argument.generateHintString()
                        }
                        if (subHintString.isNotEmpty()) {
                            append("/$subHintString")
                        }
                    }

                    currentElementType.isGodotPrimitive() || currentElementType.isCoreType() -> {
                        append("${currentElementType.getAsVariantTypeOrdinal()}:${currentElementType.getGodotCoreTypeName()}")
                        break@loop
                    }

                    currentElementType.isNodeType() -> {
                        val objectVariantType = VariantParser.OBJECT.id

                        val className = registeredClassesByFqName[currentElementType.fqName]?.getRegisteredName(settings)
                            ?: currentElementType.baseGodotType()?.fqName?.substringAfterLast(".")

                        val subTypeString = if (className != null) {
                            "/${PropertyHint.NODE_TYPE.value}:$className"
                        } else {
                            ""
                        }

                        append("$objectVariantType$subTypeString")
                        break@loop
                    }

                    currentElementType.isResource() -> {
                        val objectVariantType = VariantParser.OBJECT.id

                        val className = registeredClassesByFqName[currentElementType.fqName]?.getRegisteredName(settings)
                            ?: currentElementType.baseGodotType()?.fqName?.substringAfterLast(".")

                        val subTypeString = if (className != null) {
                            "/${PropertyHint.RESOURCE_TYPE.value}:$className"
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

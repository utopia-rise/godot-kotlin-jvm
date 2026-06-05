package godot.registrar.generator.generator.hintstring

import godot.core.PropertyHint
import godot.core.VariantParser
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.baseGodotType
import godot.registrar.generator.ext.getAsVariantTypeOrdinal
import godot.registrar.generator.ext.getGodotCoreTypeName
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.ext.isCompatibleList
import godot.registrar.generator.ext.isDictionary
import godot.registrar.generator.ext.isResource
import godot.registration.model.RegisteredProperty
import godot.registration.model.ext.isCoreType
import godot.registration.model.ext.isGodotPrimitive
import godot.registration.model.ext.isNodeType
import godot.registration.model.hint.property.EnumHint
import godot.registration.model.types.Type

class ArrayAndDictionaryHintStringGenerator(
    registeredProperty: RegisteredProperty,
    context: GeneratorContext,
) : PropertyHintStringGenerator<EnumHint>(registeredProperty, context) {


    /**
     * Hint string array formatting: https://github.com/godotengine/godot/blob/30b0aadab65fcafb9a160dba2c9abfd005bb62a5/editor/editor_properties_array_dict.cpp#L1085
     */
    override fun getHintString(): String {
        // A collection of enums carries its element names/values in the hint itself. We use them directly
        // because interface-typed collections (e.g. List) drop their generic argument in the model.
        // example: 2/2:ENUM_1,ENUM_2 (or 2/2:A:2,B:8 for a GodotEnum with explicit values)
        propertyHintAnnotation?.enumValues?.takeIf { it.isNotEmpty() }?.let { enumValues ->
            return "${VariantParser.LONG.id}/${VariantParser.LONG.id}:${enumValues.toGodotHintString()}"
        }

        val elementType = registeredProperty.type.genericArguments.firstOrNull()

        return when {
            // if type is any -> no hint string necessary. it will be untyped
            elementType != null && elementType.fqName == Any::class.qualifiedName -> ""

            else -> {
                // array or dictionary
                // structure of hint string:
                //      array: type/optionalSubtype:godotClassName -> 24/34:Button
                //      dict:  type/optionalSubtype:godotClassName;type/optionalSubtype:godotClassName -> 2:int;24/34:Button
                //          -> dict key value types are separated by ;
                buildString {
                    if (elementType == null) {
                        val compatibleListType = registeredProperty.type.getAsVariantTypeOrdinal()
                        if (compatibleListType != VariantParser.ARRAY.id) {
                            append(":${compatibleListType}")
                        }
                    }

                    append(
                        registeredProperty
                            .type
                            .genericArguments
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
                        currentElementType = currentElementType.genericArguments.firstOrNull()
                    }

                    currentElementType.isDictionary() -> {
                        append(VariantParser.DICTIONARY.id)
                        val subHintString = currentElementType.genericArguments.joinToString(";") { argument ->
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

                        val className =
                            context.registeredClassesByFqName[currentElementType.fqName]?.getRegisteredName(context.settings)
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

                        val className =
                            context.registeredClassesByFqName[currentElementType.fqName]?.getRegisteredName(context.settings)
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

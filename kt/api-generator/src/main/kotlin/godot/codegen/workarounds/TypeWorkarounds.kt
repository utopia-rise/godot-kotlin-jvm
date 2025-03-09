package godot.codegen.workarounds

fun String.sanitizeApiType() = if (indexOf(",") != -1) {
    // There are property with multiple types, and it's all Materials, so
    // Godot's developer should make more strict API
    "Material"
} else {
    // There are inconsistencies between property type and getter type in api.
    //TODO/4.0: remove when https://github.com/godotengine/godot/issues/70736 is fixed
    replace("24/17:", "")
    //"Variant" can be used as the cuter class of an Enum but isn't generated. We merge it with the name of the enum
    replace("Variant.", "Variant")
}

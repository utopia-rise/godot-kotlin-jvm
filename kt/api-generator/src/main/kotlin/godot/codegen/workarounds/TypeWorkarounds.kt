package godot.codegen.workarounds

//TODO/4.0: remove when https://github.com/godotengine/godot/issues/70736 is fixed
@Deprecated(
    "This should be deleted when godot api is clean, " +
        "see: https://github.com/godotengine/godot/issues/70736",
    replaceWith = ReplaceWith("")
)
fun String.sanitizeApiType() = if (indexOf(",") != -1) {
    // There are property with multiple types, and it's all Materials, so
    // Godot's developer should make more strict API
    "Material"
} else {
    // There are inconsistencies between property type and getter type in api.
    replace("24/17:", "")
}


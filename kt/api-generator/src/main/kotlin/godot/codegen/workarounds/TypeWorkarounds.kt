package godot.codegen.workarounds

//TODO/4.0: remove when https://github.com/godotengine/godot/issues/70736 is fixed
@Deprecated(
    "This should be deleted when godot api is clean, " +
            "see: https://github.com/godotengine/godot/issues/70736",
    replaceWith = ReplaceWith("")
)
fun String.sanitizeApiType() = this.replace("24/17:", "")
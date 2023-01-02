package godot.codegen.workarounds

import godot.codegen.models.enriched.EnrichedSignal

//TODO/4.0: remove when https://github.com/godotengine/godot/issues/70734 is fixed
@Deprecated(
    "This should be deleted when godot api is clean, " +
            "see: https://github.com/godotengine/godot/issues/70734",
    replaceWith = ReplaceWith("name")
)
fun EnrichedSignal.sanitizedName(englobingClassName: String) =
    if (englobingClassName == "GraphNode" && name == "selected") {
        "signalSelected"
    } else {
        name
    }
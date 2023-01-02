package godot.codegen.workarounds

import godot.codegen.models.enriched.EnrichedSignal

@Deprecated(
    "This should be deleted when godot api is clean",
    replaceWith = ReplaceWith("EnrichedSignal.name")
)
fun EnrichedSignal.sanitizedName(englobingClassName: String) =
    if (englobingClassName == "GraphNode" && name == "selected") {
        "signalSelected"
    } else {
        name
    }
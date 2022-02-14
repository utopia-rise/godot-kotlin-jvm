package godot.codegen.traits

import godot.codegen.models.enriched.EnrichedArgument

interface CallableTrait : TypedTrait, NullableTrait {
    val arguments: List<EnrichedArgument>
    val isVararg: Boolean
    val engineIndexName: String
}
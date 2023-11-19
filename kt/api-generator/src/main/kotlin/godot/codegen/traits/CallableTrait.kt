package godot.codegen.traits

import godot.codegen.models.enriched.EnrichedArgument

interface CallableTrait : TypedTrait, CastableTrait, NullableTrait {
    val arguments: List<EnrichedArgument>
    val isVararg: Boolean
    val voidPtrVariableName: String
}
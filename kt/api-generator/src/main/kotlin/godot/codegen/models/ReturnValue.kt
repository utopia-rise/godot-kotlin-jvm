package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import godot.codegen.traits.TypedTrait

data class ReturnValue @JsonCreator constructor (
	@JsonProperty("type") override val type : String,
    @JsonProperty("meta") val meta : String?,
) : TypedTrait

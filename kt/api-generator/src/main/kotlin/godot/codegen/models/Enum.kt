package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Enum @JsonCreator constructor(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("values") val values: List<EnumValue>,
    @param:JsonProperty("is_bitfield") val isBitField: Boolean = false
)

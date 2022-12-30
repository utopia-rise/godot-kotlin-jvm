package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class MemberOffset @JsonCreator constructor(
    @JsonProperty("member") val member: String,
    @JsonProperty("offset") val offset: Int,
    //TODO/4.0: manage meta to infer right type size
    @JsonProperty("meta") val meta: String?
)

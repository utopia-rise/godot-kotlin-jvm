package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class MemberOffset @JsonCreator constructor(
    @JsonProperty("member") val member: String,
    @JsonProperty("offset") val offset: Int,
    @JsonProperty("meta") val meta: String?
)

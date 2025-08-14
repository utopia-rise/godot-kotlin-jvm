package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class MemberOffset @JsonCreator constructor(
    @param:JsonProperty("member") val member: String,
    @param:JsonProperty("offset") val offset: Int,
    @param:JsonProperty("meta") val meta: String?
)

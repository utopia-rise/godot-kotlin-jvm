package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ClassMemberOffsets(
    @JsonProperty("name") val name: String,
    @JsonProperty("members") val members: List<MemberOffset>
)

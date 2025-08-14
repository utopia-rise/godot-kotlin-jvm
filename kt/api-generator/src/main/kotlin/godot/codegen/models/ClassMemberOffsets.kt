package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ClassMemberOffsets(
    @param:JsonProperty("name") val name: String,
    @param:JsonProperty("members") val members: List<MemberOffset>
)

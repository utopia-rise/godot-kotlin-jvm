package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Header @JsonCreator constructor(
    @param:JsonProperty("version_major") val versionMajor: Int,
    @param:JsonProperty("version_minor") val versionMinor: Int,
    @param:JsonProperty("version_patch") val versionPatch: Int,
    @param:JsonProperty("version_status") val versionStatus: String,
    @param:JsonProperty("version_build") val versionBuild: String,
    @param:JsonProperty("version_full_name") val versionFullName: String
)

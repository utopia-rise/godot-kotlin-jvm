package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Header @JsonCreator constructor (
    @JsonProperty("version_major") val versionMajor : Int,
    @JsonProperty("version_minor") val versionMinor : Int,
    @JsonProperty("version_patch") val versionPatch : Int,
    @JsonProperty("version_status") val versionStatus : String,
    @JsonProperty("version_build") val versionBuild : String,
    @JsonProperty("version_full_name") val versionFullName : String
)

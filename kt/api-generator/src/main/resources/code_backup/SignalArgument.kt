package code_backup

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty


@JsonIgnoreProperties(ignoreUnknown = true)
class SignalArgument @JsonCreator constructor(
    @JsonProperty("name")
    val name: String,
    @JsonProperty("type")
    var type: String,
    @JsonProperty("default_value")
    val defaultValue: String
) {
    init {
        type = type.convertTypeToKotlin()
    }
}

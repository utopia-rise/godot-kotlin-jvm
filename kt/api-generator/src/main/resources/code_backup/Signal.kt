package godot.codegen

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import godot.codegen.utils.convertToCamelCase
import godot.codegen.utils.escapeKotlinReservedNames
import godot.codegen.utils.getPackage

import godot.codegen.utils.convertIfTypeParameter

private const val signalPackage = "godot.signals"

@JsonIgnoreProperties(ignoreUnknown = true)
class Signal @JsonCreator constructor(
    @JsonProperty("name")
    var name: String,
    @JsonProperty("arguments")
    val arguments: List<SignalArgument>
) {

    fun generate(className: String): PropertySpec {
        val builder = if (arguments.isEmpty()) {
            PropertySpec
                .builder(
                    name.convertToCamelCase().escapeKotlinReservedNames(),
                    ClassName(signalPackage, "Signal0")
                )
                .delegate(
                    "%M()",
                    MemberName(signalPackage, "signal")
                )
        } else {
            PropertySpec
                .builder(
                    name.convertToCamelCase().escapeKotlinReservedNames(),
                    ClassName(signalPackage, "Signal${arguments.size}")
                        .parameterizedBy(
                            *arguments
                                .map {
                                    ClassName(it.type.getPackage(), it.type).convertIfTypeParameter()
                                }
                                .toTypedArray()
                        )
                )
                .delegate("%M(${
                    arguments
                        .map { "\"${it.name}\"" + if (it != arguments.last()) ", " else "" }
                        .reduce { acc, s -> acc + s }
                })",
                    MemberName(signalPackage, "signal")
                )
        }
        val kDoc = classDocs[className]?.signals?.get(name)?.description
        if (kDoc != null) {
            builder.addKdoc("%L", kDoc)
        }
        return builder.build()
    }
}

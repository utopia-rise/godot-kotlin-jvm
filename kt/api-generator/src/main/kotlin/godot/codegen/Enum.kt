package godot.codegen

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec
import godot.codegen.utils.escapeUnderscore


@JsonIgnoreProperties(ignoreUnknown = true)
class Enum @JsonCreator constructor(
    @JsonProperty("name")
    var name: String,
    @JsonProperty("values")
    var values: Map<String, Int>
) {

    fun generate(containingClassName: String): TypeSpec {
        val enumBuilder = TypeSpec.enumBuilder(name.escapeUnderscore())
        enumBuilder.primaryConstructor(
            FunSpec.constructorBuilder()
                .addParameter("id", Long::class)
                .addStatement("this.%N = %N", "id", "id")
                .build()
        )
        enumBuilder.addProperty("id", Long::class)
        values.forEach { (key, value) ->
            val newKey = if (name == "RPCMode") key.removePrefix("RPC_MODE_") else key
            enumBuilder.addEnumConstant(
                newKey, TypeSpec.anonymousClassBuilder()
                    .addSuperclassConstructorParameter("%L", value)
                    .also {
                        val kDoc = classDocs[containingClassName]?.constants?.get(key)?.description
                        if (kDoc != null) {
                            it.addKdoc("%L", kDoc)
                        }
                    }
                    .build()
            )
        }
        val companion = TypeSpec.companionObjectBuilder()
            .addFunction(
                FunSpec.builder("from")
                    .addParameter("value", Long::class)
                    .addStatement("return values().single { it.%N == %N }", "id", "value")
                    .build()
            )
            .build()
        enumBuilder.addType(companion)
        return enumBuilder.build()
    }
}

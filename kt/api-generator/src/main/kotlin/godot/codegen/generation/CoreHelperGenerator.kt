package godot.codegen.generation

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.UNIT
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.services.IApiGenerationService
import godot.tools.common.constants.CORE_TYPE_HELPER
import kotlin.text.replace

object CoreHelperGenerator {

    fun generate(enrichedClass: EnrichedClass, property: EnrichedProperty, isSingleton: Boolean, context: IApiGenerationService): FunSpec {
        val parameterTypeName = property.getCastedType().typeName
        val parameterName = property.name
        val propertyFunSpec = FunSpec.builder("${parameterName}Mutate").addModifiers(KModifier.FINAL)

        if (isSingleton) {
            propertyFunSpec.addAnnotation(JvmStatic::class)
        }

        return propertyFunSpec
            .addParameter(
                ParameterSpec.builder(
                    "block",
                    LambdaTypeName.get(
                        receiver = parameterTypeName,
                        returnType = UNIT
                    )
                ).build()
            )
            .addAnnotation(CORE_TYPE_HELPER)
            .returns(parameterTypeName)
            .addStatement(
                """return $parameterName.apply{
                                            |    block(this)
                                            |    $parameterName = this
                                            |}
                                            |""".trimMargin()
            ).apply {
                val kDoc = buildString {
                    val propertyKdoc =
                        property.sanitizedDocumentation
                    if (propertyKdoc != null) {
                        appendLine(propertyKdoc.replace("/*", "&#47;*"))
                        appendLine()
                    }

                    appendLine(
                        """This is a helper function to make dealing with local copies easier.
                    |
                    |For more information, see our [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
                    |
                    |Allow to directly modify the local copy of the property and assign it back to the Object.
                    |
                    |Prefer that over writing:
                    |``````
                    |val myCoreType = ${enrichedClass.type.lowercase()}.${property.name}
                    |//Your changes
                    |${enrichedClass.type.lowercase()}.${property.name} = myCoreType
                    |``````
                    |""".trimMargin()
                    )
                }
                addKdoc(kDoc)
            }
            .build()
    }
}

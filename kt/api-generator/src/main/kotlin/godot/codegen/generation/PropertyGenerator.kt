package godot.codegen.generation

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.UNIT
import godot.codegen.extensions.isBitField
import godot.codegen.extensions.isEnum
import godot.codegen.extensions.isLocalCopyCoreTypes
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.services.IApiGenerationService
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.CORE_TYPE_HELPER
import godot.tools.common.constants.CORE_TYPE_LOCAL_COPY
import kotlin.text.replace

object PropertyGenerator {

    fun generate(property: EnrichedProperty, isSingleton: Boolean, context: IApiGenerationService): PropertySpec? {
        if (!property.hasGetter && !property.hasSetter) return null

        // We can't trust the property alone because some of them don't have a getter so we have to check on the setter's first parameter as well.
        val argumentIndex = if (property.isIndexed) 1 else 0
        val propertyTypeName = (property.getterMethod ?: property.setterMethod!!.arguments[argumentIndex]).getCastedType().typeName

        val propertySpecBuilder = PropertySpec.builder(property.name, propertyTypeName).addModifiers(KModifier.FINAL)

        if (isSingleton) {
            propertySpecBuilder.addAnnotation(JvmStatic::class)
        }

        if (property.hasGetter) {
            val methodName = property.getterName

            propertySpecBuilder.getter(
                FunSpec.getterBuilder()
                    .addStatement(
                        if (property.isIndexed) {
                            val indexArgument = property.getterMethod!!.arguments[0]
                            if (indexArgument.isEnum() || indexArgument.isBitField()) {
                                val argumentValue = context.findDefaultEnumValue(
                                    indexArgument,
                                    property.index!!.toLong()
                                ).type
                                "return $methodName($argumentValue)"
                            } else {
                                "return $methodName(${property.index})"
                            }

                        } else {
                            "return $methodName()"
                        }
                    )
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("\"${property.name}Property\"")
                            .build()
                    )
                    .addModifiers(KModifier.INLINE)
                    .build()
            )
        } else {
            propertySpecBuilder.getter(
                FunSpec.getterBuilder()
                    .addStatement(
                        "%L %T(%S)",
                        "throw",
                        UninitializedPropertyAccessException::class,
                        "Cannot access property ${property.name}: has no getter"
                    )
                    .build()
            )
        }

        val getterType = property
            .getterMethod
            ?.getCastedType()
            ?.typeName

        val setterType = property
            .setterMethod
            ?.arguments
            ?.get(argumentIndex)
            ?.getCastedType()
            ?.typeName

        val getterAndSetterAreCompatible = getterType == setterType


        // We don't generate the setter if its type doesn't match the getter.
        if (property.hasSetter && getterAndSetterAreCompatible) {
            val methodName = property.setterName!!

            propertySpecBuilder.mutable().setter(
                FunSpec.setterBuilder()
                    .addParameter("value", property.getCastedType().className)
                    .addStatement(
                        if (property.isIndexed) {
                            val indexArgument = property.setterMethod!!.arguments[0]
                            if (indexArgument.isEnum() || indexArgument.isBitField()) {
                                val argumentValue = context.findDefaultEnumValue(
                                    indexArgument,
                                    property.index!!.toLong()
                                ).type
                                "$methodName($argumentValue, value)"
                            } else {
                                "$methodName(${property.index}, value)"
                            }

                        } else {
                            "$methodName(value)"
                        }

                    )
                    .addModifiers(KModifier.INLINE)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("\"${property.name}Property\"")
                            .build()
                    )
                    .build()
            )
        }

        if (property.isLocalCopyCoreTypes()) {
            propertySpecBuilder.addAnnotation(CORE_TYPE_LOCAL_COPY)
        }

        propertySpecBuilder.addKdoc(property)

        return propertySpecBuilder.build()
    }
}

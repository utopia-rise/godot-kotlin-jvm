package godot.codegen.generation.rule

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.UNIT
import godot.codegen.generation.Context
import godot.codegen.generation.task.EnrichedClassTask
import godot.codegen.generation.task.EnrichedConstantTask
import godot.codegen.generation.task.EnrichedPropertyTask
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedProperty
import godot.codegen.generation.task.traits.addKdoc
import godot.tools.common.constants.CORE_TYPE_HELPER
import godot.tools.common.constants.CORE_TYPE_LOCAL_COPY

class PropertyRule : GodotApiRule<EnrichedPropertyTask>() {
    override fun apply(task: EnrichedPropertyTask, context: Context) = configure(task.builder) {
        val property = task.property

        if (!property.hasGetter && !property.hasSetter) return

        if (property.hasGetter) {
            val methodName = property.getterName

            getter(
                FunSpec.getterBuilder()
                    .addStatement(
                        if (property.isIndexed) {
                            val indexArgument = property.getterMethod!!.arguments[0]
                            if (indexArgument.type.isEnum() || indexArgument.type.isBitField()) {
                                val argumentValue = context.generateEnumDefaultValue(
                                    indexArgument.type,
                                    property.index!!.toLong()
                                )
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
            getter(
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

        val argumentIndex = if (property.isIndexed) 1 else 0
        val setterType = property
            .setterMethod
            ?.arguments
            ?.get(argumentIndex)
            ?.getCastedType()

        val getterAndSetterAreCompatible = getterType == setterType


        // We don't generate the setter if its type doesn't match the getter.
        if (property.hasSetter && getterAndSetterAreCompatible) {
            val methodName = property.setterName!!

            mutable().setter(
                FunSpec.setterBuilder()
                    .addParameter("value", property.getCastedType())
                    .addStatement(
                        if (property.isIndexed) {
                            val indexArgument = property.setterMethod!!.arguments[0]
                            if (indexArgument.type.isEnum() || indexArgument.type.isBitField()) {
                                val argumentValue = context.generateEnumDefaultValue(
                                    indexArgument.type,
                                    property.index!!.toLong()
                                )
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

        if (property.type.isLocalCopyCoreTypes()) {
            addAnnotation(CORE_TYPE_LOCAL_COPY)
        }

        addKdoc(property)
    }
}

class CoreTypeHelperRule : GodotApiRule<EnrichedClassTask>() {
    override fun apply(task: EnrichedClassTask, context: Context) = with(task.builder) {
        val clazz = task.clazz
        for (propertyTask in task.enrichedProperties) {
            val property = propertyTask.property
            if (property.hasSetter && property.type.isLocalCopyCoreTypes()) {
                addFunction(getHelper(clazz, property))
            }

        }
    }

    private fun getHelper(clazz: EnrichedClass, property: EnrichedProperty): FunSpec {
        val parameterTypeName = property.getCastedType()
        val parameterName = property.name

        val propertyFunSpec = FunSpec.builder("${parameterName}Mutate").addModifiers(KModifier.FINAL)

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
                    val propertyKdoc = property.description
                    if (propertyKdoc != null && propertyKdoc.isNotBlank()) {
                        appendLine(propertyKdoc)
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
                        |val myCoreType = ${clazz.identifier.lowercase()}.${property.name}
                        |//Your changes
                        |${clazz.identifier.lowercase()}.${property.name} = myCoreType
                        |``````
                        |""".trimMargin()
                    )
                }
                addKdoc(kDoc)
            }.build()
    }
}

class ConstantRule : GodotApiRule<EnrichedConstantTask>() {
    override fun apply(task: EnrichedConstantTask, context: Context) = configure(task.builder) {
        val constant = task.constant
        addModifiers(KModifier.CONST, KModifier.FINAL)
        initializer("%L", constant.value)
        addKdoc(constant)
        build()
    }
}

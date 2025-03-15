package godot.codegen.generation.rule

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asClassName
import godot.codegen.constants.jvmReservedMethods
import godot.codegen.extensions.applyJvmNameIfNecessary
import godot.codegen.extensions.getClassName
import godot.codegen.extensions.getDefaultValueKotlinString
import godot.codegen.extensions.getTypeName
import godot.codegen.extensions.isBitField
import godot.codegen.extensions.isEnum
import godot.codegen.extensions.jvmVariantTypeValue
import godot.codegen.generation.Context
import godot.codegen.generation.task.MethodTask
import godot.codegen.models.custom.AdditionalImport
import godot.codegen.models.enriched.EnrichedClass
import godot.codegen.models.enriched.EnrichedMethod
import godot.codegen.models.enriched.isSameSignature
import godot.codegen.services.impl.methodBindingsInnerClassName
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.addKdoc
import godot.tools.common.constants.TRANSFER_CONTEXT
import godot.tools.common.constants.VARIANT_CASTER_ANY
import godot.tools.common.constants.VARIANT_PARSER_LONG
import godot.tools.common.constants.godotApiPackage
import java.util.*

class MethodRule : GodotApiRule<MethodTask>() {
    override fun apply(task: MethodTask, context: Context) = task.configure {
        val method = task.method
        val modifiers = mutableListOf<KModifier>()

        // This method already exist in the Kotlin class Any. We have to override it because Godot uses the same name in Object.
        if (method.name == "toString") {
            modifiers.add(KModifier.OVERRIDE)
        }

        // Godot doesn't override its methods, they are either final or meant to be implemented by script or extension.
        if (method.isVirtual) {
            modifiers.add(KModifier.OPEN)
        } else {
            modifiers.add(KModifier.FINAL)
        }

        addModifiers(modifiers)
        applyJvmNameIfNecessary(method.name)

        val methodTypeName = method.getCastedType()
        val shouldReturn = method.getTypeName() != UNIT

        if (shouldReturn) {
            returns(methodTypeName.typeName)

            if (method.isEnum()) {
                val methodTypeSimpleName = methodTypeName.className.simpleName
                if (methodTypeSimpleName.contains('.')) {
                    task.owner.additionalImports.add(
                        AdditionalImport(
                            methodTypeName.className.packageName,
                            methodTypeSimpleName.split('.')[0]
                        )
                    )
                }
            }
        }

        //TODO: move adding arguments to generatedFunBuilder to separate function
        val callArgumentsAsString = buildCallArgumentsString(
            this,
            method,
            context
        ) //cannot be inlined as it also adds the arguments to the generatedFunBuilder

        if (method.isVararg) {
            addParameter(
                "__var_args",
                ANY.copy(nullable = true),
                KModifier.VARARG
            )
        }

        generateCodeBlock(task.owner, method, callArgumentsAsString, method.isStatic)

        addKdoc(method)

        for (jvmReservedMethod in jvmReservedMethods) {
            if (method.isSameSignature(jvmReservedMethod) && !method.isVirtual) {
                addAnnotation(
                    AnnotationSpec.builder(JvmName::class)
                        .addMember(
                            CodeBlock.of(
                                "\"%L%L\"",
                                task.owner.type.replaceFirstChar { it.lowercase(Locale.US) },
                                method.name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.US) else it.toString() }
                            )
                        )
                        .build()
                )

            }
        }
    }

    private fun buildCallArgumentsString(
        generatedFunBuilder: FunSpec.Builder,
        method: EnrichedMethod,
        context: Context
    ): String {
        return buildString {
            method.arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                val shouldAddComa = index != 0

                if (shouldAddComa) append(",·")

                val sanitisedArgumentName = method.arguments[index].name

                append("%T·to·$sanitisedArgumentName${argument.getToBufferCastingMethod()}")

                if (argument.isEnum()) append(".id")
                if (argument.isBitField()) append(".flag")

                val parameterBuilder = ParameterSpec.builder(
                    sanitisedArgumentName,
                    argument.getCastedType().typeName
                )

                val defaultValueKotlinCode = argument.getDefaultValueKotlinString()
                val appliedDefault = if ((argument.isEnum() || argument.isBitField()) && defaultValueKotlinCode != null) {
                    context.generateEnumDefaultValue(
                        argument,
                        defaultValueKotlinCode.first.toLong()
                    )
                } else {
                    defaultValueKotlinCode?.first
                }
                if (appliedDefault != null) {
                    parameterBuilder.defaultValue(appliedDefault, *defaultValueKotlinCode!!.second)

                    // add @JvmOverloads annotation for java support if not already present
                    val jvmOverloadAnnotationSpec = AnnotationSpec.builder(JvmOverloads::class.asClassName()).build()
                    if (!generatedFunBuilder.annotations.contains(jvmOverloadAnnotationSpec)) {
                        generatedFunBuilder.addAnnotation(jvmOverloadAnnotationSpec)
                    }
                }

                generatedFunBuilder.addParameter(parameterBuilder.build())
            }
            if (method.isVararg && isNotEmpty()) append(",·")
        }
    }

    private fun FunSpec.Builder.generateCodeBlock(
        clazz: EnrichedClass,
        enrichedMethod: EnrichedMethod,
        callArgumentsAsString: String,
        isStatic: Boolean
    ) {
        if (!enrichedMethod.isVirtual) {
            generateJvmMethodCall(
                clazz,
                callable = enrichedMethod,
                callArgumentsAsString = callArgumentsAsString,
                isStatic = isStatic
            )
        } else if (enrichedMethod.getTypeName() != UNIT) {
            addStatement(
                "%L·%T(%S)",
                "throw",
                NotImplementedError::class,
                "${enrichedMethod.name} is not implemented for ${clazz.type}"
            )
        }
    }

    private fun <T : CallableTrait> FunSpec.Builder.generateJvmMethodCall(
        clazz: EnrichedClass,
        callable: T,
        callArgumentsAsString: String,
        isStatic: Boolean
    ): FunSpec.Builder {
        val ktVariantClassNames = callable.arguments.map {
            it.jvmVariantTypeValue
        }.toTypedArray()

        if (callable.isVararg) {
            addStatement(
                "%T.writeArguments($callArgumentsAsString·*__var_args.map·{·%T·to·it·}.toTypedArray())",
                TRANSFER_CONTEXT,
                *ktVariantClassNames,
                VARIANT_CASTER_ANY
            )
        } else {
            addStatement(
                "%T.writeArguments($callArgumentsAsString)",
                TRANSFER_CONTEXT,
                *ktVariantClassNames
            )
        }

        val returnTypeVariantTypeClass = callable.jvmVariantTypeValue

        val ptr = if (isStatic) {
            "0" //nullpointer
        } else {
            "ptr"
        }

        addStatement(
            "%T.callMethod($ptr, %T.%M, %T)",
            TRANSFER_CONTEXT,
            clazz.getClassName().nestedClass(methodBindingsInnerClassName),
            MemberName(godotApiPackage, callable.voidPtrVariableName),
            returnTypeVariantTypeClass
        )

        val methodReturnType = callable.getBufferType()

        if (methodReturnType.className != UNIT) {
            if (callable.isEnum()) {
                addStatement(
                    "return·${methodReturnType.className.simpleNames.joinToString(".")}.from(%T.readReturnValue(%T)·as·%T)",
                    TRANSFER_CONTEXT,
                    VARIANT_PARSER_LONG,
                    LONG
                )
            } else if (callable.isBitField()) {
                val simpleNames = methodReturnType.className.simpleNames
                addStatement(
                    "return·%T(%T.readReturnValue(%T)·as·%T)",
                    ClassName(
                        "${methodReturnType.className.packageName}.${simpleNames.subList(0, simpleNames.size - 1).joinToString(".")}",
                        callable.getClassName().simpleName
                    ),
                    TRANSFER_CONTEXT,
                    VARIANT_PARSER_LONG,
                    LONG
                )
            } else {
                addStatement(
                    "return·(%T.readReturnValue(%T)·as·%T)${callable.getFromBufferCastingMethod()}",
                    TRANSFER_CONTEXT,
                    returnTypeVariantTypeClass,
                    methodReturnType.typeName
                )
            }
        }
        return this
    }
}

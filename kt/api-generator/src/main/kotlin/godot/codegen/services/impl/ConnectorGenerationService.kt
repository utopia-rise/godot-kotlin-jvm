package godot.codegen.services.impl

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.buildCodeBlock
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.IConnectorGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.GODOT_METHOD_CALLABLE
import godot.tools.common.constants.GODOT_SIGNAL_CONNECTOR
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.GodotFunctions
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.godotApiPackage
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotExtensionPackage
import java.io.File
import java.lang.Class
import kotlin.jvm.JvmName
import kotlin.reflect.KCallable

object ConnectorGenerationService : IConnectorGenerationService {
    private const val METHOD_PARAMETER_NAME = "method"
    private const val CANCEL_PARAMETER_NAME = "cancel"
    private const val FLAGS_PARAMETER_NAME = "flags"
    private const val TARGET_PARAMETER_NAME = "target"
    private fun javaOnlyLambdaHelperName(argCount: Int) = "_connectLambda${argCount}Java"
    private fun javaOnlyMethodHelperName(argCount: Int) = "_connectMethod${argCount}Java"
    private val godotObjectBoundTypeVariable = TypeVariableName("T", GODOT_OBJECT)
    private val connectFlagClassName = ClassName(godotApiPackage, OBJECT_CONNECT_FLAGS_CLASS_NAME)
    private val variantConverterClassName = ClassName(godotCorePackage, GodotKotlinJvmTypes.variantParser)
    private val variantConverterMember = MemberName(godotCorePackage, METHOD_NAME_GET_VARIANT_CONVERTER)
    private val asCallableMember= MemberName(godotCorePackage, GodotFunctions.asCallable)
    private val javaClassClassName = Class::class.asClassName()
    private val returnTypeParameter = TypeVariableName("R", ANY.copy(nullable = true))

    override fun generate(output: File) {
        val connectorFileSpec = FileSpec.builder(godotExtensionPackage, SIGNAL_CONNECTORS_FILE_NAME)

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val signalClassName = ClassName(godotCorePackage, "$SIGNAL_CLASS_BASENAME$argCount")
            val lambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_CLASS_BASENAME$argCount")
            val jvmActionClassName = ClassName(godotCorePackage, "$JVM_ACTION_CLASS_BASENAME$argCount")
            val methodCallableClassName = ClassName(godotCorePackage, "$METHOD_CALLABLE_CLASS_BASENAME$argCount")
            val methodStringClassName = ClassName(godotCorePackage, "$METHOD_STRING_CLASS_BASENAME$argCount")
            val genericClassNameInfo = GenericClassNameInfo(signalClassName, argCount)
            val genericParameters = genericClassNameInfo.genericTypes
            val genericJvmAction = if (genericParameters.isEmpty()) {
                jvmActionClassName
            } else {
                jvmActionClassName.parameterizedBy(genericParameters)
            }

            val flagsParameter = ParameterSpec.builder(FLAGS_PARAMETER_NAME, connectFlagClassName)
                .defaultValue("%T.%L", connectFlagClassName, "DEFAULT")
                .build()


            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toReifiedExtensionFunSpecBuilder(METHOD_NAME_CONNECT_LAMBDA)
                    .addParameters(
                        listOf(
                            flagsParameter,
                            ParameterSpec
                                .builder(
                                    METHOD_PARAMETER_NAME,
                                    LambdaTypeName.get(
                                        parameters = genericClassNameInfo.toParameterSpecList(),
                                        returnType = UNIT
                                    )
                                )
                                .addModifiers(KModifier.NOINLINE)
                                .build()
                        )
                    )
                    .addCode(
                        CodeBlock.of(
                            """ 
                                val connector = %T.createUnsafe(
                                    this, 
                                    $METHOD_PARAMETER_NAME.%M()
                                )
                                connector.connect($FLAGS_PARAMETER_NAME)
                                return connector
                            """.trimIndent(),
                            GODOT_SIGNAL_CONNECTOR,
                            asCallableMember
                        )
                    )
                    .returns(
                        GODOT_SIGNAL_CONNECTOR
                    )
                    .build()
            )

            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toExtensionFunSpecBuilder(javaOnlyLambdaHelperName(argCount))
                    .addParameters(
                        buildList {
                            add(flagsParameter)
                            addAll(
                                genericParameters.mapIndexed { index, typeVariableName ->
                                    ParameterSpec.builder("p${index}Type", javaClassClassName.parameterizedBy(typeVariableName)).build()
                                }
                            )
                            add(ParameterSpec.builder("action", genericJvmAction).build())
                        }
                    )
                    .returns(GODOT_SIGNAL_CONNECTOR)
                    .addAnnotation(JvmOverloads::class)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("%S", METHOD_NAME_CONNECT_LAMBDA + argCount)
                            .build()
                    )
                    .addCode(
                        buildCodeBlock {
                            add("val connector = %T.createUnsafe(\n", GODOT_SIGNAL_CONNECTOR)
                            indent()
                            add("this,\n")
                            add("%T._createJava(", lambdaCallableClassName)
                            genericParameters.forEachIndexed { index, _ ->
                                if (index != 0) add(", ")
                                add("p${index}Type")
                            }
                            if (genericParameters.isNotEmpty()) add(", ")
                            add("action)\n")
                            unindent()
                            add(")\n")
                            add("connector.connect($FLAGS_PARAMETER_NAME)\n")
                            add("return connector\n")
                        }
                    )
                    .build()
            )


            val lambdaTypeName = genericClassNameInfo.toLambdaTypeName(UNIT, godotObjectBoundTypeVariable)

            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toExtensionFunSpecBuilder(METHOD_NAME_CONNECT_METHOD, listOf(godotObjectBoundTypeVariable))
                    .addParameters(
                        listOf(
                            ParameterSpec
                                .builder(TARGET_PARAMETER_NAME, godotObjectBoundTypeVariable)
                                .build(),
                            ParameterSpec
                                .builder(METHOD_PARAMETER_NAME, lambdaTypeName)
                                .build(),
                            flagsParameter
                        )
                    )
                    .returns(GODOT_SIGNAL_CONNECTOR)
                    .addCode(
                        CodeBlock.of(
                            """ 
                                val connector = %T.createUnsafe(
                                    this, 
                                    %T($TARGET_PARAMETER_NAME,·($METHOD_PARAMETER_NAME·as·%T<*>).name.%M())
                                )
                                connector.connect($FLAGS_PARAMETER_NAME)
                                return connector
                            """.trimIndent(),
                            GODOT_SIGNAL_CONNECTOR,
                            GODOT_METHOD_CALLABLE,
                            KCallable::class.asClassName(),
                            TO_GODOT_NAME_UTIL_FUNCTION,
                        )
                    )
                    .addAnnotation(JvmSynthetic::class)
                    .build()
            )

            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toExtensionFunSpecBuilder(javaOnlyMethodHelperName(argCount), listOf(godotObjectBoundTypeVariable, returnTypeParameter))
                    .addParameters(
                        listOf(
                            ParameterSpec
                                .builder(TARGET_PARAMETER_NAME, godotObjectBoundTypeVariable)
                                .build(),
                            ParameterSpec
                                .builder(
                                    METHOD_PARAMETER_NAME,
                                    methodStringClassName.parameterizedBy(listOf(godotObjectBoundTypeVariable, returnTypeParameter) + genericParameters)
                                )
                                .build(),
                            flagsParameter
                        )
                    )
                    .returns(GODOT_SIGNAL_CONNECTOR)
                    .addAnnotation(JvmOverloads::class)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("%S", METHOD_NAME_CONNECT_METHOD + argCount)
                            .build()
                    )
                    .addCode(
                        CodeBlock.of(
                            """
                                val connector = %T.createUnsafe(
                                    this,
                                    %T._createJava($TARGET_PARAMETER_NAME, $METHOD_PARAMETER_NAME)
                                )
                                connector.connect($FLAGS_PARAMETER_NAME)
                                return connector
                            """.trimIndent(),
                            GODOT_SIGNAL_CONNECTOR,
                            methodCallableClassName,
                        )
                    )
                    .build()
            )

            val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_CLASS_BASENAME$argCount")
            val containerInfo = GenericClassNameInfo(lambdaContainerClassName, argCount)
            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toReifiedExtensionFunSpecBuilder(METHOD_NAME_PROMISE)
                    .addParameters(
                        listOf(
                            ParameterSpec
                                .builder(
                                    METHOD_PARAMETER_NAME,
                                    LambdaTypeName.get(
                                        parameters = genericClassNameInfo.toParameterSpecList(),
                                        returnType = UNIT
                                    )
                                )
                                .addModifiers(KModifier.NOINLINE)
                                .build(),
                            ParameterSpec
                                .builder(
                                    CANCEL_PARAMETER_NAME, LambdaTypeName.get(
                                        returnType = UNIT
                                    )
                                )
                                .addModifiers(KModifier.NOINLINE)
                                .build(),

                            )
                    )
                    .addCode(
                        CodeBlock.of(
                            buildString {
                                append("%T(%T.NIL,·arrayOf(")
                                genericParameters.forEachIndexed { index, _ ->
                                    if (index != 0) append(",·")
                                    append("%M(%T::class)!!")
                                }
                                append("),·$METHOD_PARAMETER_NAME).setAsCancellable(this,·$CANCEL_PARAMETER_NAME)")
                            },
                            containerInfo.className.parameterizedBy(listOf(UNIT) + containerInfo.genericTypes),
                            variantConverterClassName,
                            *genericParameters
                                .flatMap {
                                    listOf(variantConverterMember, it)
                                }
                                .toTypedArray()
                        )
                    )
                    .build()
            )
        }

        connectorFileSpec
            .addAnnotation(
                AnnotationSpec.builder(JvmName::class)
                    .useSiteTarget(AnnotationSpec.UseSiteTarget.FILE)
                    .addMember("%S", "SignalConnectors")
                    .build()
            )
            .addAnnotation(
                AnnotationSpec
                    .builder(ClassName("kotlin", "Suppress"))
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .addMember("\"NOTHING_TO_INLINE\"")
                    .build()
            )
            .build()
            .writeTo(output)
    }
}

package godot.codegen.services.impl

import com.squareup.kotlinpoet.AnnotationSpec
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
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.IConnectorGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.GODOT_METHOD_CALLABLE
import godot.tools.common.constants.GODOT_SIGNAL_CONNECTOR
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.godotCorePackage
import java.io.File
import kotlin.reflect.KCallable

object ConnectorGenerationService : IConnectorGenerationService {
    private const val LAMBDA_CONTAINER_NAME = "LambdaContainer"
    private const val SIGNAL_CLASS_NAME = "Signal"
    private const val CONNECT_METHOD_NAME = "connect"
    private const val PROMISE_METHOD_NAME = "promise"
    private const val METHOD_PARAMETER_NAME = "method"
    private const val CANCEL_PARAMETER_NAME = "cancel"
    private const val FLAGS_PARAMETER_NAME = "flags"
    private const val TARGET_PARAMETER_NAME = "target"
    private val godotObjectBoundTypeVariable = TypeVariableName("T", GODOT_OBJECT)
    private val connectFlagClassName = ClassName(godotCorePackage, "Object.ConnectFlags")
    private val variantConverterClassName = ClassName(godotCorePackage, GodotKotlinJvmTypes.variantParser)
    private val variantMapperMember = MemberName(godotCorePackage, "variantMapper")

    override fun generate(output: File) {
        val connectorFileSpec = FileSpec.builder(godotCorePackage, "SignalConnectors")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val signalClassName = ClassName(godotCorePackage, "$SIGNAL_CLASS_NAME$argCount")
            val genericClassNameInfo = GenericClassNameInfo(signalClassName, argCount)
            val genericParameters = genericClassNameInfo.genericTypes

            val flagsParameter = ParameterSpec.builder(FLAGS_PARAMETER_NAME, connectFlagClassName)
                .defaultValue("%T.%L", connectFlagClassName, "DEFAULT")
                .build()


            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toReifiedExtensionFunSpecBuilder(CONNECT_METHOD_NAME)
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
                                val connector = %T(
                                    this, 
                                    $METHOD_PARAMETER_NAME.asCallable()
                                )
                                connector.connect($FLAGS_PARAMETER_NAME)
                                return connector
                            """.trimIndent(),
                            GODOT_SIGNAL_CONNECTOR,
                        )
                    )
                    .returns(
                        GODOT_SIGNAL_CONNECTOR
                    )
                    .build()
            )


            val lambdaTypeName = genericClassNameInfo.toLambdaTypeName(UNIT, godotObjectBoundTypeVariable)

            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toExtensionFunSpecBuilder(CONNECT_METHOD_NAME, listOf(godotObjectBoundTypeVariable))
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
                                val connector = %T(
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
                    .build()
            )

            val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_NAME$argCount")
            val containerInfo = GenericClassNameInfo(lambdaContainerClassName, argCount)
            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toReifiedExtensionFunSpecBuilder(PROMISE_METHOD_NAME)
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
                                    append("%M[%T::class]!!")
                                }
                                append("),·$METHOD_PARAMETER_NAME).setAsCancellable(this,·$CANCEL_PARAMETER_NAME)")
                            },
                            containerInfo.className.parameterizedBy(listOf(UNIT) + containerInfo.genericTypes),
                            variantConverterClassName,
                            *genericParameters
                                .flatMap {
                                    listOf(variantMapperMember, it)
                                }
                                .toTypedArray()
                        )
                    )
                    .build()
            )
        }

        connectorFileSpec
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

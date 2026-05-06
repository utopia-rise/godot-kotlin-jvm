package godot.codegen.services.impl

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.IConnectorGenerationService
import godot.common.constants.Constraints
import godot.tools.common.names.API
import godot.tools.common.names.CoreType
import godot.tools.common.names.Function
import godot.tools.common.names.Kotlin
import godot.tools.common.names.VariantConverter
import java.io.File
import kotlin.reflect.KCallable

object ConnectorGenerationService : IConnectorGenerationService {
    private const val LAMBDA_CONTAINER_NAME = "LambdaContainer"
    private const val SIGNAL_CLASS_NAME = "Signal"
    private const val CONNECT_METHOD_METHOD_NAME = "connectMethod"
    private const val CONNECT_LAMBDA_METHOD_NAME = "connectLambda"
    private const val PROMISE_METHOD_NAME = "promise"
    private const val METHOD_PARAMETER_NAME = "method"
    private const val CANCEL_PARAMETER_NAME = "cancel"
    private const val FLAGS_PARAMETER_NAME = "flags"
    private const val TARGET_PARAMETER_NAME = "target"
    private val godotObjectBoundTypeVariable = TypeVariableName("T", API.`object`)
    private val connectFlagClassName = API.connectFlags
    private val variantMapperMember = Function.variantMapper
    private val asCallableMember = Function.asCallable

    override fun generate(output: File) {
        val connectorFileSpec = FileSpec.builder(Function.promise.packageName, "SignalConnectors")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val signalClassName = CoreType.signal(argCount)
            val genericClassNameInfo = GenericClassNameInfo(signalClassName, argCount)
            val genericParameters = genericClassNameInfo.genericTypes

            val flagsParameter = ParameterSpec.builder(FLAGS_PARAMETER_NAME, connectFlagClassName)
                .defaultValue("%T.%L", connectFlagClassName, "DEFAULT")
                .build()


            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toReifiedExtensionFunSpecBuilder(CONNECT_LAMBDA_METHOD_NAME)
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
                            CoreType.signalConnector,
                            asCallableMember
                        )
                    )
                    .returns(
                        CoreType.signalConnector
                    )
                    .build()
            )


            val lambdaTypeName = genericClassNameInfo.toLambdaTypeName(UNIT, godotObjectBoundTypeVariable)

            connectorFileSpec.addFunction(
                genericClassNameInfo
                    .toExtensionFunSpecBuilder(CONNECT_METHOD_METHOD_NAME, listOf(godotObjectBoundTypeVariable))
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
                    .returns(CoreType.signalConnector)
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
                            CoreType.signalConnector,
                            CoreType.methodCallable,
                            KCallable::class,
                            Function.toGodotName,
                        )
                    )
                    .addAnnotation(JvmSynthetic::class)
                    .build()
            )

            val lambdaContainerClassName = CoreType.lambdaContainer(argCount)
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
                                append("%T(%M,·arrayOf(")
                                genericParameters.forEachIndexed { index, _ ->
                                    if (index != 0) append(",·")
                                    append("%M[%T::class]!!")
                                }
                                append("),·$METHOD_PARAMETER_NAME).setAsCancellable(this,·$CANCEL_PARAMETER_NAME)")
                            },
                            containerInfo.className.parameterizedBy(listOf(UNIT) + containerInfo.genericTypes),
                            VariantConverter.nil,
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
                    .builder(Kotlin.suppress)
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .addMember("\"NOTHING_TO_INLINE\"")
                    .build()
            )
            .build()
            .writeTo(output)
    }
}



package godot.codegen.services.impl

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.codegen.services.ISignalGenerationService
import godot.tools.common.constants.*
import kotlin.reflect.KCallable

class SignalGenerationService : ISignalGenerationService {
    override fun generate(maxArgumentCount: Int): FileSpec {
        val signalFileSpec = FileSpec.builder(signalPackage, "Signals")

        val signalProviderObject = TypeSpec
            .objectBuilder(ClassName(godotSignalsPackage, "SignalProvider"))

        val godotObjectBoundTypeVariable = TypeVariableName("T", GODOT_OBJECT)
        val flagsParameter = ParameterSpec.builder(FLAGS_PARAMETER_NAME, INT)
            .defaultValue("%L", 0)
            .build()

        for (argCount in 0 .. maxArgumentCount) {
            val argumentRange = 0 ..< argCount

            val typeVariableNames = argumentRange
                .map {
                    TypeVariableName("P$it")
                }

            val signalClassName = ClassName(signalPackage, "$SIGNAL_CLASS_NAME$argCount")
            val signalTypeSpec = TypeSpec
                .classBuilder(signalClassName)
                .addTypeVariables(typeVariableNames)
                .superclass(ClassName(signalPackage, SIGNAL_CLASS_NAME))

            signalTypeSpec
                .primaryConstructor(
                    FunSpec.constructorBuilder()
                        .addParameters(
                            listOf(
                                ParameterSpec.builder(INSTANCE_PARAMETER, GODOT_OBJECT).build(),
                                ParameterSpec.builder(NAME_PARAMETER, STRING).build()
                            )
                        )
                        .build()
                )

            signalTypeSpec
                .addSuperclassConstructorParameter(INSTANCE_PARAMETER)
                .addSuperclassConstructorParameter(NAME_PARAMETER)

            val genericParameters = typeVariableNames
                .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                    ParameterSpec.builder("p$index", typeVariableName).build()
                }
            val lambdaTypeName = LambdaTypeName.get(
                receiver = godotObjectBoundTypeVariable,
                parameters = genericParameters,
                returnType = UNIT
            )

            signalTypeSpec
                .addFunctions(
                    listOf(
                        FunSpec.builder("emit")
                            .returns(UNIT)
                            .addParameters(
                                genericParameters
                            )
                            .addCode(
                                CodeBlock.of(
                                    buildString {
                                        append("emitSignal(")
                                        for (i in argumentRange) {
                                            if (i != 0) append(",·")

                                            append("p$i")
                                        }
                                        append(')')
                                    }
                                )
                            )
                            .build(),

                        FunSpec.builder(CONNECT_METHOD_NAME)
                            .addTypeVariable(godotObjectBoundTypeVariable)
                            .addParameters(
                                listOf(
                                    ParameterSpec.builder(TARGET_PARAMETER_NAME, godotObjectBoundTypeVariable).build(),
                                    ParameterSpec.builder(METHOD_PARAMETER_NAME, lambdaTypeName).build(),
                                    flagsParameter
                                )
                            )
                            .returns(GODOT_ERROR)
                            .addCode(generateConnectionCodeBlock())
                            .build(),

                        FunSpec.builder(DISCONNECT_METHOD_NAME)
                            .addTypeVariable(godotObjectBoundTypeVariable)
                            .addParameters(
                                listOf(
                                    ParameterSpec.builder(TARGET_PARAMETER_NAME, godotObjectBoundTypeVariable).build(),
                                    ParameterSpec.builder(METHOD_PARAMETER_NAME, lambdaTypeName).build()
                                )
                            )
                            .returns(UNIT)
                            .addCode(generateConnectionCodeBlock(true))
                            .build()
                    )
                )

            signalFileSpec.addType(signalTypeSpec.build())

            val signalConnectExtensionBuilder = FunSpec.builder(CONNECT_METHOD_NAME)

            val signalConnectExtensionGenericParameters = ParameterSpec
                .builder(
                    METHOD_PARAMETER_NAME,
                    LambdaTypeName.get(
                        parameters = genericParameters,
                        returnType = UNIT
                    )
                )

            if (argCount != 0) {
                signalConnectExtensionBuilder.addModifiers(KModifier.INLINE)
                signalConnectExtensionGenericParameters.addModifiers(KModifier.NOINLINE)
            }

            val signalClassNameWithTypeParameters = if (typeVariableNames.isEmpty()) {
                signalClassName
            } else {
                signalClassName.parameterizedBy(*typeVariableNames.toTypedArray())
            }
            signalFileSpec.addFunction(
                signalConnectExtensionBuilder
                    .addTypeVariables(
                        typeVariableNames.map { it.copy(reified = true) }
                    )
                    .receiver(
                        signalClassNameWithTypeParameters
                    )
                    .addParameters(
                        listOf(
                            flagsParameter,
                            signalConnectExtensionGenericParameters.build()
                        )
                    )
                    .returns(GODOT_ERROR)
                    .addCode(
                        "return·$CONNECT_METHOD_NAME($METHOD_PARAMETER_NAME.%M(),·$FLAGS_PARAMETER_NAME)",
                        AS_CALLABLE_UTIL_FUNCTION
                    )
                    .build()
            )

            val signalProviderFunction = FunSpec.builder(SIGNAL_FUNCTION_NAME)

            if (argCount != 0) {
                signalProviderFunction.addAnnotation(
                    AnnotationSpec.builder(Suppress::class)
                        .addMember("\"UNUSED_PARAMETER\"")
                        .build()
                )
            }

            signalProviderObject
                .addFunction(
                    signalProviderFunction
                        .addTypeVariables(typeVariableNames)
                        .addParameters(
                            listOf(
                                ParameterSpec.builder(THIS_REF_PARAMETER_NAME, GODOT_OBJECT).build(),
                                ParameterSpec.builder(NAME_PARAMETER, STRING).build(),
                                *argumentRange
                                    .map {
                                        ParameterSpec.builder("p$it", STRING).build()
                                    }
                                    .toTypedArray()
                            )
                        )
                        .returns(signalClassNameWithTypeParameters)
                        .addCode(
                            "return·%T($THIS_REF_PARAMETER_NAME,·$NAME_PARAMETER)",
                            signalClassNameWithTypeParameters
                        )
                        .addAnnotation(JvmStatic::class)
                        .build()
                )

            val signalDelegateFunction = FunSpec.builder(SIGNAL_FUNCTION_NAME)

            if (argCount != 0) {
                signalDelegateFunction.addAnnotation(
                    AnnotationSpec.builder(Suppress::class).addMember("\"UNUSED_PARAMETER\"").build()
                )
            }

            signalFileSpec
                .addFunction(
                    signalDelegateFunction
                        .addTypeVariables(typeVariableNames)
                        .addParameters(
                            argumentRange
                                .map {
                                    ParameterSpec.builder("p$it", STRING).build()
                                }
                        )
                        .returns(signalDelegateProviderClassName.parameterizedBy(signalClassNameWithTypeParameters))
                        .addCode(
                            CodeBlock.of(
                                "return·%T(::%T)",
                                signalDelegateProviderClassName,
                                signalClassName
                            )
                        )
                        .build()
                )
        }

        signalFileSpec.addAnnotation(
            AnnotationSpec.builder(ClassName("kotlin", "Suppress"))
                .addMember("\"PackageDirectoryMismatch\"")
                .build()
        )

        signalFileSpec.addType(signalProviderObject.build())

        return signalFileSpec.build()
    }

    companion object {
        private const val SIGNAL_CLASS_NAME = "Signal"
        private const val INSTANCE_PARAMETER = "instance"
        private const val NAME_PARAMETER = "name"
        private const val TARGET_PARAMETER_NAME = "target"
        private const val METHOD_PARAMETER_NAME = "method"
        private const val FLAGS_PARAMETER_NAME = "flags"
        private const val THIS_REF_PARAMETER_NAME = "thisRef"

        private const val CONNECT_METHOD_NAME = "connect"
        private const val DISCONNECT_METHOD_NAME = "disconnect"
        private const val SIGNAL_FUNCTION_NAME = "signal"

        private val signalDelegateProviderClassName = ClassName(signalPackage, "SignalDelegateProvider")

        private fun generateConnectionCodeBlock(isDisconnect: Boolean = false): CodeBlock {
            val methodName = if (isDisconnect) DISCONNECT_METHOD_NAME else CONNECT_METHOD_NAME
            val flagsParameters = if (isDisconnect) "" else ",·$FLAGS_PARAMETER_NAME"

            return CodeBlock.of(
                "return·$methodName(%T($TARGET_PARAMETER_NAME,·($METHOD_PARAMETER_NAME·as·%T<*>).name.%M().%M())$flagsParameters)",
                GODOT_CALLABLE,
                KCallable::class.asClassName(),
                CAMEL_TO_SNAKE_CASE_UTIL_FUNCTION,
                AS_STRING_NAME_UTIL_FUNCTION
            )
        }
    }
}
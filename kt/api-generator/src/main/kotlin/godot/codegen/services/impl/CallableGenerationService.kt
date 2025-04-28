package godot.codegen.services.impl

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ARRAY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.ICallableGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.GodotFunctions
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotInteropPackage
import java.io.File


object CallableGenerationService : ICallableGenerationService {
    private const val FUNCTION_PARAMETER_NAME = "function"
    private const val LAMBDA_CALLABLE_NAME = "LambdaCallable"
    private const val LAMBDA_CONTAINER_NAME = "LambdaContainer"
    private const val CONTAINER_ARGUMENT_NAME = "container"
    private const val CALLABLE_FUNCTION_NAME = "callable"
    private const val VARIANT_TYPE_RETURN_NAME = "returnConverter"
    private const val VARIANT_TYPE_ARGUMENT_NAME = "typeConverters"
    private val LAMBDA_CALLABLE_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CALLABLE_NAME)
    private val LAMBDA_CONTAINER_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CONTAINER_NAME)
    private val returnTypeParameter = TypeVariableName("R", ANY.copy(nullable = true))
    private val variantConverterClassName = ClassName(godotInteropPackage, GodotKotlinJvmTypes.variantConverter)

    override fun generate(outputDir: File) {
        val callableFileSpec = FileSpec.builder(godotCorePackage, "LambdaCallables")
        val containerFileSpec = FileSpec.builder(godotCorePackage, "LambdaContainers")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val argumentRange = 0..<argCount
            val genericParameters = argumentRange.map { TypeVariableName("P$it") }
            val genericParameterWithReturn = listOf(returnTypeParameter) + genericParameters

            val lambdaTypeName = LambdaTypeName.get(
                receiver = null,
                parameters = genericParameters
                    .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                        ParameterSpec.builder("p$index", typeVariableName).build()
                    },
                returnType = returnTypeParameter
            )

            val constructor = FunSpec
                .constructorBuilder()
                .addModifiers(KModifier.INTERNAL)
                .addParameter(
                    ParameterSpec
                        .builder(
                            VARIANT_TYPE_RETURN_NAME,
                            variantConverterClassName
                        )
                        .build()
                )
                .addParameter(
                    ParameterSpec
                        .builder(
                            VARIANT_TYPE_ARGUMENT_NAME,
                            ARRAY.parameterizedBy(variantConverterClassName)
                        )
                        .build()
                )
                .addParameter(
                    ParameterSpec
                        .builder(
                            FUNCTION_PARAMETER_NAME,
                            lambdaTypeName
                        )
                        .build()
                )
                .addModifiers(KModifier.INTERNAL)
                .addAnnotation(PublishedApi::class)
                .build()

            val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_NAME$argCount")
            val lambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_NAME$argCount")
            val classInfo = GenericClassNameInfo(lambdaCallableClassName, argCount)

            val lambdaContainerClassBuilder = TypeSpec
                .classBuilder(lambdaContainerClassName)
                .superclass(LAMBDA_CONTAINER_CLASS_NAME.parameterizedBy(returnTypeParameter))
                .addSuperclassConstructorParameter(VARIANT_TYPE_RETURN_NAME)
                .addSuperclassConstructorParameter(VARIANT_TYPE_ARGUMENT_NAME)
                .addTypeVariable(returnTypeParameter)
                .addTypeVariables(genericParameters)
                .primaryConstructor(
                    constructor
                )
                .addProperty(
                    PropertySpec
                        .builder(
                            FUNCTION_PARAMETER_NAME,
                            lambdaTypeName.copy(nullable = true),
                            KModifier.PRIVATE
                        )
                        .mutable()
                        .initializer(FUNCTION_PARAMETER_NAME)
                        .build()
                )
                .addFunction(
                    FunSpec
                        .builder("unsafeInvoke")
                        .addParameters(classInfo.toParameterSpecList())
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·$FUNCTION_PARAMETER_NAME?.invoke(")
                                    append(classInfo.toArgumentsString("pINDEX", "INDEX"))
                                    append(")?:·throw·%T()")
                                },
                                ClassName(godotCorePackage, "InvalidJvmLambdaException")
                            )
                        )
                        .build()

                )
                .addFunction(
                    FunSpec
                        .builder("unsafeInvokeFromBuffer")
                        .addModifiers(KModifier.OVERRIDE)
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·$FUNCTION_PARAMETER_NAME?.invoke(")
                                    for (i in argumentRange) {
                                        if (i != 0) append(",·")

                                        append("paramsArray[$i]·as·%T")
                                    }
                                    append(")?:·throw·%T()")
                                },
                                *genericParameters.toTypedArray(),
                                ClassName(godotCorePackage, "InvalidJvmLambdaException")
                            )
                        )
                        .build()
                )
                .addFunction(
                    FunSpec
                        .builder("invalidate")
                        .addModifiers(KModifier.OVERRIDE)
                        .addCode("function·=·null")
                        .build()
                )

            val lambdaCallableClassBuilder = TypeSpec
                .classBuilder(lambdaCallableClassName)
                .superclass(LAMBDA_CALLABLE_CLASS_NAME.parameterizedBy(returnTypeParameter))
                .addTypeVariable(returnTypeParameter)
                .addTypeVariables(genericParameters)
                .primaryConstructor(
                    constructor
                )
                .addProperty(
                    PropertySpec
                        .builder(CONTAINER_ARGUMENT_NAME, lambdaContainerClassName.parameterizedBy(genericParameterWithReturn))
                        .addModifiers(KModifier.OVERRIDE)
                        .initializer(
                            CodeBlock.of(
                                "%T($VARIANT_TYPE_RETURN_NAME, $VARIANT_TYPE_ARGUMENT_NAME, $FUNCTION_PARAMETER_NAME)",
                                lambdaContainerClassName.parameterizedBy(genericParameterWithReturn)
                            )
                        )
                        .build()
                )
                .addFunction(
                    FunSpec
                        .builder("call")
                        .addParameters(classInfo.toParameterSpecList())
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·$CONTAINER_ARGUMENT_NAME.unsafeInvoke(")
                                    append(classInfo.toArgumentsString("pINDEX", "INDEX"))
                                    append(')')
                                }
                            )
                        )
                        .build()
                )
                .addFunction(
                    FunSpec.builder("callDeferred")
                        .addParameters(classInfo.toParameterSpecList())
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·unsafeCallDeferred(")
                                    append(classInfo.toArgumentsString("pINDEX", "INDEX"))
                                    append(")·as·%T")
                                },
                                returnTypeParameter
                            )
                        )
                        .build()
                )
                .addFunction(
                    FunSpec.builder("invoke")
                        .addParameters(classInfo.toParameterSpecList())
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·call(")
                                    append(classInfo.toArgumentsString("pINDEX", "INDEX"))
                                    append(')')
                                },
                                *genericParameters.toTypedArray()
                            )
                        )
                        .addModifiers(KModifier.OPERATOR)
                        .build()
                )

            val typeVariables = genericParameters.toMutableList()
            var remainingParameters = 0
            while (typeVariables.isNotEmpty()) {
                val bindReturnType =
                    ClassName(godotCorePackage, "$LAMBDA_CALLABLE_NAME${genericParameters.size - typeVariables.size}")
                lambdaCallableClassBuilder.addFunction(
                    FunSpec.builder("bind")
                        .addParameters(
                            typeVariables
                                .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                                    ParameterSpec.builder("p${index + remainingParameters}", typeVariableName)
                                        .build()
                                }
                        )
                        .addCode(
                            buildString {
                                append("return·%T($CONTAINER_ARGUMENT_NAME.returnConverter,·$CONTAINER_ARGUMENT_NAME.typeConverters.take(${remainingParameters}).toTypedArray())·{")

                                for (index in (0..<remainingParameters)) {
                                    if (index != 0) append(",·")

                                    append("p${index}:·%T")
                                }

                                append("·->·$CONTAINER_ARGUMENT_NAME.unsafeInvoke(")

                                for (i in genericParameters.indices) {
                                    if (i != 0) append(",·")

                                    append("p$i")
                                }

                                append(")·}")
                            },
                            bindReturnType,
                            *genericParameters.take(remainingParameters).toTypedArray()
                        )
                        .build()
                )

                typeVariables.removeFirst()
                ++remainingParameters
            }

            containerFileSpec.addType(lambdaContainerClassBuilder.build())
            callableFileSpec.addType(lambdaCallableClassBuilder.build())

            val variantMapperMember = MemberName(godotCorePackage, "variantMapper")
            callableFileSpec.addFunction(
                FunSpec.builder(CALLABLE_FUNCTION_NAME + argCount)
                    .addTypeVariables(genericParameters.map { it.copy(reified = true) })
                    .addTypeVariable(returnTypeParameter.copy(reified = true))
                    .addModifiers(KModifier.INLINE)
                    .addParameters(
                        listOf(
                            ParameterSpec
                                .builder(
                                    FUNCTION_PARAMETER_NAME,
                                    lambdaTypeName
                                )
                                .addModifiers(KModifier.NOINLINE)
                                .build()
                        )
                    )
                    .addCode(
                        CodeBlock.of(
                            buildString {
                                append("return·$LAMBDA_CALLABLE_NAME$argCount(")
                                append("%M.getOrDefault(%T::class,·%T),·arrayOf(")
                                genericParameters.forEach { _ ->
                                    append("%M[%T::class]!!,·")
                                }
                                append("),·")
                                append(FUNCTION_PARAMETER_NAME)
                                append(')')
                            },
                            variantMapperMember,
                            returnTypeParameter,
                            VARIANT_PARSER_NIL,
                            *genericParameters
                                .flatMap {
                                    listOf(variantMapperMember, it)
                                }
                                .toTypedArray()
                        )
                    )
                    .build()
            )

            callableFileSpec
                .addFunction(
                    FunSpec
                        .builder(GodotFunctions.asCallable)
                        .addTypeVariables(genericParameters.map { it.copy(reified = true) })
                        .addTypeVariable(returnTypeParameter.copy(reified = true))
                        .addModifiers(KModifier.INLINE)
                        .receiver(lambdaTypeName)
                        .addCode("return·$CALLABLE_FUNCTION_NAME$argCount(this)")
                        .build()
                )
        }

        callableFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(ClassName("kotlin", "Suppress"))
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .build()
            )
            .build()
            .writeTo(outputDir)

        containerFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(ClassName("kotlin", "Suppress"))
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .build()
            )
            .build()
            .writeTo(outputDir)
    }
}

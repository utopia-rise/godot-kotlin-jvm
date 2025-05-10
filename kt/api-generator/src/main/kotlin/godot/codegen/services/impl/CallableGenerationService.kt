package godot.codegen.services.impl

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ARRAY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
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
    private const val CALLABLE_NAME = "Callable"
    private const val LAMBDA_CALLABLE_NAME = "LambdaCallable"
    private const val LAMBDA_CONTAINER_NAME = "LambdaContainer"

    private const val FUNCTION_PARAMETER_NAME = "function"
    private const val CONTAINER_ARGUMENT_NAME = "container"
    private const val BOUND_ARGS_ARGUMENT_NAME = "boundArgs"
    private const val CALLABLE_FUNCTION_NAME = "callable"
    private const val VARIANT_TYPE_RETURN_NAME = "returnConverter"
    private const val VARIANT_TYPE_ARGUMENT_NAME = "typeConverters"

    private val LAMBDA_CALLABLE_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CALLABLE_NAME)
    private val LAMBDA_CONTAINER_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CONTAINER_NAME)
    private val CALLABLE_CLASS_NAME = ClassName(godotCorePackage, CALLABLE_NAME)
    private val returnTypeParameter = TypeVariableName("R", ANY.copy(nullable = true))
    private val variantConverterClassName = ClassName(godotInteropPackage, GodotKotlinJvmTypes.variantConverter)

    override fun generate(outputDir: File) {
        val lambdaFileSpec = FileSpec.builder(godotCorePackage, "LambdaCallables")
        val containerFileSpec = FileSpec.builder(godotCorePackage, "LambdaContainers")
        val callableFileSpec = FileSpec.builder(godotCorePackage, "Callables")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {

            val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_NAME$argCount")
            val lambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_NAME$argCount")
            val callableClassName = ClassName(godotCorePackage, "$CALLABLE_NAME$argCount")

            val containerInfo = GenericClassNameInfo(lambdaContainerClassName, argCount)
            val lambdaInfo = GenericClassNameInfo(lambdaCallableClassName, argCount)
            val callableInfo = GenericClassNameInfo(callableClassName, argCount)

            val genericParameters = containerInfo.genericTypes
            val lambdaTypeName = lambdaInfo.toLambdaTypeName(returnType = returnTypeParameter)

            val callableClassBuilder = TypeSpec
                .interfaceBuilder(callableClassName)
                .addSuperinterface(CALLABLE_CLASS_NAME)
                .addTypeVariable(returnTypeParameter)
                .addTypeVariables(genericParameters)
                .addFunction(
                    FunSpec
                        .builder("call")
                        .addParameters(callableInfo.toParameterSpecList())
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·callUnsafe(")
                                    append(callableInfo.toArgumentsString("pINDEX", "INDEX"))
                                    append(") as R")
                                }
                            )
                        )
                        .build()
                )
                .addFunction(
                    FunSpec.builder("callDeferred")
                        .addParameters(callableInfo.toParameterSpecList())
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·callDeferredUnsafe(")
                                    append(callableInfo.toArgumentsString("pINDEX", "INDEX"))
                                    append(")")
                                }
                            )
                        )
                        .build()
                )
                .addFunction(
                    FunSpec.builder("invoke")
                        .addParameters(lambdaInfo.toParameterSpecList())
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·call(")
                                    append(callableInfo.toArgumentsString("pINDEX", "INDEX"))
                                    append(')')
                                },
                                *genericParameters.toTypedArray()
                            )
                        )
                        .addModifiers(KModifier.OPERATOR)
                        .build()
                )

            val lambdaContainerClassBuilder = TypeSpec
                .classBuilder(lambdaContainerClassName)
                .superclass(LAMBDA_CONTAINER_CLASS_NAME.parameterizedBy(returnTypeParameter))
                .addSuperclassConstructorParameter(VARIANT_TYPE_RETURN_NAME)
                .addSuperclassConstructorParameter(VARIANT_TYPE_ARGUMENT_NAME)
                .addSuperclassConstructorParameter(FUNCTION_PARAMETER_NAME)
                .addTypeVariable(returnTypeParameter)
                .addTypeVariables(genericParameters)
                .primaryConstructor(
                    FunSpec
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
                        .addAnnotation(PublishedApi::class)
                        .build()
                )
                .addFunction(
                    FunSpec
                        .builder("invokeUnsafe")
                        .addModifiers(KModifier.OVERRIDE)
                        .addParameter(
                            ParameterSpec
                                .builder("args", ANY.copy(nullable = true), KModifier.VARARG)
                                .build()
                        )
                        .returns(returnTypeParameter)
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·($FUNCTION_PARAMETER_NAME·as?·%T)?.invoke(")
                                    append(lambdaInfo.toArgumentsString("args[INDEX]", "INDEX"))
                                    append(")?:·throw·%T()")
                                },
                                lambdaInfo.toErasedLambdaTypeName(returnType = returnTypeParameter),
                                ClassName(godotCorePackage, "InvalidJvmLambdaException")
                            )
                        )
                        .build()

                )

            val lambdaCallableClassBuilder = TypeSpec
                .classBuilder(lambdaCallableClassName)
                .superclass(LAMBDA_CALLABLE_CLASS_NAME.parameterizedBy(returnTypeParameter))
                .addSuperinterface(callableClassName.parameterizedBy(listOf(returnTypeParameter) + genericParameters))
                .addTypeVariable(returnTypeParameter)
                .addTypeVariables(genericParameters)
                .primaryConstructor(
                    FunSpec
                        .constructorBuilder()
                        .addModifiers(KModifier.INTERNAL)
                        .addParameter(
                            ParameterSpec
                                .builder(
                                    CONTAINER_ARGUMENT_NAME,
                                    LAMBDA_CONTAINER_CLASS_NAME.parameterizedBy(returnTypeParameter)
                                )
                                .build()
                        )
                        .addParameter(
                            ParameterSpec
                                .builder(
                                    BOUND_ARGS_ARGUMENT_NAME,
                                    ARRAY.parameterizedBy(ANY.copy(nullable = true))
                                )
                                .defaultValue("emptyArray()")
                                .build()
                        )
                        .addAnnotation(PublishedApi::class)
                        .build()
                )
                .addSuperclassConstructorParameter(CONTAINER_ARGUMENT_NAME, BOUND_ARGS_ARGUMENT_NAME)


            val typeVariables = genericParameters.toMutableList()
            var remainingParameters = 0
            while (typeVariables.isNotEmpty()) {
                val boundLambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_NAME${remainingParameters}")
                val boundCallableClassName = ClassName(godotCorePackage, "$CALLABLE_NAME${remainingParameters}")
                val bindInfo = GenericClassNameInfo(boundLambdaCallableClassName, remainingParameters)

                callableClassBuilder.addFunction(
                    FunSpec.builder("bind")
                        .addModifiers(KModifier.ABSTRACT)
                        .addParameters(
                            typeVariables.mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                                ParameterSpec.builder("p${index + remainingParameters}", typeVariableName)
                                    .build()
                            }
                        )
                        .returns(boundCallableClassName.parameterizedBy(listOf(returnTypeParameter) + bindInfo.genericTypes))
                        .build()
                )

                lambdaCallableClassBuilder.addFunction(
                    FunSpec.builder("bind")
                        .addModifiers(KModifier.OVERRIDE)
                        .addParameters(
                            typeVariables.mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                                ParameterSpec.builder("p${index + remainingParameters}", typeVariableName)
                                    .build()
                            }
                        )
                        .addCode(
                            buildString {
                                append("return·%T($CONTAINER_ARGUMENT_NAME, arrayOf(")

                                for (index in (0..<typeVariables.size)) {
                                    if (index != 0) append(",·")
                                    append("p${index + remainingParameters}")
                                }

                                append("))")
                            },
                            boundLambdaCallableClassName.parameterizedBy(listOf(returnTypeParameter) + bindInfo.genericTypes),
                        )
                        .build()
                )

                typeVariables.removeFirst()
                ++remainingParameters
            }

            containerFileSpec.addType(lambdaContainerClassBuilder.build())
            lambdaFileSpec.addType(lambdaCallableClassBuilder.build())
            callableFileSpec.addType(callableClassBuilder.build())

            val variantMapperMember = MemberName(godotCorePackage, "variantMapper")
            lambdaFileSpec.addFunction(
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
                                append("return·%T(%T(")
                                append("%M.getOrDefault(%T::class,·%T),·arrayOf(")
                                genericParameters.forEachIndexed { index, _ ->
                                    if (index != 0) append(",·")
                                    append("%M[%T::class]!!")
                                }
                                append("),·")
                                append(FUNCTION_PARAMETER_NAME)
                                append("))")
                            },
                            lambdaInfo.className.parameterizedBy(listOf(returnTypeParameter) + lambdaInfo.genericTypes),
                            containerInfo.className.parameterizedBy(listOf(returnTypeParameter) + containerInfo.genericTypes),
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

            lambdaFileSpec
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

        lambdaFileSpec
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
    }
}

package godot.codegen.services.impl

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ARRAY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.ICallableGenerationService
import godot.common.constants.Constraints
import godot.tools.common.names.API
import godot.tools.common.names.CoreType
import godot.tools.common.names.Function
import godot.tools.common.names.Kotlin
import godot.tools.common.names.VariantConverter
import java.io.File
import kotlin.reflect.KCallable


object CallableGenerationService : ICallableGenerationService {
    private const val FUNCTION_PARAMETER_NAME = "function"
    private const val CONTAINER_ARGUMENT_NAME = "container"
    private const val TARGET_ARGUMENT_NAME = "target"
    private const val METHOD_NAME_ARGUMENT_NAME = "methodName"
    private const val BOUND_ARGS_ARGUMENT_NAME = "boundArgs"
    private const val CALLABLE_FUNCTION_NAME = "callable"
    private const val VARIANT_TYPE_RETURN_NAME = "returnConverter"
    private const val VARIANT_TYPE_ARGUMENT_NAME = "typeConverters"

    private val CALLABLE_CLASS_NAME = CoreType.callable
    private val LAMBDA_CALLABLE_CLASS_NAME = CoreType.lambdaCallable
    private val LAMBDA_CONTAINER_CLASS_NAME = CoreType.lambdaContainer
    private val METHOD_CALLABLE_CLASS_NAME = CoreType.methodCallable

    private val returnTypeParameter = TypeVariableName("R", ANY.copy(nullable = true))
    private val variantConverterClassName = VariantConverter.converterType

    override fun generate(outputDir: File) {
        val callableFileSpec = FileSpec.builder(CoreType.callable.packageName, CoreType.callable.simpleName + "s")
        val lambdaFileSpec = FileSpec.builder(CoreType.callable.packageName, CoreType.lambdaCallable.simpleName + "s")
        val containerFileSpec = FileSpec.builder(CoreType.callable.packageName, CoreType.lambdaContainer.simpleName + "s")
        val methodFileSpec = FileSpec.builder(CoreType.callable.packageName, CoreType.methodCallable.simpleName + "s")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {

            val callableClassName = CoreType.callable(argCount)
            val lambdaContainerClassName = CoreType.lambdaContainer(argCount)
            val lambdaCallableClassName = CoreType.lambdaCallable(argCount)
            val methodCallableClassName = CoreType.methodCallable(argCount)

            val callableInfo = GenericClassNameInfo(callableClassName, argCount)
            val containerInfo = GenericClassNameInfo(lambdaContainerClassName, argCount)
            val lambdaInfo = GenericClassNameInfo(lambdaCallableClassName, argCount)
            val methodCallableInfo = GenericClassNameInfo(methodCallableClassName, argCount)

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
                                CoreType.invalidJvmLambdaException
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
                .addSuperclassConstructorParameter(CONTAINER_ARGUMENT_NAME)
                .addSuperclassConstructorParameter(BOUND_ARGS_ARGUMENT_NAME)

            val methodCallableClassBuilder = TypeSpec
                .classBuilder(methodCallableClassName)
                .superclass(METHOD_CALLABLE_CLASS_NAME)
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
                                    TARGET_ARGUMENT_NAME,
                                    API.`object`
                                )
                                .build()
                        )
                        .addParameter(
                            ParameterSpec
                                .builder(
                                    METHOD_NAME_ARGUMENT_NAME,
                                    CoreType.stringName
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
                .addSuperclassConstructorParameter(TARGET_ARGUMENT_NAME)
                .addSuperclassConstructorParameter(METHOD_NAME_ARGUMENT_NAME)
                .addSuperclassConstructorParameter(BOUND_ARGS_ARGUMENT_NAME)

            val typeVariables = genericParameters.toMutableList()
            var remainingParameters = 0
            while (typeVariables.isNotEmpty()) {
                val boundCallableClassName = CoreType.callable(remainingParameters)
                val boundLambdaCallableClassName = CoreType.lambdaCallable(remainingParameters)
                val boundMethodCallableClassName = CoreType.methodCallable(remainingParameters)

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
                                append("return·%T($CONTAINER_ARGUMENT_NAME, arrayOf<Any?>(")

                                for (index in (0..<typeVariables.size)) {
                                    if (index != 0) append(",·")
                                    append("p${index + remainingParameters}")
                                }

                                append(", *$BOUND_ARGS_ARGUMENT_NAME))")
                            },
                            boundLambdaCallableClassName.parameterizedBy(listOf(returnTypeParameter) + bindInfo.genericTypes),
                        )
                        .build()
                )

                methodCallableClassBuilder.addFunction(
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
                                append("return·%T($TARGET_ARGUMENT_NAME, $METHOD_NAME_ARGUMENT_NAME, arrayOf<Any?>(")

                                for (index in (0..<typeVariables.size)) {
                                    if (index != 0) append(",·")
                                    append("p${index + remainingParameters}")
                                }

                                append(", *$BOUND_ARGS_ARGUMENT_NAME))")
                            },
                            boundMethodCallableClassName.parameterizedBy(listOf(returnTypeParameter) + bindInfo.genericTypes),
                        )
                        .build()
                )

                typeVariables.removeFirst()
                ++remainingParameters
            }

            callableFileSpec.addType(callableClassBuilder.build())
            containerFileSpec.addType(lambdaContainerClassBuilder.build())
            lambdaFileSpec.addType(lambdaCallableClassBuilder.build())
            methodFileSpec.addType(methodCallableClassBuilder.build())


            val variantMapperMember = Function.variantMapper
            lambdaFileSpec.addFunction(
                FunSpec.builder(CALLABLE_FUNCTION_NAME + argCount)
                    .addTypeVariable(returnTypeParameter.copy(reified = true))
                    .addTypeVariables(genericParameters.map { it.copy(reified = true) })
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
                                append("%M.getOrDefault(%T::class,·%M),·arrayOf(")
                                genericParameters.forEachIndexed { index, _ ->
                                    if (index != 0) append(",·")
                                    append("%M[%T::class]!!")
                                }
                                append("),·")
                                append(FUNCTION_PARAMETER_NAME)
                                append("))")
                            },
                            lambdaInfo.className.parameterizedBy(listOf(returnTypeParameter) + genericParameters),
                            containerInfo.className.parameterizedBy(listOf(returnTypeParameter) + genericParameters),
                            variantMapperMember,
                            returnTypeParameter,
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

            lambdaFileSpec
                .addFunction(
                    FunSpec
                        .builder(Function.asCallable.simpleName)
                        .addTypeVariable(returnTypeParameter.copy(reified = true))
                        .addTypeVariables(genericParameters.map { it.copy(reified = true) })
                        .addModifiers(KModifier.INLINE)
                        .receiver(lambdaTypeName)
                        .addCode("return·$CALLABLE_FUNCTION_NAME$argCount(this)")
                        .build()
                )

            val objectGeneric = TypeVariableName("T", API.`object`)
            methodFileSpec
                .addFunction(
                    FunSpec.builder(CALLABLE_FUNCTION_NAME + argCount)
                        .addTypeVariable(objectGeneric)
                        .addTypeVariable(returnTypeParameter)
                        .addTypeVariables(genericParameters)
                        .receiver(objectGeneric)
                        .addParameters(
                            listOf(
                                ParameterSpec
                                    .builder(
                                        CALLABLE_FUNCTION_NAME,
                                        methodCallableInfo.toLambdaTypeName(returnType = returnTypeParameter, receiver = objectGeneric)
                                    )
                                    .build()
                            )
                        )
                        .addCode(
                            CodeBlock.of(
                                "return·%T(this,·($CALLABLE_FUNCTION_NAME·as·%T<R>).name.%M())",
                                methodCallableClassName.parameterizedBy(listOf(returnTypeParameter) + genericParameters),
                                KCallable::class,
                                Function.toGodotName,
                            )
                        )
                        .build()
                )
        }

        callableFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(Kotlin.suppress)
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .build()
            )
            .build()
            .writeTo(outputDir)

        containerFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(Kotlin.suppress)
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .build()
            )
            .build()
            .writeTo(outputDir)

        lambdaFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(Kotlin.suppress)
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .build()
            )
            .build()
            .writeTo(outputDir)

        methodFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(Kotlin.suppress)
                    .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                    .addMember("\"unused\"")
                    .build()
            )
            .build()
            .writeTo(outputDir)
    }
}



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
import com.squareup.kotlinpoet.asClassName
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.ICallableGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.GodotFunctions
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.STRING_NAME
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotInteropPackage
import java.io.File
import kotlin.reflect.KCallable


object CallableGenerationService : ICallableGenerationService {
    private const val CALLABLE_NAME = "Callable"
    private const val LAMBDA_CALLABLE_NAME = "LambdaCallable"
    private const val LAMBDA_CONTAINER_NAME = "LambdaContainer"
    private const val METHOD_CALLABLE_NAME = "MethodCallable"

    private const val FUNCTION_PARAMETER_NAME = "function"
    private const val CONTAINER_ARGUMENT_NAME = "container"
    private const val TARGET_ARGUMENT_NAME = "target"
    private const val METHOD_NAME_ARGUMENT_NAME = "methodName"
    private const val BOUND_ARGS_ARGUMENT_NAME = "boundArgs"
    private const val CALLABLE_FUNCTION_NAME = "callable"
    private const val VARIANT_TYPE_RETURN_NAME = "returnConverter"
    private const val VARIANT_TYPE_ARGUMENT_NAME = "typeConverters"

    private val CALLABLE_CLASS_NAME = ClassName(godotCorePackage, CALLABLE_NAME)
    private val LAMBDA_CALLABLE_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CALLABLE_NAME)
    private val LAMBDA_CONTAINER_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CONTAINER_NAME)
    private val METHOD_CALLABLE_CLASS_NAME = ClassName(godotCorePackage, METHOD_CALLABLE_NAME)

    private val returnTypeParameter = TypeVariableName("R", ANY.copy(nullable = true))
    private val variantConverterClassName = ClassName(godotInteropPackage, GodotKotlinJvmTypes.variantConverter)

    override fun generate(outputDir: File) {
        val callableFileSpec = FileSpec.builder(godotCorePackage, CALLABLE_NAME + "s")
        val lambdaFileSpec = FileSpec.builder(godotCorePackage, LAMBDA_CALLABLE_NAME + "s")
        val containerFileSpec = FileSpec.builder(godotCorePackage, LAMBDA_CONTAINER_NAME + "s")
        val methodFileSpec = FileSpec.builder(godotCorePackage, METHOD_CALLABLE_NAME + "s")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            callableFileSpec.generateCallables(argCount)
            methodFileSpec.generateMethodCallables(argCount)
            containerFileSpec.generateLambdaContainer(argCount)
            lambdaFileSpec.generateLambdaCallables(argCount)
        }

        callableFileSpec.buildTo(outputDir)
        containerFileSpec.buildTo(outputDir)
        lambdaFileSpec.buildTo(outputDir)
        methodFileSpec.buildTo(outputDir)
    }

    fun FileSpec.Builder.generateCallables(argCount: Int) {
        val callableClassName = ClassName(godotCorePackage, "$CALLABLE_NAME$argCount")
        val callableInfo = GenericClassNameInfo(callableClassName, argCount)
        val genericParameters = callableInfo.genericTypes

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
                    .addParameters(callableInfo.toParameterSpecList())
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

        generateBindMethods(argCount) { remaining, parameters ->
            val remainingParameters = remaining.size
            val boundCallableClassName = ClassName(godotCorePackage, "$CALLABLE_NAME${remainingParameters}")
            callableClassBuilder.addFunction(
                FunSpec.builder("bind")
                    .addModifiers(KModifier.ABSTRACT)
                    .addParameters(
                        parameters.mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                            ParameterSpec.builder("p${index + remainingParameters}", typeVariableName)
                                .build()
                        }
                    )
                    .returns(boundCallableClassName.parameterizedBy(listOf(returnTypeParameter) + remaining))
                    .build()
            )
        }

        addType(callableClassBuilder.build())
    }

    fun FileSpec.Builder.generateMethodCallables(argCount: Int) {
        val callableClassName = ClassName(godotCorePackage, "$CALLABLE_NAME$argCount")
        val methodCallableClassName = ClassName(godotCorePackage, "$METHOD_CALLABLE_NAME$argCount")
        val methodCallableInfo = GenericClassNameInfo(methodCallableClassName, argCount)
        val genericParameters = methodCallableInfo.genericTypes

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
                                GODOT_OBJECT
                            )
                            .build()
                    )
                    .addParameter(
                        ParameterSpec
                            .builder(
                                METHOD_NAME_ARGUMENT_NAME,
                                STRING_NAME
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

        generateBindMethods(argCount) { remaining, parameters ->
            val boundMethodCallableClassName = ClassName(godotCorePackage, "$METHOD_CALLABLE_NAME${remaining.size}")
            methodCallableClassBuilder.addFunction(
                FunSpec.builder("bind")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameters(
                        parameters.mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                            ParameterSpec.builder("p${index + remaining.size}", typeVariableName)
                                .build()
                        }
                    )
                    .addCode(
                        buildString {
                            append("return·%T($TARGET_ARGUMENT_NAME, $METHOD_NAME_ARGUMENT_NAME, arrayOf<Any?>(")

                            for (index in (0..<parameters.size)) {
                                if (index != 0) append(",·")
                                append("p${index + remaining.size}")
                            }

                            append(", *$BOUND_ARGS_ARGUMENT_NAME))")
                        },
                        boundMethodCallableClassName.parameterizedBy(listOf(returnTypeParameter) + remaining),
                    )
                    .build()
            )
        }

        addType(methodCallableClassBuilder.build())

        val objectGeneric = TypeVariableName("T", GODOT_OBJECT)
        addFunction(
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
                        KCallable::class.asClassName(),
                        TO_GODOT_NAME_UTIL_FUNCTION,
                    )
                )
                .build()
        )

    }

    fun FileSpec.Builder.generateLambdaContainer(argCount: Int) {
        val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_NAME$argCount")
        val containerInfo = GenericClassNameInfo(lambdaContainerClassName, argCount)
        val genericParameters = containerInfo.genericTypes

        val lambdaTypeName = containerInfo.toLambdaTypeName(returnType = returnTypeParameter)

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
                                append(containerInfo.toArgumentsString("args[INDEX]", "INDEX"))
                                append(")?:·throw·%T()")
                            },
                            containerInfo.toErasedLambdaTypeName(returnType = returnTypeParameter),
                            ClassName(godotCorePackage, "InvalidJvmLambdaException")
                        )
                    )
                    .build()

            )

        addType(lambdaContainerClassBuilder.build())
    }

    fun FileSpec.Builder.generateLambdaCallables(argCount: Int) {
        val callableClassName = ClassName(godotCorePackage, "$CALLABLE_NAME$argCount")
        val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_NAME$argCount")
        val lambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_NAME$argCount")
        val containerInfo = GenericClassNameInfo(lambdaContainerClassName, argCount)
        val lambdaInfo = GenericClassNameInfo(lambdaCallableClassName, argCount)
        val genericParameters = containerInfo.genericTypes

        val lambdaTypeName = containerInfo.toLambdaTypeName(returnType = returnTypeParameter)

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

        generateBindMethods(argCount) { remaining, parameters ->
            val boundLambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_NAME${remaining.size}")

            lambdaCallableClassBuilder.addFunction(
                FunSpec.builder("bind")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameters(
                        parameters.mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                            ParameterSpec.builder("p${index + remaining.size}", typeVariableName)
                                .build()
                        }
                    )
                    .addCode(
                        buildString {
                            append("return·%T($CONTAINER_ARGUMENT_NAME, arrayOf<Any?>(")

                            for (index in (0..<parameters.size)) {
                                if (index != 0) append(",·")
                                append("p${index + remaining.size}")
                            }

                            append(", *$BOUND_ARGS_ARGUMENT_NAME))")
                        },
                        boundLambdaCallableClassName.parameterizedBy(listOf(returnTypeParameter) + remaining),
                    )
                    .build()
            )
        }

        addType(lambdaCallableClassBuilder.build())

        val variantMapperMember = MemberName(godotCorePackage, "getVariantConverter")
        addFunction(
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
                            append("%M<%T>()!!,·arrayOf(")
                            genericParameters.forEachIndexed { index, _ ->
                                if (index != 0) append(",·")
                                append("%M<%T>()!!")
                            }
                            append("),·")
                            append(FUNCTION_PARAMETER_NAME)
                            append("))")
                        },
                        lambdaInfo.className.parameterizedBy(listOf(returnTypeParameter) + genericParameters),
                        containerInfo.className.parameterizedBy(listOf(returnTypeParameter) + genericParameters),
                        variantMapperMember,
                        returnTypeParameter,
                        *genericParameters
                            .flatMap {
                                listOf(variantMapperMember, it)
                            }
                            .toTypedArray()
                    )
                )
                .build()
        )

        addFunction(
            FunSpec
                .builder(GodotFunctions.asCallable)
                .addTypeVariable(returnTypeParameter.copy(reified = true))
                .addTypeVariables(genericParameters.map { it.copy(reified = true) })
                .addModifiers(KModifier.INLINE)
                .receiver(lambdaTypeName)
                .addCode("return·$CALLABLE_FUNCTION_NAME$argCount(this)")
                .build()
        )
    }

    inline fun generateBindMethods(argCount: Int, block: (remaining: MutableList<TypeVariableName>, parameters: MutableList<TypeVariableName>) -> Unit) {
        val remainingGenerics = GenericClassNameInfo(numberOfGenericParameters = argCount).genericTypes.toMutableList()
        val parameterTypes = ArrayList<TypeVariableName>().toMutableList()

        while (remainingGenerics.isNotEmpty()) {
            val type = remainingGenerics.removeLast()
            parameterTypes.add(0, type)
            block(remainingGenerics, parameterTypes)
        }
    }


    fun FileSpec.Builder.buildTo(dir: File) {
        addAnnotation(
            AnnotationSpec
                .builder(ClassName("kotlin", "Suppress"))
                .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                .addMember("\"unused\"")
                .addMember("\"RedundantVisibilityModifier\"")
                .build()
        )
            .build()
            .writeTo(dir)
    }
}

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
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.buildCodeBlock
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.ICallableGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.AS_STRING_NAME_UTIL_FUNCTION
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.GodotFunctions
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.STRING_NAME
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotInteropPackage
import java.io.File
import java.lang.Class
import java.lang.Void
import kotlin.jvm.JvmName
import kotlin.reflect.KCallable


object CallableGenerationService : ICallableGenerationService {
    private const val FUNCTION_PARAMETER_NAME = "function"
    private const val CONTAINER_ARGUMENT_NAME = "container"
    private const val TARGET_ARGUMENT_NAME = "target"
    private const val METHOD_NAME_ARGUMENT_NAME = "methodName"
    private const val BOUND_ARGS_ARGUMENT_NAME = "boundArgs"
    private const val CALLABLE_PARAMETER_NAME = "callable"
    private const val METHOD_CALLABLE_FUNCTION_NAME = "callable"
    private const val LAMBDA_CALLABLE_FUNCTION_NAME = "callable"
    private const val VARIANT_TYPE_RETURN_NAME = "returnConverter"
    private const val VARIANT_TYPE_ARGUMENT_NAME = "typeConverters"

    private val CALLABLE_CLASS_NAME = ClassName(godotCorePackage, CALLABLE_CLASS_BASENAME)
    private val LAMBDA_CALLABLE_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CALLABLE_CLASS_BASENAME)
    private val LAMBDA_CONTAINER_CLASS_NAME = ClassName(godotCorePackage, LAMBDA_CONTAINER_CLASS_BASENAME)
    private val METHOD_CALLABLE_CLASS_NAME = ClassName(godotCorePackage, METHOD_CALLABLE_CLASS_BASENAME)

    private val javaClassClassName = Class::class.asClassName()
    private val returnTypeParameter = TypeVariableName("R", ANY.copy(nullable = true))
    private val variantConverterClassName = ClassName(godotInteropPackage, GodotKotlinJvmTypes.variantConverter)

    private fun kotlinJavaHelperName(baseName: String) = "_${baseName}Java"

    override fun generate(outputDir: File) {
        val callableFileSpec = FileSpec.builder(godotCorePackage, CALLABLE_CLASS_BASENAME + "s")
        val jvmFunctionFileSpec = FileSpec.builder(godotCorePackage, JVM_FUNCTION_CLASS_BASENAME + "s")
        val lambdaFileSpec = FileSpec.builder(godotCorePackage, LAMBDA_CALLABLE_CLASS_BASENAME + "s")
        val containerFileSpec = FileSpec.builder(godotCorePackage, LAMBDA_CONTAINER_CLASS_BASENAME + "s")
        val methodFileSpec = FileSpec.builder(godotCorePackage, METHOD_CALLABLE_CLASS_BASENAME + "s")


        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            callableFileSpec.generateCallables(argCount)
            jvmFunctionFileSpec.generateJvmLambdas(argCount)
            methodFileSpec.generateMethodStringName(argCount)
            methodFileSpec.generateMethodCallables(argCount)
            containerFileSpec.generateLambdaContainer(argCount)
            lambdaFileSpec.generateLambdaCallables(argCount)
        }

        callableFileSpec.buildTo(outputDir)
        jvmFunctionFileSpec.buildTo(outputDir)
        containerFileSpec.buildTo(outputDir)
        lambdaFileSpec.buildTo(outputDir)
        methodFileSpec.buildTo(outputDir)
    }

    fun FileSpec.Builder.generateJvmLambdas(argCount: Int) {
        val jvmFunctionClassName = ClassName(godotCorePackage, "$JVM_FUNCTION_CLASS_BASENAME$argCount")
        val jvmFunctionInfo = GenericClassNameInfo(jvmFunctionClassName, argCount)
        val functionSuperinterface = when (argCount) {
            0 -> ClassName("kotlin", "Function0").parameterizedBy(returnTypeParameter)
            else -> ClassName("kotlin", "Function$argCount").parameterizedBy(jvmFunctionInfo.genericTypes + returnTypeParameter)
        }

        addType(
            TypeSpec
                .interfaceBuilder(jvmFunctionClassName)
                .addSuperinterface(functionSuperinterface)
                .addTypeVariable(returnTypeParameter)
                .addTypeVariables(jvmFunctionInfo.genericTypes)
                .addFunction(
                    FunSpec
                        .builder(METHOD_NAME_INVOKE)
                        .addModifiers(KModifier.ABSTRACT)
                        .addModifiers(KModifier.OVERRIDE)
                        .addParameters(jvmFunctionInfo.toParameterSpecList())
                        .returns(returnTypeParameter)
                        .build()
                )
                .build()
        )

        val jvmActionClassName = ClassName(godotCorePackage, "$JVM_ACTION_CLASS_BASENAME$argCount")
        val jvmActionInfo = GenericClassNameInfo(jvmActionClassName, argCount)
        addType(
            TypeSpec
                .interfaceBuilder(jvmActionClassName)
                .addTypeVariables(jvmActionInfo.genericTypes)
                .addFunction(
                    FunSpec
                        .builder(METHOD_NAME_INVOKE)
                        .addModifiers(KModifier.ABSTRACT)
                        .addParameters(jvmActionInfo.toParameterSpecList())
                        .returns(UNIT)
                        .build()
                )
                .build()
        )
    }

    fun FileSpec.Builder.generateCallables(argCount: Int) {
        val callableClassName = ClassName(godotCorePackage, "$CALLABLE_CLASS_BASENAME$argCount")
        val callableInfo = GenericClassNameInfo(callableClassName, argCount)
        val genericParameters = callableInfo.genericTypes

        val callableClassBuilder = TypeSpec
            .interfaceBuilder(callableClassName)
            .addSuperinterface(CALLABLE_CLASS_NAME)
            .addTypeVariable(returnTypeParameter)
            .addTypeVariables(genericParameters)
            .addFunction(
                FunSpec
                    .builder(METHOD_NAME_CALL)
                    .addParameters(callableInfo.toParameterSpecList())
                    .returns(returnTypeParameter)
                    .addCode(
                        CodeBlock.of(
                            buildString {
                                append("return·callUnsafe(")
                                append(callableInfo.toArgumentsString("pINDEX", "INDEX"))
                                append(") as R")
                            },
                            *genericParameters.toTypedArray()
                        )
                    )
                    .build()
            )
            .addFunction(
                FunSpec.builder(METHOD_NAME_CALL_DEFERRED)
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
                FunSpec.builder(METHOD_NAME_INVOKE)
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
            val boundCallableClassName = ClassName(godotCorePackage, "$CALLABLE_CLASS_BASENAME${remainingParameters}")
            callableClassBuilder.addFunction(
                FunSpec.builder(METHOD_NAME_BIND)
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
        val callableClassName = ClassName(godotCorePackage, "$CALLABLE_CLASS_BASENAME$argCount")
        val methodCallableClassName = ClassName(godotCorePackage, "$METHOD_CALLABLE_CLASS_BASENAME$argCount")
        val methodStringClassName = ClassName(godotCorePackage, "$METHOD_STRING_CLASS_BASENAME$argCount")
        val methodCallableInfo = GenericClassNameInfo(methodCallableClassName, argCount)
        val genericParameters = methodCallableInfo.genericTypes

        val objectType = TypeVariableName("T", GODOT_OBJECT)

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
            val boundMethodCallableClassName = ClassName(godotCorePackage, "$METHOD_CALLABLE_CLASS_BASENAME${remaining.size}")
            methodCallableClassBuilder.addFunction(
                FunSpec.builder(METHOD_NAME_BIND)
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

        val genericMethodCallable = methodCallableClassName.parameterizedBy(listOf(returnTypeParameter) + genericParameters)
        val companion = TypeSpec
            .companionObjectBuilder()
            .addFunction(
                methodCallableInfo
                    .toFunSpecBuilder(kotlinJavaHelperName(METHOD_NAME_CREATE_UNSAFE), prefix = listOf(returnTypeParameter))
                    .addParameter(ParameterSpec.builder("godotObject", GODOT_OBJECT).build())
                    .addParameter(ParameterSpec.builder("methodName", STRING).build())
                    .returns(genericMethodCallable)
                    .addCode(
                        "return·%T(godotObject,·methodName.%M())",
                        genericMethodCallable,
                        TO_GODOT_NAME_UTIL_FUNCTION
                    )
                    .addAnnotation(JvmStatic::class)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("%S", METHOD_NAME_CREATE_UNSAFE)
                            .build()
                    )
                    .build()
            )
            .addFunction(
                methodCallableInfo
                    .toFunSpecBuilder(kotlinJavaHelperName(METHOD_NAME_CREATE), prefix = listOf(objectType, returnTypeParameter))
                    .addParameter(ParameterSpec.builder("godotObject", objectType).build())
                    .addParameter(
                        ParameterSpec.builder(
                            "methodName",
                            methodStringClassName.parameterizedBy(listOf(objectType, returnTypeParameter) + genericParameters)
                        ).build()
                    )
                    .returns(genericMethodCallable)
                    .addCode(
                        "return·methodName.toCallable(godotObject)",
                    )
                    .addAnnotation(JvmStatic::class)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("%S", METHOD_NAME_CREATE)
                            .build()
                    )
                    .build()
            )

        methodCallableClassBuilder.addType(companion.build())
        addType(methodCallableClassBuilder.build())

        val objectGeneric = TypeVariableName("T", GODOT_OBJECT)
        addFunction(
            FunSpec.builder(METHOD_CALLABLE_FUNCTION_NAME + argCount)
                .addTypeVariable(objectGeneric)
                .addTypeVariable(returnTypeParameter)
                .addTypeVariables(genericParameters)
                .addParameters(
                    listOf(
                        ParameterSpec
                            .builder(
                                TARGET_ARGUMENT_NAME,
                                objectGeneric
                            )
                            .build(),
                        ParameterSpec
                            .builder(
                                CALLABLE_PARAMETER_NAME,
                                methodCallableInfo.toLambdaTypeName(returnType = returnTypeParameter, receiver = objectGeneric)
                            )
                            .build()
                    )
                )
                .addCode(
                    CodeBlock.of(
                        "return·%T($TARGET_ARGUMENT_NAME,·($CALLABLE_PARAMETER_NAME·as·%T<R>).name.%M())",
                        methodCallableClassName.parameterizedBy(listOf(returnTypeParameter) + genericParameters),
                        KCallable::class.asClassName(),
                        TO_GODOT_NAME_UTIL_FUNCTION,
                    )
                )
                .addAnnotation(JvmSynthetic::class)
                .build()
        )
    }

    fun FileSpec.Builder.generateMethodStringName(argCount: Int) {
        val methodCallableClassName = ClassName(godotCorePackage, "$METHOD_CALLABLE_CLASS_BASENAME$argCount")
        val methodStringClassName = ClassName(godotCorePackage, "$METHOD_STRING_CLASS_BASENAME$argCount")
        val methodCallableInfo = GenericClassNameInfo(methodStringClassName, argCount)
        val genericParameters = methodCallableInfo.genericTypes

        val objectType = TypeVariableName("T", GODOT_OBJECT)

        val classBuilder = methodCallableInfo.toTypeSpecBuilder(prefix = listOf(objectType, returnTypeParameter))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.PRIVATE)
                    .addParameter("methodName", STRING_NAME)
                    .build()
            )
            .addFunction(
                FunSpec.constructorBuilder()
                    .addParameter("methodName", STRING)
                    .callThisConstructor(buildCodeBlock {
                        add("methodName.%M()", AS_STRING_NAME_UTIL_FUNCTION)
                    })
                    .build()
            )
            .addProperty(
                PropertySpec.builder("methodName", STRING_NAME)
                    .initializer("methodName")
                    .addModifiers(KModifier.PUBLIC)
                    .build()
            )
            .addFunction(
                FunSpec.builder(METHOD_NAME_TO_CALLABLE)
                    .addModifiers(KModifier.INTERNAL)
                    .addParameter("godotObject", objectType)
                    .addStatement(
                        "return %T(godotObject, methodName)",
                        methodCallableClassName.parameterizedBy(listOf(returnTypeParameter) + genericParameters)
                    )
                    .build()
            )
            .build()
        addType(classBuilder)
    }

    fun FileSpec.Builder.generateLambdaContainer(argCount: Int) {
        val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_CLASS_BASENAME$argCount")
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
                    .builder(METHOD_NAME_INVOKE_UNSAFE)
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
                            ClassName(godotCorePackage, INVALID_JVM_LAMBDA_EXCEPTION_CLASS_NAME)
                        )
                    )
                    .build()

            )

        addType(lambdaContainerClassBuilder.build())
    }

    fun FileSpec.Builder.generateLambdaCallables(argCount: Int) {
        val callableClassName = ClassName(godotCorePackage, "$CALLABLE_CLASS_BASENAME$argCount")
        val jvmActionClassName = ClassName(godotCorePackage, "$JVM_ACTION_CLASS_BASENAME$argCount")
        val jvmFunctionClassName = ClassName(godotCorePackage, "$JVM_FUNCTION_CLASS_BASENAME$argCount")
        val lambdaContainerClassName = ClassName(godotCorePackage, "$LAMBDA_CONTAINER_CLASS_BASENAME$argCount")
        val lambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_CLASS_BASENAME$argCount")
        val containerInfo = GenericClassNameInfo(lambdaContainerClassName, argCount)
        val lambdaInfo = GenericClassNameInfo(lambdaCallableClassName, argCount)
        val genericParameters = containerInfo.genericTypes

        val lambdaTypeName = containerInfo.toLambdaTypeName(returnType = returnTypeParameter)
        val variantMapperMember = MemberName(godotCorePackage, METHOD_NAME_GET_VARIANT_CONVERTER)
        val voidClassName = Void::class.asClassName()
        val nullableVoidType = voidClassName.copy(nullable = true)
        val genericJvmAction = if (genericParameters.isEmpty()) {
            jvmActionClassName
        } else {
            jvmActionClassName.parameterizedBy(genericParameters)
        }

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
            val boundLambdaCallableClassName = ClassName(godotCorePackage, "$LAMBDA_CALLABLE_CLASS_BASENAME${remaining.size}")

            lambdaCallableClassBuilder.addFunction(
                FunSpec.builder(METHOD_NAME_BIND)
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

        val genericJvmFunction = jvmFunctionClassName.parameterizedBy(listOf(returnTypeParameter) + genericParameters)
        val genericLambdaCallable = lambdaCallableClassName.parameterizedBy(listOf(returnTypeParameter) + genericParameters)
        val companionBuilder = TypeSpec
            .companionObjectBuilder()
            .addFunction(
                lambdaInfo
                    .toFunSpecBuilder(kotlinJavaHelperName(METHOD_NAME_CREATE), prefix = listOf(returnTypeParameter))
                    .addParameters(
                        buildList {
                            add(ParameterSpec.builder("returnType", javaClassClassName.parameterizedBy(returnTypeParameter)).build())
                            addAll(
                                genericParameters.mapIndexed { index, typeVariableName ->
                                    ParameterSpec.builder("p${index}Type", javaClassClassName.parameterizedBy(typeVariableName)).build()
                                }
                            )
                            add(ParameterSpec.builder(FUNCTION_PARAMETER_NAME, genericJvmFunction).build())
                        }
                    )
                    .returns(genericLambdaCallable)
                    .addCode(
                        buildCodeBlock {
                            add(
                                "return %T(%T(",
                                genericLambdaCallable,
                                containerInfo.className.parameterizedBy(listOf(returnTypeParameter) + genericParameters)
                            )
                            add("%M(returnType)!!, arrayOf(", variantMapperMember)
                            genericParameters.forEachIndexed { index, _ ->
                                if (index != 0) add(", ")
                                add("%M(p${index}Type)!!", variantMapperMember)
                            }
                            add("), %L))", FUNCTION_PARAMETER_NAME)
                        }
                    )
                    .addAnnotation(JvmStatic::class)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("%S", METHOD_NAME_CREATE)
                            .build()
                    )
                    .build()
            )
            .addFunction(
                lambdaInfo
                    .toFunSpecBuilder(kotlinJavaHelperName(METHOD_NAME_CREATE))
                    .addParameters(
                        buildList {
                            addAll(
                                genericParameters.mapIndexed { index, typeVariableName ->
                                    ParameterSpec.builder("p${index}Type", javaClassClassName.parameterizedBy(typeVariableName)).build()
                                }
                            )
                            add(ParameterSpec.builder("action", genericJvmAction).build())
                        }
                    )
                    .returns(lambdaCallableClassName.parameterizedBy(listOf(nullableVoidType) + genericParameters))
                    .addCode(
                        buildCodeBlock {
                            add(
                                "return %T(%T(",
                                lambdaCallableClassName.parameterizedBy(listOf(nullableVoidType) + genericParameters),
                                containerInfo.className.parameterizedBy(listOf(nullableVoidType) + genericParameters)
                            )
                            add("%M(%T::class.java)!!, arrayOf(", variantMapperMember, voidClassName)
                            genericParameters.forEachIndexed { index, _ ->
                                if (index != 0) add(", ")
                                add("%M(p${index}Type)!!", variantMapperMember)
                            }
                            add("), ")
                            add("object : %T ", jvmFunctionClassName.parameterizedBy(listOf(nullableVoidType) + genericParameters))
                            beginControlFlow("{")
                            beginControlFlow("override fun invoke(${containerInfo.toParameterSpecList().joinToString(", ") { "${it.name}: ${it.type}" }}): %T", nullableVoidType)
                            addStatement("action.invoke(${containerInfo.toArgumentsString("pINDEX", "INDEX")})")
                            addStatement("return null")
                            endControlFlow()
                            endControlFlow()
                            add("))")
                        }
                    )
                    .addAnnotation(JvmStatic::class)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("%S", METHOD_NAME_CREATE)
                            .build()
                    )
                    .build()
            )

        lambdaCallableClassBuilder.addType(companionBuilder.build())

        addType(lambdaCallableClassBuilder.build())
        addFunction(
            FunSpec.builder(LAMBDA_CALLABLE_FUNCTION_NAME + argCount)
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
                .addCode("return·$LAMBDA_CALLABLE_FUNCTION_NAME$argCount(this)")
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

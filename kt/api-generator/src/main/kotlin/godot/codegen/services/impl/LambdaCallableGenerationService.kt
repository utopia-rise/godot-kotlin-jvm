package godot.codegen.services.impl

import com.squareup.kotlinpoet.ANY
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
import godot.codegen.services.ILambdaCallableGenerationService
import godot.codegen.utils.GenericClassNameInfo
import godot.common.constants.Constraints
import godot.tools.common.constants.GodotFunctions
import godot.tools.common.constants.GodotKotlinJvmTypes
import godot.tools.common.constants.VARIANT_PARSER_NIL
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.godotInteropPackage
import godot.tools.common.constants.godotExtensionPackage
import java.io.File

class LambdaCallableGenerationService : ILambdaCallableGenerationService {
    override fun generate(outputDir: File) {
        val callableFileSpec = FileSpec.builder(godotExtensionPackage, "Callables")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val ktCallableClassName = ClassName(godotExtensionPackage, "$KT_CALLABLE_NAME$argCount")
            val classBuilder = TypeSpec
                .classBuilder(ktCallableClassName)
                .superclass(
                    KT_CALLABLE_CLASS_NAME
                        .parameterizedBy(returnTypeParameter)
                )

            val argumentRange = 0..<argCount

            classBuilder
                .addSuperclassConstructorParameter(
                    VARIANT_TYPE_ARGUMENT_NAME
                )

            for (index in argumentRange) {
                classBuilder.addSuperclassConstructorParameter("p${index}Type")
            }

            val typeVariableNames = argumentRange
                .map {
                    TypeVariableName("P$it")
                }

            classBuilder
                .addTypeVariables(
                    typeVariableNames
                )
                .addTypeVariable(returnTypeParameter)

            val primaryConstructor = FunSpec.constructorBuilder()

            val lambdaTypeName = LambdaTypeName.get(
                receiver = null,
                parameters = typeVariableNames
                    .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                        ParameterSpec.builder("p$index", typeVariableName).build()
                    },
                returnType = returnTypeParameter
            )

            classBuilder
                .addProperty(
                    PropertySpec
                        .builder(
                            FUNCTION_PARAMETER_NAME,
                            lambdaTypeName,
                            KModifier.PRIVATE
                        )
                        .initializer(FUNCTION_PARAMETER_NAME)
                        .build()
                )

            val variantConverterClassName = ClassName(
                godotInteropPackage,
                GodotKotlinJvmTypes.variantConverter
            )

            primaryConstructor
                .addParameter(
                    ParameterSpec
                        .builder(
                            VARIANT_TYPE_ARGUMENT_NAME,
                            variantConverterClassName
                        )
                        .build()
                )

            for (arg in argumentRange) {
                val typeProperty = "p${arg}Type"

                if (arg != argumentRange.last) {
                    classBuilder
                        .addProperty(
                            PropertySpec
                                .builder(
                                    typeProperty,
                                    variantConverterClassName,
                                    KModifier.PRIVATE
                                )
                                .initializer(typeProperty)
                                .build()
                        )
                }

                primaryConstructor
                    .addParameter(
                        ParameterSpec
                            .builder(
                                typeProperty,
                                variantConverterClassName
                            )
                            .build()
                    )
            }

            primaryConstructor
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

            classBuilder.primaryConstructor(primaryConstructor.build())

            classBuilder
                .addFunction(
                    FunSpec.builder("invokeKt")
                        .returns(
                            returnTypeParameter
                        )
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·$FUNCTION_PARAMETER_NAME(")
                                    for (i in argumentRange) {
                                        if (i != 0) append(",·")

                                        append("paramsArray[$i]·as·%T")
                                    }
                                    append(')')
                                },
                                *typeVariableNames.toTypedArray()
                            )
                        )
                        .addModifiers(KModifier.OVERRIDE)
                        .build()
                )

            classBuilder
                .addFunction(
                    FunSpec.builder("invoke")
                        .returns(
                            returnTypeParameter
                        )
                        .addParameters(
                            typeVariableNames
                                .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                                    ParameterSpec.builder("p$index", typeVariableName)
                                        .build()
                                }
                        )
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·$FUNCTION_PARAMETER_NAME(")
                                    for (i in argumentRange) {
                                        if (i != 0) append(",·")

                                        append("p$i")
                                    }
                                    append(')')
                                }
                            )
                        )
                        .addModifiers(KModifier.OPERATOR)
                        .build()
                )

            classBuilder
                .addFunction(
                    FunSpec.builder("call")
                        .returns(ANY.copy(nullable = true))
                        .addParameter(
                            ParameterSpec.builder("args", ANY.copy(nullable = true))
                                .addModifiers(KModifier.VARARG)
                                .build()
                        )
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("return·$FUNCTION_PARAMETER_NAME(")
                                    for (i in argumentRange) {
                                        if (i != 0) append(",·")

                                        append("args[$i]·as·%T")
                                    }
                                    append(')')
                                },
                                *typeVariableNames.toTypedArray()
                            )
                        )
                        .addModifiers(KModifier.OVERRIDE)
                        .build()
                )

            val typeVariables = typeVariableNames.toMutableList()
            var removedTypeVariables = 0
            while (typeVariables.isNotEmpty()) {
                val bindReturnType =
                    ClassName(godotExtensionPackage, "$KT_CALLABLE_NAME${typeVariableNames.size - typeVariables.size}")
                classBuilder.addFunction(
                    FunSpec.builder("bind")
                        .addParameters(
                            typeVariables
                                .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                                    ParameterSpec.builder("p${index + removedTypeVariables}", typeVariableName)
                                        .build()
                                }
                        )
                        .addCode(
                            buildString {
                                append("return·%T($VARIANT_TYPE_ARGUMENT_NAME")

                                for (index in (0..<removedTypeVariables)) {
                                    append(",·p${index}Type")
                                }

                                append(")·{·")

                                for (index in (0..<removedTypeVariables)) {
                                    if (index != 0) append(",·")

                                    append("p${index}:·%T")
                                }

                                append("·->·$FUNCTION_PARAMETER_NAME(")

                                for (i in typeVariableNames.indices) {
                                    if (i != 0) append(",·")

                                    append("p$i")
                                }

                                append(")·}")
                            },
                            bindReturnType,
                            *typeVariableNames.take(removedTypeVariables).toTypedArray()
                        )
                        .build()
                )

                typeVariables.removeFirst()
                ++removedTypeVariables
            }

            val genericClassNameInfo = GenericClassNameInfo(ktCallableClassName, argCount)
            classBuilder.addType(generateKtCallableCompanion(argCount, genericClassNameInfo))

            callableFileSpec.addType(classBuilder.build())

            val variantMapperMember = MemberName(godotCorePackage, "variantMapper")
            callableFileSpec.addFunction(
                FunSpec.builder(CALLABLE_FUNCTION_NAME + argCount)
                    .addTypeVariables(typeVariableNames.map { it.copy(reified = true) })
                    .addTypeVariable(returnTypeParameter.copy(reified = true))
                    .addModifiers(KModifier.INLINE)
                    .addParameter(
                        ParameterSpec
                            .builder(
                                FUNCTION_PARAMETER_NAME,
                                lambdaTypeName
                            )
                            .addModifiers(KModifier.NOINLINE)
                            .build()
                    )
                    .addCode(
                        CodeBlock.of(
                            buildString {
                                append("return·$KT_CALLABLE_NAME$argCount(")
                                append("%M.getOrDefault(%T::class,·%T),·")
                                for (typeParameter in typeVariableNames) {
                                    append("%M[%T::class]!!,·")
                                }
                                append(FUNCTION_PARAMETER_NAME)
                                append(')')
                            },
                            variantMapperMember,
                            returnTypeParameter,
                            VARIANT_PARSER_NIL,
                            *typeVariableNames
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
                        .addTypeVariables(typeVariableNames.map { it.copy(reified = true) })
                        .addTypeVariable(returnTypeParameter.copy(reified = true))
                        .addModifiers(KModifier.INLINE)
                        .receiver(lambdaTypeName)
                        .addCode("return·$CALLABLE_FUNCTION_NAME$argCount(this)")
                        .build()
                )
        }

        callableFileSpec.addAnnotation(
            AnnotationSpec.builder(ClassName("kotlin", "Suppress"))
                .addMember("\"PackageDirectoryMismatch\", \"UNCHECKED_CAST\"")
                .build()
        )
            .build()
            .writeTo(outputDir)
    }

    // JAVA BRIDGE FUNCTION
    private fun generateKtCallableCompanion(argCount: Int, genericClassNameInfo: GenericClassNameInfo): TypeSpec {
        val variantMapperMember = MemberName(godotExtensionPackage, "variantMapper")

        return TypeSpec
            .companionObjectBuilder()
            .addFunction(
                FunSpec
                    .builder(JAVA_CREATE_METHOD_NAME)
                    .addTypeVariable(returnTypeParameter)
                    .addTypeVariables(genericClassNameInfo.genericTypes)
                    .addParameter(
                        ParameterSpec
                            .builder("returnClass", JAVA_CLASS_CLASS_NAME.parameterizedBy(returnTypeParameter))
                            .build()
                    )
                    .addParameters(genericClassNameInfo.toParameterSpecList().map {
                        ParameterSpec
                            .builder(it.name + "Class", JAVA_CLASS_CLASS_NAME.parameterizedBy(it.type))
                            .build()
                    })
                    .addParameter(
                        ParameterSpec
                            .builder(
                                FUNCTION_PARAMETER_NAME,
                                genericClassNameInfo.toLambdaTypeName(returnTypeParameter)
                            )
                            .build()
                    )
                    .addCode(
                        CodeBlock.of(
                            buildString {
                                append("return·$KT_CALLABLE_NAME$argCount(")
                                append("%M.getOrDefault(%T.getOrCreateKotlinClass(returnClass),·%T),·")
                                genericClassNameInfo.toParameterSpecList().forEach {
                                    append("%M[%T.getOrCreateKotlinClass(${it.name}Class)]!!,·")
                                }
                                append(FUNCTION_PARAMETER_NAME)
                                append(')')
                            },
                            variantMapperMember,
                            REFLECTION_CLASS_NAME,
                            VARIANT_PARSER_NIL,
                            *genericClassNameInfo.genericTypes
                                .flatMap {
                                    listOf(variantMapperMember, REFLECTION_CLASS_NAME)
                                }
                                .toTypedArray()
                        )
                    )
                    .addAnnotation(JvmStatic::class)
                    .addAnnotation(
                        AnnotationSpec
                            .builder(JvmName::class)
                            .addMember("\"create\"")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    private companion object {
        const val FUNCTION_PARAMETER_NAME = "function"
        const val KT_CALLABLE_NAME = "LambdaCallable"
        const val CALLABLE_FUNCTION_NAME = "callable"
        const val JAVA_CREATE_METHOD_NAME = "javaCreate"
        const val VARIANT_TYPE_ARGUMENT_NAME = "variantConverter"
        val KT_CALLABLE_CLASS_NAME = ClassName(godotCorePackage, KT_CALLABLE_NAME)
        val returnTypeParameter = TypeVariableName("R", ANY.copy(nullable = true))

        //Java
        val REFLECTION_CLASS_NAME = ClassName("kotlin.jvm.internal", "Reflection")
        val JAVA_CLASS_CLASS_NAME = ClassName("java.lang", "Class")
    }
}

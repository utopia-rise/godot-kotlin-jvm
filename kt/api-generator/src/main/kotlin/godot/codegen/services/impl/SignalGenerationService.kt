package godot.codegen.services.impl

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asClassName
import godot.codegen.services.ISignalGenerationService
import godot.tools.common.constants.AS_CALLABLE_UTIL_FUNCTION
import godot.tools.common.constants.GODOT_CALLABLE
import godot.tools.common.constants.GODOT_ERROR
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.kotlinReflectPackage
import kotlin.reflect.KCallable

class SignalGenerationService : ISignalGenerationService {

    // Helper that provide utilities to handle generic classes.
    private class GenericClassNameInfo(
        val className: ClassName,
        numberOfGenericParameters: Int
    ) {
        val genericTypes = Array(numberOfGenericParameters) {
            TypeVariableName("P$it")
        }.toList()
        val genericClassName = className.run {
            if (genericTypes.isNotEmpty()) {
                parameterizedBy(genericTypes)
            } else {
                this
            }
        }

        val reifiedTypes = genericTypes.map { it.copy(reified = true) }
        val reifiedClassName = className.run {
            if (reifiedTypes.isNotEmpty()) {
                parameterizedBy(reifiedTypes)
            } else {
                this
            }
        }

        val erasedGenericClassName = className.run {
            if (genericTypes.isNotEmpty()) {
                parameterizedBy(genericTypes.map { ANY })
            } else {
                this
            }
        }

        fun toTypeSpecBuilder() = TypeSpec
            .classBuilder(className)
            .addTypeVariables(genericTypes)

        fun toFunSpecBuilder(name: String) = FunSpec
            .builder(name)
            .addTypeVariables(genericTypes)

        fun toExtensionFunSpecBuilder(name: String) = toFunSpecBuilder(name).receiver(genericClassName)

        fun toReifiedFunSpecBuilder(name: String) = FunSpec
            .builder(name)
            .addTypeVariables(reifiedTypes)
            .addModifiers(KModifier.INLINE)

        fun toReifiedExtensionFunSpecBuilder(name: String) = toReifiedFunSpecBuilder(name).receiver(reifiedClassName)

        fun toParameterSpecList() = genericTypes
            .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                ParameterSpec.builder("p$index", typeVariableName).build()
            }
    }

    override fun generate(maxArgumentCount: Int): FileSpec {
        val signalFileSpec = FileSpec.builder(godotCorePackage, "Signals")


        for (argCount in 0..maxArgumentCount) {
            val signalClassName = ClassName(godotCorePackage, "$SIGNAL_CLASS_NAME$argCount")
            val genericClassNameInfo = GenericClassNameInfo(signalClassName, argCount)

            signalFileSpec.addType(generateSignalClass(argCount, genericClassNameInfo))

            signalFileSpec.addFunction(generateFakeSignalConstructor(argCount, genericClassNameInfo))
            signalFileSpec.addFunction(generateSignalDelegate(argCount, genericClassNameInfo))
            signalFileSpec.addFunction(generateSignalExtension(genericClassNameInfo))
        }

        return signalFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(Suppress::class)
                    .addMember("\"PackageDirectoryMismatch\"")
                    .addMember("\"NOTHING_TO_INLINE\"")
                    .addMember("\"UNUSED_PARAMETER\"")
                    .build()
            )
            .indent("    ")
            .build()

    }


    private fun generateSignalClass(argCount: Int, genericClassNameInfo: GenericClassNameInfo): TypeSpec {

        val flagsParameter = ParameterSpec.builder(FLAGS_PARAMETER_NAME, INT)
            .defaultValue("0")
            .build()

        val lambdaTypeName = LambdaTypeName.get(
            receiver = godotObjectBoundTypeVariable,
            parameters = genericClassNameInfo.toParameterSpecList(),
            returnType = UNIT
        )

        return genericClassNameInfo
            .toTypeSpecBuilder()
            .superclass(ClassName(godotCorePackage, SIGNAL_CLASS_NAME))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .addParameters(
                        listOf(
                            ParameterSpec.builder(INSTANCE_PARAMETER, GODOT_OBJECT).build(),
                            ParameterSpec.builder(NAME_PARAMETER, STRING).build()
                        )
                    )
                    .addAnnotation(PublishedApi::class)
                    .build()
            )
            .addSuperclassConstructorParameter(INSTANCE_PARAMETER)
            .addSuperclassConstructorParameter(NAME_PARAMETER)
            .addFunctions(
                listOf(
                    FunSpec.builder(EMIT_METHOD_NAME)
                        .returns(UNIT)
                        .addParameters(
                            genericClassNameInfo.toParameterSpecList()
                        )
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("emitSignal(")
                                    for (i in 0..<argCount) {
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
            .addType(generateSignalCompanion(argCount, genericClassNameInfo))
            .build()
    }

    private fun generateConnectionCodeBlock(isDisconnect: Boolean = false): CodeBlock {
        val methodName = if (isDisconnect) DISCONNECT_METHOD_NAME else CONNECT_METHOD_NAME
        val flagsParameters = if (isDisconnect) "" else ",·$FLAGS_PARAMETER_NAME"

        return CodeBlock.of(
            "return·$methodName(%T($TARGET_PARAMETER_NAME,·($METHOD_PARAMETER_NAME·as·%T<*>).name.%M())$flagsParameters)",
            GODOT_CALLABLE,
            KCallable::class.asClassName(),
            TO_GODOT_NAME_UTIL_FUNCTION,
        )
    }

    private fun generateSignalCompanion(argCount: Int, genericClassNameInfo: GenericClassNameInfo): TypeSpec {
        val erasedReadOnlyPropertyClassName = readOnlyPropertyClassName.parameterizedBy(GODOT_OBJECT, genericClassNameInfo.erasedGenericClassName)

        return TypeSpec.companionObjectBuilder()
            .addProperty(
                PropertySpec
                    .builder(DELEGATE_PROPERTY_NAME, erasedReadOnlyPropertyClassName, KModifier.INTERNAL)
                    .addAnnotation(PublishedApi::class)
                    .initializer(
                        "%T·{·$THIS_REF_PARAMETER_NAME,·$PROPERTY_PARAMETER·->·getValue($THIS_REF_PARAMETER_NAME,·$PROPERTY_PARAMETER)·}",
                        readOnlyPropertyClassName
                    )
                    .build()
            )
            .addFunction(
                genericClassNameInfo
                    .toFunSpecBuilder("getValue")
                    .addModifiers(KModifier.OPERATOR, KModifier.INLINE)
                    .addParameters(
                        listOf(
                            ParameterSpec.builder(THIS_REF_PARAMETER_NAME, GODOT_OBJECT).build(),
                            ParameterSpec.builder(PROPERTY_PARAMETER, propertyClassname).build(),
                        )
                    )
                    .returns(genericClassNameInfo.genericClassName)
                    .addCode(
                        CodeBlock.of(
                            "return·%T(thisRef,·property.name)",
                            genericClassNameInfo.className,
                        )
                    )
                    .build()
            )
            .addFunction(
                genericClassNameInfo
                    .toFunSpecBuilder(JAVA_CREATE_METHOD_NAME)
                    .addParameter(ParameterSpec.builder("`object`", GODOT_OBJECT).build())
                    .addParameter(ParameterSpec.builder("signalName", STRING).build())
                    .addParameters(
                        (0..<argCount)
                            .map {
                                ParameterSpec.builder("p$it", STRING).build()
                            }
                    )
                    .returns(genericClassNameInfo.genericClassName)
                    .addCode(
                        "return·%T(`object`,·signalName)",
                        genericClassNameInfo.className
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

    private fun generateFakeSignalConstructor(argCount: Int, genericClassNameInfo: GenericClassNameInfo): FunSpec {
        return FunSpec
            .builder(SIGNAL_CLASS_NAME + argCount)
            .receiver(GODOT_OBJECT)
            .addModifiers(KModifier.INLINE)
            .addTypeVariables(genericClassNameInfo.genericTypes)
            .addParameter(ParameterSpec.builder("signalName", STRING).build())
            .addParameters(
                (0..<argCount)
                    .map {
                        ParameterSpec.builder("p$it", STRING).build()
                    }
            )
            .addCode(
                CodeBlock.of(
                    "return·%T(this,·signalName)",
                    genericClassNameInfo.genericClassName,
                )
            )
            .addAnnotation(
                AnnotationSpec
                    .builder(Suppress::class)
                    .addMember("\"FUNCTION_NAME\"")
                    .build()
            )
            .build()
    }

    private fun generateSignalDelegate(argCount: Int, genericClassNameInfo: GenericClassNameInfo): FunSpec {
        val genericReadOnlyPropertyClassName = readOnlyPropertyClassName.parameterizedBy(GODOT_OBJECT, genericClassNameInfo.genericClassName)

        return genericClassNameInfo
                .toFunSpecBuilder(SIGNAL_METHOD_NAME + argCount)
                .addModifiers(KModifier.INLINE)
                .receiver(GODOT_OBJECT)
                .addParameters(
                    (0..<argCount)
                        .map {
                            ParameterSpec.builder("p$it", STRING).build()
                        }
                )
                .addCode(
                    if (argCount == 0) {
                        CodeBlock.of("return·%T.$DELEGATE_PROPERTY_NAME", genericClassNameInfo.className)
                    } else {
                        CodeBlock.of("return·%T.$DELEGATE_PROPERTY_NAME·as·%T", genericClassNameInfo.className, genericReadOnlyPropertyClassName)
                    }
                )
                .apply {
                    if (argCount != 0) {
                        addAnnotation(
                            AnnotationSpec
                                .builder(Suppress::class)
                                .addMember("\"UNCHECKED_CAST\"")
                                .build()
                        )
                    }
                }
                .build()
    }


    private fun generateSignalExtension(genericClassNameInfo: GenericClassNameInfo): FunSpec {
        val flagsParameter = ParameterSpec.builder(FLAGS_PARAMETER_NAME, INT)
            .defaultValue("0")
            .build()

        val signalConnectExtensionGenericParameters = ParameterSpec.builder(
            METHOD_PARAMETER_NAME,
            LambdaTypeName.get(
                parameters = genericClassNameInfo.toParameterSpecList(),
                returnType = UNIT
            )
        )
            .addModifiers(KModifier.NOINLINE)
            .build()

        return genericClassNameInfo
            .toReifiedExtensionFunSpecBuilder(CONNECT_METHOD_NAME)
            .addParameters(
                listOf(
                    flagsParameter,
                    signalConnectExtensionGenericParameters
                )
            )
            .addCode(
                "return·$CONNECT_METHOD_NAME($METHOD_PARAMETER_NAME.%M(),·$FLAGS_PARAMETER_NAME)",
                AS_CALLABLE_UTIL_FUNCTION
            )
            .returns(GODOT_ERROR)
            .build()
    }


    companion object {
        private const val SIGNAL_CLASS_NAME = "Signal"
        private const val INSTANCE_PARAMETER = "instance"
        private const val NAME_PARAMETER = "name"
        private const val PROPERTY_PARAMETER = "property"
        private const val TARGET_PARAMETER_NAME = "target"
        private const val METHOD_PARAMETER_NAME = "method"
        private const val FLAGS_PARAMETER_NAME = "flags"
        private const val THIS_REF_PARAMETER_NAME = "thisRef"

        private const val EMIT_METHOD_NAME = "emit"
        private const val CONNECT_METHOD_NAME = "connect"
        private const val DISCONNECT_METHOD_NAME = "disconnect"
        private const val SIGNAL_METHOD_NAME = "signal"
        private const val JAVA_CREATE_METHOD_NAME = "javaCreate"

        private const val DELEGATE_PROPERTY_NAME = "delegate"

        private val propertyClassname = ClassName(kotlinReflectPackage, "KProperty").parameterizedBy(STAR)
        private val readOnlyPropertyClassName = ClassName("kotlin.properties", "ReadOnlyProperty")
        private val godotObjectBoundTypeVariable = TypeVariableName("T", GODOT_OBJECT)
    }
}

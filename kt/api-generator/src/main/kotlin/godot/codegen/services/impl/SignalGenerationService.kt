package godot.codegen.services.impl

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.STRING
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.ISignalGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.GODOT_OBJECT
import godot.tools.common.constants.STRING_NAME
import godot.tools.common.constants.TO_GODOT_NAME_UTIL_FUNCTION
import godot.tools.common.constants.godotCorePackage
import godot.tools.common.constants.kotlinReflectPackage
import java.io.File

object SignalGenerationService : ISignalGenerationService {
    private const val CALLABLE_NAME = "Callable"
    private const val SIGNAL_CLASS_NAME = "Signal"

    private const val INSTANCE_PARAMETER = "instance"
    private const val NAME_PARAMETER = "name"
    private const val CALLABLE_PARAMETER = "callable"
    private const val PROPERTY_PARAMETER = "property"
    private const val THIS_REF_PARAMETER_NAME = "thisRef"

    private const val CONNECT_METHOD_NAME = "connect"
    private const val DISCONNECT_METHOD_NAME = "disconnect"
    private const val EMIT_METHOD_NAME = "emit"
    private const val SIGNAL_METHOD_NAME = "signal"
    private const val FLAGS_PARAMETER_NAME = "flags"

    private const val UNSAFE_SUFFIX = "Unsafe"
    private const val DELEGATE_PROPERTY_NAME = "delegate"

    private val connectFlagClassName = ClassName(godotCorePackage, "Object.ConnectFlags")
    private val propertyClassname = ClassName(kotlinReflectPackage, "KProperty").parameterizedBy(STAR)
    private val readOnlyPropertyClassName = ClassName("kotlin.properties", "ReadOnlyProperty")

    override fun generate(outputDir: File) {
        val signalFileSpec = FileSpec.builder(godotCorePackage, "Signals")

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val signalClassName = ClassName(godotCorePackage, "$SIGNAL_CLASS_NAME$argCount")
            val genericClassNameInfo = GenericClassNameInfo(signalClassName, argCount)

            signalFileSpec.addType(generateSignalClass(argCount, genericClassNameInfo))

            signalFileSpec.addFunction(generateFakeSignalConstructor(argCount, genericClassNameInfo))
            signalFileSpec.addFunction(generateSignalDelegate(argCount, genericClassNameInfo))
        }

        signalFileSpec
            .addAnnotation(
                AnnotationSpec
                    .builder(Suppress::class)
                    .addMember("\"PackageDirectoryMismatch\"")
                    .addMember("\"NOTHING_TO_INLINE\"")
                    .addMember("\"UNUSED_PARAMETER\"")
                    .addMember("\"unused\"")
                    .build()
            )
            .indent("    ")
            .build()
            .writeTo(outputDir)
    }

    private fun generateSignalClass(argCount: Int, genericClassNameInfo: GenericClassNameInfo): TypeSpec {
        val callableClassName = ClassName(godotCorePackage, CALLABLE_NAME + argCount)
        return genericClassNameInfo
            .toTypeSpecBuilder()
            .superclass(ClassName(godotCorePackage, SIGNAL_CLASS_NAME))
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .addParameters(
                        listOf(
                            ParameterSpec.builder(INSTANCE_PARAMETER, GODOT_OBJECT).build(),
                            ParameterSpec.builder(NAME_PARAMETER, STRING_NAME).build()
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
                                    append("$EMIT_METHOD_NAME$UNSAFE_SUFFIX(")
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
                        .returns(UNIT)
                        .addAnnotation(JvmOverloads::class)
                        .addParameters(
                            listOf(
                                ParameterSpec.builder(
                                    CALLABLE_PARAMETER,
                                    callableClassName.parameterizedBy(listOf(STAR) + genericClassNameInfo.genericTypes)
                                ).build(),
                                ParameterSpec.builder(FLAGS_PARAMETER_NAME, connectFlagClassName)
                                    .defaultValue("%T.%L", connectFlagClassName, "DEFAULT")
                                    .build()
                            )
                        )
                        .addCode(
                            CodeBlock.of(
                                "connectUnsafe($CALLABLE_PARAMETER, $FLAGS_PARAMETER_NAME)"
                            )
                        )
                        .build(),
                    FunSpec.builder(DISCONNECT_METHOD_NAME)
                        .returns(UNIT)
                        .addParameters(
                            listOf(
                                ParameterSpec.builder(
                                    CALLABLE_PARAMETER,
                                    callableClassName.parameterizedBy(listOf(STAR) + genericClassNameInfo.genericTypes)
                                ).build(),
                            )
                        )
                        .addCode(
                            CodeBlock.of(
                                "disconnectUnsafe($CALLABLE_PARAMETER)"
                            )
                        )
                        .build(),
                )
            )
            .addType(generateSignalCompanion(argCount, genericClassNameInfo))
            .build()
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
                            "return·%T(thisRef,·property.%M())",
                            genericClassNameInfo.className,
                            TO_GODOT_NAME_UTIL_FUNCTION
                        )
                    )
                    .build()
            )
            .addFunction(
                genericClassNameInfo
                    .toFunSpecBuilder("create")
                    .addParameter(ParameterSpec.builder("godotObject", GODOT_OBJECT).build())
                    .addParameter(ParameterSpec.builder("signalName", STRING).build())
                    .returns(genericClassNameInfo.genericClassName)
                    .addCode(
                        "return·%T(godotObject,·signalName.%M())",
                        genericClassNameInfo.className,
                        TO_GODOT_NAME_UTIL_FUNCTION
                    )
                    .addAnnotation(JvmStatic::class)
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
            .addCode(
                CodeBlock.of(
                    "return·%T(this,·signalName.%M())",
                    genericClassNameInfo.genericClassName,
                    TO_GODOT_NAME_UTIL_FUNCTION
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
}

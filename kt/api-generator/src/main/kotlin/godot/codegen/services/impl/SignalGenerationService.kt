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
import godot.codegen.constants.API
import godot.codegen.constants.Core
import godot.codegen.constants.Utils
import godot.codegen.poet.GenericClassNameInfo
import godot.codegen.services.ISignalGenerationService
import godot.common.constants.Constraints
import godot.tools.common.constants.kotlinReflectPackage
import java.io.File
import kotlin.jvm.JvmName

object SignalGenerationService : ISignalGenerationService {
    private const val INSTANCE_PARAMETER = "instance"
    private const val NAME_PARAMETER = "name"
    private const val CALLABLE_PARAMETER = "callable"
    private const val PROPERTY_PARAMETER = "property"
    private const val THIS_REF_PARAMETER_NAME = "thisRef"

    private const val FLAGS_PARAMETER_NAME = "flags"

    private val connectFlagClassName = ClassName(godotCorePackage, OBJECT_CONNECT_FLAGS_CLASS_NAME)
    private val propertyClassname = ClassName(kotlinReflectPackage, K_PROPERTY_CLASS_NAME).parameterizedBy(STAR)
    private val readOnlyPropertyClassName = ClassName("kotlin.properties", READ_ONLY_PROPERTY_CLASS_NAME)

    private val connectFlagClassName = API.connectFlags
    private val propertyClassname = ClassName(kotlinReflectPackage, "KProperty").parameterizedBy(STAR)
    private val readOnlyPropertyClassName = ClassName("kotlin.properties", "ReadOnlyProperty")
    private fun kotlinJavaHelperName(baseName: String) = "_${baseName}Java"

    override fun generate(outputDir: File) {
        val signalFileSpec = FileSpec.builder(Core.signal.packageName, SIGNALS_FILE_NAME)

        for (argCount in 0..Constraints.MAX_FUNCTION_ARG_COUNT) {
            val signalClassName = Core.signal(argCount)
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
        val callableClassName = Core.callable(argCount)
        return genericClassNameInfo
            .toTypeSpecBuilder()
            .superclass(Core.signal)
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addModifiers(KModifier.INTERNAL)
                    .addParameters(
                        listOf(
                            ParameterSpec.builder(INSTANCE_PARAMETER, API.`object`).build(),
                            ParameterSpec.builder(NAME_PARAMETER, Core.stringName).build()
                        )
                    )
                    .addAnnotation(PublishedApi::class)
                    .build()
            )
            .addSuperclassConstructorParameter(INSTANCE_PARAMETER)
            .addSuperclassConstructorParameter(NAME_PARAMETER)
            .addFunctions(
                listOf(
                    FunSpec.builder(METHOD_NAME_EMIT)
                        .returns(UNIT)
                        .addParameters(
                            genericClassNameInfo.toParameterSpecList()
                        )
                        .addCode(
                            CodeBlock.of(
                                buildString {
                                    append("$METHOD_NAME_EMIT$SUFFIX_UNSAFE(")
                                    for (i in 0..<argCount) {
                                        if (i != 0) append(",·")
                                        append("p$i")
                                    }
                                    append(')')
                                }
                            )
                        )
                        .build(),
                    FunSpec.builder(METHOD_NAME_CONNECT)
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
                    FunSpec.builder(METHOD_NAME_DISCONNECT)
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
        val erasedReadOnlyPropertyClassName = readOnlyPropertyClassName.parameterizedBy(API.`object`, genericClassNameInfo.erasedGenericClassName)

        return TypeSpec.companionObjectBuilder()
            .addProperty(
                PropertySpec
                    .builder(PROPERTY_NAME_DELEGATE, erasedReadOnlyPropertyClassName, KModifier.INTERNAL)
                    .addAnnotation(PublishedApi::class)
                    .initializer(
                        "%T·{·$THIS_REF_PARAMETER_NAME,·$PROPERTY_PARAMETER·->·$METHOD_NAME_GET_VALUE($THIS_REF_PARAMETER_NAME,·$PROPERTY_PARAMETER)·}",
                        readOnlyPropertyClassName
                    )
                    .build()
            )
            .addFunction(
                genericClassNameInfo
                    .toFunSpecBuilder(METHOD_NAME_GET_VALUE)
                    .addModifiers(KModifier.OPERATOR, KModifier.INLINE)
                    .addParameters(
                        listOf(
                            ParameterSpec.builder(THIS_REF_PARAMETER_NAME, API.`object`).build(),
                            ParameterSpec.builder(PROPERTY_PARAMETER, propertyClassname).build(),
                        )
                    )
                    .returns(genericClassNameInfo.genericClassName)
                    .addCode(
                        CodeBlock.of(
                            "return·%T(thisRef,·property.%M())",
                            genericClassNameInfo.className,
                            Utils.toGodotName
                        )
                    )
                    .build()
            )
            .addFunction(
                genericClassNameInfo
                    .toFunSpecBuilder(kotlinJavaHelperName(METHOD_NAME_CREATE))
                    .addParameter(ParameterSpec.builder("godotObject", GODOT_OBJECT).build())
                    .addParameter(ParameterSpec.builder("signalName", STRING).build())
                    .returns(genericClassNameInfo.genericClassName)
                    .addCode(
                        "return·%T(godotObject,·signalName.%M())",
                        genericClassNameInfo.className,
                        TO_GODOT_NAME_UTIL_FUNCTION
                    )
                    .addAnnotation(JvmStatic::class)
                    .addAnnotation(
                        AnnotationSpec.builder(JvmName::class)
                            .addMember("%S", METHOD_NAME_CREATE)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    private fun generateFakeSignalConstructor(argCount: Int, genericClassNameInfo: GenericClassNameInfo): FunSpec {
        return FunSpec
            .builder(SIGNAL_CLASS_BASENAME + argCount)
            .receiver(API.`object`)
            .addModifiers(KModifier.INLINE)
            .addTypeVariables(genericClassNameInfo.genericTypes)
            .addParameter(ParameterSpec.builder("signalName", STRING).build())
            .addCode(
                CodeBlock.of(
                    "return·%T(this,·signalName.%M())",
                    genericClassNameInfo.genericClassName,
                    Utils.toGodotName
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
        val genericReadOnlyPropertyClassName = readOnlyPropertyClassName.parameterizedBy(API.`object`, genericClassNameInfo.genericClassName)

        return genericClassNameInfo
            .toFunSpecBuilder(METHOD_NAME_SIGNAL + argCount)
            .addModifiers(KModifier.INLINE)
            .receiver(API.`object`)
            .addCode(
                if (argCount == 0) {
                    CodeBlock.of("return·%T.$PROPERTY_NAME_DELEGATE", genericClassNameInfo.className)
                } else {
                    CodeBlock.of("return·%T.$PROPERTY_NAME_DELEGATE·as·%T", genericClassNameInfo.className, genericReadOnlyPropertyClassName)
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


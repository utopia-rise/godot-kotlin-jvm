package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.entrygenerator.generator.FunctionRegistrationGenerator
import godot.entrygenerator.generator.PropertyRegistrationGenerator
import godot.entrygenerator.generator.SignalRegistrationGenerator
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.settings.Settings
import godot.registration.ClassRegistrar
import godot.registration.KtClass
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.godotEntryBasePackage
import java.io.BufferedWriter

class ClassRegistrarFileBuilder(
    private val registeredClass: RegisteredClass,
    private val settings: Settings,
    private val registrarAppendableProvider: (RegisteredClass) -> BufferedWriter,
    private val registeredClassesByFqName: Map<String, RegisteredClass>,
) {
    private val registeredClassName = registeredClass.getRegisteredName(settings)

    private val classRegistrarBuilder = TypeSpec
        .classBuilder("${registeredClassName}Registrar")
        .addModifiers(KModifier.OPEN)
        .let { classBuilder ->
            if (registeredClass.isAbstract) {
                classBuilder.addKdoc("Registrar for abstract class. Does not register any members as it's only used for default value providing if any properties with default values are provided in the abstract class. Members of this abstract class are registered by the inheriting registrars")
            } else classBuilder
        }

    private val className = ClassName(registeredClass.containingPackage, registeredClass.name)

    private val registerClassControlFlow = FunSpec
        .builder("register")
        .addModifiers(KModifier.OVERRIDE)
        .returns(KtClass::class.asClassName().parameterizedBy(STAR))
        .let { funSpecBuilder ->
            val superClasses = registeredClass.supertypes.mapNotNull { supertype ->
                if (supertype is RegisteredClass && !supertype.isAbstract) {
                    "\"${supertype.getRegisteredName(settings)}\""
                } else {
                    null
                }
            }.reduceOrNull { statement, name -> "$statement,$name" } ?: ""

            funSpecBuilder.addCode(
                CodeBlock.builder()
                    .add("return·register(\n")
                    .indent()
                    .add("%S,\n", registeredClassName)
                    .add("listOf($superClasses),\n")
                    .add("%S,\n", registeredClass.godotBaseClass)
                    .add("%T::class\n", className)
                    .unindent()
                    .add(")·{\n")
                    .indent()
                    .build()
            )
            funSpecBuilder.addStatement("constructor(::%T)", className)
        }

    fun build(settings: Settings) {
        classRegistrarBuilder.addSuperinterface(ClassRegistrar::class)

        if (!registeredClass.isAbstract) {
            SignalRegistrationGenerator.generate(registeredClass, settings, className, registerClassControlFlow, registeredClassesByFqName)
            PropertyRegistrationGenerator.generate(registeredClass, settings, className, registerClassControlFlow, registeredClassesByFqName)
            FunctionRegistrationGenerator.generateNotifications(registeredClass, registerClassControlFlow)
            FunctionRegistrationGenerator.generateFunctions(registeredClass, settings, className, registerClassControlFlow, registeredClassesByFqName)
        }

        registerClassControlFlow.addCode(
            CodeBlock.builder().unindent().add("}\n").build()
        )
        classRegistrarBuilder.addFunction(registerClassControlFlow.build())

        registrarAppendableProvider(registeredClass).use { bufferedWriter ->
            FileSpec
                .builder(godotEntryBasePackage, "${registeredClass.customName}Entry")
                .addFileComment(GENERATED_COMMENT)
                .addType(classRegistrarBuilder.build())
                .build()
                .writeTo(bufferedWriter)
        }
    }
}

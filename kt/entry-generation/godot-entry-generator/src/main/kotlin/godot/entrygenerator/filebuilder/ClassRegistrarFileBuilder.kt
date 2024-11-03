package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import godot.annotation.RegisteredClassMetadata
import godot.entrygenerator.generator.ConstructorRegistrationGenerator
import godot.entrygenerator.generator.FunctionRegistrationGenerator
import godot.entrygenerator.generator.PropertyRegistrationGenerator
import godot.entrygenerator.generator.SignalRegistrationGenerator
import godot.entrygenerator.model.RegisteredClass
import godot.tools.common.constants.*
import java.io.BufferedWriter
import godot.tools.common.constants.GodotFunctions

class ClassRegistrarFileBuilder(
    projectName: String,
    private val registeredClass: RegisteredClass,
    private val compilationTimeRelativeRegistrationFilePath: String,
    private val registrarAppendableProvider: (RegisteredClass) -> BufferedWriter,
) {
    private val classRegistrarBuilder = TypeSpec
        .classBuilder("${registeredClass.registeredName}Registrar")
        .addModifiers(KModifier.OPEN)
        .apply {
            if (!registeredClass.isAbstract) {
                addAnnotation(
                    AnnotationSpec
                        .builder(RegisteredClassMetadata::class.asClassName())
                        .addMember("%S", registeredClass.registeredName)
                        .addMember("%S", registeredClass.godotBaseClass)
                        .addMember("%S", registeredClass.fqName)
                        .addMember("%S", registeredClass.relativeSourcePath)
                        .addMember("%S", compilationTimeRelativeRegistrationFilePath)
                        .addMember("%S", projectName)
                        .addMember("%S", registeredClass.supertypes.joinToString(",") { it.fqName })
                        .addMember("%S", registeredClass.signals.joinToString(",") { it.fqName })
                        .addMember("%S", registeredClass.properties.joinToString(",") { it.fqName })
                        .addMember("%S", registeredClass.functions.filter { it.name != GodotFunctions.notification }.joinToString(",") { it.fqName })
                        .build()
                )
            }
        }

    private val className = ClassName(registeredClass.containingPackage, registeredClass.name)

    private val registerClassControlFlow = FunSpec
        .builder("register")
        .addModifiers(KModifier.OVERRIDE)
        .addParameter("registry", ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.classRegistry))
        .beginControlFlow("with(registry)") //START: with registry
        .let { funSpecBuilder ->
            val superClasses = registeredClass.supertypes.mapNotNull { supertype ->
                //Used to implement script inheritance methods, so we remove base types
                val value = if (supertype is RegisteredClass) {
                    "\"${supertype.registeredName}\""
                } else {
                    null
                }
                value
            }.reduceOrNull { statement, name -> "$statement,$name" } ?: ""
            funSpecBuilder.beginControlFlow(
                "registerClass<%T>(listOf($superClasses),·%T::class,·${registeredClass.isAbstract},·${registeredClass.isTool},·%S,·%S,·%S,·%S)·{",
                className,
                className,
                registeredClass.godotBaseClass,
                registeredClass.registeredName,
                registeredClass.relativeSourcePath,
                compilationTimeRelativeRegistrationFilePath,
            ) //START: registerClass
        }


    fun build(): Pair<String, Array<Any>> {
        classRegistrarBuilder.addSuperinterface(
            ClassName(godotRegistrationPackage, GodotKotlinJvmTypes.classRegistrar)
        )

        if (!registeredClass.isAbstract) {
            ConstructorRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow)
        }
        FunctionRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow)
        SignalRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow)
        PropertyRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow)

        classRegistrarBuilder.addFunction(
            registerClassControlFlow
                .endControlFlow() //END: registerClass
                .endControlFlow() //END: with registry
                .build()
        )

        registrarAppendableProvider(registeredClass).use { bufferedWriter ->
            FileSpec
                .builder(godotEntryBasePackage, "${registeredClass.registeredName}Entry")
                .addFileComment(GENERATED_COMMENT)
                .addType(classRegistrarBuilder.build())
                .build()
                .writeTo(bufferedWriter)
        }

        return "%T().register(registry)" to arrayOf(
            ClassName(
                godotEntryBasePackage,
                "${registeredClass.registeredName}Registrar"
            )
        )
    }
}

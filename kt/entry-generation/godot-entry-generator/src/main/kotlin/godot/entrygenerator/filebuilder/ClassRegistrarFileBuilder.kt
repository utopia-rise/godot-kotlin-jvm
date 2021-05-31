package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import godot.entrygenerator.ext.camelToSnakeCase
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.ext.toTypeName
import godot.entrygenerator.generator.ConstructorRegistrationGenerator
import godot.entrygenerator.generator.FunctionRegistrationGenerator
import godot.entrygenerator.model.RegisterConstructorAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisterSignalAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.Type
import java.io.BufferedWriter
import java.io.File
import java.util.*

class ClassRegistrarFileBuilder(
    private val registeredClass: RegisteredClass,
    private val appendableProvider: (RegisteredClass) -> BufferedWriter
) {
    private val classRegistrarBuilder = TypeSpec
        .classBuilder("${registeredClass.name}Registrar")
        .addModifiers(KModifier.OPEN)

    private val className = ClassName(registeredClass.containingPackage, registeredClass.name)

    private val registerClassControlFlow = FunSpec
        .builder("register")
        .addModifiers(KModifier.OVERRIDE)
        .addParameter("registry", ClassName("godot.runtime", "ClassRegistry"))
        .beginControlFlow("with(registry)") //START: with registry
        .beginControlFlow(
            "registerClass<%T>(%S,·%S,·%T::class,·${registeredClass.isTool},·%S,·%S)·{",
            className,
            registeredClass.resPath,
            registeredClass.supertypes.first().fqName,
            className,
            registeredClass.godotBaseClass,
            registeredClass.registeredName
        ) //START: registerClass

    private fun registerSignals() {
        registeredClass
            .properties
            .filter { it.annotations.hasAnnotation<RegisterSignalAnnotation>() }
            .forEach { registeredSignal ->

            }
    }

    private fun registerProperties() {
        registeredClass
            .properties
            .filter { it.annotations.hasAnnotation<RegisterPropertyAnnotation>() }
            .forEach { registeredProperty ->

            }
    }

    fun build(): Pair<String, Array<Any>> {
        if (!registeredClass.directlyInheritsGodotBaseClass) {
            val inheritedClass = registeredClass.supertypes.first()
            classRegistrarBuilder.superclass(
                ClassName(
                    "godot.${inheritedClass.containingPackage}",
                    "${inheritedClass.name}Registrar"
                )
            )
        } else {
            classRegistrarBuilder.addSuperinterface(
                ClassName("godot.runtime", "ClassRegistrar")
            )
        }

        ConstructorRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow)
        FunctionRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow)
        registerSignals()
        registerProperties()

        classRegistrarBuilder.addFunction(
            registerClassControlFlow
                .endControlFlow() //END: registerClass
                .endControlFlow() //END: with registry
                .build()
        )

        appendableProvider(registeredClass).use { bufferedWriter ->
            FileSpec
                .builder("godot.${registeredClass.containingPackage}", "${registeredClass.name}Entry")
                .addComment("THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD")
                .addType(classRegistrarBuilder.build())
                .build()
                .writeTo(bufferedWriter)
        }

        return "%T().register(registry)" to arrayOf(
            ClassName(
                "godot.${registeredClass.containingPackage}",
                "${registeredClass.name}Registrar"
            )
        )
    }
}

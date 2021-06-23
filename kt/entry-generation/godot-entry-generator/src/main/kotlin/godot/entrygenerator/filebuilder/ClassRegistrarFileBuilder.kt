package godot.entrygenerator.filebuilder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import godot.entrygenerator.generator.ConstructorRegistrationGenerator
import godot.entrygenerator.generator.FunctionRegistrationGenerator
import godot.entrygenerator.generator.PropertyRegistrationGenerator
import godot.entrygenerator.generator.SignalRegistrationGenerator
import godot.entrygenerator.model.RegisteredClass
import java.io.BufferedWriter

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
        SignalRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow)
        PropertyRegistrationGenerator.generate(registeredClass, className, registerClassControlFlow, classRegistrarBuilder)

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

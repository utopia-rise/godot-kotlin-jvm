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
import godot.entrygenerator.settings.Settings
import godot.registration.ClassRegistrar
import godot.registration.ClassRegistry
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
        .addParameter("registry", ClassRegistry::class)
        .beginControlFlow("with(registry)") //START: with registry
        .let { funSpecBuilder ->
            if (!registeredClass.isAbstract) {
                val superClasses = registeredClass.supertypes.mapNotNull { supertype ->
                    // Used to implement script inheritance methods, so we remove base types and abstract parents.
                    if (supertype is RegisteredClass && !supertype.isAbstract) {
                        "\"${supertype.getRegisteredName(settings)}\""
                    } else {
                        null
                    }
                }.reduceOrNull { statement, name -> "$statement,$name" } ?: ""

                funSpecBuilder.beginControlFlow(
                    "registerClass<%T>(listOf($superClasses), %T::class, ${registeredClass.isTool}, %S, %S, %S) {",
                    className,
                    className,
                    registeredClass.godotBaseClass,
                    registeredClassName,
                    registeredClass.fqName,
                ) //START: registerClass
            } else {
                funSpecBuilder
                    .addComment("Abstract classes don't need to have any members to be registered")
            }
        }

    fun build(settings: Settings): Pair<String, Array<Any>> {
        classRegistrarBuilder.addSuperinterface(ClassRegistrar::class)

        if (!registeredClass.isAbstract) {
            ConstructorRegistrationGenerator.generate(className, registerClassControlFlow)
            FunctionRegistrationGenerator.generate(registeredClass, settings, className, registerClassControlFlow, registeredClassesByFqName)
            SignalRegistrationGenerator.generate(registeredClass, settings, className, registerClassControlFlow, registeredClassesByFqName)
            PropertyRegistrationGenerator.generate(registeredClass, settings, className, registerClassControlFlow, registeredClassesByFqName)
        }

        classRegistrarBuilder.addFunction(
            registerClassControlFlow
                .let { funSpecBuilder ->
                    if (!registeredClass.isAbstract) {
                        funSpecBuilder.endControlFlow() //END: registerClass
                    } else funSpecBuilder
                }
                .endControlFlow() //END: with registry
                .build()
        )

        registrarAppendableProvider(registeredClass).use { bufferedWriter ->
            FileSpec
                .builder(godotEntryBasePackage, "${registeredClass.customName}Entry")
                .addFileComment(GENERATED_COMMENT)
                .addType(classRegistrarBuilder.build())
                .build()
                .writeTo(bufferedWriter)
        }

        return "%T().register(this)" to arrayOf(
            ClassName(
                godotEntryBasePackage,
                "${registeredClass.getRegisteredName(settings)}Registrar"
            )
        )
    }
}

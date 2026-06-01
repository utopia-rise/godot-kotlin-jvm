package godot.registrar.generator.filebuilder

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import godot.registrar.generator.ext.flattenedHierarchy
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.generator.FunctionRegistrationGenerator
import godot.registrar.generator.generator.PropertyRegistrationGenerator
import godot.registrar.generator.generator.SignalRegistrationGenerator
import godot.registrar.generator.settings.Settings
import godot.registration.ClassRegistrar
import godot.registration.KtClass
import godot.registration.model.types.ScriptClass
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.godotRegistrarBasePackage
import java.io.File

class ClassRegistrarFileBuilder(
    private val registeredClass: ScriptClass,
    private val settings: Settings,
    private val sourceOutputDir: File,
    private val registeredClassesByFqName: Map<String, ScriptClass>,
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
            val superClasses = registeredClass.flattenedHierarchy()
                .filterIsInstance<ScriptClass>()
                .filter { it.isRegistered && !it.isAbstract }
                .map { "\"${it.getRegisteredName(settings)}\"" }
                .reduceOrNull { statement, name -> "$statement,$name" } ?: ""

            funSpecBuilder.addCode(
                CodeBlock.builder()
                    .add("return·register(\n")
                    .indent()
                    .add("%S,\n", registeredClassName)
                    .add("listOf($superClasses),\n")
                    .add("%S,\n", registeredClass.baseGodotClass)
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
            SignalRegistrationGenerator.generate(
                registeredClass,
                settings,
                className,
                registerClassControlFlow,
                registeredClassesByFqName
            )
            PropertyRegistrationGenerator.generate(
                registeredClass,
                settings,
                className,
                registerClassControlFlow,
                registeredClassesByFqName
            )
            FunctionRegistrationGenerator.generateNotifications(registeredClass, registerClassControlFlow)
            FunctionRegistrationGenerator.generateFunctions(
                registeredClass,
                settings,
                className,
                registerClassControlFlow,
                registeredClassesByFqName
            )
        }

        registerClassControlFlow.addCode(
            CodeBlock.builder().unindent().add("}\n").build()
        )
        classRegistrarBuilder.addFunction(registerClassControlFlow.build())

        FileSpec
            .builder(godotRegistrarBasePackage, "${registeredClassName}Registrar")
            .addFileComment(GENERATED_COMMENT)
            .addType(classRegistrarBuilder.build())
            .build()
            // KotlinPoet creates <sourceOutputDir>/godot/registrar/<name>Registrar.kt (handles dirs from the package).
            .writeTo(sourceOutputDir)
    }
}

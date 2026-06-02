package godot.registrar.generator.builder

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import godot.registrar.generator.GeneratorContext
import godot.registrar.generator.ext.flattenedHierarchy
import godot.registrar.generator.ext.getRegisteredName
import godot.registrar.generator.generator.addFunctionRegistrations
import godot.registrar.generator.generator.addNotificationRegistrations
import godot.registrar.generator.generator.addPropertyRegistrations
import godot.registrar.generator.generator.addSignalRegistrations
import godot.registration.ClassRegistrar
import godot.registration.KtClass
import godot.registration.model.types.ScriptClass
import godot.tools.common.constants.GENERATED_COMMENT
import godot.tools.common.constants.godotRegistrarBasePackage
import java.io.File

class RegistrarClassGenerator(
    private val context: GeneratorContext,
    private val sourceOutputDir: File,
) {
    fun generate(registeredClasses: List<ScriptClass>) {
        registeredClasses.forEach { registeredClass ->
            buildRegistrarFile(registeredClass).writeTo(sourceOutputDir)
        }
    }

    private fun buildRegistrarFile(registeredClass: ScriptClass): FileSpec {
        val registeredClassName = registeredClass.getRegisteredName(context.settings)
        return FileSpec
            .builder(godotRegistrarBasePackage, "${registeredClassName}Registrar")
            .addFileComment(GENERATED_COMMENT)
            .addType(buildRegistrarType(registeredClass, registeredClassName))
            .build()
    }

    private fun buildRegistrarType(
        registeredClass: ScriptClass,
        registeredClassName: String,
    ): TypeSpec {
        val classRegistrarBuilder = TypeSpec
            .classBuilder("${registeredClassName}Registrar")
            .addModifiers(KModifier.OPEN)
            .addSuperinterface(ClassRegistrar::class)

        if (registeredClass.isAbstract) {
            classRegistrarBuilder.addKdoc(
                "Registrar for abstract class. Does not register any members as it's only used for default value providing if any properties with default values are provided in the abstract class. Members of this abstract class are registered by the inheriting registrars"
            )
        }

        classRegistrarBuilder.addFunction(buildRegisterFunction(registeredClass, registeredClassName))
        return classRegistrarBuilder.build()
    }

    private fun buildRegisterFunction(
        registeredClass: ScriptClass,
        registeredClassName: String,
    ): FunSpec {
        val className = ClassName(registeredClass.containingPackage, registeredClass.name)
        val registerFunctionBuilder = FunSpec
            .builder("register")
            .addModifiers(KModifier.OVERRIDE)
            .returns(KtClass::class.asClassName().parameterizedBy(STAR))

        registerFunctionBuilder.addCode(buildRegisterHeader(registeredClass, registeredClassName, className))

        if (!registeredClass.isAbstract) {
            registerFunctionBuilder.addStatement("constructor(::%T)", className)
            registerFunctionBuilder.addSignalRegistrations(registeredClass, context, className)
            registerFunctionBuilder.addPropertyRegistrations(registeredClass, context, className)
            registerFunctionBuilder.addNotificationRegistrations(registeredClass)
            registerFunctionBuilder.addFunctionRegistrations(registeredClass, context, className)
        }

        registerFunctionBuilder.addCode(CodeBlock.builder().unindent().add("}\n").build())
        return registerFunctionBuilder.build()
    }

    private fun buildRegisterHeader(
        registeredClass: ScriptClass,
        registeredClassName: String,
        className: ClassName,
    ): CodeBlock {
        val superClasses = registeredClass.flattenedHierarchy()
            .filterIsInstance<ScriptClass>()
            .filter { it.isRegistered && !it.isAbstract }
            .joinToString(",") { "\"${it.getRegisteredName(context.settings)}\"" }

        return CodeBlock.builder()
            .add("return register(\n")
            .indent()
            .add("%S,\n", registeredClassName)
            .add("listOf($superClasses),\n")
            .add("%S,\n", registeredClass.baseGodotClass)
            .add("%T::class\n", className)
            .unindent()
            .add(") {\n")
            .indent()
            .build()
    }
}

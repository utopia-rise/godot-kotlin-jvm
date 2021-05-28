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
import godot.entrygenerator.model.RegisterConstructorAnnotation
import godot.entrygenerator.model.RegisterPropertyAnnotation
import godot.entrygenerator.model.RegisterSignalAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.entrygenerator.model.Type
import java.io.File
import java.util.*

class ClassRegistrarFileBuilder(
    private val registeredClass: RegisteredClass,
    private val baseOutputPath: String
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

    private fun registerConstructors() {
        registeredClass
            .constructors
            .filter { registeredConstructor ->
                registeredConstructor.parameters.isEmpty() ||
                    registeredConstructor.annotations.hasAnnotation<RegisterConstructorAnnotation>()
            }
            .forEach { registeredConstructor ->
                val ctorParamsCount = registeredConstructor.parameters.size

                if (ctorParamsCount == 0) {
                    registerClassControlFlow.addStatement(
                        "constructor(%T(::%T))",
                        ClassName("godot.core", "KtConstructor$ctorParamsCount"),
                        className
                    )
                } else {
                    val templateArgs = mutableListOf<Any>()
                    val templateString = buildString {
                        append("{")
                        registeredConstructor.parameters.forEachIndexed { index, valueParameter ->
                            append("%L:·%T")
                            templateArgs.add(valueParameter.name)
                            templateArgs.add(
                                valueParameter.type.toTypeName()
                            ) //setting nullables explicitly to false in case of type parameters for generic types, setting nullablility later

                            if (valueParameter.typeArguments.isNotEmpty()) {
                                append("<")
                                valueParameter.typeArguments.forEach { typeArgument ->
                                    append("%T")
                                    templateArgs.add(
                                        ClassName(
                                            typeArgument.fqName.substringBeforeLast("."),
                                            typeArgument.fqName.substringAfterLast(".")
                                        )
                                    )
                                }
                                append(">")
                            }

                            if (valueParameter.type.isNullable) {
                                append("?") //setting nullability now and not earlier in case of type parameters for generic types
                            }

                            if (index != registeredConstructor.parameters.size - 1) {
                                append(",·")
                            }
                        }

                        append("·->·%T(")
                        templateArgs.add(className)

                        registeredConstructor.parameters.forEachIndexed { index, valueParameter ->
                            append(valueParameter.name)
                            if (index != registeredConstructor.parameters.size - 1) {
                                append(",·")
                            }
                        }
                        append(")},·")

                        registeredConstructor.parameters.forEachIndexed { index, valueParameter ->
                            append("%T·to·%L")
                            templateArgs.add(valueParameter.type.toKtVariantType())
                            templateArgs.add(valueParameter.type.isNullable)

                            if (index != registeredConstructor.parameters.size - 1) {
                                append(",·")
                            }
                        }
                    }

                    registerClassControlFlow.addStatement(
                        "constructor(%T($templateString))",
                        ClassName("godot.core", "KtConstructor$ctorParamsCount"),
                        *templateArgs.toTypedArray()
                    )
                }
            }
    }

    private fun registerFunctions() {
        registeredClass.functions.forEach { registeredFunction ->

        }
    }

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

        registerConstructors()
        registerFunctions()
        registerSignals()
        registerProperties()

        classRegistrarBuilder.addFunction(
            registerClassControlFlow
                .endControlFlow() //END: registerClass
                .endControlFlow() //END: with registry
                .build()
        )

        FileSpec
            .builder("godot.${registeredClass.containingPackage}", "${registeredClass.name}Entry")
            .addComment("THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD")
            .addType(classRegistrarBuilder.build())
            .build()
            .writeTo(File(baseOutputPath))

        return "%T().register(registry)" to arrayOf(
            ClassName(
                "godot.${registeredClass.containingPackage}",
                "${registeredClass.name}Registrar"
            )
        )
    }
}

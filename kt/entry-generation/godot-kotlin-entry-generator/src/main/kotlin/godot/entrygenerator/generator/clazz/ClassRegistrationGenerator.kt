package godot.entrygenerator.generator.clazz

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.TypeSpec
import godot.entrygenerator.EntryGenerator
import godot.entrygenerator.extension.getAnnotationValue
import godot.entrygenerator.extension.getGodotBaseSimpleClassName
import godot.entrygenerator.extension.getSuperTypeNameAsString
import godot.entrygenerator.extension.getUserDefinedSuperclass
import godot.entrygenerator.extension.toParameterKtVariantType
import godot.entrygenerator.extension.toTypeName
import godot.entrygenerator.generator.function.FunctionRegistrationGenerator
import godot.entrygenerator.generator.property.PropertyRegistrationGenerator
import godot.entrygenerator.generator.signal.SignalRegistrationGenerator
import godot.entrygenerator.model.*
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.descriptors.PropertyDescriptor
import org.jetbrains.kotlin.js.resolve.diagnostics.findPsi
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.psi.psiUtil.getTextWithLocation
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import java.io.File

object ClassRegistrationGenerator {

    fun registerClasses(
        classesWithMembers: Set<ClassWithMembers>,
        mainEntryRegistryControlFlow: FunSpec.Builder,
        bindingContext: BindingContext,
        outputPath: String
    ) {
        classesWithMembers.forEach { classWithMembers ->
            classWithMembers.gatherAllMembersOfClassHierarchyForRegistration()

            val classNameAsString = classWithMembers.classDescriptor.name.asString()
            val packagePath = classWithMembers.classDescriptor.fqNameSafe.parent().asString()
            val className = ClassName(packagePath, classNameAsString)
            val superClassFqName = classWithMembers.classDescriptor.getSuperTypeNameAsString()
            val godotBaseClass = classWithMembers.classDescriptor.getGodotBaseSimpleClassName()

            val registerClassControlFlow = provideRegisterClassControlFlow(
                classWithMembers,
                FunSpec
                    .builder("register")
                    .addModifiers(KModifier.OVERRIDE)
                    .addParameter("registry", ClassName("godot.runtime", "ClassRegistry"))
                    .beginControlFlow("with(registry)"), //START: with registry
                className,
                superClassFqName,
                godotBaseClass,
                isTool(classWithMembers.classDescriptor)
            ) //START: registerClass

            val classSpecificRegistrarBuilder = TypeSpec
                .classBuilder("${classNameAsString}Registrar")
                .addModifiers(KModifier.OPEN)

            registerFunctions(
                classWithMembers.functions,
                registerClassControlFlow,
                className
            )

            registerSignals(
                classWithMembers.signals,
                className,
                registerClassControlFlow
            )

            registerProperties(
                classWithMembers.properties,
                classSpecificRegistrarBuilder,
                registerClassControlFlow,
                className,
                bindingContext
            )

            registerClassControlFlow.endControlFlow() //END: registerClass
            registerClassControlFlow.endControlFlow() //END: with registry

            classSpecificRegistrarBuilder
                .addFunction(registerClassControlFlow.build())

            val inheritedUserClass = classWithMembers
                .classDescriptor
                .getUserDefinedSuperclass()

            if (inheritedUserClass != null) {
                val superClassPackagePath = inheritedUserClass.fqNameSafe.asString().substringBeforeLast(".")
                val superClassSimpleName = inheritedUserClass.fqNameSafe.asString().substringAfterLast(".")
                classSpecificRegistrarBuilder.superclass(
                    ClassName(
                        "godot.$superClassPackagePath",
                        "${superClassSimpleName}Registrar"
                    )
                )
            } else {
                classSpecificRegistrarBuilder.addSuperinterface(ClassName("godot.runtime", "ClassRegistrar"))
            }

            FileSpec
                .builder("godot.$packagePath", "${classNameAsString}Entry")
                .addComment("THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY! ALL CHANGES TO IT WILL BE OVERWRITTEN ON EACH BUILD")
                .addType(classSpecificRegistrarBuilder.build())
                .build()
                .writeTo(File(outputPath))

            mainEntryRegistryControlFlow
                .addStatement(
                    "%T().register(registry)",
                    ClassName("godot.$packagePath", "${classNameAsString}Registrar")
                )
        }
    }

    private fun provideRegisterClassControlFlow(
        classWithMembers: ClassWithMembers,
        classRegistryControlFlow: FunSpec.Builder,
        className: ClassName,
        superClass: String,
        godotBaseClass: String,
        isTool: Boolean
    ): FunSpec.Builder {
        val classNameAsString = getClassNameAsString(classWithMembers.classDescriptor).removePrefix("_")
        EntryGenerator.registeredClassNames.add(classWithMembers.classDescriptor.fqNameSafe.asString() to classNameAsString)
        val classResPath =
            requireNotNull(EntryGenerator.fqNamesToRePath[classWithMembers.classDescriptor.fqNameSafe.asString()]) {
                "No resPath found for class ${classWithMembers.classDescriptor.fqNameSafe.asString()}"
            }
        classRegistryControlFlow.beginControlFlow(
            "registerClass<%T>(%S,·%S,·%T::class,·$isTool,·%S,·%S)·{",
            className,
            classResPath,
            superClass,
            className,
            godotBaseClass,
            classNameAsString
        )

        registerConstructors(classWithMembers.classDescriptor.constructors, classRegistryControlFlow, className)
        return classRegistryControlFlow
    }

    private fun registerConstructors(
        constructors: Collection<ClassConstructorDescriptor>,
        classRegistryControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        requireNotNull(constructors.firstOrNull { it.valueParameters.isEmpty() }) {
            "$className does not contain a default constructor. A default constructor (no args) is needed for Godot"
        }
        val constructorsToRegister = constructors
            .filter { classConstructorDescriptor ->
                classConstructorDescriptor.annotations.hasAnnotation(FqName(REGISTER_CONSTRUCTOR_ANNOTATION)) ||
                    classConstructorDescriptor.valueParameters.isEmpty()
            }
            .let { annotatedConstructors ->
                if (annotatedConstructors.isEmpty()) {
                    listOf(constructors.first { it.valueParameters.isEmpty() })
                } else annotatedConstructors
            }

        require(
            constructorsToRegister
                .groupBy { it.valueParameters.size }
                .size == constructorsToRegister.size
        ) {
            "$className contains multiple registered constructors with the same arg count. Constructor overloading is not yet supported!"
        }

        constructorsToRegister.forEach { classConstructorDescriptor ->
            val ctorParamsCount = classConstructorDescriptor.valueParameters.size
            require(ctorParamsCount <= 5) {
                "A constructor cannot have more than 5 params in Godot! Reduce the param count for constructor:\n${
                    classConstructorDescriptor.findPsi()?.getTextWithLocation()
                }"
            }

            if (ctorParamsCount == 0) {
                classRegistryControlFlow.addStatement(
                    "constructor(%T(::%T))",
                    ClassName("godot.core", "KtConstructor$ctorParamsCount"),
                    className
                )
            } else {
                val templateArgs = mutableListOf<Any>()
                val templateString = buildString {
                    append("{")
                    classConstructorDescriptor.valueParameters.forEachIndexed { index, valueParameter ->
                        append("%L:·%T")
                        templateArgs.add(valueParameter.name.asString())
                        templateArgs.add(
                            valueParameter.type.toTypeName().copy(nullable = false)
                        ) //setting nullables explicitly to false in case of type parameters for generic types, setting nullablility later

                        if (valueParameter.type.arguments.isNotEmpty()) {
                            append("<")
                            valueParameter.type.arguments.forEach { typeProjection ->
                                append("%T")
                                templateArgs.add(typeProjection.type.toTypeName())
                            }
                            append(">")
                        }

                        if (valueParameter.type.isMarkedNullable) {
                            append("?") //setting nullability now and not earlier in case of type parameters for generic types
                        }

                        if (index != classConstructorDescriptor.valueParameters.size - 1) {
                            append(",·")
                        }
                    }

                    append("·->·%T(")
                    templateArgs.add(className)

                    classConstructorDescriptor.valueParameters.forEachIndexed { index, valueParameter ->
                        append(valueParameter.name.asString())
                        if (index != classConstructorDescriptor.valueParameters.size - 1) {
                            append(",·")
                        }
                    }
                    append(")},·")

                    classConstructorDescriptor.valueParameters.forEachIndexed { index, valueParameter ->
                        append("%T·to·%L")
                        templateArgs.add(valueParameter.type.toParameterKtVariantType())
                        templateArgs.add(valueParameter.type.isMarkedNullable)

                        if (index != classConstructorDescriptor.valueParameters.size - 1) {
                            append(",·")
                        }
                    }
                }

                classRegistryControlFlow.addStatement(
                    "constructor(%T($templateString))",
                    ClassName("godot.core", "KtConstructor$ctorParamsCount"),
                    *templateArgs.toTypedArray()
                )
            }
        }
    }

    private fun getClassNameAsString(classDescriptor: ClassDescriptor): String {
        val customClassName = classDescriptor.annotations.getAnnotationValue(
            REGISTER_CLASS_ANNOTATION,
            REGISTER_CLASS_ANNOTATION_NAME_ARGUMENT,
            ""
        )
        return if (customClassName.isNotEmpty()) {
            customClassName
        } else {
            val packagePath = classDescriptor.fqNameSafe.parent().asString()
            val simpleName = classDescriptor.fqNameSafe.shortName().asString()
            "${packagePath.replace(".", "_")}_$simpleName"
        }
    }

    private fun registerFunctions(
        functions: List<FunctionDescriptor>,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName
    ) {
        FunctionRegistrationGenerator
            .registerFunctions(functions, registerClassControlFlow, className)
    }

    private fun registerSignals(
        signals: List<PropertyDescriptor>,
        className: ClassName,
        registerClassControlFlow: FunSpec.Builder
    ) {
        SignalRegistrationGenerator
            .registerSignals(signals, className, registerClassControlFlow)
    }

    private fun registerProperties(
        registeredProperties: MutableList<RegisteredProperty>,
        classSpecificRegistryBuilder: TypeSpec.Builder,
        registerClassControlFlow: FunSpec.Builder,
        className: ClassName,
        bindingContext: BindingContext
    ) {
        PropertyRegistrationGenerator
            .registerProperties(
                registeredProperties,
                classSpecificRegistryBuilder,
                registerClassControlFlow,
                className,
                bindingContext
            )
    }

    private fun isTool(classDescriptor: ClassDescriptor): Boolean {
        return classDescriptor
            .annotations
            .getAnnotationValue(REGISTER_CLASS_ANNOTATION, REGISTER_CLASS_ANNOTATION_TOOL_ARGUMENT, false)
    }
}

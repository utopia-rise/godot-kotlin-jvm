package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.ext.toTypeName
import godot.entrygenerator.model.RegisterConstructorAnnotation
import godot.entrygenerator.model.RegisteredClass

object ConstructorRegistrationGenerator {

    fun generate(registeredClass: RegisteredClass, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        registeredClass
            .registeredConstructors
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
                                    if (typeArgument.isNullable) {
                                        append("?")
                                    }
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
}

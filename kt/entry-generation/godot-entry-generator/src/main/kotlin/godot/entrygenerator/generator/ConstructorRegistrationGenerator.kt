package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.ext.toTypeName
import godot.entrygenerator.model.RegisteredClass
import godot.tools.common.constants.godotCorePackage

object ConstructorRegistrationGenerator {

    fun generate(registeredClass: RegisteredClass, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
        registeredClass
            .constructors
            .filter { registeredConstructor ->
                registeredConstructor.parameters.isEmpty()
            }
            .forEach { registeredConstructor ->
                val ctorParamsCount = registeredConstructor.parameters.size

                if (ctorParamsCount == 0) {
                    registerClassControlFlow.addStatement(
                        "constructor(%T(::%T))",
                        ClassName(godotCorePackage, "KtConstructor$ctorParamsCount"),
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
                            ) //setting nullables explicitly to false in case of type parameters for generic types, setting nullability later

                            if (valueParameter.typeArguments.isNotEmpty()) {
                                append("<")
                                append(
                                    valueParameter.typeArguments.joinToString(",·") { typeArgument ->
                                        templateArgs.add(
                                            ClassName(
                                                typeArgument.fqName.substringBeforeLast("."),
                                                typeArgument.fqName.substringAfterLast(".")
                                            )
                                        )
                                        if (typeArgument.isNullable) {
                                            "%T?"
                                        } else {
                                            "%T"
                                        }
                                    }
                                )
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
                            append("%T")
                            templateArgs.add(valueParameter.type.toKtVariantType())

                            if (index != registeredConstructor.parameters.size - 1) {
                                append(",·")
                            }
                        }
                    }

                    registerClassControlFlow.addStatement(
                        "constructor(%T($templateString))",
                        ClassName(godotCorePackage, "KtConstructor$ctorParamsCount"),
                        *templateArgs.toTypedArray()
                    )
                }
            }
    }
}

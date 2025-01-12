package godot.entrygenerator.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import godot.entrygenerator.ext.hasAnnotation
import godot.entrygenerator.ext.toKtVariantType
import godot.entrygenerator.ext.toTypeName
import godot.entrygenerator.model.RegisterConstructorAnnotation
import godot.entrygenerator.model.RegisteredClass
import godot.tools.common.constants.godotCorePackage

object ConstructorRegistrationGenerator {

    fun generate(registeredClass: RegisteredClass, className: ClassName, registerClassControlFlow: FunSpec.Builder) {
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
                        ClassName(godotCorePackage, "KtConstructor$ctorParamsCount"),
                        className
                    )
                } else {
                    val templateArgs = mutableListOf<Any>()
                    val templateString = buildString {
                        append("::%T")
                        templateArgs.add(className)

                        append(",·")

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

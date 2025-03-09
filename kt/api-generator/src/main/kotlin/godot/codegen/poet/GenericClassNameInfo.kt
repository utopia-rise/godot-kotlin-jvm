package godot.codegen.poet

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName

// Helper that provide utilities to handle generic classes.
class GenericClassNameInfo(
    val className: ClassName,
    numberOfGenericParameters: Int
) {
    val genericTypes = Array(numberOfGenericParameters) {
        TypeVariableName("P$it")
    }.toList()
    val genericClassName = className.run {
        if (genericTypes.isNotEmpty()) {
            parameterizedBy(genericTypes)
        } else {
            this
        }
    }

    val reifiedTypes = genericTypes.map { it.copy(reified = true) }
    val reifiedClassName = className.run {
        if (reifiedTypes.isNotEmpty()) {
            parameterizedBy(reifiedTypes)
        } else {
            this
        }
    }

    val erasedGenericClassName = className.run {
        if (genericTypes.isNotEmpty()) {
            parameterizedBy(genericTypes.map { ANY })
        } else {
            this
        }
    }

    fun toTypeSpecBuilder() = TypeSpec
        .classBuilder(className)
        .addTypeVariables(genericTypes)

    fun toFunSpecBuilder(name: String) = FunSpec
        .builder(name)
        .addTypeVariables(genericTypes)

    fun toExtensionFunSpecBuilder(name: String) = toFunSpecBuilder(name).receiver(genericClassName)

    fun toReifiedFunSpecBuilder(name: String) = FunSpec
        .builder(name)
        .addTypeVariables(reifiedTypes)
        .addModifiers(KModifier.INLINE)

    fun toReifiedExtensionFunSpecBuilder(name: String) = toReifiedFunSpecBuilder(name).receiver(reifiedClassName)

    fun toParameterSpecList() = genericTypes
        .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
            ParameterSpec.builder("p$index", typeVariableName).build()
        }

    fun toLambdaTypeName(returnType: TypeVariableName) = LambdaTypeName.get(
        receiver = null,
        parameters = genericTypes
            .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                ParameterSpec.builder("p$index", typeVariableName).build()
            },
        returnType = returnType
    )
}

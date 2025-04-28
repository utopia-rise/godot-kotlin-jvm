package godot.codegen.poet

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.TypeVariableName

/**
 * Provides utilities to handle generic classes and generate KotlinPoet builders for them.
 *
 * @property className The base [ClassName] representing the class.
 * @param numberOfGenericParameters The number of generic type parameters for the class.
 */
class GenericClassNameInfo(
    val className: ClassName,
    numberOfGenericParameters: Int
) {
    /**
     * Return list of generic argument type names.
     *
     * Example: genericTypes = [P0, P1]
     */
    val genericTypes = Array(numberOfGenericParameters) {
        TypeVariableName("P$it")
    }.toList()


    /**
     * Parameterized [ClassName] with generic type variables.
     *
     * Example: MyClass<P0, P1>
     */
    val genericClassName = className.run {
        if (genericTypes.isNotEmpty()) {
            parameterizedBy(genericTypes)
        } else {
            this
        }
    }

    /**
     * List of reified type variables for inline functions.
     *
     * Example: [reified P0, reified P1]
     */
    val reifiedTypes = genericTypes.map { it.copy(reified = true) }

    /**
     * Parameterized [ClassName] with reified generic type variables.
     *
     * Example: MyClass<reified P0, reified P1>
     */
    val reifiedClassName = className.run {
        if (reifiedTypes.isNotEmpty()) {
            parameterizedBy(reifiedTypes)
        } else {
            this
        }
    }

    /**
     * Parameterized [ClassName] with generic parameters erased to [ANY].
     *
     * Example: MyClass<Any, Any>
     */
    val erasedGenericClassName = className.run {
        if (genericTypes.isNotEmpty()) {
            parameterizedBy(genericTypes.map { ANY })
        } else {
            this
        }
    }

    /**
     * Combine optional [prefix], core [genericTypes], and optional [suffix] into one list.
     */
    private fun allTypeVariables(
        prefix: List<TypeVariableName> = emptyList(),
        suffix: List<TypeVariableName> = emptyList()
    ) = prefix + genericTypes + suffix

    /**
     * Builds a [TypeSpec.Builder] for the class with type variables.
     *
     * Example: toTypeSpecBuilder(prefix, suffix) -> TypeSpec.classBuilder("MyClass").addTypeVariables(prefix + [P0,P1] + suffix)
     */
    fun toTypeSpecBuilder(
        prefix: List<TypeVariableName> = emptyList(),
        suffix: List<TypeVariableName> = emptyList()
    ) = TypeSpec.classBuilder(className.simpleName)
        .addTypeVariables(allTypeVariables(prefix, suffix))

    /**
     * Builds a [FunSpec.Builder] with generic type variables.
     *
     * Example: builder("foo", prefix, suffix) -> builder("foo").addTypeVariables(prefix + [P0,P1] + suffix)
     */
    fun toFunSpecBuilder(
        name: String,
        prefix: List<TypeVariableName> = emptyList(),
        suffix: List<TypeVariableName> = emptyList()
    ) = FunSpec.builder(name)
        .addTypeVariables(allTypeVariables(prefix, suffix))



    /**
     * Builds an extension [FunSpec.Builder] on [genericClassName].
     *
     * Example: fun <X,P0,P1,Y> MyClass<P0,P1>.foo() {...}
     */
    fun toExtensionFunSpecBuilder(
        name: String,
        prefix: List<TypeVariableName> = emptyList(),
        suffix: List<TypeVariableName> = emptyList()
    ) = toFunSpecBuilder(name, prefix, suffix)
        .receiver(genericClassName)


    /**
     * Begin building a reified inline FunSpec with reified type parameters.
     *
     * Example: inline fun <X, reified P0, reified P1, Y> foo() {...}
     */
    fun toReifiedFunSpecBuilder(
        name: String,
        prefix: List<TypeVariableName> = emptyList(),
        suffix: List<TypeVariableName> = emptyList()
    ) = FunSpec.builder(name)
        .addModifiers(KModifier.INLINE)
        .addTypeVariables(prefix + reifiedTypes + suffix)


    /**
     * Begin building a reified inline extension FunSpec on the class.
     *
     * Example: inline fun <reified P0, reified P1> MyClass<P0, P1>.foo() {...}
     */
    fun toReifiedExtensionFunSpecBuilder(
        name: String,
        prefix: List<TypeVariableName> = emptyList(),
        suffix: List<TypeVariableName> = emptyList()
    ) = toReifiedFunSpecBuilder(name, prefix, suffix)
        .receiver(reifiedClassName)


    /**
     * Generate a list of parameters matching the generic type variables.
     *
     * Example: [ParameterSpec("p0", P0), ParameterSpec("p1", P1)]
     */
    fun toParameterSpecList() = genericTypes
        .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
            ParameterSpec.builder("p$index", typeVariableName).build()
        }

    /**
     * Build a comma-separated argument string based on a template.
     *
     * @param template String template where occurrences of `{$indexKey}` will be replaced by index
     * @param indexKey placeholder key in template (e.g., "%d")
     *
     * Example: toArgumentsString("p%{i}", "{i}") -> "p0, p1"
     */
    fun toArgumentsString(template: String, indexKey: String): String {
        return buildString {
            genericTypes.mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                if (index != 0) append(",·")
                append(template.replace(indexKey, index.toString()))
            }
        }
    }

    /**
     * Create a LambdaTypeName taking generic types as parameters and returning [returnType].
     *
     * Example: toLambdaTypeName(R) -> (p0: P0, p1: P1) -> R
     */
    fun toLambdaTypeName(returnType:  TypeName, receiver:  TypeName? = null) = LambdaTypeName.get(
        receiver = receiver,
        parameters = genericTypes
            .mapIndexed { index: Int, typeVariableName: TypeVariableName ->
                ParameterSpec.builder("p$index", typeVariableName).build()
            },
        returnType = returnType
    )
}

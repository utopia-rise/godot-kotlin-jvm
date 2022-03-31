package code_backup

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.squareup.kotlinpoet.*

import godot.codegen.utils.*


@JsonIgnoreProperties(ignoreUnknown = true)
open class Method @JsonCreator constructor(
    @JsonProperty("name")
    val oldName: String,
    @JsonProperty("return_type")
    var returnType: String,
    @JsonProperty("is_virtual")
    val isVirtual: Boolean,
    @JsonProperty("has_varargs")
    val hasVarargs: Boolean,
    @JsonProperty("arguments")
    val arguments: List<Argument>
) {

    var newName: String = oldName.convertToCamelCase()

    init {
        returnType = returnType.convertTypeToKotlin()
        if (isVirtual && !newName.startsWith("_")) {
            newName = "_$newName"
        }
    }

    var isGetterOrSetter: Boolean = false
    lateinit var engineIndexName: String

    fun initEngineIndex(engineClassIndexName: String) {
        engineIndexName = "ENGINEMETHOD_${engineClassIndexName}_${oldName.toUpperCase()}"
    }

    fun generate(clazz: Class): FunSpec {
        val modifiers = mutableListOf<KModifier>()

        if (!clazz.isSingleton) {
            modifiers.add(getModifier(clazz))
        }

        val generatedFunBuilder = FunSpec
            .builder(newName)
            .addModifiers(modifiers)

        val shouldReturn = returnType != "Unit"
        if (shouldReturn) {
            val simpleName = returnType.removeEnumPrefix()
            val nullable = returnType.convertTypeForICalls() == "Object" || returnType.convertTypeForICalls() == "Any"
            val returnClassName = ClassName(returnType.getPackage(), simpleName).copy(nullable = nullable) as ClassName
            generatedFunBuilder.returns(returnClassName.convertIfTypeParameter())
        }

        if (returnType.isEnum()) {
            val type = returnType.removeEnumPrefix()
            if (type.contains('.')) {
                clazz.additionalImports.add(returnType.getPackage() to type.split('.')[0])
            }
        }

        //TODO: move adding arguments to generatedFunBuilder to separate function
        val callArgumentsAsString = buildCallArgumentsString(
            clazz,
            generatedFunBuilder
        ) //cannot be inlined as it also adds the arguments to the generatedFunBuilder

        if (hasVarargs) {
            generatedFunBuilder.addParameter(
                "__var_args",
                ANY.copy(nullable = true),
                KModifier.VARARG
            )
        }

        generatedFunBuilder.generateCodeBlock(clazz, callArgumentsAsString, shouldReturn)

        val kDoc = classDocs[clazz.newName]?.functions?.get(oldName)?.description
        if (kDoc != null) {
            generatedFunBuilder.addKdoc("%L", kDoc)
        }

        return generatedFunBuilder.build()
    }

    private fun FunSpec.Builder.generateCodeBlock(clazz: Class,
                                                  callArgumentsAsString: String,
                                                  shouldReturn: Boolean
    ) {
        if (!isVirtual) {
            generateJvmMethodCall(
                engineIndexName,
                returnType,
                callArgumentsAsString,
                arguments.map { it.type }.toList(),
                hasVarargs
            )
        } else {
            if (shouldReturn) {
                addStatement(
                        "%L %T(%S)",
                        "throw",
                        NotImplementedError::class,
                        "$oldName is not implemented for ${clazz.newName}"
                )
            }
        }
    }

    private fun buildCallArgumentsString(cl: Class, generatedFunBuilder: FunSpec.Builder): String {
        return buildString {
            arguments.withIndex().forEach {
                val index = it.index
                val argument = it.value

                val shouldAddComa = index != 0

                if (shouldAddComa) append(", ")

                val sanitisedArgumentName = tree.getSanitisedArgumentName(this@Method, index, cl)

                append("%T to $sanitisedArgumentName")
                if (argument.type.isEnum()) append(".id")

                if (argument.type.isEnum()) append(".id")

                val baseClassName = ClassName(
                    argument.type.getPackage(),
                    argument.type.removeEnumPrefix()
                )
                val parameterBuilder = ParameterSpec.builder(
                    sanitisedArgumentName,
                    baseClassName.convertIfTypeParameter().copy(nullable = argument.nullable)
                )

                if (argument.applyDefault != null) parameterBuilder.defaultValue(argument.applyDefault)

                generatedFunBuilder.addParameter(parameterBuilder.build())
            }
            if (hasVarargs && length != 0) append(", ")
        }
    }

    private fun getModifier(cl: Class) =
        if (tree.doAncestorsHaveMethod(cl, this)) KModifier.OVERRIDE else KModifier.OPEN

}

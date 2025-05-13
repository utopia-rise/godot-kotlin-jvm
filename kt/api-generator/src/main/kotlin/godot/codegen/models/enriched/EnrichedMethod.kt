package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ClassName
import godot.codegen.exceptions.TooManyMethodArgument
import godot.codegen.models.Method
import godot.codegen.models.traits.CallableGeneratorTrait
import godot.codegen.models.traits.DocumentedGenerationTrait
import godot.codegen.models.traits.GenerationType
import godot.codegen.models.traits.Nature
import godot.codegen.workarounds.sanitizeApiType
import godot.common.constants.Constraints
import godot.common.extensions.convertToCamelCase

class EnrichedMethod(model: Method) : CallableGeneratorTrait, DocumentedGenerationTrait {
    override val type = GenerationType(model.returnValue?.type?.sanitizeApiType() ?: "void")
    override val nullable = type.isObjectSubClass() || type.isVariant()
    override val genericParameters = emptyList<ClassName>()
    override val meta: String? = model.returnValue?.meta

    val name = model.name.convertToCamelCase().let {
        if (model.isVirtual && !it.startsWith("_")) {
            "_$it"
        } else {
            it
        }
    }
    override val arguments = model.arguments?.toEnriched() ?: listOf()
    override val isVararg = model.isVararg
    override var description = model.description

    val hash = model.hash
    val isVirtual = model.isVirtual
    val isStatic = model.isStatic
    val godotName = model.name

    val canGenerate: Boolean  = run{
        if (type.isNativeType()) {
            return@run false
        }
        for (argument in arguments) {
            if (argument.type.isNativeType()) {
                return@run false
            }
        }
        return@run true
    }

    init {
        if (arguments.size > Constraints.MAX_FUNCTION_ARG_COUNT) {
            throw TooManyMethodArgument(model)
        }
    }
}

fun List<Method>.toEnriched() = map { EnrichedMethod(it) }

fun EnrichedMethod.isSameSignature(other: EnrichedMethod): Boolean {
    return name == other.name &&
        type == other.type
    arguments == other.arguments
}

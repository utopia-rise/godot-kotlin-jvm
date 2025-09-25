package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ClassName
import godot.codegen.models.Constant
import godot.codegen.models.traits.DocumentedGenerationTrait
import godot.codegen.models.traits.GenerationType
import godot.codegen.models.traits.HasTypeGenerationTrait

class EnrichedConstant(model: Constant) : HasTypeGenerationTrait, DocumentedGenerationTrait {
    override val type = GenerationType("int")
    override val genericParameters = emptyList<ClassName>()
    override var description = model.description

    val name = model.name
    val value = model.value
}

fun List<Constant>.toEnriched() = map { EnrichedConstant(it) }

package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ClassName
import godot.codegen.models.NativeStructure
import godot.codegen.models.traits.Nature
import godot.codegen.models.traits.TypeGenerationTrait
import godot.codegen.models.traits.from

class EnrichedNativeStructure(model: NativeStructure) : TypeGenerationTrait {
    override val identifier = model.name
    override val nature = Nature.NATIVE
    override val className = ClassName.from(this)
}


fun List<NativeStructure>.toEnriched() = map { EnrichedNativeStructure(it) }
fun NativeStructure.toEnriched() = EnrichedNativeStructure(this)

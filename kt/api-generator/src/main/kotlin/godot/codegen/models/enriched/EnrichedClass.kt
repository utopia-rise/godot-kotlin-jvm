package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ClassName
import godot.codegen.models.ApiType
import godot.codegen.models.Class
import godot.codegen.generation.task.traits.DocumentedGenerationTrait
import godot.codegen.generation.task.traits.Nature
import godot.codegen.generation.task.traits.TypeGenerationTrait

class EnrichedClass(model: Class) : TypeGenerationTrait, DocumentedGenerationTrait {
    override val identifier = model.name
    override val nature = Nature.CLASS

    val apiType = ApiType.from(model.apiType)
    val isInstantiable = model.isInstantiable

    var parent: EnrichedClass? = null
        private set
    var isSingleton = false
        private set

    val constants = model.constants?.toEnriched() ?: listOf()
    val enums = model.enums?.toEnriched(this) ?: listOf()
    val signals = model.signals?.toEnriched() ?: listOf()
    val properties = model.properties?.toEnriched() ?: listOf()
    val methods = model.methods?.toEnriched() ?: listOf()

    override var description = model.description
    val additionalImports = mutableSetOf<ClassName>()

    fun makeSingleton() {
        isSingleton = true
    }

    fun setParent(parent: EnrichedClass) {
        this.parent = parent
    }
}

fun List<Class>.toEnriched() = map { EnrichedClass(it) }
fun Class.toEnriched() = EnrichedClass(this)

package godot.codegen.models.enriched

import godot.codegen.models.ApiType
import godot.codegen.models.Class
import godot.codegen.models.custom.AdditionalImport
import godot.codegen.traits.IDocumented
import godot.codegen.traits.TypedTrait

class EnrichedClass(model: Class) : TypedTrait, IDocumented {
    override val type = model.name
    val apiType = ApiType.from(model.apiType)
    val isInstantiable = model.isInstantiable

    var parent: EnrichedClass? = null
        private set
    var isSingleton = false
        private set

    val constants = model.constants?.toEnriched() ?: listOf()
    val enums = model.enums?.toEnriched(this.type) ?: listOf()
    val signals = model.signals?.toEnriched() ?: listOf()
    val properties = model.properties?.toEnriched() ?: listOf()
    val methods = model.methods?.toEnriched() ?: listOf()

    override val description = model.description
    val additionalImports = mutableListOf<AdditionalImport>()

    fun makeSingleton() {
        isSingleton = true
    }

    fun setParent(parent: EnrichedClass) {
        this.parent = parent
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        other as EnrichedClass
        return type == other.type
    }

    override fun hashCode() = type.hashCode()
}

fun List<Class>.toEnriched() = map { EnrichedClass(it) }
fun Class.toEnriched() = EnrichedClass(this)

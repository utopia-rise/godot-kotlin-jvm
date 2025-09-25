package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ClassName
import godot.codegen.models.ApiType
import godot.codegen.models.Class
import godot.codegen.models.traits.DocumentedGenerationTrait
import godot.codegen.models.traits.Nature
import godot.codegen.models.traits.TypeGenerationTrait
import godot.codegen.models.traits.from

enum class ModuleLevel { CORE, API }

class EnrichedClass(model: Class) : TypeGenerationTrait, DocumentedGenerationTrait {
    override val identifier = model.name
    override val nature = Nature.CLASS
    override val className = ClassName.from(this)

    val apiType = ApiType.from(model.apiType)
    private var moduleLevel: ModuleLevel = ModuleLevel.API


    var parent: EnrichedClass? = null
        private set
    var isSingleton = false
        private set

    val constants = model.constants?.toEnriched() ?: listOf()
    val enums = model.enums?.toEnriched(this) ?: listOf()
    val signals = model.signals?.toEnriched() ?: listOf()
    val properties = model.properties?.toEnriched() ?: listOf()
    val methods = model.methods?.toEnriched() ?: listOf()

    val isAbstract = methods.any { it.isAbstract } || !model.isInstantiable

    override var description = model.description
    val additionalImports = mutableSetOf<ClassName>()

    fun makeSingleton() {
        isSingleton = true
    }

    fun setParent(parent: EnrichedClass) {
        this.parent = parent
    }

    fun setAsCoreModule() {
        moduleLevel = ModuleLevel.CORE
    }

    fun isCoreModule(): Boolean {
        return moduleLevel == ModuleLevel.CORE
    }
}

fun List<Class>.toEnriched() = map { EnrichedClass(it) }
fun Class.toEnriched() = EnrichedClass(this)

package godot.codegen.repositories.impl

import godot.codegen.models.BuiltinClass
import godot.codegen.models.Enum
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.ICoreRepository


class CoreRepository(
    coreTypes: List<BuiltinClass>,
    globalEnums: List<Enum>
) : ICoreRepository {
    private val coreTypes = coreTypes.associate{ it.name to (it.enums?.toEnriched(it.name)?: listOf())}
    private val globalEnums = globalEnums.toEnriched()

    override fun getGlobalEnums() = globalEnums
    override fun getCoreEnum(type: String) = coreTypes[type]?: listOf()
}

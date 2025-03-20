package godot.codegen.repositories.impl

import godot.codegen.models.BuiltinClass
import godot.codegen.models.Enum
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.IEnumRepository
import godot.codegen.generation.task.traits.GenerationType


class EnumRepository(
    coreTypes: List<BuiltinClass>,
    globalEnums: List<Enum>
) : IEnumRepository {
    private val coreTypes = coreTypes.associate { it.name to (it.enums?.toEnriched(GenerationType(it.name)) ?: listOf()) }
    private val globalEnumList = globalEnums.toEnriched()
    private val globalEnumMap = globalEnumList.associateBy { it.identifier }

    override fun getGlobalEnums() = globalEnumList
    override fun getGlobalEnum(type: String) = globalEnumMap[type]

    override fun getCoreEnum(type: String) = coreTypes[type] ?: listOf()
}

package godot.codegen.services.impl

import godot.codegen.constants.CoreTypeTraits
import godot.codegen.models.Enum
import godot.codegen.models.EnumValue
import godot.codegen.models.enriched.EnrichedEnum
import godot.codegen.models.enriched.toEnriched
import godot.codegen.services.ICoreService
import godot.tools.common.constants.GodotTypes


class CoreService(
    globalEnums: List<Enum>
) : ICoreService {
    private val coreTypes = mapOf(
        GodotTypes.vector3 to listOf(
            Enum(
                "Axis",
                listOf(
                    EnumValue("X", 0),
                    EnumValue("Y", 1),
                    EnumValue("Z", 2)
                )
            ).toEnriched(CoreTypeTraits.VECTOR3.type)
        )
    )

    private val globalEnums = globalEnums.toEnriched()

    override fun getGlobalEnums() = globalEnums
    override fun getCoreType(type: String): List<EnrichedEnum> = coreTypes[type]!!
}

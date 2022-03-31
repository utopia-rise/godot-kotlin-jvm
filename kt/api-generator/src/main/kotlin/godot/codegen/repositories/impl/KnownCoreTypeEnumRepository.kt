package godot.codegen.repositories.impl

import godot.codegen.constants.CoreTypeTraits
import godot.codegen.constants.GodotTypes
import godot.codegen.models.Enum
import godot.codegen.models.EnumValue
import godot.codegen.models.enriched.toEnriched
import godot.codegen.repositories.CoreTypeEnumRepository

class KnownCoreTypeEnumRepository : CoreTypeEnumRepository {
    val rawData = mapOf(
        GodotTypes.vector3 to listOf(
            Enum(
                "Axis",
                listOf(
                    EnumValue("X", 0),
                    EnumValue("Y", 1),
                    EnumValue("Z", 2)
                )
            ).toEnriched(CoreTypeTraits.VECTOR3)
        )
    )

    override fun list() = rawData.map { it.value }.flatten()
    override fun listForCoreType(coreType: String) = rawData[coreType]
}
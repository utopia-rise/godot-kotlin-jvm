package godot.codegen.services.impl

import godot.codegen.constants.GodotTypes
import godot.codegen.exceptions.NoMatchingEnumFound
import godot.codegen.models.custom.DefaultEnumValue
import godot.codegen.repositories.CoreTypeEnumRepository
import godot.codegen.repositories.GlobalEnumRepository
import godot.codegen.services.IClassService
import godot.codegen.services.IEnumService

class EnumService(
    private val globalEnumRepository: GlobalEnumRepository,
    private val coreTypeEnumRepository: CoreTypeEnumRepository,
    private val classService: IClassService
) : IEnumService {
    override fun getGlobalEnums() = globalEnumRepository.list()
    override fun findEnumValue(enumName: String, enumValue: Int) : DefaultEnumValue {
        val enumSplit = enumName.split(".")
        return if (enumSplit.size > 1) {
            val className = enumSplit[0]
            val enum = enumSplit[1]
            val enrichedEnum = if (GodotTypes.coreTypes.contains(className)) {
                coreTypeEnumRepository.listForCoreType(className)
            } else {
                classService.getClasses()
                    .plus(classService.getSingletons())
                    .first { it.name == className }
                    .enums
            }
                ?.first { it.name == enum }
            val value = enrichedEnum
                ?.internal
                ?.values
                ?.first { it.value == enumValue } ?: throw NoMatchingEnumFound(enumName)

            DefaultEnumValue(enrichedEnum, value)
        } else {
            val enum = getGlobalEnums()
                .first { it.name == enumName }
            val value = enum
                .internal
                .values
                .first { it.value == enumValue }

            DefaultEnumValue(enum, value)
        }
    }
}
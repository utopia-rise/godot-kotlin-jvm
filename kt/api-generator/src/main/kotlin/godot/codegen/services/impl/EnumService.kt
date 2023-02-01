package godot.codegen.services.impl

import godot.tools.common.constants.GodotTypes
import godot.codegen.exceptions.NoMatchingEnumFound
import godot.codegen.models.custom.DefaultEnumValue
import godot.codegen.poet.ClassTypeNameWrapper
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
    override fun findEnumValue(enumClassName: ClassTypeNameWrapper, enumValue: Int) : DefaultEnumValue {
        val simpleNames = enumClassName.className.simpleNames
        return if (simpleNames.size > 1) {
            val className = simpleNames[0]
            val enum = simpleNames[1]
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
                ?.first { it.value == enumValue } ?: throw NoMatchingEnumFound(simpleNames.joinToString("."))

            DefaultEnumValue(enrichedEnum, value)
        } else {
            val enum = getGlobalEnums()
                .first { it.name == simpleNames[0] }
            val value = enum
                .internal
                .values
                .first { it.value == enumValue }

            DefaultEnumValue(enum, value)
        }
    }
}

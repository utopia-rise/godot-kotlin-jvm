package godot.codegen.services.impl

import godot.codegen.exceptions.NoMatchingEnumFound
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isBitField
import godot.codegen.models.custom.DefaultEnumValue
import godot.codegen.poet.ClassTypeNameWrapper
import godot.codegen.repositories.CoreTypeEnumRepository
import godot.codegen.repositories.GlobalEnumRepository
import godot.codegen.services.IClassService
import godot.codegen.services.IApiService
import godot.tools.common.constants.GodotTypes

class ApiService(
    private val globalEnumRepository: GlobalEnumRepository,
    private val coreTypeEnumRepository: CoreTypeEnumRepository,
    private val classService: IClassService
) : IApiService {

    override fun getGlobalEnums() = globalEnumRepository.list()

    override fun findDefaultEnumValue(enumClassName: ClassTypeNameWrapper, enumValue: Long): DefaultEnumValue {
        val simpleNames = enumClassName.className.simpleNames
        return if (simpleNames.size > 1) {
            val className = simpleNames[0]
            val enrichedEnum = if (GodotTypes.coreTypes.contains(className)) {
                coreTypeEnumRepository.listForCoreType(className)
            } else {
                classService.findTypeByName(className)!!.enums
            }?.firstOrNull { it.getTypeClassName() == enumClassName } ?: throw NoMatchingEnumFound(simpleNames.joinToString("."))

            val value = enrichedEnum
                .internal
                .values
                .firstOrNull { it.value == enumValue } ?: if (enrichedEnum.isBitField()) {
                return DefaultEnumValue(
                    null,
                    "${enrichedEnum.name}Value($enumValue)",
                    enrichedEnum.encapsulatingType
                )
            } else {
                throw NoMatchingEnumFound(simpleNames.joinToString("."))
            }

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

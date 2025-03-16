package godot.codegen.generation

import godot.codegen.exceptions.NoMatchingEnumFound
import godot.codegen.extensions.getClassName
import godot.codegen.repositories.IClassRepository
import godot.codegen.repositories.IEnumRepository
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.traits.TypedTrait
import godot.tools.common.constants.GodotTypes

class Context(
    val classRepository: IClassRepository,
    val enumRepository: IEnumRepository,
    val nativeStructureRepository: INativeStructureRepository
) {
    var nextEngineClassIndex = 0
    var nextSingletonIndex = 0

    fun generateEnumDefaultValue(enumClass: TypedTrait, value: Long): String {
        val simpleNames = enumClass.getClassName().simpleNames
        val className: String
        val enrichedEnum = if (simpleNames.size > 1) {
            className = simpleNames[0]
            if (GodotTypes.coreTypes.contains(className)) {
                enumRepository.getCoreEnum(className)
            } else {
                classRepository.findTypeByName(className)!!.enums
            }.firstOrNull {
                it.type == enumClass.type
            } ?: throw NoMatchingEnumFound(simpleNames.joinToString("."))
        } else {
            className = ""
            enumRepository.getGlobalEnum(enumClass.type!!)!!
        }

        val enumValue = enrichedEnum.values.firstOrNull { it.value == value }
        return if (enumValue != null) {
            (if (className != "") "${className}." else "") + enrichedEnum.simpleName + "." + enumValue.name
        } else {
            (if (className != "") "${className}." else "") + enrichedEnum.simpleName + "(" + value + ")"
        }
    }
}

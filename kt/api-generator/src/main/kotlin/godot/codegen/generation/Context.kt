package godot.codegen.generation

import godot.codegen.exceptions.NoMatchingEnumFound
import godot.codegen.repositories.IClassRepository
import godot.codegen.repositories.IEnumRepository
import godot.codegen.repositories.INativeStructureRepository
import godot.codegen.generation.task.traits.GenerationType
import godot.tools.common.constants.GodotTypes

class Context(
    val classRepository: IClassRepository,
    val enumRepository: IEnumRepository,
    val nativeStructureRepository: INativeStructureRepository
) {
    var nextEngineClassIndex = 0
    var nextSingletonIndex = 0

    fun generateEnumDefaultValue(type: GenerationType, value: Long): String {
        val simpleNames = type.getClassName().simpleNames
        val className: String
        val enrichedEnum = if (simpleNames.size > 1) {
            className = simpleNames[0]
            if (GodotTypes.coreTypes.contains(className)) {
                enumRepository.getCoreEnum(className)
            } else {
                classRepository.findTypeByName(className)!!.enums
            }.firstOrNull {
                it.identifier == type.identifier
            } ?: throw NoMatchingEnumFound(type.identifier)
        } else {
            className = ""
            enumRepository.getGlobalEnum(type.identifier)!!
        }

        val enumValue = enrichedEnum.values.firstOrNull { it.value == value }
        return if (enumValue != null) {
            enrichedEnum.identifier + "." + enumValue.name
        } else {
            enrichedEnum.identifier + "(" + value + ")"
        }
    }
}

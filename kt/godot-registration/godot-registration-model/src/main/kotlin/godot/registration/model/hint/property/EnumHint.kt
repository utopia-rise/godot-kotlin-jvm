package godot.registration.model.hint.property

import godot.registration.model.types.Type

sealed class EnumHint(
    val enumType: Type,
    val entryCount: Int,
) : PropertyHint()

class EnumHintStringHint(enumType: Type, entryCount: Int) : EnumHint(enumType, entryCount)
class EnumFlagHintStringHint(enumType: Type, entryCount: Int) : EnumHint(enumType, entryCount)
class EnumListHintStringHint(enumType: Type, entryCount: Int) : EnumHint(enumType, entryCount)

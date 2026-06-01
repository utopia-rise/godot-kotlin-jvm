package godot.registration.model.hint.property

sealed class EnumHint(
    val enumValueNames: List<String>,
) : PropertyHint()

class EnumHintStringHint(enumValueNames: List<String>) : EnumHint(enumValueNames)
class EnumFlagHintStringHint(enumValueNames: List<String>) : EnumHint(enumValueNames)
class EnumListHintStringHint(enumValueNames: List<String>) : EnumHint(enumValueNames)

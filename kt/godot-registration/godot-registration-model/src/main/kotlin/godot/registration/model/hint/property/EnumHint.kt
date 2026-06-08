package godot.registration.model.hint.property

sealed class EnumHint(
    val enumFqName: String,
    val entryCount: Int,
) : PropertyHint()

class EnumHintStringHint(enumFqName: String, entryCount: Int) : EnumHint(enumFqName, entryCount)
class EnumFlagHintStringHint(enumFqName: String, entryCount: Int) : EnumHint(enumFqName, entryCount)
class EnumListHintStringHint(enumFqName: String, entryCount: Int) : EnumHint(enumFqName, entryCount)

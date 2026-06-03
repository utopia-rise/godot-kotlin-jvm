package godot.registration.model.hint.property

/**
 * A single enum constant contributing to an enum/flag/list hint.
 *
 * [value] is the explicit integer the user assigned through [godot.core.GodotEnum]; it is `null` for a
 * regular Kotlin enum, in which case the hint is emitted names-only and Godot auto-assigns ordinals
 * (or positional flag masks).
 */
data class EnumValue(val name: String, val value: Long?)

sealed class EnumHint(
    val enumValues: List<EnumValue>,
) : PropertyHint()

class EnumHintStringHint(enumValues: List<EnumValue>) : EnumHint(enumValues)
class EnumFlagHintStringHint(enumValues: List<EnumValue>) : EnumHint(enumValues)
class EnumListHintStringHint(enumValues: List<EnumValue>) : EnumHint(enumValues)

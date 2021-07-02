package godot.entrygenerator.model

sealed class EnumAnnotation(
    val enumValueNames: List<String>
) : PropertyHintAnnotation

class EnumHintStringAnnotation(enumValueNames: List<String>) : EnumAnnotation(enumValueNames)
class EnumFlagHintStringAnnotation(enumValueNames: List<String>) : EnumAnnotation(enumValueNames)
class EnumListHintStringAnnotation(enumValueNames: List<String>) : EnumAnnotation(enumValueNames)

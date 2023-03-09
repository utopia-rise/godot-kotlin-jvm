package godot.entrygenerator.model

sealed class EnumAnnotation(
    val enumValueNames: List<String>,
    source: Any
) : PropertyHintAnnotation(source)

class EnumHintStringAnnotation(enumValueNames: List<String>, source: Any) : EnumAnnotation(enumValueNames, source)
class EnumFlagHintStringAnnotation(enumValueNames: List<String>, source: Any) : EnumAnnotation(enumValueNames, source)
class EnumListHintStringAnnotation(enumValueNames: List<String>, source: Any) : EnumAnnotation(enumValueNames, source)

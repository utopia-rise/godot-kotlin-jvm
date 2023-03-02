package godot.entrygenerator.model

data class RangeHintAnnotation<T: Number>(
    val start: T,
    val end: T,
    val step: T,
    val or: Range,
    val hideSlider: Boolean,
    val isRadians: Boolean,
    val isDegrees: Boolean,
    val isExp: Boolean,
    val suffix: String?,
): PropertyHintAnnotation

package godot.entrygenerator.model

sealed class RangeHintAnnotation<T: Any>: PropertyHintAnnotation {
    abstract val start: T
    abstract val end: T
    abstract val step: T
}

class IntRangeHintAnnotation(
    override val start: Int,
    override val end: Int,
    override val step: Int,
    val or: Range
) : RangeHintAnnotation<Int>()

class LongRangeHintAnnotation(
    override val start: Long,
    override val end: Long,
    override val step: Long,
    val or: Range
) : RangeHintAnnotation<Long>()

class FloatRangeHintAnnotation(
    override val start: Float,
    override val end: Float,
    override val step: Float,
    val or: Range
) : RangeHintAnnotation<Float>()

class DoubleRangeHintAnnotation(
    override val start: Double,
    override val end: Double,
    override val step: Double,
    val or: Range
) : RangeHintAnnotation<Double>()

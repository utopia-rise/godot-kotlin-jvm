package godot.entrygenerator.model

sealed class RangeHintAnnotation<T: Any>: PropertyHintAnnotation {
    abstract val start: T
    abstract val end: T
    abstract val step: T
    abstract val or: Range
}

class IntRangeHintAnnotation(
    override val start: Int,
    override val end: Int,
    override val step: Int,
    override val or: Range
) : RangeHintAnnotation<Int>()

class FloatRangeHintAnnotation(
    override val start: Float,
    override val end: Float,
    override val step: Float,
    override val or: Range
) : RangeHintAnnotation<Float>()

class DoubleRangeHintAnnotation(
    override val start: Double,
    override val end: Double,
    override val step: Double,
    override val or: Range
) : RangeHintAnnotation<Double>()

class ExpRangeHintAnnotation(
    override val start: Double,
    override val end: Double,
    override val step: Double,
    override val or: Range
) : RangeHintAnnotation<Double>()

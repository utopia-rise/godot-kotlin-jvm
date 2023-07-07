package godot.util

import godot.core.ObjectID
import godot.core.VariantType
import java.util.*
import kotlin.math.abs
import kotlin.math.sign

typealias RealT = Double
internal typealias NaturalT = Long

internal val realTVariantType = VariantType.DOUBLE
internal val NaturalTVariantType = VariantType.LONG

typealias VoidPtr = Long

const val nullptr: VoidPtr = -1L
val nullObjectID = ObjectID(-1)

fun String.camelToSnakeCase(): String {
    return "(?<=[a-zA-Z0-9])[A-Z]".toRegex().replace(this) {
        "_${it.value}"
    }.lowercase(Locale.ENGLISH)
}

@Suppress("NOTHING_TO_INLINE")
inline fun Number.toRealT(): RealT = this.toDouble()

@Suppress("NOTHING_TO_INLINE")
inline fun Double.toRealT(): RealT = this

@Suppress("NOTHING_TO_INLINE")
inline fun Float.toRealT(): RealT = this.toDouble()

@Suppress("NOTHING_TO_INLINE")
@PublishedApi
internal inline fun Number.toGodotReal(): Float = this.toFloat()

@Suppress("NOTHING_TO_INLINE")
@PublishedApi
internal inline fun Float.toGodotReal(): Float = this

@Suppress("NOTHING_TO_INLINE")
inline fun Int.toNaturalT(): NaturalT = this.toLong()

val Int.signbit: Boolean
    get() = sign < 0

val Long.signbit: Boolean
    get() = sign < 0

val Float.signbit: Boolean
    get() = sign < 0

val Double.signbit: Boolean
    get() = sign < 0

/**
 * Because of float precision, it's hard to obtain two perfectly equal real numbers.
 * They are considered equal if the difference is smaller than CMP_EPSILON
 */
const val CMP_EPSILON: RealT = 0.00001
fun isEqualApprox(a: RealT, b: RealT, epsilon: RealT = CMP_EPSILON): Boolean {
    //taken from https://github.com/godotengine/godot/blob/d8066aa6a4afb12ffddcec71bd7e051dcd04f3e1/core/math/math_funcs.h#L315

    // Check for exact equality first, required to handle "infinity" values.
    if (a == b) {
        return true
    }
    // Then check for approximate equality.
    var tolerance: RealT = epsilon * abs(a)
    if (tolerance < epsilon) {
        tolerance = epsilon
    }
    return abs(a - b) < tolerance
}

fun lerp(from: Float, to: Float, weight: Float) = from + (to - from) * weight
fun lerp(from: Double, to: Double, weight: Double) = from + (to - from) * weight

fun cubicInterpolateInTime(
    from: RealT,
    to: RealT,
    pre: RealT,
    post: RealT,
    weight: RealT,
    toT: RealT,
    preT: RealT,
    postT: RealT
): RealT {
    val t = lerp(0.0, toT, weight)
    val a1 = lerp(pre, from, if (preT == 0.0) 0.0 else (t - preT) / -preT)
    val a2 = lerp(from, to, if (toT == 0.0) 0.5 else t / toT)
    val a3 = lerp(to, post, if (postT - toT == 0.0) 1.0 else (t - toT) / (postT - toT))
    val b1 = lerp(a1, a2, if (toT - preT == 0.0) 0.0 else (t - preT) / (toT - preT))
    val b2 = lerp(a2, a3, if (postT == 0.0) 1.0 else t / postT)
    return lerp(b1, b2, if (toT == 0.0) 0.5 else t / toT)
}

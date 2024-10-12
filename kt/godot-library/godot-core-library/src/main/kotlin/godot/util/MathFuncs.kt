@file:Suppress("NOTHING_TO_INLINE", "FloatingPointLiteralPrecision")

package godot.util

import kotlin.math.abs
import kotlin.math.floor
import kotlin.math.sign


//Taken from core/math/math_defs.h
const val CMP_EPSILON: RealT = 0.00001

//This epsilon is for values related to a unit size (scalar or vector len)
const val UNIT_EPSILON = 0.001

const val SQRT12 = 0.7071067811865475244008443621048490
const val SQRT2 = 1.4142135623730950488016887242
const val LN2 = 0.6931471805599453094172321215
const val TAU = 6.2831853071795864769252867666
const val PI = 3.1415926535897932384626433833
const val E = 2.7182818284590452353602874714

const val NEPER2DB = 8.6858896380650365530225783783321
const val DB2NEPER = 1.0 / NEPER2DB

val Double.signbit: Boolean
    get() = sign < 0

/**
 * Because of float precision, it's hard to obtain two perfectly equal real numbers.
 * They are considered equal if the difference is smaller than CMP_EPSILON
 */
fun RealT.isEqualApprox(to: RealT, epsilon: RealT = CMP_EPSILON): Boolean {
    // Check for exact equality first, required to handle "infinity" values.
    if (this == to) {
        return true
    }
    return abs(this - to) < epsilon
}

fun RealT.isEqualApprox(to: RealT): Boolean {
    //taken from https://github.com/godotengine/godot/blob/d8066aa6a4afb12ffddcec71bd7e051dcd04f3e1/core/math/math_funcs.h#L315

    // Check for exact equality first, required to handle "infinity" values.
    if (this == to) {
        return true
    }
    // Then check for approximate equality.
    var tolerance: RealT = CMP_EPSILON * abs(this)
    if (tolerance < CMP_EPSILON) {
        tolerance = CMP_EPSILON
    }
    return abs(this - to) < tolerance
}

inline fun RealT.isZeroApprox() = abs(this) < CMP_EPSILON

fun RealT.fposmod(b: RealT): RealT {
    val value = this.rem(b)
    if ((value < 0 && b > 0) || (value > 0 && b < 0)) {
        return value + b;
    }
    return value
}

internal fun snapped(value: NaturalT, step: NaturalT) = if (step != 0) {
    (floor(value.toRealT() / step.toRealT() + 0.5) * step).toNaturalT()
} else {
    value
}

internal fun snapped(value: RealT, step: RealT) = if (step != 0.0) {
    floor(value / step + 0.5) * step
} else {
    value
}

internal fun bezierDerivative(start: RealT, control1: RealT, control2: RealT, end: RealT, t: RealT): RealT {
    /* Formula from Wikipedia article on Bezier curves. */
    val omt = 1.0 - t
    val omt2 = omt * omt
    val t2 = t * t

    return (control1 - start) * 3.0f * omt2 + (control2 - control1) * 6.0f * omt * t + (end - control2) * 3.0f * t2
}

internal fun bezierInterpolate(start: RealT, control1: RealT, control2: RealT, end: RealT, t: RealT): RealT {
    /* Formula from Wikipedia article on Bezier curves. */
    val omt: Double = 1.0 - t
    val omt2 = omt * omt
    val omt3 = omt2 * omt
    val t2: Double = t * t
    val t3: Double = t2 * t

    return start * omt3 + control1 * omt2 * t * 3.0 + control2 * omt * t2 * 3.0 + end * t3
}

internal fun cubicInterpolate(
    from: Double,
    to: Double,
    pre: Double,
    post: Double,
    weight: Double
) = 0.5f *
    ((from * 2.0f) +
        (-pre + to) * weight +
        (2.0f * pre - 5.0f * from + 4.0f * to - post) * (weight * weight) +
        (-pre + 3.0f * from - 3.0f * to + post) * (weight * weight * weight))

inline fun lerp(from: Float, to: Float, weight: Float) = from + (to - from) * weight
inline fun lerp(from: Double, to: Double, weight: Double) = from + (to - from) * weight

internal fun lerpAngle(from: RealT, to: RealT, weight: RealT): RealT {
    var difference = (to - from).rem(TAU)
    difference = (2 * difference).rem(TAU) - difference
    return from + difference * weight;
}

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

package godot.util

import godot.core.VariantType
import java.util.*
import kotlin.math.abs

typealias RealT = Double
internal typealias NaturalT = Long
internal val realTVariantType = VariantType.DOUBLE
internal val NaturalTVariantType = VariantType.LONG

typealias VoidPtr = Long
const val nullptr: VoidPtr = 0L

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

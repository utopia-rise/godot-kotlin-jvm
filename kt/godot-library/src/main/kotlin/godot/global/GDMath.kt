@file:JvmName("GDMathUtils")

package godot.global

import godot.core.Color
import godot.core.Vector2
import godot.core.Vector3
import godot.common.util.DB2NEPER
import godot.common.util.NEPER2DB
import godot.common.util.TAU
import godot.common.util.fposmod
import godot.common.util.isEqualApprox
import godot.common.util.isZeroApprox
import godot.common.util.toRealT
import kotlin.math.pow
import kotlin.math.sign

//Necessary for stepDecimal function
const val MAX_N = 10
val sd = arrayOf(
    0.9999,
    0.09999,
    0.009999,
    0.0009999,
    0.00009999,
    0.000009999,
    0.0000009999,
    0.00000009999,
    0.000000009999,
    0.0000000009999
)

internal interface GDMath {

    /** Returns the absolute value of parameter s (i.e. unsigned value, works for integer and float). */
    fun abs(s: Int) = kotlin.math.abs(s)

    /** Returns the absolute value of parameter s (i.e. unsigned value, works for integer and float). */
    fun abs(s: Long) = kotlin.math.abs(s)

    /** Returns the absolute value of parameter s (i.e. unsigned value, works for integer and float). */
    fun abs(s: Float) = kotlin.math.abs(s)

    /** Returns the absolute value of parameter s (i.e. unsigned value, works for integer and float). */
    fun abs(s: Double) = kotlin.math.abs(s)


    /** Returns the arc cosine of s in radians. Use to get the angle of cosine s. */
    fun acos(s: Float) = kotlin.math.acos(s)

    /** Returns the arc cosine of s in radians. Use to get the angle of cosine s. */
    fun acos(s: Double) = kotlin.math.acos(s)


    /** Returns the arc sine of s in radians. Use to get the angle of sine s. */
    fun asin(s: Float) = kotlin.math.asin(s)

    /** Returns the arc sine of s in radians. Use to get the angle of sine s. */
    fun asin(s: Double) = kotlin.math.asin(s)


    /** Returns the arc tangent of s in radians. Use it to get the angle from an angle's tangent in trigonometry: atan(tan(angle)) == angle.
     * The method cannot know in which quadrant the angle should fall. See atan2 if you always want an exact angle. */
    fun atan(s: Float) = kotlin.math.atan(s)

    /** Returns the arc tangent of s in radians. Use it to get the angle from an angle's tangent in trigonometry: atan(tan(angle)) == angle.
     * The method cannot know in which quadrant the angle should fall. See atan2 if you always want an exact angle. */
    fun atan(s: Double) = kotlin.math.atan(s)


    /** Returns the arc tangent of y/x in radians. Use to get the angle of tangent y/x. To compute the value, the method takes into account the sign of both arguments in order to determine the quadrant.
     * a = atan2(0 */
    fun atan2(y: Float, x: Float) = kotlin.math.atan2(y, x)

    /** Returns the arc tangent of y/x in radians. Use to get the angle of tangent y/x. To compute the value, the method takes into account the sign of both arguments in order to determine the quadrant.
     * a = atan2(0 */
    fun atan2(y: Double, x: Double) = kotlin.math.atan2(y, x)


    /** Converts a 2D point expressed in the cartesian coordinate system (X and Y axis) to the polar coordinate system (a distance from the origin and an angle). */
    fun cartesian2polar(x: Float, y: Float) = Vector2(sqrt(x * x + y * y), kotlin.math.atan2(y, x))

    /** Converts a 2D point expressed in the cartesian coordinate system (X and Y axis) to the polar coordinate system (a distance from the origin and an angle). */
    fun cartesian2polar(x: Double, y: Double) = Vector2(sqrt(x * x + y * y), kotlin.math.atan2(y, x))


    /** Rounds s upward, returning the smallest integral value that is not less than s. */
    fun ceil(s: Float) = kotlin.math.ceil(s)

    /** Rounds s upward, returning the smallest integral value that is not less than s. */
    fun ceil(s: Double) = kotlin.math.ceil(s)


    /** Clamps value and returns a value not less than min and not more than max. */
    fun clamp(value: Float, min: Float, max: Float) = kotlin.math.min(kotlin.math.max(value, min), max)

    /** Clamps value and returns a value not less than min and not more than max. */
    fun clamp(value: Double, min: Double, max: Double) = kotlin.math.min(kotlin.math.max(value, min), max)

    /** Clamps value and returns a value not less than min and not more than max. */
    fun clamp(value: Float, min: Int, max: Int) = kotlin.math.min(kotlin.math.max(value, min.toFloat()), max.toFloat())

    /** Clamps value and returns a value not less than min and not more than max. */
    fun clamp(value: Double, min: Long, max: Long) =
        kotlin.math.min(kotlin.math.max(value, min.toDouble()), max.toDouble())


    /** Returns the cosine of angle s in radians. */
    fun cos(s: Float) = kotlin.math.cos(s)

    /** Returns the cosine of angle s in radians. */
    fun cos(s: Double) = kotlin.math.cos(s)


    /** Returns the hyperbolic cosine of s in radians. */
    fun cosh(s: Float) = kotlin.math.cosh(s)

    /** Returns the hyperbolic cosine of s in radians. */
    fun cosh(s: Double) = kotlin.math.cosh(s)


    /** Converts from decibels to linear energy (audio). */
    fun dbToLinear(db: Float) = kotlin.math.exp(db * DB2NEPER)

    /** Converts from decibels to linear energy (audio). */
    fun dbToLinear(db: Double) = kotlin.math.exp(db * DB2NEPER)


    /** Returns degrees converted to radians. */
    fun degToRad(s: Float) = s * TAU / 360

    /** Returns degrees converted to radians. */
    fun degToRad(s: Double) = s * TAU / 360

    /** Easing function, based on exponent. 0 is constant, 1 is linear, 0 to 1 is ease-in, 1+ is ease out.
     * Negative values are in-out/out in.
     * Value must be between 0 and 1.
     */
    fun ease(value: Float, curve: Float): Float = ease(value.toDouble(), curve.toDouble()).toFloat()

    /** Easing function, based on exponent. 0 is constant, 1 is linear, 0 to 1 is ease-in, 1+ is ease out.
     * Negative values are in-out/out in.
     * Value must be between 0 and 1.
     */
    fun ease(value: Double, curve: Double): Double {
        val s = when {
            value < 0 -> 0.0
            value > 1.0 -> 1.0
            else -> value
        }

        return when {
            curve > 0.0 -> {
                if (curve < 1.0) {
                    val a = 1.0 - s
                    1.0 - a.pow(1.0 / curve)
                } else {
                    s.pow(curve)
                }
            }

            curve < 0.0 -> {
                if (value < 0.5) {
                    val a = s * 2.0
                    a.pow(-curve) * 0.5
                } else {
                    val a = 1.0 - (s - 0.5) * 2.0
                    (1.0 - a.pow(-curve)) * 0.5 + 0.5
                }
            }

            else -> 0.0
        }
    }


    /** The natural exponential function. It raises the mathematical constant e to the power of s and returns it. */
    fun exp(s: Float) = kotlin.math.exp(s)

    /** The natural exponential function. It raises the mathematical constant e to the power of s and returns it. */
    fun exp(s: Double) = kotlin.math.exp(s)


    /** Rounds s to the closest smaller integer and returns it. */
    fun floor(s: Float) = kotlin.math.floor(s)

    /** Rounds s to the closest smaller integer and returns it. */
    fun floor(s: Double) = kotlin.math.floor(s)

    /** Rounds s to the closest smaller integer and returns it. */
    fun floori(s: Float) = kotlin.math.floor(s).toInt()

    /** Rounds s to the closest smaller integer and returns it. */
    fun floori(s: Double) = kotlin.math.floor(s).toInt()


    /** Returns the floating-point remainder of a/b, keeping the sign of a. */
    fun fmod(a: Float, b: Float) = a.rem(b)

    /** Returns the floating-point remainder of a/b, keeping the sign of a. */
    fun fmod(a: Double, b: Double) = a.rem(b)


    /** Returns the floating-point modulus of a/b that wraps equally in positive and negative. */
    fun fposmod(a: Float, b: Float): Float {
        return a.toRealT().fposmod(b.toRealT()).toFloat()
    }

    /** Returns the floating-point modulus of a/b that wraps equally in positive and negative. */
    fun fposmod(a: Double, b: Double): Double {
        return a.toRealT().fposmod(b.toRealT())
    }

    /** Returns a normalized value considering the given range. This is the opposite of lerp. */
    fun inverseLerp(from: Float, to: Float, weight: Float) = (weight - from) / (to - from)

    /** Returns a normalized value considering the given range. This is the opposite of lerp. */
    fun inverseLerp(from: Double, to: Double, weight: Double) = (weight - from) / (to - from)


    /** Returns true if a and b are approximately equal to each other. */
    fun isEqualApprox(a: Float, b: Float) = a.toRealT().isEqualApprox(b.toRealT())

    /** Returns true if a and b are approximately equal to each other. */
    fun isEqualApprox(a: Double, b: Double) = a.toRealT().isEqualApprox(b.toRealT())


    /** Returns whether x is a finite value, i.e. it is not NAN, positive infinity, or negative infinity. */
    fun isFinite(s: Float) = s.isFinite()

    /** Returns whether s is an infinity value (either positive infinity or negative infinity). */
    fun isFinite(s: Double) = s.isFinite()

    /** Returns whether s is an infinity value (either positive infinity or negative infinity). */
    fun isInf(s: Float) = s.isInfinite()

    /** Returns whether s is an infinity value (either positive infinity or negative infinity). */
    fun isInf(s: Double) = s.isInfinite()

    /** Returns whether s is an infinity value (either positive infinity or negative infinity). */
    fun isNan(s: Float) = s.isNaN()

    /** Returns whether s is an infinity value (either positive infinity or negative infinity). */
    fun isNan(s: Double) = s.isNaN()


    /** Returns true, for value types, if a and b share the same value. Returns true, for reference types, if the references of a and b are the same. */
    fun isSame(a: Any, b: Any) = a == b


    /** Returns true if s is zero or almost zero. */
    fun isZeroApprox(s: Float) = s.toRealT().isZeroApprox()

    /** Returns true if s is zero or almost zero. */
    fun isZeroApprox(s: Double) = s.toRealT().isZeroApprox()

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Int, to: Int, weight: Float) = from + weight * (to - from)

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Long, to: Long, weight: Double) = from + weight * (to - from)

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Float, to: Float, weight: Float) = from + weight * (to - from)

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Double, to: Double, weight: Double) = from + weight * (to - from)

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Color, to: Color, weight: Float) = from + (to - from) * weight.toRealT()

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Color, to: Color, weight: Double) = from + (to - from) * weight

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Vector2, to: Vector2, weight: Float) = from + (to - from) * weight.toRealT()

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Vector2, to: Vector2, weight: Double) = from + (to - from) * weight

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Vector3, to: Vector3, weight: Float) = from + (to - from) * weight.toRealT()

    /** Linearly interpolates between two values by a normalized value. This is the opposite of inverse_lerp. */
    fun lerp(from: Vector3, to: Vector3, weight: Double) = from + (to - from) * weight


    /** Linearly interpolates between two angles (in radians) by a normalized value.
     * Similar to lerp, but interpolates correctly when the angles wrap around TAU. */
    fun lerpAngle(from: Float, to: Float, weight: Float) =
        lerpAngle(from.toDouble(), to.toDouble(), weight.toDouble()).toFloat()

    /** Linearly interpolates between two angles (in radians) by a normalized value.
     * Similar to lerp, but interpolates correctly when the angles wrap around TAU. */
    fun lerpAngle(from: Double, to: Double, weight: Double): Double {
        val difference = fmod(to - from, TAU)
        val distance = fmod(2.0f * difference, TAU) - difference
        return from + distance * weight
    }


    /** Converts from linear energy to decibels (audio).
     * This can be used to implement volume sliders that behave as expected (since volume isn't linear) */
    fun linearToDb(nrg: Float) = kotlin.math.ln(nrg) * NEPER2DB

    /** Converts from linear energy to decibels (audio).
     * This can be used to implement volume sliders that behave as expected (since volume isn't linear) */
    fun linearToDb(nrg: Double) = kotlin.math.ln(nrg) * NEPER2DB


    /** Natural logarithm. The amount of time needed to reach a certain level of continuous growth.
     *  Note: This is not the same as the "log" function on most calculators, which uses a base 10 logarithm. */
    fun log(s: Float) = kotlin.math.ln(s)

    /** Natural logarithm. The amount of time needed to reach a certain level of continuous growth.
     *  Note: This is not the same as the "log" function on most calculators, which uses a base 10 logarithm. */
    fun log(s: Double) = kotlin.math.ln(s)

    /** Returns the minimum of two values. */
    fun min(a: Int, b: Int) = kotlin.math.min(a, b)

    /** Returns the minimum of two values. */
    fun min(a: Long, b: Long) = kotlin.math.min(a, b)

    /** Returns the minimum of two values. */
    fun min(a: Float, b: Float) = kotlin.math.min(a, b)

    /** Returns the minimum of two values. */
    fun min(a: Double, b: Double) = kotlin.math.min(a, b)

    /** Returns the maximum of two values. */
    fun max(a: Int, b: Int) = kotlin.math.max(a, b)

    /** Returns the maximum of two values. */
    fun max(a: Long, b: Long) = kotlin.math.max(a, b)

    /** Returns the maximum of two values. */
    fun max(a: Float, b: Float) = kotlin.math.max(a, b)

    /** Returns the maximum of two values. */
    fun max(a: Double, b: Double) = kotlin.math.max(a, b)


    /** Returns the floating-point remainder of a/b, keeping the sign of a. */
    fun mod(a: Int, b: Int) = a.rem(b)

    /** Returns the floating-point remainder of a/b, keeping the sign of a. */
    fun mod(a: Long, b: Long) = a.rem(b)

    /** Moves from toward to by the delta value.
     *  Use a negative delta value to move away. */
    fun moveToward(from: Int, to: Int, delta: Int) = if (abs(to - from) <= delta) to else from + (to - from).sign * delta

    /** Moves from toward to by the delta value.
     *  Use a negative delta value to move away. */
    fun moveToward(from: Long, to: Long, delta: Long) = if (abs(to - from) <= delta) to else from + (to - from).sign * delta

    /** Moves from toward to by the delta value.
     *  Use a negative delta value to move away. */
    fun moveToward(from: Float, to: Float, delta: Float) = if (abs(to - from) <= delta) to else from + (to - from).sign * delta

    /** Moves from toward to by the delta value.
     *  Use a negative delta value to move away. */
    fun moveToward(from: Double, to: Double, delta: Double) = if (abs(to - from) <= delta) to else from + (to - from).sign * delta


    /** Returns the nearest larger power of 2 for integer value. */
    fun nearestPo2(value: Int) = nearestPo2(value.toLong()).toInt()

    /** Returns the nearest larger power of 2 for long value. */
    fun nearestPo2(value: Long): Long {
        val powerOf = kotlin.math.ceil(kotlin.math.ln(value.toDouble()) / kotlin.math.ln(2.0))
        return 2.0.pow(powerOf).toLong()
    }

    /** Returns the nearest larger power of 2 for float value. */
    fun nearestPo2(value: Float) = nearestPo2(value.toDouble()).toFloat()

    /** Returns the nearest larger power of 2 for double value. */
    fun nearestPo2(value: Double): Double {
        val powerOf = kotlin.math.ceil(kotlin.math.ln(value) / kotlin.math.ln(2.0))
        return 2.0.pow(powerOf)
    }

    /** Converts a 2D point expressed in the polar coordinate system (a distance from the origin r and an angle th) to the cartesian coordinate system (X and Y axis). */
    fun polarToCartesian(r: Float, th: Float) = polarToCartesian(r.toDouble(), th.toDouble())

    /** Converts a 2D point expressed in the polar coordinate system (a distance from the origin r and an angle th) to the cartesian coordinate system (X and Y axis). */
    fun polarToCartesian(r: Double, th: Double) = Vector2(r * kotlin.math.sin(th), r * kotlin.math.cos(th))


    /** Returns the floating-point modulus of a/b that wraps equally in positive and negative. */
    fun posmod(a: Int, b: Int): Int {
        val value = a.rem(b)
        if ((value < 0 && b > 0) || (value > 0 && b < 0)) {
            return value + b;
        }
        return value
    }

    /** Returns the floating-point modulus of a/b that wraps equally in positive and negative. */
    fun posmod(a: Long, b: Long): Long {
        val value = a.rem(b)
        if ((value < 0 && b > 0) || (value > 0 && b < 0)) {
            return value + b;
        }
        return value
    }


    /** Returns the result of x raised to the power of y. */
    fun pow(base: Float, exp: Float) = base.pow(exp)

    /** Returns the result of x raised to the power of y. */
    fun pow(base: Double, exp: Double) = base.pow(exp)


    /** Converts from radians to degrees. */
    fun radToDeg(rad: Float) = radToDeg(rad.toDouble()).toFloat()

    /** Converts from radians to degrees. */
    fun radToDeg(rad: Double) = rad * 360 / TAU


    /** Maps a value from range [istart, istop] to [ostart, ostop]. See also lerp and inverse_lerp.
     * If value is outside [istart, istop], then the resulting value will also be outside [ostart, ostop].
     * If this is not desired, use clamp on the result of this function.
     * For complex use cases where multiple ranges are needed, consider using Curve or Gradient instead.
     * Note: If istart == istop, the return value is undefined (most likely NaN, INF, or -INF).*/
    fun remap(value: Float, istart: Float, istop: Float, ostart: Float, ostop: Float) =
        lerp(ostart, ostop, inverseLerp(istart, istop, value))

    /** Maps a value from range [istart, istop] to [ostart, ostop]. See also lerp and inverse_lerp.
     * If value is outside [istart, istop], then the resulting value will also be outside [ostart, ostop].
     * If this is not desired, use clamp on the result of this function.
     * For complex use cases where multiple ranges are needed, consider using Curve or Gradient instead.
     * Note: If istart == istop, the return value is undefined (most likely NaN, INF, or -INF).*/
    fun remap(value: Double, istart: Double, istop: Double, ostart: Double, ostop: Double) =
        lerp(ostart, ostop, inverseLerp(istart, istop, value))

    /** Returns the integral value that is nearest to s, with halfway cases rounded away from zero. */
    fun round(s: Float) = kotlin.math.round(s)

    /** Returns the integral value that is nearest to s, with halfway cases rounded away from zero. */
    fun round(s: Double) = kotlin.math.round(s)


    /** Returns the sign of s: -1 or 1. Returns 0 if s is 0. */
    fun sign(s: Float) = kotlin.math.sign(s)

    /** Returns the sign of s: -1 or 1. Returns 0 if s is 0. */
    fun sign(s: Double) = kotlin.math.sign(s)


    /** Returns the sine of angle s in radians. */
    fun sin(s: Float) = kotlin.math.sin(s)

    /** Returns the sine of angle s in radians. */
    fun sin(s: Double) = kotlin.math.sin(s)


    /** Returns the hyperbolic sine of s in radians. */
    fun sinh(s: Float) = kotlin.math.sinh(s)

    /** Returns the hyperbolic sine of s in radians. */
    fun sinh(s: Double) = kotlin.math.sinh(s)


    /** Returns a number smoothly interpolated between the from and to, based on the weight.
     * Similar to lerp, but interpolates faster at the beginning and slower at the end.
     */
    fun smoothstep(from: Float, to: Float, weight: Float) =
        smoothstep(from.toDouble(), to.toDouble(), weight.toDouble()).toFloat()

    /** Returns a number smoothly interpolated between the from and to, based on the weight.
     * Similar to lerp, but interpolates faster at the beginning and slower at the end.
     */
    fun smoothstep(from: Double, to: Double, weight: Double): Double {
        if (from.isEqualApprox(to)) {
            return from
        }
        val x: Double = clamp((weight - from) / (to - from), 0.0, 1.0)
        return x * x * (3.0 - 2.0 * x)
    }


    /** Returns the square root of s. */
    fun sqrt(s: Float) = kotlin.math.sqrt(s)

    /** Returns the square root of s. */
    fun sqrt(s: Double) = kotlin.math.sqrt(s)


    /** Returns the position of the first non-zero digit, after the decimal point.
     * Note that the maximum return value is 10, which is a design decision in the implementation. */
    fun stepDecimals(step: Float) = stepDecimals(step.toDouble())

    /** Returns the position of the first non-zero digit, after the decimal point.
     * Note that the maximum return value is 10, which is a design decision in the implementation. */
    fun stepDecimals(step: Double): Int {
        val abs = kotlin.math.abs(step)
        val decs = abs - kotlin.math.floor(abs)
        for (i in 0 until MAX_N) {
            if (decs >= sd[i]) {
                return i
            }
        }
        return 0
    }


    /** Snaps float value s to a given step.
     * This can also be used to round a floating point number to an arbitrary number of decimals. */
    fun stepify(s: Int, step: Int) = (s / step) * step

    /** Snaps float value s to a given step.
     * This can also be used to round a floating point number to an arbitrary number of decimals. */
    fun stepify(s: Long, step: Long) = (s / step) * step

    /** Snaps float value s to a given step.
     * This can also be used to round a floating point number to an arbitrary number of decimals. */
    fun stepify(s: Float, step: Float) = kotlin.math.floor(s / step) * step

    /** Snaps float value s to a given step.
     * This can also be used to round a floating point number to an arbitrary number of decimals. */
    fun stepify(s: Double, step: Double) = kotlin.math.floor(s / step) * step


    /** Returns the tangent of angle s in radians. */
    fun tan(s: Float) = kotlin.math.tan(s)

    /** Returns the tangent of angle s in radians. */
    fun tan(s: Double) = kotlin.math.tan(s)

    /** Returns the tangent of angle s in radians. */
    fun tanh(s: Float) = kotlin.math.tanh(s)

    /** Returns the tangent of angle s in radians. */
    fun tanh(s: Double) = kotlin.math.tanh(s)


    /** Wraps float value between min and max.
     *  Usable for creating loop-alike behavior or infinite surfaces.*/
    fun wrapf(value: Float, min: Float, max: Float) = min + fposmod(value + min, max - min)

    /** Wraps double value between min and max.
     *  Usable for creating loop-alike behavior or infinite surfaces.*/
    fun wrapf(value: Double, min: Double, max: Double) = min + fposmod(value + min, max - min)


    /** Wraps int value between min and max.
     *  Usable for creating loop-alike behavior or infinite surfaces.*/
    fun wrapi(value: Int, min: Int, max: Int) = min + posmod(value + min, max - min)

    /** Wraps long value between min and max.
     *  Usable for creating loop-alike behavior or infinite surfaces.*/
    fun wrapi(value: Long, min: Long, max: Long) = min + posmod(value + min, max - min)
}

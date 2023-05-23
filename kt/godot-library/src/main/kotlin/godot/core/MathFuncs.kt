package godot.core

import godot.util.RealT
import kotlin.math.floor

internal fun snapped(value: Int, step: Int) = if (step != 0) {
    floor(value / step + 0.5) * step
} else {
    value.toDouble()
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
package godot.core

import kotlin.math.floor

internal fun snapped(value: Double, step: Double) = if (step != 0.0) {
    floor(value / step + 0.5) * step
} else {
    value
}

internal fun snapped(value: Int, step: Int) = if (step != 0) {
    floor(value / step + 0.5) * step
} else {
    value.toDouble()
}
@file:JvmName("Utils")
@file:Suppress("NOTHING_TO_INLINE")

package godot.common.util

typealias RealT = Double
typealias NaturalT = Int

inline fun Number.toRealT(): RealT = this.toDouble()
inline fun Double.toRealT(): RealT = this
inline fun Float.toRealT(): RealT = this.toDouble()
inline fun Number.toNaturalT(): NaturalT = this.toInt()
inline fun Long.toNaturalT(): NaturalT = this.toInt()
inline fun Int.toNaturalT(): NaturalT = this

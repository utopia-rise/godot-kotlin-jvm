@file:JvmName("Utils")
@file:Suppress("NOTHING_TO_INLINE")

package godot.util

import godot.core.ObjectID
import java.util.*

typealias RealT = Double
typealias NaturalT = Int

typealias VoidPtr = Long

const val nullptr: VoidPtr = -1L
val nullObjectID = ObjectID(-1L)

fun String.camelToSnakeCase(): String {
    return "(?<=[a-zA-Z0-9])[A-Z]".toRegex().replace(this) {
        "_${it.value}"
    }.lowercase(Locale.ENGLISH)
}

inline fun Number.toRealT(): RealT = this.toDouble()
inline fun Double.toRealT(): RealT = this
inline fun Float.toRealT(): RealT = this.toDouble()
inline fun Number.toNaturalT(): NaturalT = this.toInt()
inline fun Long.toNaturalT(): NaturalT = this.toInt()
inline fun Int.toNaturalT(): NaturalT = this

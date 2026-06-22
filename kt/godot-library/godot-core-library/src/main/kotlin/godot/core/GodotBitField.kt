package godot.core

/**
 * Shared implementation for Godot bitfield wrappers.
 *
 * Subclasses only provide [wrap] so the common bitwise operations can rebuild the right wrapper type.
 */
abstract class BitFieldBase<T : BitFieldBase<T>>(
    val flag: Long,
) {
    protected abstract fun wrap(flag: Long): T

    infix fun or(other: T): T = wrap(flag or other.flag)
    infix fun or(other: Long): T = wrap(flag or other)

    infix fun xor(other: T): T = wrap(flag xor other.flag)
    infix fun xor(other: Long): T = wrap(flag xor other)

    infix fun and(other: T): T = wrap(flag and other.flag)
    infix fun and(other: Long): T = wrap(flag and other)

    operator fun contains(value: T): Boolean = (flag and value.flag) == value.flag

    operator fun unaryPlus(): T = wrap(flag.unaryPlus())
    operator fun unaryMinus(): T = wrap(flag.unaryMinus())
    fun inv(): T = wrap(flag.inv())

    infix fun shl(bits: Int): T = wrap(flag shl bits)
    infix fun shr(bits: Int): T = wrap(flag shr bits)
    infix fun ushr(bits: Int): T = wrap(flag ushr bits)

    override fun equals(other: Any?): Boolean = this === other || (other is BitFieldBase<*> && other.flag == flag)
    override fun hashCode(): Int = flag.hashCode()
    override fun toString(): String = "${this::class.simpleName}($flag)"
}

/**
 * Type-safe bitfield backed by the enum [E].
 *
 * Each enum constant maps to a single bit through [flagBit]:
 * - a regular Kotlin enum uses `1L shl ordinal`,
 * - a [GodotEnum] uses its [GodotEnum.value] directly as the mask.
 *
 * Combine flags with [or]/[and] or build one from constants with [of]:
 * ```
 * var elements: BitField<Element> = BitField.of(Element.FIRE, Element.WATER)
 * if (Element.FIRE in elements) { ... }
 * ```
 *
 * Note: this is intentionally a regular class, not a `@JvmInline value class`. An inline class erases to
 * its underlying `long` (with mangled accessors) in bytecode, which the registration layer scans — it
 * would then no longer be detected as a [BitField] property.
 */
class BitField<E : Enum<E>>(flag: Long) : BitFieldBase<BitField<E>>(flag) {
    override fun wrap(flag: Long): BitField<E> = BitField(flag)

    operator fun contains(value: E): Boolean = (flag and value.flagBit()) == value.flagBit()

    companion object {
        @JvmStatic
        fun <E : Enum<E>> of(vararg values: E): BitField<E> =
            BitField(values.fold(0L) { acc, e -> acc or e.flagBit() })
    }
}

/**
 * Bit mask of this enum constant when used inside a [BitField].
 *
 * Regular enums get a positional bit (`1L shl ordinal`), matching Godot's auto-assignment for a names-only
 * `FLAGS` hint. A [GodotEnum] instead uses its [GodotEnum.value] directly, letting the user pick the exact
 * flag bits.
 */
internal fun Enum<*>.flagBit(): Long = if (this is GodotEnum) value else (1L shl ordinal)

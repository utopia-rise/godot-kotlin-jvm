package godot.core

import godot.util.RealT
import godot.util.isEqualApprox
import godot.util.toRealT
import kotlin.math.*

class Color(
    var r: RealT,
    var g: RealT,
    var b: RealT,
    var a: RealT
) : Comparable<Color>, CoreType {

    //PROPERTIES
    var r8: Int
        get() = (r * 255).roundToInt()
        set(value) {
            r = value.toRealT() / 255f
        }
    var g8: Int
        get() = (g * 255).roundToInt()
        set(value) {
            g = value.toRealT() / 255f
        }
    var b8: Int
        get() = (b * 255).roundToInt()
        set(value) {
            b = value.toRealT() / 255f
        }
    var a8: Int
        get() = (a * 255).roundToInt()
        set(value) {
            a = value.toRealT() / 255f
        }

    var h: RealT
        get() {
            var min: RealT = min(r, g)
            min = min(min, b)
            var max: RealT = max(r, g)
            max = max(max, b)

            val delta = max - min

            if (delta == 0.0) return 0.0

            var h: RealT
            h = when {
                r == max -> ((g - b) / delta) // between yellow & magenta
                g == max -> (2 + (b - r) / delta) // between cyan & yellow
                else -> (4 + (r - g) / delta) // between magenta & cyan
            }

            h /= 6.0f
            if (h < 0) {
                h += 1.0f
            }

            return h
        }
        set(value) {
            setHSV(value, s, v, a)
        }
    var s: RealT
        get() {
            var min: RealT = min(r, g)
            min = min(min, b)
            var max: RealT = max(r, g)
            max = max(max, b)

            val delta = max - min

            return if (max != 0.0) (delta / max).toRealT() else 0.0
        }
        set(value) {
            setHSV(h, value, v, a)
        }
    var v: RealT
        get() {
            var max: RealT = max(r, g)
            max = max(max, b)
            return max.toRealT()
        }
        set(value) {
            setHSV(h, s, value, a)
        }

    private fun setHSV(h: RealT, s: RealT, v: RealT, alpha: RealT) {
        val i = floor(h).toInt()
        val f: RealT
        val p = v * (1 - s)
        val q: RealT
        val t: RealT

        a = alpha
        if (s == 0.0) {
            // acp_chromatic (grey)
            r = v
            g = v
            b = v
            return
        }

        var h2 = h * 6.0
        h2 = h2.rem(6.0)

        f = h2 - i
        q = v * (1 - s * f)
        t = v * (1 - s * (1 - f))

        when (i) {
            0 -> { // Red is the dominant color
                r = v
                g = t
                b = p
            }

            1 -> { // Green is the dominant color
                r = q
                g = v
                b = p
            }

            2 -> {
                r = p
                g = v
                b = t
            }

            3 -> { // Blue is the dominant color
                r = p
                g = q
                b = v
            }

            4 -> {
                r = t
                g = p
                b = v
            }

            else -> { // (5) Red is the dominant color
                r = v
                g = p
                b = q
            }
        }
    }

    //CONSTANTS
    private enum class ColorByte(val size: Int, val shift: Int) {
        BITS32(255, 8),
        BITS64(65535, 16)
    }

    companion object {
        inline val aliceblue: Color
            get() = Color(0.94, 0.97, 1.00)
        inline val antiquewhite: Color
            get() = Color(0.98, 0.92, 0.84)
        inline val aqua: Color
            get() = Color(0.00, 1.00, 1.00)
        inline val aquamarine: Color
            get() = Color(0.50, 1.00, 0.83)
        inline val azure: Color
            get() = Color(0.94, 1.00, 1.00)
        inline val beige: Color
            get() = Color(0.96, 0.96, 0.86)
        inline val bisque: Color
            get() = Color(1.00, 0.89, 0.77)
        inline val black: Color
            get() = Color(0.00, 0.00, 0.00)
        inline val blanchedalmond: Color
            get() = Color(1.00, 0.92, 0.80)
        inline val blue: Color
            get() = Color(0.00, 0.00, 1.00)
        inline val blueviolet: Color
            get() = Color(0.54, 0.17, 0.89)
        inline val brown: Color
            get() = Color(0.65, 0.16, 0.16)
        inline val burlywood: Color
            get() = Color(0.87, 0.72, 0.53)
        inline val cadetblue: Color
            get() = Color(0.37, 0.62, 0.63)
        inline val chartreuse: Color
            get() = Color(0.50, 1.00, 0.00)
        inline val chocolate: Color
            get() = Color(0.82, 0.41, 0.12)
        inline val coral: Color
            get() = Color(1.00, 0.50, 0.31)
        inline val cornflower: Color
            get() = Color(0.39, 0.58, 0.93)
        inline val cornsilk: Color
            get() = Color(1.00, 0.97, 0.86)
        inline val crimson: Color
            get() = Color(0.86, 0.08, 0.24)
        inline val cyan: Color
            get() = Color(0.00, 1.00, 1.00)
        inline val darkblue: Color
            get() = Color(0.00, 0.00, 0.55)
        inline val darkcyan: Color
            get() = Color(0.00, 0.55, 0.55)
        inline val darkgoldenrod: Color
            get() = Color(0.72, 0.53, 0.04)
        inline val darkgray: Color
            get() = Color(0.66, 0.66, 0.66)
        inline val darkgreen: Color
            get() = Color(0.00, 0.39, 0.00)
        inline val darkkhaki: Color
            get() = Color(0.74, 0.72, 0.42)
        inline val darkmagenta: Color
            get() = Color(0.55, 0.00, 0.55)
        inline val darkolivegreen: Color
            get() = Color(0.33, 0.42, 0.18)
        inline val darkorange: Color
            get() = Color(1.00, 0.55, 0.00)
        inline val darkorchid: Color
            get() = Color(0.60, 0.20, 0.80)
        inline val darkred: Color
            get() = Color(0.55, 0.00, 0.00)
        inline val darksalmon: Color
            get() = Color(0.91, 0.59, 0.48)
        inline val darkseagreen: Color
            get() = Color(0.56, 0.74, 0.56)
        inline val darkslateblue: Color
            get() = Color(0.28, 0.24, 0.55)
        inline val darkslategray: Color
            get() = Color(0.18, 0.31, 0.31)
        inline val darkturquoise: Color
            get() = Color(0.00, 0.81, 0.82)
        inline val darkviolet: Color
            get() = Color(0.58, 0.00, 0.83)
        inline val deeppink: Color
            get() = Color(1.00, 0.08, 0.58)
        inline val deepskyblue: Color
            get() = Color(0.00, 0.75, 1.00)
        inline val dimgray: Color
            get() = Color(0.41, 0.41, 0.41)
        inline val dodgerblue: Color
            get() = Color(0.12, 0.56, 1.00)
        inline val firebrick: Color
            get() = Color(0.70, 0.13, 0.13)
        inline val floralwhite: Color
            get() = Color(1.00, 0.98, 0.94)
        inline val forestgreen: Color
            get() = Color(0.13, 0.55, 0.13)
        inline val fuchsia: Color
            get() = Color(1.00, 0.00, 1.00)
        inline val gainsboro: Color
            get() = Color(0.86, 0.86, 0.86)
        inline val ghostwhite: Color
            get() = Color(0.97, 0.97, 1.00)
        inline val gold: Color
            get() = Color(1.00, 0.84, 0.00)
        inline val goldenrod: Color
            get() = Color(0.85, 0.65, 0.13)
        inline val gray: Color
            get() = Color(0.75, 0.75, 0.75)
        inline val webgray: Color
            get() = Color(0.50, 0.50, 0.50)
        inline val green: Color
            get() = Color(0.00, 1.00, 0.00)
        inline val webgreen: Color
            get() = Color(0.00, 0.50, 0.00)
        inline val greenyellow: Color
            get() = Color(0.68, 1.00, 0.18)
        inline val honeydew: Color
            get() = Color(0.94, 1.00, 0.94)
        inline val hotpink: Color
            get() = Color(1.00, 0.41, 0.71)
        inline val indianred: Color
            get() = Color(0.80, 0.36, 0.36)
        inline val indigo: Color
            get() = Color(0.29, 0.00, 0.51)
        inline val ivory: Color
            get() = Color(1.00, 1.00, 0.94)
        inline val khaki: Color
            get() = Color(0.94, 0.90, 0.55)
        inline val lavender: Color
            get() = Color(0.90, 0.90, 0.98)
        inline val lavenderblush: Color
            get() = Color(1.00, 0.94, 0.96)
        inline val lawngreen: Color
            get() = Color(0.49, 0.99, 0.00)
        inline val lemonchiffon: Color
            get() = Color(1.00, 0.98, 0.80)
        inline val lightblue: Color
            get() = Color(0.68, 0.85, 0.90)
        inline val lightcoral: Color
            get() = Color(0.94, 0.50, 0.50)
        inline val lightcyan: Color
            get() = Color(0.88, 1.00, 1.00)
        inline val lightgoldenrod: Color
            get() = Color(0.98, 0.98, 0.82)
        inline val lightgray: Color
            get() = Color(0.83, 0.83, 0.83)
        inline val lightgreen: Color
            get() = Color(0.56, 0.93, 0.56)
        inline val lightpink: Color
            get() = Color(1.00, 0.71, 0.76)
        inline val lightsalmon: Color
            get() = Color(1.00, 0.63, 0.48)
        inline val lightseagreen: Color
            get() = Color(0.13, 0.70, 0.67)
        inline val lightskyblue: Color
            get() = Color(0.53, 0.81, 0.98)
        inline val lightslategray: Color
            get() = Color(0.47, 0.53, 0.60)
        inline val lightsteelblue: Color
            get() = Color(0.69, 0.77, 0.87)
        inline val lightyellow: Color
            get() = Color(1.00, 1.00, 0.88)
        inline val lime: Color
            get() = Color(0.00, 1.00, 0.00)
        inline val limegreen: Color
            get() = Color(0.20, 0.80, 0.20)
        inline val linen: Color
            get() = Color(0.98, 0.94, 0.90)
        inline val magenta: Color
            get() = Color(1.00, 0.00, 1.00)
        inline val maroon: Color
            get() = Color(0.69, 0.19, 0.38)
        inline val webmaroon: Color
            get() = Color(0.50, 0.00, 0.00)
        inline val mediumaquamarine: Color
            get() = Color(0.40, 0.80, 0.67)
        inline val mediumblue: Color
            get() = Color(0.00, 0.00, 0.80)
        inline val mediumorchid: Color
            get() = Color(0.73, 0.33, 0.83)
        inline val mediumpurple: Color
            get() = Color(0.58, 0.44, 0.86)
        inline val mediumseagreen: Color
            get() = Color(0.24, 0.70, 0.44)
        inline val mediumslateblue: Color
            get() = Color(0.48, 0.41, 0.93)
        inline val mediumspringgreen: Color
            get() = Color(0.00, 0.98, 0.60)
        inline val mediumturquoise: Color
            get() = Color(0.28, 0.82, 0.80)
        inline val mediumvioletred: Color
            get() = Color(0.78, 0.08, 0.52)
        inline val midnightblue: Color
            get() = Color(0.10, 0.10, 0.44)
        inline val mintcream: Color
            get() = Color(0.96, 1.00, 0.98)
        inline val mistyrose: Color
            get() = Color(1.00, 0.89, 0.88)
        inline val moccasin: Color
            get() = Color(1.00, 0.89, 0.71)
        inline val navajowhite: Color
            get() = Color(1.00, 0.87, 0.68)
        inline val navyblue: Color
            get() = Color(0.00, 0.00, 0.50)
        inline val oldlace: Color
            get() = Color(0.99, 0.96, 0.90)
        inline val olive: Color
            get() = Color(0.50, 0.50, 0.00)
        inline val olivedrab: Color
            get() = Color(0.42, 0.56, 0.14)
        inline val orange: Color
            get() = Color(1.00, 0.65, 0.00)
        inline val orangered: Color
            get() = Color(1.00, 0.27, 0.00)
        inline val orchid: Color
            get() = Color(0.85, 0.44, 0.84)
        inline val palegoldenrod: Color
            get() = Color(0.93, 0.91, 0.67)
        inline val palegreen: Color
            get() = Color(0.60, 0.98, 0.60)
        inline val paleturquoise: Color
            get() = Color(0.69, 0.93, 0.93)
        inline val palevioletred: Color
            get() = Color(0.86, 0.44, 0.58)
        inline val papayawhip: Color
            get() = Color(1.00, 0.94, 0.84)
        inline val peachpuff: Color
            get() = Color(1.00, 0.85, 0.73)
        inline val peru: Color
            get() = Color(0.80, 0.52, 0.25)
        inline val pink: Color
            get() = Color(1.00, 0.75, 0.80)
        inline val plum: Color
            get() = Color(0.87, 0.63, 0.87)
        inline val powderblue: Color
            get() = Color(0.69, 0.88, 0.90)
        inline val purple: Color
            get() = Color(0.63, 0.13, 0.94)
        inline val webpurple: Color
            get() = Color(0.50, 0.00, 0.50)
        inline val rebeccapurple: Color
            get() = Color(0.40, 0.20, 0.60)
        inline val red: Color
            get() = Color(1.00, 0.00, 0.00)
        inline val rosybrown: Color
            get() = Color(0.74, 0.56, 0.56)
        inline val royalblue: Color
            get() = Color(0.25, 0.41, 0.88)
        inline val saddlebrown: Color
            get() = Color(0.55, 0.27, 0.07)
        inline val salmon: Color
            get() = Color(0.98, 0.50, 0.45)
        inline val sandybrown: Color
            get() = Color(0.96, 0.64, 0.38)
        inline val seagreen: Color
            get() = Color(0.18, 0.55, 0.34)
        inline val seashell: Color
            get() = Color(1.00, 0.96, 0.93)
        inline val sienna: Color
            get() = Color(0.63, 0.32, 0.18)
        inline val silver: Color
            get() = Color(0.75, 0.75, 0.75)
        inline val skyblue: Color
            get() = Color(0.53, 0.81, 0.92)
        inline val slateblue: Color
            get() = Color(0.42, 0.35, 0.80)
        inline val slategray: Color
            get() = Color(0.44, 0.50, 0.56)
        inline val snow: Color
            get() = Color(1.00, 0.98, 0.98)
        inline val springgreen: Color
            get() = Color(0.00, 1.00, 0.50)
        inline val steelblue: Color
            get() = Color(0.27, 0.51, 0.71)
        inline val tan: Color
            get() = Color(0.82, 0.71, 0.55)
        inline val teal: Color
            get() = Color(0.00, 0.50, 0.50)
        inline val thistle: Color
            get() = Color(0.85, 0.75, 0.85)
        inline val tomato: Color
            get() = Color(1.00, 0.39, 0.28)
        inline val turquoise: Color
            get() = Color(0.25, 0.88, 0.82)
        inline val transparent: Color
            get() = Color(1.00, 1.00, 1.00, 0.00)
        inline val violet: Color
            get() = Color(0.93, 0.51, 0.93)
        inline val wheat: Color
            get() = Color(0.96, 0.87, 0.70)
        inline val white: Color
            get() = Color(1.00, 1.00, 1.00)
        inline val whitesmoke: Color
            get() = Color(0.96, 0.96, 0.96)
        inline val yellow: Color
            get() = Color(1.00, 1.00, 0.00)
        inline val yellowgreen: Color
            get() = Color(0.60, 0.80, 0.20)

        internal fun parseCol(p_str: String, p_ofs: Int): RealT {
            var ig = 0.0
            for (i in 0..1) {
                var v: Int

                when (val c: Char = p_str[i + p_ofs]) {
                    in '0'..'9' -> v = c.code - '0'.code
                    in 'a'..'f' -> {
                        v = c.code - 'a'.code
                        v += 10
                    }

                    in 'A'..'F' -> {
                        v = c.code - 'A'.code
                        v += 10
                    }

                    else -> return -1.0
                }

                ig += if (i == 0)
                    v * 16
                else
                    v
            }
            return ig
        }

        //Color construction helpers
        fun html(from: String): Color {
            var color = from
            if (color.isEmpty())
                return Color()
            if (color[0] == '#')
                color = color.substring(1, color.length - 1)

            val alpha = when {
                color.length == 8 -> true
                color.length == 6 -> false
                else -> return Color()
            }

            var a = 255
            if (alpha) {
                a = parseCol(color, 0).toInt()
                if (a < 0) {
                    return Color()
                }
            }

            val p = if (alpha) 2 else 0
            val r = parseCol(color, p + 0).toInt()
            val g = parseCol(color, p + 2).toInt()
            val b = parseCol(color, p + 4).toInt()
            if (r < 0 || g < 0 || b < 0) {
                return Color()
            }

            return Color(
                r / 255.0,
                g / 255.0,
                b / 255.0,
                a / 255.0
            )
        }

        fun hex(from: Int): Color {
            val a = (from and 0xFF) / 255.0
            var hex = from shr 8
            val b = (hex and 0xFF) / 255.0
            hex = hex shr 8
            val g = (hex and 0xFF) / 255.0
            hex = hex shr 8
            val r = (hex and 0xFF) / 255.0
            return Color(r, g, b, a)
        }

        fun hex64(from: Long): Color {
            val a = (from and 0xFFFF) / 65535.0
            var hex = from shr 16
            val b = (hex and 0xFFFF) / 65535.0
            hex = hex shr 16
            val g = (hex and 0xFFFF) / 65535.0
            hex = hex shr 16
            val r = (hex and 0xFFFF) / 65535.0
            return Color(r, g, b, a)
        }
    }

    //CONSTRUCTOR

    constructor() : this(0.0, 0.0, 0.0, 1.0)

    constructor(other: Color) : this(other.r, other.g, other.b, other.a)

    constructor(r: Number, g: Number, b: Number, a: Number = 1.0) :
        this(r.toRealT(), g.toRealT(), b.toRealT(), a.toRealT())

    //API
    /**
     * Returns a new color resulting from blending this color over another.
     * If the color is opaque, the result is also opaque. The second color may have a range of alpha values.
     */
    fun blend(over: Color): Color {
        val res = Color()
        val sa = 1.0 - over.a
        if (res.a == 0.0) {
            return Color(0.0, 0.0, 0.0, 0.0)
        } else {
            res.r = (r * a * sa + over.r * over.a) / res.a
            res.g = (g * a * sa + over.g * over.a) / res.a
            res.b = (b * a * sa + over.b * over.a) / res.a
        }
        return res
    }

    /**
     * Returns the most contrasting color.
     */
    fun contrasted(): Color {
        val c = Color(r, g, b, a)
        c.contrast()
        return c
    }


    internal fun contrast() {
        r = (r + 0.5).rem(1.0)
        g = (g + 0.5).rem(1.0)
        b = (b + 0.5).rem(1.0)
    }

    /**
     * Returns a new color resulting from making this color darker by the specified percentage (ratio from 0 to 1).
     */
    fun darkened(amount: RealT): Color {
        return Color(
            r * (1.0 - amount),
            g * (1.0 - amount),
            b * (1.0 - amount),
            a
        )
    }

    /**
     * Constructs a color from an HSV profile. h, s, and v are values between 0 and 1.
     */
    fun fromHsv(h: RealT, s: RealT, v: RealT, a: RealT): Color {
        var h2 = (h * 360.0).rem(360.0)

        if (h2 < 0) h2 += 360

        val finalH = h2 / 60
        val c = v * s
        val x = c * (1.0 - (finalH.rem(2) - 1))
        val rgbTriple = when (finalH.toInt()) {
            0 -> Triple(c, x, 0.0)
            1 -> Triple(x, c, 0.0)
            2 -> Triple(0.0, c, x)
            3 -> Triple(0.0, x, c)
            4 -> Triple(x, 0.0, c)
            5 -> Triple(c, 0.0, x)
            else -> Triple(0.0, 0.0, 0.0)
        }

        val m = v - c
        return Color(m + rgbTriple.first, m + rgbTriple.second, m + rgbTriple.third, a)
    }

    /**
     * Returns the color’s grayscale representation.
     * The gray value is calculated as (r + g + b) / 3.
     */
    fun gray(): RealT = (r + g + b) / 3.0

    /**
     * Returns the inverted color (1 - r, 1 - g, 1 - b, a).
     */
    fun inverted(): Color {
        val c = Color(r, g, b, a)
        c.invert()
        return c
    }

    internal fun invert() {
        r = 1.0 - r
        g = 1.0 - g
        b = 1.0 - b
    }

    /**
     * Returns true if this color and color are approximately equal, by running isEqualApprox on each component.
     */
    fun isEqualApprox(color: Color): Boolean {
        return isEqualApprox(r, color.r)
            && isEqualApprox(g, color.g)
            && isEqualApprox(b, color.b)
            && isEqualApprox(a, color.a)
    }

    /**
     * Returns a new color resulting from making this color lighter by the specified percentage (ratio from 0 to 1).
     */
    fun lightened(amount: RealT): Color {
        return Color(
            r + (1.0 - r) * amount,
            g + (1.0 - g) * amount,
            b + (1.0 - b) * amount,
            a
        )
    }

    /**
     * Returns the linear interpolation with another color. The interpolation factor t is between 0 and 1.
     */
    fun linearInterpolate(otherColor: Color, t: RealT): Color {
        val res = Color(r, g, b, a)
        res.r += (t * (otherColor.r - r))
        res.g += (t * (otherColor.g - g))
        res.b += (t * (otherColor.b - b))
        res.a += (t * (otherColor.a - a))
        return res
    }


    /**
     * Returns the color’s 32-bit integer in ABGR format (each byte represents a component of the ABGR profile).
     * ABGR is the reversed version of the default format.
     */
    fun toABGR32(): Int = toByteColorCode(a, b, g, r, ColorByte.BITS32).toInt()

    /**
     * Returns the color’s 64-bit integer in ABGR format (each word represents a component of the ABGR profile).
     * ABGR is the reversed version of the default format.
     */
    fun toABGR64(): Long = toByteColorCode(a, b, g, r, ColorByte.BITS64)

    /**
     * Returns the color’s 32-bit integer in ARGB format (each byte represents a component of the ARGB profile).
     * ARGB is more compatible with DirectX.
     */
    fun toARGB32(): Int = toByteColorCode(a, r, g, b, ColorByte.BITS32).toInt()

    /**
     * Returns the color’s 64-bit integer in ARGB format (each word represents a component of the ARGB profile).
     * ARGB is more compatible with DirectX.
     */
    fun toARGB64(): Long = toByteColorCode(a, r, g, b, ColorByte.BITS64)

    /**
     * Returns the color’s 32-bit integer in RGBA format (each byte represents a component of the RGBA profile).
     * RGBA is Godot’s default format.
     */
    fun toRGBA32(): Int = toByteColorCode(r, g, b, a, ColorByte.BITS32).toInt()

    /**
    Returns the color’s 64-bit integer in RGBA format (each word represents a component of the RGBA profile).
    RGBA is Godot’s default format.
     */
    fun toRGBA64(): Long = toByteColorCode(r, g, b, a, ColorByte.BITS64)

    private fun toByteColorCode(first: RealT, second: RealT, third: RealT, fourth: RealT, colorByte: ColorByte): Long {
        val size = colorByte.size
        val shift = colorByte.shift
        var c: Long = (first * size).roundToLong()
        c = c shl shift
        c = c or (second * size).roundToLong()
        c = c shl shift
        c = c or (third * size).roundToLong()
        c = c shl shift
        c = c or (fourth * size).roundToLong()

        return c
    }

    /**
     * Returns the color’s HTML hexadecimal color string in ARGB format (ex: ff34f822).
     * Setting with_alpha to false excludes alpha from the hexadecimal string.
     */
    fun toHtml(alpha: Boolean): String {
        var txt = ""
        txt += toHex(r)
        txt += toHex(g)
        txt += toHex(b)
        if (alpha) {
            txt = toHex(a) + txt
        }
        return txt
    }

    private fun toHex(p_val: RealT): String {
        var v = (p_val * 255).toInt()
        v = when {
            v < 0 -> 0
            v > 255 -> 255
            else -> v
        }
        var ret = ""

        for (i in 0..1) {
            val c = shortArrayOf(0, 0)
            val lv = v and 0xF
            if (lv < 10) {
                c[0] = ('0'.code + lv).toShort()
            } else {
                c[0] = ('a'.code + lv - 10).toShort()
            }

            v = v shr 4
            val cs = String(charArrayOf(c[0].toInt().toChar()))
            ret = cs + ret
        }
        return ret
    }

    operator fun plus(c: Color) = Color(r + c.r, g + c.g, b + c.b, a + c.a)
    operator fun plus(scalar: Float) = Color(r + scalar, g + scalar, b + scalar, a + scalar)
    operator fun plus(scalar: Double) = Color(r + scalar, g + scalar, b + scalar, a + scalar)

    operator fun minus(c: Color) = Color(r - c.r, g - c.g, b - c.b, a - c.a)
    operator fun minus(scalar: Float) = Color(r - scalar, g - scalar, b - scalar, a - scalar)
    operator fun minus(scalar: Double) = Color(r - scalar, g - scalar, b - scalar, a - scalar)

    operator fun times(c: Color) = Color(r * c.r, g * c.g, b * c.b, a * c.a)
    operator fun times(scalar: Float) = Color(r * scalar, g * scalar, b * scalar, a * scalar)
    operator fun times(scalar: Double) = Color(r * scalar, g * scalar, b * scalar, a * scalar)

    operator fun div(c: Color) = Color(r / c.r, g / c.g, b / c.b, a / c.a)
    operator fun div(scalar: Float) = Color(r / scalar, g / scalar, b / scalar, a / scalar)
    operator fun div(scalar: Double) = Color(r / scalar, g / scalar, b / scalar, a / scalar)

    override fun compareTo(other: Color): Int {
        return when {
            r == other.r -> when {
                g == other.g -> when {
                    b == other.b -> when {
                        a < other.a -> -1
                        a == other.a -> 0
                        else -> 1
                    }

                    b < other.b -> -1
                    else -> 1
                }

                g < other.g -> -1
                else -> 1
            }

            r < other.r -> -1
            else -> 1
        }
    }

    override fun toString(): String {
        return "$r, $g, $b, $a"
    }

    override fun hashCode(): Int {
        var result = r.hashCode()
        result = 31 * result + g.hashCode()
        result = 31 * result + b.hashCode()
        result = 31 * result + a.hashCode()
        return result
    }
}

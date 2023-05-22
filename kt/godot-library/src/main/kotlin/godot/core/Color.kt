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
         * Decodes a Color from a RGBE9995 format integer. See Image.FORMAT_RGBE9995.
         */
        fun fromRgbd9995(rgbe: Int): Color {
            val r = rgbe and 0x1ff
            val g = (rgbe shr 9) and 0x1ff
            val b = (rgbe shr 18) and 0x1ff
            val e = (rgbe shr 27)
            val m = 2.0.pow(e - 15.0 - 9.0)

            val rd = r * m;
            val gd = g * m;
            val bd = b * m;

            return Color(rd, gd, bd, 1.0f)
        }

        /**
         * Creates a Color from the given string, which can be either an HTML color code or a named color
         * (case-insensitive). Returns default if the color cannot be inferred from the string.
         */
        fun fromString(str: String, default: Color) = if (htmlIsValid(str)) {
            html(str)
        } else {
            named(str, default)
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

        fun hex(from: Long): Color {
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

        private val namedColors = arrayOf(
            "ALICE_BLUE" to hex(0xF0F8FFFF),
            "ANTIQUE_WHITE" to hex(0xFAEBD7FF),
            "AQUA" to hex(0x00FFFFFF),
            "AQUAMARINE" to hex(0x7FFFD4FF),
            "AZURE" to hex(0xF0FFFFFF),
            "BEIGE" to hex(0xF5F5DCFF),
            "BISQUE" to hex(0xFFE4C4FF),
            "BLACK" to hex(0x000000FF),
            "BLANCHED_ALMOND" to hex(0xFFEBCDFF),
            "BLUE" to hex(0x0000FFFF),
            "BLUE_VIOLET" to hex(0x8A2BE2FF),
            "BROWN" to hex(0xA52A2AFF),
            "BURLYWOOD" to hex(0xDEB887FF),
            "CADET_BLUE" to hex(0x5F9EA0FF),
            "CHARTREUSE" to hex(0x7FFF00FF),
            "CHOCOLATE" to hex(0xD2691EFF),
            "CORAL" to hex(0xFF7F50FF),
            "CORNFLOWER_BLUE" to hex(0x6495EDFF),
            "CORNSILK" to hex(0xFFF8DCFF),
            "CRIMSON" to hex(0xDC143CFF),
            "CYAN" to hex(0x00FFFFFF),
            "DARK_BLUE" to hex(0x00008BFF),
            "DARK_CYAN" to hex(0x008B8BFF),
            "DARK_GOLDENROD" to hex(0xB8860BFF),
            "DARK_GRAY" to hex(0xA9A9A9FF),
            "DARK_GREEN" to hex(0x006400FF),
            "DARK_KHAKI" to hex(0xBDB76BFF),
            "DARK_MAGENTA" to hex(0x8B008BFF),
            "DARK_OLIVE_GREEN" to hex(0x556B2FFF),
            "DARK_ORANGE" to hex(0xFF8C00FF),
            "DARK_ORCHID" to hex(0x9932CCFF),
            "DARK_RED" to hex(0x8B0000FF),
            "DARK_SALMON" to hex(0xE9967AFF),
            "DARK_SEA_GREEN" to hex(0x8FBC8FFF),
            "DARK_SLATE_BLUE" to hex(0x483D8BFF),
            "DARK_SLATE_GRAY" to hex(0x2F4F4FFF),
            "DARK_TURQUOISE" to hex(0x00CED1FF),
            "DARK_VIOLET" to hex(0x9400D3FF),
            "DEEP_PINK" to hex(0xFF1493FF),
            "DEEP_SKY_BLUE" to hex(0x00BFFFFF),
            "DIM_GRAY" to hex(0x696969FF),
            "DODGER_BLUE" to hex(0x1E90FFFF),
            "FIREBRICK" to hex(0xB22222FF),
            "FLORAL_WHITE" to hex(0xFFFAF0FF),
            "FOREST_GREEN" to hex(0x228B22FF),
            "FUCHSIA" to hex(0xFF00FFFF),
            "GAINSBORO" to hex(0xDCDCDCFF),
            "GHOST_WHITE" to hex(0xF8F8FFFF),
            "GOLD" to hex(0xFFD700FF),
            "GOLDENROD" to hex(0xDAA520FF),
            "GRAY" to hex(0xBEBEBEFF),
            "GREEN" to hex(0x00FF00FF),
            "GREEN_YELLOW" to hex(0xADFF2FFF),
            "HONEYDEW" to hex(0xF0FFF0FF),
            "HOT_PINK" to hex(0xFF69B4FF),
            "INDIAN_RED" to hex(0xCD5C5CFF),
            "INDIGO" to hex(0x4B0082FF),
            "IVORY" to hex(0xFFFFF0FF),
            "KHAKI" to hex(0xF0E68CFF),
            "LAVENDER" to hex(0xE6E6FAFF),
            "LAVENDER_BLUSH" to hex(0xFFF0F5FF),
            "LAWN_GREEN" to hex(0x7CFC00FF),
            "LEMON_CHIFFON" to hex(0xFFFACDFF),
            "LIGHT_BLUE" to hex(0xADD8E6FF),
            "LIGHT_CORAL" to hex(0xF08080FF),
            "LIGHT_CYAN" to hex(0xE0FFFFFF),
            "LIGHT_GOLDENROD" to hex(0xFAFAD2FF),
            "LIGHT_GRAY" to hex(0xD3D3D3FF),
            "LIGHT_GREEN" to hex(0x90EE90FF),
            "LIGHT_PINK" to hex(0xFFB6C1FF),
            "LIGHT_SALMON" to hex(0xFFA07AFF),
            "LIGHT_SEA_GREEN" to hex(0x20B2AAFF),
            "LIGHT_SKY_BLUE" to hex(0x87CEFAFF),
            "LIGHT_SLATE_GRAY" to hex(0x778899FF),
            "LIGHT_STEEL_BLUE" to hex(0xB0C4DEFF),
            "LIGHT_YELLOW" to hex(0xFFFFE0FF),
            "LIME" to hex(0x00FF00FF),
            "LIME_GREEN" to hex(0x32CD32FF),
            "LINEN" to hex(0xFAF0E6FF),
            "MAGENTA" to hex(0xFF00FFFF),
            "MAROON" to hex(0xB03060FF),
            "MEDIUM_AQUAMARINE" to hex(0x66CDAAFF),
            "MEDIUM_BLUE" to hex(0x0000CDFF),
            "MEDIUM_ORCHID" to hex(0xBA55D3FF),
            "MEDIUM_PURPLE" to hex(0x9370DBFF),
            "MEDIUM_SEA_GREEN" to hex(0x3CB371FF),
            "MEDIUM_SLATE_BLUE" to hex(0x7B68EEFF),
            "MEDIUM_SPRING_GREEN" to hex(0x00FA9AFF),
            "MEDIUM_TURQUOISE" to hex(0x48D1CCFF),
            "MEDIUM_VIOLET_RED" to hex(0xC71585FF),
            "MIDNIGHT_BLUE" to hex(0x191970FF),
            "MINT_CREAM" to hex(0xF5FFFAFF),
            "MISTY_ROSE" to hex(0xFFE4E1FF),
            "MOCCASIN" to hex(0xFFE4B5FF),
            "NAVAJO_WHITE" to hex(0xFFDEADFF),
            "NAVY_BLUE" to hex(0x000080FF),
            "OLD_LACE" to hex(0xFDF5E6FF),
            "OLIVE" to hex(0x808000FF),
            "OLIVE_DRAB" to hex(0x6B8E23FF),
            "ORANGE" to hex(0xFFA500FF),
            "ORANGE_RED" to hex(0xFF4500FF),
            "ORCHID" to hex(0xDA70D6FF),
            "PALE_GOLDENROD" to hex(0xEEE8AAFF),
            "PALE_GREEN" to hex(0x98FB98FF),
            "PALE_TURQUOISE" to hex(0xAFEEEEFF),
            "PALE_VIOLET_RED" to hex(0xDB7093FF),
            "PAPAYA_WHIP" to hex(0xFFEFD5FF),
            "PEACH_PUFF" to hex(0xFFDAB9FF),
            "PERU" to hex(0xCD853FFF),
            "PINK" to hex(0xFFC0CBFF),
            "PLUM" to hex(0xDDA0DDFF),
            "POWDER_BLUE" to hex(0xB0E0E6FF),
            "PURPLE" to hex(0xA020F0FF),
            "REBECCA_PURPLE" to hex(0x663399FF),
            "RED" to hex(0xFF0000FF),
            "ROSY_BROWN" to hex(0xBC8F8FFF),
            "ROYAL_BLUE" to hex(0x4169E1FF),
            "SADDLE_BROWN" to hex(0x8B4513FF),
            "SALMON" to hex(0xFA8072FF),
            "SANDY_BROWN" to hex(0xF4A460FF),
            "SEA_GREEN" to hex(0x2E8B57FF),
            "SEASHELL" to hex(0xFFF5EEFF),
            "SIENNA" to hex(0xA0522DFF),
            "SILVER" to hex(0xC0C0C0FF),
            "SKY_BLUE" to hex(0x87CEEBFF),
            "SLATE_BLUE" to hex(0x6A5ACDFF),
            "SLATE_GRAY" to hex(0x708090FF),
            "SNOW" to hex(0xFFFAFAFF),
            "SPRING_GREEN" to hex(0x00FF7FFF),
            "STEEL_BLUE" to hex(0x4682B4FF),
            "TAN" to hex(0xD2B48CFF),
            "TEAL" to hex(0x008080FF),
            "THISTLE" to hex(0xD8BFD8FF),
            "TOMATO" to hex(0xFF6347FF),
            "TRANSPARENT" to hex(0xFFFFFF00),
            "TURQUOISE" to hex(0x40E0D0FF),
            "VIOLET" to hex(0xEE82EEFF),
            "WEB_GRAY" to hex(0x808080FF),
            "WEB_GREEN" to hex(0x008000FF),
            "WEB_MAROON" to hex(0x800000FF),
            "WEB_PURPLE" to hex(0x800080FF),
            "WHEAT" to hex(0xF5DEB3FF),
            "WHITE" to hex(0xFFFFFFFF),
            "WHITE_SMOKE" to hex(0xF5F5F5FF),
            "YELLOW" to hex(0xFFFF00FF),
            "YELLOW_GREEN" to hex(0x9ACD32FF),
            null to Color(),
        )

        private fun findNamedColor(name: String): Int {
            var nameCopy = name
            // Normalize name
            // Normalize name
            nameCopy = nameCopy.replace(" ", "")
            nameCopy = nameCopy.replace("-", "")
            nameCopy = nameCopy.replace("_", "")
            nameCopy = nameCopy.replace("'", "")
            nameCopy = nameCopy.replace(".", "")
            nameCopy = nameCopy.uppercase()

            var idx = 0
            val color = namedColors[idx].first
            while (color != null) {
                if (nameCopy == java.lang.String(color).replace("_", "")) {
                    return idx
                }
                idx++
            }

            return -1
        }

        private fun named(name: String, default: Color): Color {
            val idx: Int = findNamedColor(name)
            return if (idx == -1) {
                default
            } else namedColors[idx].second
        }

        fun parseCol4(str: String, ofs: Int) = when (val character: Char = str.get(ofs)) {
            in '0'..'9' -> {
                character.code - '0'.code
            }

            in 'a'..'f' -> {
                character.code + (10 - 'a'.code)
            }

            in 'A'..'F' -> {
                character.code + (10 - 'A'.code)
            }

            else -> -1
        }

        /**
         * Returns true if color is a valid HTML hexadecimal color string. The string must be a hexadecimal value
         * (case-insensitive) of either 3, 4, 6 or 8 digits, and may be prefixed by a hash sign (#). This method is
         * identical to String.is_valid_html_color.
         */
        fun htmlIsValid(color: String): Boolean {
            var clr: String = color

            if (clr.isEmpty()) {
                return false
            }
            if (clr[0] == '#') {
                clr = clr.substring(1)
            }

            // Check if the amount of hex digits is valid.

            // Check if the amount of hex digits is valid.
            val len = clr.length
            if (!(len == 3 || len == 4 || len == 6 || len == 8)) {
                return false
            }

            // Check if each hex digit is valid.

            // Check if each hex digit is valid.
            for (i in 0 until len) {
                if (parseCol4(clr, i) == -1) {
                    return false
                }
            }

            return true
        }
    }

    //CONSTRUCTOR

    constructor() : this(0.0, 0.0, 0.0, 1.0)

    constructor(other: Color) : this(other.r, other.g, other.b, other.a)

    constructor(other: Color, alpha: RealT) : this(other.r, other.g, other.b, alpha)

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
     * Returns a new color with all components clamped between the components of [min] and [max], by running clamp on
     * each component.
     */
    fun clamp(min: Color = Color(0, 0, 0, 0), max: Color = Color(1, 1, 1, 1)) = Color(
        r.coerceIn(min.r, max.r),
        g.coerceIn(min.g, max.g),
        b.coerceIn(min.b, max.b),
        a.coerceIn(min.a, max.a),
    )

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
     * Returns the light intensity of the color, as a value between 0.0 and 1.0 (inclusive). This is useful when
     * determining light or dark color. Colors with a luminance smaller than 0.5 can be generally considered dark.
     *
     * Note: get_luminance relies on the color being in the linear color space to return an accurate relative luminance
     * value. If the color is in the sRGB color space, use srgb_to_linear to convert it to the linear color space first.
     */
    fun getLuminance() = 0.2126f * r + 0.7152f * g + 0.0722f * b

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
     * Returns the linear interpolation between this color's components and [to]'s components. The interpolation factor
     * [weight] should be between 0.0 and 1.0 (inclusive). See also @GlobalScope.lerp.
     */
    fun lerp(to: Color, weight: Float): Color {
        val res = Color(this)

        res.r = r + (weight * (to.r - r))
        res.r = g + (weight * (to.g - g))
        res.r = b + (weight * (to.b - b))
        res.r = a + (weight * (to.a - a))

        return res
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
     * Returns the color converted to the sRGB color space. This method assumes the original color is in the linear
     * color space. See also srgb_to_linear which performs the opposite operation.
     */
    fun linearToSrgb() = Color(
        if (r < 0.0031308f) 12.92f * r else (1.0f + 0.055f) * r.pow(1.0 / 2.4) - 0.055,
        if (g < 0.0031308f) 12.92f * g else (1.0f + 0.055f) * g.pow(1.0 / 2.4) - 0.055,
        if (b < 0.0031308f) 12.92f * b else (1.0f + 0.055f) * b.pow(1.0 / 2.4) - 0.055,
        a
    )

    /**
     * Returns the color converted to the linear color space. This method assumes the original color already is in the
     * sRGB color space. See also linear_to_srgb which performs the opposite operation.
     */
    fun srgbToLinear() = Color(
        if (r < 0.04045f) r * (1.0f / 12.92f) else ((r + 0.055) * (1.0 / (1.0 + 0.055))).pow(2.4),
        if (g < 0.04045f) g * (1.0f / 12.92f) else ((g + 0.055) * (1.0 / (1.0 + 0.055))).pow(2.4),
        if (b < 0.04045f) b * (1.0f / 12.92f) else ((b + 0.055) * (1.0 / (1.0 + 0.055))).pow(2.4),
        a
    )

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

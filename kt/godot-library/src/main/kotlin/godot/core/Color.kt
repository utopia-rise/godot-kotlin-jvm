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
        inline val aliceBlue: Color
            get() = Color(0.94, 0.97, 1.00)
        inline val antiqueWhite: Color
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
        inline val blanchedAlmond: Color
            get() = Color(1.00, 0.92, 0.80)
        inline val blue: Color
            get() = Color(0.00, 0.00, 1.00)
        inline val blueViolet: Color
            get() = Color(0.54, 0.17, 0.89)
        inline val brown: Color
            get() = Color(0.65, 0.16, 0.16)
        inline val burlywood: Color
            get() = Color(0.87, 0.72, 0.53)
        inline val cadetBlue: Color
            get() = Color(0.37, 0.62, 0.63)
        inline val chartreuse: Color
            get() = Color(0.50, 1.00, 0.00)
        inline val chocolate: Color
            get() = Color(0.82, 0.41, 0.12)
        inline val coral: Color
            get() = Color(1.00, 0.50, 0.31)
        inline val cornflowerBlue: Color
            get() = Color(0.39, 0.58, 0.93)
        inline val cornsilk: Color
            get() = Color(1.00, 0.97, 0.86)
        inline val crimson: Color
            get() = Color(0.86, 0.08, 0.24)
        inline val cyan: Color
            get() = Color(0.00, 1.00, 1.00)
        inline val darkBlue: Color
            get() = Color(0.00, 0.00, 0.55)
        inline val darkCyan: Color
            get() = Color(0.00, 0.55, 0.55)
        inline val darkGoldenrod: Color
            get() = Color(0.72, 0.53, 0.04)
        inline val darkGray: Color
            get() = Color(0.66, 0.66, 0.66)
        inline val darkGreen: Color
            get() = Color(0.00, 0.39, 0.00)
        inline val darkKhaki: Color
            get() = Color(0.74, 0.72, 0.42)
        inline val darkMagenta: Color
            get() = Color(0.55, 0.00, 0.55)
        inline val darkOliveGreen: Color
            get() = Color(0.33, 0.42, 0.18)
        inline val darkorange: Color
            get() = Color(1.00, 0.55, 0.00)
        inline val darkOrchid: Color
            get() = Color(0.60, 0.20, 0.80)
        inline val darkRed: Color
            get() = Color(0.55, 0.00, 0.00)
        inline val darkSalmon: Color
            get() = Color(0.91, 0.59, 0.48)
        inline val darkSeaGreen: Color
            get() = Color(0.56, 0.74, 0.56)
        inline val darkSlateBlue: Color
            get() = Color(0.28, 0.24, 0.55)
        inline val darkSlateGray: Color
            get() = Color(0.18, 0.31, 0.31)
        inline val darkTurquoise: Color
            get() = Color(0.00, 0.81, 0.82)
        inline val darkViolet: Color
            get() = Color(0.58, 0.00, 0.83)
        inline val deepPink: Color
            get() = Color(1.00, 0.08, 0.58)
        inline val deepSkyBlue: Color
            get() = Color(0.00, 0.75, 1.00)
        inline val dimGray: Color
            get() = Color(0.41, 0.41, 0.41)
        inline val dodgerBlue: Color
            get() = Color(0.12, 0.56, 1.00)
        inline val firebrick: Color
            get() = Color(0.70, 0.13, 0.13)
        inline val floralWhite: Color
            get() = Color(1.00, 0.98, 0.94)
        inline val forestGreen: Color
            get() = Color(0.13, 0.55, 0.13)
        inline val fuchsia: Color
            get() = Color(1.00, 0.00, 1.00)
        inline val gainsboro: Color
            get() = Color(0.86, 0.86, 0.86)
        inline val ghostWhite: Color
            get() = Color(0.97, 0.97, 1.00)
        inline val gold: Color
            get() = Color(1.00, 0.84, 0.00)
        inline val goldenrod: Color
            get() = Color(0.85, 0.65, 0.13)
        inline val gray: Color
            get() = Color(0.75, 0.75, 0.75)
        inline val webGray: Color
            get() = Color(0.50, 0.50, 0.50)
        inline val green: Color
            get() = Color(0.00, 1.00, 0.00)
        inline val webGreen: Color
            get() = Color(0.00, 0.50, 0.00)
        inline val greenYellow: Color
            get() = Color(0.68, 1.00, 0.18)
        inline val honeydew: Color
            get() = Color(0.94, 1.00, 0.94)
        inline val hotPink: Color
            get() = Color(1.00, 0.41, 0.71)
        inline val indianRed: Color
            get() = Color(0.80, 0.36, 0.36)
        inline val indigo: Color
            get() = Color(0.29, 0.00, 0.51)
        inline val ivory: Color
            get() = Color(1.00, 1.00, 0.94)
        inline val khaki: Color
            get() = Color(0.94, 0.90, 0.55)
        inline val lavender: Color
            get() = Color(0.90, 0.90, 0.98)
        inline val lavenderBlush: Color
            get() = Color(1.00, 0.94, 0.96)
        inline val lawnGreen: Color
            get() = Color(0.49, 0.99, 0.00)
        inline val lemonChiffon: Color
            get() = Color(1.00, 0.98, 0.80)
        inline val lightBlue: Color
            get() = Color(0.68, 0.85, 0.90)
        inline val lightCoral: Color
            get() = Color(0.94, 0.50, 0.50)
        inline val lightCyan: Color
            get() = Color(0.88, 1.00, 1.00)
        inline val lightGoldenrod: Color
            get() = Color(0.98, 0.98, 0.82)
        inline val lightGray: Color
            get() = Color(0.83, 0.83, 0.83)
        inline val lightGreen: Color
            get() = Color(0.56, 0.93, 0.56)
        inline val lightPink: Color
            get() = Color(1.00, 0.71, 0.76)
        inline val lightSalmon: Color
            get() = Color(1.00, 0.63, 0.48)
        inline val lightSeaGreen: Color
            get() = Color(0.13, 0.70, 0.67)
        inline val lightSkyBlue: Color
            get() = Color(0.53, 0.81, 0.98)
        inline val lightSlateGray: Color
            get() = Color(0.47, 0.53, 0.60)
        inline val lightSteelBlue: Color
            get() = Color(0.69, 0.77, 0.87)
        inline val lightYellow: Color
            get() = Color(1.00, 1.00, 0.88)
        inline val lime: Color
            get() = Color(0.00, 1.00, 0.00)
        inline val limeGreen: Color
            get() = Color(0.20, 0.80, 0.20)
        inline val linen: Color
            get() = Color(0.98, 0.94, 0.90)
        inline val magenta: Color
            get() = Color(1.00, 0.00, 1.00)
        inline val maroon: Color
            get() = Color(0.69, 0.19, 0.38)
        inline val webMaroon: Color
            get() = Color(0.50, 0.00, 0.00)
        inline val mediumAquamarine: Color
            get() = Color(0.40, 0.80, 0.67)
        inline val mediumBlue: Color
            get() = Color(0.00, 0.00, 0.80)
        inline val mediumOrchid: Color
            get() = Color(0.73, 0.33, 0.83)
        inline val mediumPurple: Color
            get() = Color(0.58, 0.44, 0.86)
        inline val mediumSeaGreen: Color
            get() = Color(0.24, 0.70, 0.44)
        inline val mediumSlateBlue: Color
            get() = Color(0.48, 0.41, 0.93)
        inline val mediumSpringGreen: Color
            get() = Color(0.00, 0.98, 0.60)
        inline val mediumTurquoise: Color
            get() = Color(0.28, 0.82, 0.80)
        inline val mediumVioletRed: Color
            get() = Color(0.78, 0.08, 0.52)
        inline val midnightBlue: Color
            get() = Color(0.10, 0.10, 0.44)
        inline val mintCream: Color
            get() = Color(0.96, 1.00, 0.98)
        inline val mistyRose: Color
            get() = Color(1.00, 0.89, 0.88)
        inline val moccasin: Color
            get() = Color(1.00, 0.89, 0.71)
        inline val navajoWhite: Color
            get() = Color(1.00, 0.87, 0.68)
        inline val navyBlue: Color
            get() = Color(0.00, 0.00, 0.50)
        inline val oldLace: Color
            get() = Color(0.99, 0.96, 0.90)
        inline val olive: Color
            get() = Color(0.50, 0.50, 0.00)
        inline val oliveDrab: Color
            get() = Color(0.42, 0.56, 0.14)
        inline val orange: Color
            get() = Color(1.00, 0.65, 0.00)
        inline val orangeRed: Color
            get() = Color(1.00, 0.27, 0.00)
        inline val orchid: Color
            get() = Color(0.85, 0.44, 0.84)
        inline val paleGoldenrod: Color
            get() = Color(0.93, 0.91, 0.67)
        inline val paleGreen: Color
            get() = Color(0.60, 0.98, 0.60)
        inline val paleTurquoise: Color
            get() = Color(0.69, 0.93, 0.93)
        inline val paleVioletRed: Color
            get() = Color(0.86, 0.44, 0.58)
        inline val papayaWhip: Color
            get() = Color(1.00, 0.94, 0.84)
        inline val peachPuff: Color
            get() = Color(1.00, 0.85, 0.73)
        inline val peru: Color
            get() = Color(0.80, 0.52, 0.25)
        inline val pink: Color
            get() = Color(1.00, 0.75, 0.80)
        inline val plum: Color
            get() = Color(0.87, 0.63, 0.87)
        inline val powderBlue: Color
            get() = Color(0.69, 0.88, 0.90)
        inline val purple: Color
            get() = Color(0.63, 0.13, 0.94)
        inline val webPurple: Color
            get() = Color(0.50, 0.00, 0.50)
        inline val rebeccaPurple: Color
            get() = Color(0.40, 0.20, 0.60)
        inline val red: Color
            get() = Color(1.00, 0.00, 0.00)
        inline val rosyBrown: Color
            get() = Color(0.74, 0.56, 0.56)
        inline val royalBlue: Color
            get() = Color(0.25, 0.41, 0.88)
        inline val saddleBrown: Color
            get() = Color(0.55, 0.27, 0.07)
        inline val salmon: Color
            get() = Color(0.98, 0.50, 0.45)
        inline val sandyBrown: Color
            get() = Color(0.96, 0.64, 0.38)
        inline val seaGreen: Color
            get() = Color(0.18, 0.55, 0.34)
        inline val seashell: Color
            get() = Color(1.00, 0.96, 0.93)
        inline val sienna: Color
            get() = Color(0.63, 0.32, 0.18)
        inline val silver: Color
            get() = Color(0.75, 0.75, 0.75)
        inline val skyBlue: Color
            get() = Color(0.53, 0.81, 0.92)
        inline val slateBlue: Color
            get() = Color(0.42, 0.35, 0.80)
        inline val slateGray: Color
            get() = Color(0.44, 0.50, 0.56)
        inline val snow: Color
            get() = Color(1.00, 0.98, 0.98)
        inline val springGreen: Color
            get() = Color(0.00, 1.00, 0.50)
        inline val steelBlue: Color
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
        inline val whiteSmoke: Color
            get() = Color(0.96, 0.96, 0.96)
        inline val yellow: Color
            get() = Color(1.00, 1.00, 0.00)
        inline val yellowGreen: Color
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
            "ALICE_BLUE" to aliceBlue,
            "ANTIQUE_WHITE" to antiqueWhite,
            "AQUA" to aqua,
            "AQUAMARINE" to aquamarine,
            "AZURE" to azure,
            "BEIGE" to beige,
            "BISQUE" to bisque,
            "BLACK" to black,
            "BLANCHED_ALMOND" to blanchedAlmond,
            "BLUE" to blue,
            "BLUE_VIOLET" to blueViolet,
            "BROWN" to brown,
            "BURLYWOOD" to burlywood,
            "CADET_BLUE" to cadetBlue,
            "CHARTREUSE" to chartreuse,
            "CHOCOLATE" to chocolate,
            "CORAL" to coral,
            "CORNFLOWER_BLUE" to cornflowerBlue,
            "CORNSILK" to cornsilk,
            "CRIMSON" to crimson,
            "CYAN" to cyan,
            "DARK_BLUE" to darkBlue,
            "DARK_CYAN" to darkCyan,
            "DARK_GOLDENROD" to darkGoldenrod,
            "DARK_GRAY" to darkGray,
            "DARK_GREEN" to darkGreen,
            "DARK_KHAKI" to darkKhaki,
            "DARK_MAGENTA" to darkMagenta,
            "DARK_OLIVE_GREEN" to darkOliveGreen,
            "DARK_ORANGE" to darkorange,
            "DARK_ORCHID" to darkOrchid,
            "DARK_RED" to darkRed,
            "DARK_SALMON" to darkSalmon,
            "DARK_SEA_GREEN" to darkSeaGreen,
            "DARK_SLATE_BLUE" to darkSlateBlue,
            "DARK_SLATE_GRAY" to darkSlateGray,
            "DARK_TURQUOISE" to darkTurquoise,
            "DARK_VIOLET" to darkViolet,
            "DEEP_PINK" to deepPink,
            "DEEP_SKY_BLUE" to deepSkyBlue,
            "DIM_GRAY" to dimGray,
            "DODGER_BLUE" to dodgerBlue,
            "FIREBRICK" to firebrick,
            "FLORAL_WHITE" to floralWhite,
            "FOREST_GREEN" to forestGreen,
            "FUCHSIA" to fuchsia,
            "GAINSBORO" to gainsboro,
            "GHOST_WHITE" to ghostWhite,
            "GOLD" to gold,
            "GOLDENROD" to goldenrod,
            "GRAY" to gray,
            "GREEN" to green,
            "GREEN_YELLOW" to greenYellow,
            "HONEYDEW" to honeydew,
            "HOT_PINK" to hotPink,
            "INDIAN_RED" to indianRed,
            "INDIGO" to indigo,
            "IVORY" to ivory,
            "KHAKI" to khaki,
            "LAVENDER" to lavender,
            "LAVENDER_BLUSH" to lavenderBlush,
            "LAWN_GREEN" to lawnGreen,
            "LEMON_CHIFFON" to lemonChiffon,
            "LIGHT_BLUE" to lightBlue,
            "LIGHT_CORAL" to lightCoral,
            "LIGHT_CYAN" to lightCyan,
            "LIGHT_GOLDENROD" to lightGoldenrod,
            "LIGHT_GRAY" to lightGray,
            "LIGHT_GREEN" to lightGreen,
            "LIGHT_PINK" to lightPink,
            "LIGHT_SALMON" to lightSalmon,
            "LIGHT_SEA_GREEN" to lightSeaGreen,
            "LIGHT_SKY_BLUE" to lightSkyBlue,
            "LIGHT_SLATE_GRAY" to lightSlateGray,
            "LIGHT_STEEL_BLUE" to lightSteelBlue,
            "LIGHT_YELLOW" to lightYellow,
            "LIME" to lime,
            "LIME_GREEN" to limeGreen,
            "LINEN" to linen,
            "MAGENTA" to magenta,
            "MAROON" to maroon,
            "MEDIUM_AQUAMARINE" to mediumAquamarine,
            "MEDIUM_BLUE" to mediumBlue,
            "MEDIUM_ORCHID" to mediumOrchid,
            "MEDIUM_PURPLE" to mediumPurple,
            "MEDIUM_SEA_GREEN" to mediumSeaGreen,
            "MEDIUM_SLATE_BLUE" to mediumSlateBlue,
            "MEDIUM_SPRING_GREEN" to mediumSpringGreen,
            "MEDIUM_TURQUOISE" to mediumTurquoise,
            "MEDIUM_VIOLET_RED" to mediumVioletRed,
            "MIDNIGHT_BLUE" to midnightBlue,
            "MINT_CREAM" to mintCream,
            "MISTY_ROSE" to mistyRose,
            "MOCCASIN" to moccasin,
            "NAVAJO_WHITE" to navajoWhite,
            "NAVY_BLUE" to navyBlue,
            "OLD_LACE" to oldLace,
            "OLIVE" to olive,
            "OLIVE_DRAB" to oliveDrab,
            "ORANGE" to orange,
            "ORANGE_RED" to orangeRed,
            "ORCHID" to orchid,
            "PALE_GOLDENROD" to paleGoldenrod,
            "PALE_GREEN" to paleGreen,
            "PALE_TURQUOISE" to paleTurquoise,
            "PALE_VIOLET_RED" to paleVioletRed,
            "PAPAYA_WHIP" to papayaWhip,
            "PEACH_PUFF" to peachPuff,
            "PERU" to peru,
            "PINK" to pink,
            "PLUM" to plum,
            "POWDER_BLUE" to powderBlue,
            "PURPLE" to purple,
            "REBECCA_PURPLE" to rebeccaPurple,
            "RED" to red,
            "ROSY_BROWN" to rosyBrown,
            "ROYAL_BLUE" to royalBlue,
            "SADDLE_BROWN" to saddleBrown,
            "SALMON" to salmon,
            "SANDY_BROWN" to sandyBrown,
            "SEA_GREEN" to seaGreen,
            "SEASHELL" to seashell,
            "SIENNA" to sienna,
            "SILVER" to silver,
            "SKY_BLUE" to skyBlue,
            "SLATE_BLUE" to slateBlue,
            "SLATE_GRAY" to slateGray,
            "SNOW" to snow,
            "SPRING_GREEN" to springGreen,
            "STEEL_BLUE" to steelBlue,
            "TAN" to tan,
            "TEAL" to teal,
            "THISTLE" to thistle,
            "TOMATO" to tomato,
            "TRANSPARENT" to transparent,
            "TURQUOISE" to turquoise,
            "VIOLET" to violet,
            "WEB_GRAY" to webGray,
            "WEB_GREEN" to webGreen,
            "WEB_MAROON" to webMaroon,
            "WEB_PURPLE" to webPurple,
            "WHEAT" to wheat,
            "WHITE" to white,
            "WHITE_SMOKE" to whiteSmoke,
            "YELLOW" to yellow,
            "YELLOW_GREEN" to yellowGreen,
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
            val len = clr.length
            if (!(len == 3 || len == 4 || len == 6 || len == 8)) {
                return false
            }

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

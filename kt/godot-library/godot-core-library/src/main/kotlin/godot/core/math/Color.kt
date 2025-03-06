@file:Suppress("PackageDirectoryMismatch", "unused")

package godot.core

import godot.common.util.RealT
import godot.common.util.isEqualApprox
import godot.common.util.lerp
import godot.common.util.toRealT
import kotlin.math.floor
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.roundToLong

class Color : Comparable<Color>, CoreType {

    var r: RealT
    var g: RealT
    var b: RealT
    var a: RealT

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
            get() = Color(0.941176, 0.972549, 1, 1)
        inline val antiqueWhite: Color
            get() = Color(0.980392, 0.921569, 0.843137, 1)
        inline val aqua: Color
            get() = Color(0, 1, 1, 1)
        inline val aquamarine: Color
            get() = Color(0.498039, 1, 0.831373, 1)
        inline val azure: Color
            get() = Color(0.941176, 1, 1, 1)
        inline val beige: Color
            get() = Color(0.960784, 0.960784, 0.862745, 1)
        inline val bisque: Color
            get() = Color(1, 0.894118, 0.768627, 1)
        inline val black: Color
            get() = Color(0, 0, 0, 1)
        inline val blanchedAlmond: Color
            get() = Color(1, 0.921569, 0.803922, 1)
        inline val blue: Color
            get() = Color(0, 0, 1, 1)
        inline val blueViolet: Color
            get() = Color(0.541176, 0.168627, 0.886275, 1)
        inline val brown: Color
            get() = Color(0.647059, 0.164706, 0.164706, 1)
        inline val burlywood: Color
            get() = Color(0.870588, 0.721569, 0.529412, 1)
        inline val cadetBlue: Color
            get() = Color(0.372549, 0.619608, 0.627451, 1)
        inline val chartreuse: Color
            get() = Color(0.498039, 1, 0, 1)
        inline val chocolate: Color
            get() = Color(0.823529, 0.411765, 0.117647, 1)
        inline val coral: Color
            get() = Color(1, 0.498039, 0.313726, 1)
        inline val cornflowerBlue: Color
            get() = Color(0.392157, 0.584314, 0.929412, 1)
        inline val cornsilk: Color
            get() = Color(1, 0.972549, 0.862745, 1)
        inline val crimson: Color
            get() = Color(0.862745, 0.0784314, 0.235294, 1)
        inline val cyan: Color
            get() = Color(0, 1, 1, 1)
        inline val darkBlue: Color
            get() = Color(0, 0, 0.545098, 1)
        inline val darkCyan: Color
            get() = Color(0, 0.545098, 0.545098, 1)
        inline val darkGoldenrod: Color
            get() = Color(0.721569, 0.52549, 0.0431373, 1)
        inline val darkGray: Color
            get() = Color(0.662745, 0.662745, 0.662745, 1)
        inline val darkGreen: Color
            get() = Color(0, 0.392157, 0, 1)
        inline val darkKhaki: Color
            get() = Color(0.741176, 0.717647, 0.419608, 1)
        inline val darkMagenta: Color
            get() = Color(0.545098, 0, 0.545098, 1)
        inline val darkOliveGreen: Color
            get() = Color(0.333333, 0.419608, 0.184314, 1)
        inline val darkorange: Color
            get() = Color(1, 0.54902, 0, 1)
        inline val darkOrchid: Color
            get() = Color(0.6, 0.196078, 0.8, 1)
        inline val darkRed: Color
            get() = Color(0.545098, 0, 0, 1)
        inline val darkSalmon: Color
            get() = Color(0.913725, 0.588235, 0.478431, 1)
        inline val darkSeaGreen: Color
            get() = Color(0.560784, 0.737255, 0.560784, 1)
        inline val darkSlateBlue: Color
            get() = Color(0.282353, 0.239216, 0.545098, 1)
        inline val darkSlateGray: Color
            get() = Color(0.184314, 0.309804, 0.309804, 1)
        inline val darkTurquoise: Color
            get() = Color(0, 0.807843, 0.819608, 1)
        inline val darkViolet: Color
            get() = Color(0.580392, 0, 0.827451, 1)
        inline val deepPink: Color
            get() = Color(1, 0.0784314, 0.576471, 1)
        inline val deepSkyBlue: Color
            get() = Color(0, 0.74902, 1, 1)
        inline val dimGray: Color
            get() = Color(0.411765, 0.411765, 0.411765, 1)
        inline val dodgerBlue: Color
            get() = Color(0.117647, 0.564706, 1, 1)
        inline val firebrick: Color
            get() = Color(0.698039, 0.133333, 0.133333, 1)
        inline val floralWhite: Color
            get() = Color(1, 0.980392, 0.941176, 1)
        inline val forestGreen: Color
            get() = Color(0.133333, 0.545098, 0.133333, 1)
        inline val fuchsia: Color
            get() = Color(1.00, 0.00, 1.00)
        inline val gainsboro: Color
            get() = Color(0.862745, 0.862745, 0.862745, 1)
        inline val ghostWhite: Color
            get() = Color(0.972549, 0.972549, 1, 1)
        inline val gold: Color
            get() = Color(1, 0.843137, 0, 1)
        inline val goldenrod: Color
            get() = Color(0.854902, 0.647059, 0.12549, 1)
        inline val gray: Color
            get() = Color(0.745098, 0.745098, 0.745098, 1)
        inline val green: Color
            get() = Color(0.00, 1.00, 0.00)
        inline val greenYellow: Color
            get() = Color(0.678431, 1, 0.184314, 1)
        inline val honeydew: Color
            get() = Color(0.941176, 1, 0.941176, 1)
        inline val hotPink: Color
            get() = Color(1, 0.411765, 0.705882, 1)
        inline val indianRed: Color
            get() = Color(0.803922, 0.360784, 0.360784, 1)
        inline val indigo: Color
            get() = Color(0.294118, 0, 0.509804, 1)
        inline val ivory: Color
            get() = Color(1, 1, 0.941176, 1)
        inline val khaki: Color
            get() = Color(0.941176, 0.901961, 0.54902, 1)
        inline val lavender: Color
            get() = Color(0.901961, 0.901961, 0.980392, 1)
        inline val lavenderBlush: Color
            get() = Color(1, 0.941176, 0.960784, 1)
        inline val lawnGreen: Color
            get() = Color(0.486275, 0.988235, 0, 1)
        inline val lemonChiffon: Color
            get() = Color(1, 0.980392, 0.803922, 1)
        inline val lightBlue: Color
            get() = Color(0.678431, 0.847059, 0.901961, 1)
        inline val lightCoral: Color
            get() = Color(0.941176, 0.501961, 0.501961, 1)
        inline val lightCyan: Color
            get() = Color(0.878431, 1, 1, 1)
        inline val lightGoldenrod: Color
            get() = Color(0.980392, 0.980392, 0.823529, 1)
        inline val lightGray: Color
            get() = Color(0.827451, 0.827451, 0.827451, 1)
        inline val lightGreen: Color
            get() = Color(0.564706, 0.933333, 0.564706, 1)
        inline val lightPink: Color
            get() = Color(1, 0.713726, 0.756863, 1)
        inline val lightSalmon: Color
            get() = Color(1, 0.627451, 0.478431, 1)
        inline val lightSeaGreen: Color
            get() = Color(0.12549, 0.698039, 0.666667, 1)
        inline val lightSkyBlue: Color
            get() = Color(0.529412, 0.807843, 0.980392, 1)
        inline val lightSlateGray: Color
            get() = Color(0.466667, 0.533333, 0.6, 1)
        inline val lightSteelBlue: Color
            get() = Color(0.690196, 0.768627, 0.870588, 1)
        inline val lightYellow: Color
            get() = Color(1, 1, 0.878431, 1)
        inline val lime: Color
            get() = Color(0, 1, 0, 1)
        inline val limeGreen: Color
            get() = Color(0.196078, 0.803922, 0.196078, 1)
        inline val linen: Color
            get() = Color(0.980392, 0.941176, 0.901961, 1)
        inline val magenta: Color
            get() = Color(1.00, 0.00, 1.00)
        inline val maroon: Color
            get() = Color(0.690196, 0.188235, 0.376471, 1)
        inline val mediumAquamarine: Color
            get() = Color(0.4, 0.803922, 0.666667, 1)
        inline val mediumBlue: Color
            get() = Color(0, 0, 0.803922, 1)
        inline val mediumOrchid: Color
            get() = Color(0.729412, 0.333333, 0.827451, 1)
        inline val mediumPurple: Color
            get() = Color(0.576471, 0.439216, 0.858824, 1)
        inline val mediumSeaGreen: Color
            get() = Color(0.235294, 0.701961, 0.443137, 1)
        inline val mediumSlateBlue: Color
            get() = Color(0.482353, 0.407843, 0.933333, 1)
        inline val mediumSpringGreen: Color
            get() = Color(0, 0.980392, 0.603922, 1)
        inline val mediumTurquoise: Color
            get() = Color(0.282353, 0.819608, 0.8, 1)
        inline val mediumVioletRed: Color
            get() = Color(0.780392, 0.0823529, 0.521569, 1)
        inline val midnightBlue: Color
            get() = Color(0.0980392, 0.0980392, 0.439216, 1)
        inline val mintCream: Color
            get() = Color(0.960784, 1, 0.980392, 1)
        inline val mistyRose: Color
            get() = Color(1, 0.894118, 0.882353, 1)
        inline val moccasin: Color
            get() = Color(1, 0.894118, 0.709804, 1)
        inline val navajoWhite: Color
            get() = Color(1, 0.870588, 0.678431, 1)
        inline val navyBlue: Color
            get() = Color(0, 0, 0.501961, 1)
        inline val oldLace: Color
            get() = Color(0.992157, 0.960784, 0.901961, 1)
        inline val olive: Color
            get() = Color(0.501961, 0.501961, 0, 1)
        inline val oliveDrab: Color
            get() = Color(0.419608, 0.556863, 0.137255, 1)
        inline val orange: Color
            get() = Color(1, 0.647059, 0, 1)
        inline val orangeRed: Color
            get() = Color(1, 0.270588, 0, 1)
        inline val orchid: Color
            get() = Color(0.854902, 0.439216, 0.839216, 1)
        inline val paleGoldenrod: Color
            get() = Color(0.933333, 0.909804, 0.666667, 1)
        inline val paleGreen: Color
            get() = Color(0.596078, 0.984314, 0.596078, 1)
        inline val paleTurquoise: Color
            get() = Color(0.686275, 0.933333, 0.933333, 1)
        inline val paleVioletRed: Color
            get() = Color(0.858824, 0.439216, 0.576471, 1)
        inline val papayaWhip: Color
            get() = Color(1, 0.937255, 0.835294, 1)
        inline val peachPuff: Color
            get() = Color(1, 0.854902, 0.72549, 1)
        inline val peru: Color
            get() = Color(0.803922, 0.521569, 0.247059, 1)
        inline val pink: Color
            get() = Color(1, 0.752941, 0.796078, 1)
        inline val plum: Color
            get() = Color(0.866667, 0.627451, 0.866667, 1)
        inline val powderBlue: Color
            get() = Color(0.690196, 0.878431, 0.901961, 1)
        inline val purple: Color
            get() = Color(0.627451, 0.12549, 0.941176, 1)
        inline val rebeccaPurple: Color
            get() = Color(0.4, 0.2, 0.6, 1)
        inline val red: Color
            get() = Color(1.00, 0.00, 0.00)
        inline val rosyBrown: Color
            get() = Color(0.737255, 0.560784, 0.560784, 1)
        inline val royalBlue: Color
            get() = Color(0.254902, 0.411765, 0.882353, 1)
        inline val saddleBrown: Color
            get() = Color(0.545098, 0.270588, 0.0745098, 1)
        inline val salmon: Color
            get() = Color(0.980392, 0.501961, 0.447059, 1)
        inline val sandyBrown: Color
            get() = Color(0.956863, 0.643137, 0.376471, 1)
        inline val seaGreen: Color
            get() = Color(0.180392, 0.545098, 0.341176, 1)
        inline val seashell: Color
            get() = Color(1, 0.960784, 0.933333, 1)
        inline val sienna: Color
            get() = Color(0.627451, 0.321569, 0.176471, 1)
        inline val silver: Color
            get() = Color(0.752941, 0.752941, 0.752941, 1)
        inline val skyBlue: Color
            get() = Color(0.529412, 0.807843, 0.921569, 1)
        inline val slateBlue: Color
            get() = Color(0.415686, 0.352941, 0.803922, 1)
        inline val slateGray: Color
            get() = Color(0.439216, 0.501961, 0.564706, 1)
        inline val snow: Color
            get() = Color(1, 0.980392, 0.980392, 1)
        inline val springGreen: Color
            get() = Color(0, 1, 0.498039, 1)
        inline val steelBlue: Color
            get() = Color(0.27451, 0.509804, 0.705882, 1)
        inline val tan: Color
            get() = Color(0.823529, 0.705882, 0.54902, 1)
        inline val teal: Color
            get() = Color(0, 0.501961, 0.501961, 1)
        inline val thistle: Color
            get() = Color(0.847059, 0.74902, 0.847059, 1)
        inline val tomato: Color
            get() = Color(1, 0.388235, 0.278431, 1)
        inline val transparent: Color
            get() = Color(1, 1, 1, 0)
        inline val turquoise: Color
            get() = Color(0.25098, 0.878431, 0.815686, 1)
        inline val violet: Color
            get() = Color(0.933333, 0.509804, 0.933333, 1)
        inline val webGray: Color
            get() = Color(0.501961, 0.501961, 0.501961, 1)
        inline val webGreen: Color
            get() = Color(0, 0.501961, 0, 1)
        inline val webMaroon: Color
            get() = Color(0.501961, 0, 0, 1)
        inline val webPurple: Color
            get() = Color(0.501961, 0, 0.501961, 1)
        inline val wheat: Color
            get() = Color(0.960784, 0.870588, 0.701961, 1)
        inline val white: Color
            get() = Color(1.00, 1.00, 1.00)
        inline val whiteSmoke: Color
            get() = Color(0.960784, 0.960784, 0.960784, 1)
        inline val yellow: Color
            get() = Color(1.00, 1.00, 0.00)
        inline val yellowGreen: Color
            get() = Color(0.603922, 0.803922, 0.196078, 1)

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
            if (s == 0.0) {
                // Achromatic (gray)
                return Color(v, v, v)
            }

            var h2 = h * 6.0f
            h2 = h2.rem(6)

            val i = h2.toInt()
            val f = h2 - i

            val p = v * (1.0f - s)
            val q = v * (1.0f - s * f)
            val t = v * (1.0f - s * (1.0f - f))

            return when (i) {
                0 -> Color(v, t, p, a)
                1 -> Color(q, v, p, a)
                2 -> Color(p, v, t, a)
                3 -> Color(p, q, v, a)
                4 -> Color(t, p, v, a)
                5 -> Color(v, p, q, a)
                else -> Color(0.0, 0.0, 0.0, a)
            }
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

            val rd = r * m
            val gd = g * m
            val bd = b * m

            return Color(rd, gd, bd, 1.0f)
        }

        /**
         * 	Returns a [Color] constructed from red ([param r8]), green ([param g8]), blue ([param b8]), and optionally alpha ([param a8]) integer channels, each divided by 255.0 for their final value.
         * 	```
         * 	var red = Color.fromRgba(255, 0, 0)             # Same as Color(1, 0, 0).
         * 	var darkBlue = Color.fromRgba(0, 0, 51)        # Same as Color(0, 0, 0.2).
         * 	var myColor = Color.fromRgba(306, 255, 0, 102) # Same as Color(1.2, 1, 0, 0.4).
         * 	```
         * 	***Note:*** Due to the lower precision of [fromRgba] compared to the standard [Color] constructor, a color created with [fromRgba] will generally not be equal to the same color created with the standard [Color] constructor.
         * 	Use [isEqualApprox] for comparisons to avoid issues with floating-point precision error.
         */
        fun fromRgba(r: Int, g: Int, b: Int, a: Int = 255): Color {
            return Color(r / 255.0f, g / 255.0f, b / 255.0f, a / 255.0f);
        }

        /**
         * Creates a Color from the given string, which can be either an HTML color code or a named color
         * (case-insensitive). Returns default if the color cannot be inferred from the string.
         */
        private fun fromString(str: String, default: Color): Color {
            val color = if (htmlIsValid(str)) {
                html(str)
            } else {
                named(str)
            }
            if (color == Color()) {
                return Color(default)
            }
            return color
        }

        //Color construction helpers
        fun html(from: String): Color {
            var color = from
            if (color.isEmpty()) {
                return Color()
            }

            color = color.removePrefix("#")

            val isShorthand = color.length < 5

            val alpha = when (color.length) {
                8, 4 -> {
                    true
                }

                6, 3 -> {
                    false
                }

                else -> {
                    return Color()
                }
            }

            val r: Float
            val g: Float
            val b: Float
            var a = 1.0f

            if (isShorthand) {
                r = parseCol4(color, 0) / 15.0f
                g = parseCol4(color, 1) / 15.0f
                b = parseCol4(color, 2) / 15.0f
                if (alpha) {
                    a = parseCol4(color, 3) / 15.0f
                }
            } else {
                r = parseCol8(color, 0) / 255.0f
                g = parseCol8(color, 2) / 255.0f
                b = parseCol8(color, 4) / 255.0f
                if (alpha) {
                    a = parseCol8(color, 6) / 255.0f
                }
            }

            return Color(r, g, b, a)
        }

        fun hex(from: UInt): Color {
            val a = (from and 0xFFu).toFloat() / 255.0
            var hex = from shr 8
            val b = (hex and 0xFFu).toFloat() / 255.0
            hex = hex shr 8
            val g = (hex and 0xFFu).toFloat() / 255.0
            hex = hex shr 8
            val r = (hex and 0xFFu).toFloat() / 255.0
            return Color(r, g, b, a)
        }

        fun hex64(from: ULong): Color {
            val a = (from and 0xFFFFu).toFloat() / 65535.0
            var hex = from shr 16
            val b = (hex and 0xFFFFu).toFloat() / 65535.0
            hex = hex shr 16
            val g = (hex and 0xFFFFu).toFloat() / 65535.0
            hex = hex shr 16
            val r = (hex and 0xFFFFu).toFloat() / 65535.0
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
            nameCopy = nameCopy.replace(" ", "")
            nameCopy = nameCopy.replace("-", "")
            nameCopy = nameCopy.replace("_", "")
            nameCopy = nameCopy.replace("'", "")
            nameCopy = nameCopy.replace(".", "")
            nameCopy = nameCopy.uppercase()

            var idx = 0
            var color = namedColors[idx].first
            while (color != null) {
                if (nameCopy == color.replace("_", "")) {
                    return idx
                }
                idx++
                color = namedColors[idx].first
            }

            return -1
        }

        internal fun named(name: String): Color {
            val idx: Int = findNamedColor(name)
            return if (idx == -1) {
                Color()
            } else Color(namedColors[idx].second)
        }

        private fun parseCol4(str: String, ofs: Int) = when (val character: Char = str[ofs]) {
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

        private fun parseCol8(str: String, ofs: Int) = parseCol4(str, ofs) * 16 + parseCol4(str, ofs + 1)

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

        operator fun invoke(code: String) = fromString(code, Color())

        operator fun invoke(code: String, a: RealT) = fromString(code, Color()).also { it.a = a }
    }

    //CONSTRUCTOR
    constructor() {
        r = 0.0
        g = 0.0
        b = 0.0
        a = 1.0
    }

    constructor(other: Color) {
        r = other.r
        g = other.g
        b = other.b
        a = other.a
    }

    constructor(other: Color, alpha: RealT = 1.0) {
        r = other.r
        g = other.g
        b = other.b
        a = alpha
    }

    constructor(r: Number, g: Number, b: Number, a: Number = 1.0) {
        this.r = r.toRealT()
        this.g = g.toRealT()
        this.b = b.toRealT()
        this.a = a.toRealT()
    }
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
        return r.isEqualApprox(color.r)
            && g.isEqualApprox(color.g)
            && b.isEqualApprox(color.b)
            && a.isEqualApprox(color.a)
    }

    /**
     * Returns the linear interpolation between this color's components and [to]'s components. The interpolation factor
     * [weight] should be between 0.0 and 1.0 (inclusive). See also @GlobalScope.lerp.
     */
    fun lerp(to: Color, weight: RealT): Color {
        val res = Color(this)
        res.r = lerp(r, to.r, weight)
        res.g = lerp(g, to.g, weight)
        res.b = lerp(b, to.b, weight)
        res.a = lerp(a, to.a, weight)

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
    fun toHtml(alpha: Boolean = true): String {
        var txt = ""
        txt += toHex(r)
        txt += toHex(g)
        txt += toHex(b)
        if (alpha) {
            txt = toHex(a) + txt
        }
        return txt
    }

    private fun toHex(value: RealT): String {
        var v = (value * 255.0).toInt()
        v = v.coerceIn(0, 255)
        var ret = ""

        for (i in 0..1) {
            val c = shortArrayOf(0, 0)
            val lv = v and 0xF
            if (lv < 10) {
                c[0] = ('0'.code + lv).toShort()
            } else {
                c[0] = ('a'.code + lv - 10).toShort()
            }

            v = v ushr 4
            val cs = String(charArrayOf(c[0].toInt().toChar()))
            ret = cs + ret
        }
        return ret
    }

    override fun equals(other: Any?): Boolean = when (other) {
        is Color -> (this.r == other.r && this.g == other.g && this.b == other.b &&
            this.a == other.a)

        else -> false
    }

    operator fun unaryMinus() = Color(1.0 - r, 1.0 - g, 1.0 - b, 1.0 - a)

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

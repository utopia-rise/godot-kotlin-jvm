package godot.api

import godot.core.Color
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.PackedByteArray
import godot.core.PackedColorArray
import godot.core.PackedInt32Array
import godot.core.PackedFloat64Array
import godot.core.PackedStringArray
import godot.core.PackedVector2Array
import godot.core.PackedVector3Array
import godot.core.VariantArray
import godot.util.toRealT

internal interface GDCore {


    /** Returns a character as a String of the given Unicode code point (which is compatible with ASCII code). */
    fun char(code: Int) = code.toChar().toString()

    /** Returns a color constructed from integer red, green, blue, and alpha channels.
     * Each channel should have 8 bits of information ranging from 0 to 255. */
    fun Color8(r8: Int, g8: Int, b8: Int, a8: Int = 255) = Color(r8 / 256f, g8 / 256f, b8 / 256f, a8 / 256f)

    /** Returns a color according to the standardized name with alpha ranging from 0 to 1.*/
    fun ColorN(name: String, alpha: Float = 1.0f): Color {
        return when (name) {
            "aliceblue" -> Color.aliceBlue
            "aqua" -> Color.aqua
            "aquamarine" -> Color.aquamarine
            "azure" -> Color.azure
            "beige" -> Color.beige
            "bisque" -> Color.bisque
            "black" -> Color.black
            "blanchedalmond" -> Color.blanchedAlmond
            "blue" -> Color.blue
            "blueviolet" -> Color.blueViolet
            "brown" -> Color.brown
            "burlywood" -> Color.burlywood
            "cadetblue" -> Color.cadetBlue
            "chartreuse" -> Color.chartreuse
            "chocolate" -> Color.chocolate
            "coral" -> Color.coral
            "cornflower" -> Color.cornflowerBlue
            "cornsilk" -> Color.cornsilk
            "crimson" -> Color.crimson
            "cyan" -> Color.cyan
            "darkblue" -> Color.darkBlue
            "darkcyan" -> Color.darkCyan
            "darkgoldenrod" -> Color.darkGoldenrod
            "darkgray" -> Color.darkGray
            "darkgreen" -> Color.darkGreen
            "darkkhaki" -> Color.darkKhaki
            "darkmagenta" -> Color.darkMagenta
            "darkolivegreen" -> Color.darkOliveGreen
            "darkorange" -> Color.darkorange
            "darkorchid" -> Color.darkOrchid
            "darkred" -> Color.darkRed
            "darksalmon" -> Color.darkSalmon
            "darkseagreen" -> Color.darkSeaGreen
            "darkslateblue" -> Color.darkSlateBlue
            "darkslategray" -> Color.darkSlateGray
            "darkturquoise" -> Color.darkTurquoise
            "darkviolet" -> Color.darkViolet
            "deeppink" -> Color.deepPink
            "deepskyblue" -> Color.deepSkyBlue
            "dimgray" -> Color.dimGray
            "dodgerblue" -> Color.dodgerBlue
            "firebrick" -> Color.firebrick
            "floralwhite" -> Color.floralWhite
            "forestgreen" -> Color.forestGreen
            "fuchsia" -> Color.fuchsia
            "gainsboro" -> Color.gainsboro
            "ghostwhite" -> Color.ghostWhite
            "gold" -> Color.gold
            "goldenrod" -> Color.goldenrod
            "gray" -> Color.gray
            "webgray" -> Color.webGray
            "green" -> Color.green
            "webgreen" -> Color.webGreen
            "greenyellow" -> Color.greenYellow
            "honeydew" -> Color.honeydew
            "hotpink" -> Color.hotPink
            "indianred" -> Color.indianRed
            "indigo" -> Color.indigo
            "ivory" -> Color.ivory
            "khaki" -> Color.khaki
            "lavender" -> Color.lavender
            "lavenderblush" -> Color.lavenderBlush
            "lawngreen" -> Color.lawnGreen
            "lemonchiffon" -> Color.lemonChiffon
            "lightblue" -> Color.lightBlue
            "lightcoral" -> Color.lightCoral
            "lightcyan" -> Color.lightCyan
            "lightgoldenrod" -> Color.lightGoldenrod
            "lightgray" -> Color.lightGray
            "lightgreen" -> Color.lightGreen
            "lightpink" -> Color.lightPink
            "lightsalmon" -> Color.lightSalmon
            "lightseagreen" -> Color.lightSeaGreen
            "lightskyblue" -> Color.lightSkyBlue
            "lightslategray" -> Color.lightSlateGray
            "lightsteelblue" -> Color.lightSteelBlue
            "lightyellow" -> Color.lightYellow
            "lime" -> Color.lime
            "limegreen" -> Color.limeGreen
            "linen" -> Color.linen
            "magenta" -> Color.magenta
            "maroon" -> Color.maroon
            "webmaroon" -> Color.webMaroon
            "mediumaquamarine" -> Color.mediumAquamarine
            "mediumblue" -> Color.mediumBlue
            "mediumorchid" -> Color.mediumOrchid
            "mediumpurple" -> Color.mediumPurple
            "mediumseagreen" -> Color.mediumSeaGreen
            "mediumslateblue" -> Color.mediumSlateBlue
            "mediumspringgreen" -> Color.mediumSpringGreen
            "mediumturquoise" -> Color.mediumTurquoise
            "mediumvioletred" -> Color.mediumVioletRed
            "midnightblue" -> Color.midnightBlue
            "mintcream" -> Color.mintCream
            "mistyrose" -> Color.mistyRose
            "moccasin" -> Color.moccasin
            "navajowhite" -> Color.navajoWhite
            "navyblue" -> Color.navyBlue
            "oldlace" -> Color.oldLace
            "olive" -> Color.olive
            "olivedrab" -> Color.oliveDrab
            "orange" -> Color.orange
            "orangered" -> Color.orangeRed
            "orchid" -> Color.orchid
            "palegoldenrod" -> Color.paleGoldenrod
            "palegreen" -> Color.paleGreen
            "paleturquoise" -> Color.paleTurquoise
            "palevioletred" -> Color.paleVioletRed
            "papayawhip" -> Color.papayaWhip
            "peachpuff" -> Color.peachPuff
            "peru" -> Color.peru
            "pink" -> Color.pink
            "plum" -> Color.plum
            "powderblue" -> Color.powderBlue
            "purple" -> Color.purple
            "webpurple" -> Color.webPurple
            "rebeccapurple" -> Color.rebeccaPurple
            "red" -> Color.red
            "rosybrown" -> Color.rosyBrown
            "royalblue" -> Color.royalBlue
            "saddlebrown" -> Color.saddleBrown
            "salmon" -> Color.salmon
            "sandybrown" -> Color.sandyBrown
            "seagreen" -> Color.seaGreen
            "seashell" -> Color.seashell
            "sienna" -> Color.sienna
            "silver" -> Color.silver
            "skyblue" -> Color.skyBlue
            "slateblue" -> Color.slateBlue
            "slategray" -> Color.slateGray
            "snow" -> Color.snow
            "springgreen" -> Color.springGreen
            "steelblue" -> Color.steelBlue
            "tan" -> Color.tan
            "teal" -> Color.teal
            "thistle" -> Color.thistle
            "tomato" -> Color.tomato
            "turquoise" -> Color.turquoise
            "transparent" -> Color.transparent
            "violet" -> Color.violet
            "wheat" -> Color.wheat
            "white" -> Color.white
            "whitesmoke" -> Color.whiteSmoke
            "yellow" -> Color.yellow
            "yellowgreen" -> Color.yellowGreen
            else -> throw NoSuchElementException("$name is not a valid color name.")
        }.also {
            it.a = alpha.toRealT()
        }
    }

    /** Returns length of Variant var */
    fun len(s: String): Int = s.length

    /** Returns length of Variant var */
    fun len(s: NodePath): Int = len(s.path)

    /** Returns length of Variant var */
    fun <T> len(s: VariantArray<T>): Int = s.size

    /** Returns length of Variant var */
    fun <K, V> len(s: Dictionary<K, V>): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PackedByteArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PackedColorArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PackedInt32Array): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PackedFloat64Array): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PackedStringArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PackedVector2Array): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PackedVector3Array): Int = s.size

    /** Returns an integer representing the Unicode code point of the given Unicode character char. */
    fun ord(char: String): Int {
        return char[0].code
    }
}

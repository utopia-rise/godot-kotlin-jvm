package godot.global

import godot.core.Color
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.PoolByteArray
import godot.core.PoolColorArray
import godot.core.PoolIntArray
import godot.core.PoolRealArray
import godot.core.PoolStringArray
import godot.core.PoolVector2Array
import godot.core.PoolVector3Array
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
            "aliceblue" -> Color.aliceblue
            "aqua" -> Color.aqua
            "aquamarine" -> Color.aquamarine
            "azure" -> Color.azure
            "beige" -> Color.beige
            "bisque" -> Color.bisque
            "black" -> Color.black
            "blanchedalmond" -> Color.blanchedalmond
            "blue" -> Color.blue
            "blueviolet" -> Color.blueviolet
            "brown" -> Color.brown
            "burlywood" -> Color.burlywood
            "cadetblue" -> Color.cadetblue
            "chartreuse" -> Color.chartreuse
            "chocolate" -> Color.chocolate
            "coral" -> Color.coral
            "cornflower" -> Color.cornflower
            "cornsilk" -> Color.cornsilk
            "crimson" -> Color.crimson
            "cyan" -> Color.cyan
            "darkblue" -> Color.darkblue
            "darkcyan" -> Color.darkcyan
            "darkgoldenrod" -> Color.darkgoldenrod
            "darkgray" -> Color.darkgray
            "darkgreen" -> Color.darkgreen
            "darkkhaki" -> Color.darkkhaki
            "darkmagenta" -> Color.darkmagenta
            "darkolivegreen" -> Color.darkolivegreen
            "darkorange" -> Color.darkorange
            "darkorchid" -> Color.darkorchid
            "darkred" -> Color.darkred
            "darksalmon" -> Color.darksalmon
            "darkseagreen" -> Color.darkseagreen
            "darkslateblue" -> Color.darkslateblue
            "darkslategray" -> Color.darkslategray
            "darkturquoise" -> Color.darkturquoise
            "darkviolet" -> Color.darkviolet
            "deeppink" -> Color.deeppink
            "deepskyblue" -> Color.deepskyblue
            "dimgray" -> Color.dimgray
            "dodgerblue" -> Color.dodgerblue
            "firebrick" -> Color.firebrick
            "floralwhite" -> Color.floralwhite
            "forestgreen" -> Color.forestgreen
            "fuchsia" -> Color.fuchsia
            "gainsboro" -> Color.gainsboro
            "ghostwhite" -> Color.ghostwhite
            "gold" -> Color.gold
            "goldenrod" -> Color.goldenrod
            "gray" -> Color.gray
            "webgray" -> Color.webgray
            "green" -> Color.green
            "webgreen" -> Color.webgreen
            "greenyellow" -> Color.greenyellow
            "honeydew" -> Color.honeydew
            "hotpink" -> Color.hotpink
            "indianred" -> Color.indianred
            "indigo" -> Color.indigo
            "ivory" -> Color.ivory
            "khaki" -> Color.khaki
            "lavender" -> Color.lavender
            "lavenderblush" -> Color.lavenderblush
            "lawngreen" -> Color.lawngreen
            "lemonchiffon" -> Color.lemonchiffon
            "lightblue" -> Color.lightblue
            "lightcoral" -> Color.lightcoral
            "lightcyan" -> Color.lightcyan
            "lightgoldenrod" -> Color.lightgoldenrod
            "lightgray" -> Color.lightgray
            "lightgreen" -> Color.lightgreen
            "lightpink" -> Color.lightpink
            "lightsalmon" -> Color.lightsalmon
            "lightseagreen" -> Color.lightseagreen
            "lightskyblue" -> Color.lightskyblue
            "lightslategray" -> Color.lightslategray
            "lightsteelblue" -> Color.lightsteelblue
            "lightyellow" -> Color.lightyellow
            "lime" -> Color.lime
            "limegreen" -> Color.limegreen
            "linen" -> Color.linen
            "magenta" -> Color.magenta
            "maroon" -> Color.maroon
            "webmaroon" -> Color.webmaroon
            "mediumaquamarine" -> Color.mediumaquamarine
            "mediumblue" -> Color.mediumblue
            "mediumorchid" -> Color.mediumorchid
            "mediumpurple" -> Color.mediumpurple
            "mediumseagreen" -> Color.mediumseagreen
            "mediumslateblue" -> Color.mediumslateblue
            "mediumspringgreen" -> Color.mediumspringgreen
            "mediumturquoise" -> Color.mediumturquoise
            "mediumvioletred" -> Color.mediumvioletred
            "midnightblue" -> Color.midnightblue
            "mintcream" -> Color.mintcream
            "mistyrose" -> Color.mistyrose
            "moccasin" -> Color.moccasin
            "navajowhite" -> Color.navajowhite
            "navyblue" -> Color.navyblue
            "oldlace" -> Color.oldlace
            "olive" -> Color.olive
            "olivedrab" -> Color.olivedrab
            "orange" -> Color.orange
            "orangered" -> Color.orangered
            "orchid" -> Color.orchid
            "palegoldenrod" -> Color.palegoldenrod
            "palegreen" -> Color.palegreen
            "paleturquoise" -> Color.paleturquoise
            "palevioletred" -> Color.palevioletred
            "papayawhip" -> Color.papayawhip
            "peachpuff" -> Color.peachpuff
            "peru" -> Color.peru
            "pink" -> Color.pink
            "plum" -> Color.plum
            "powderblue" -> Color.powderblue
            "purple" -> Color.purple
            "webpurple" -> Color.webpurple
            "rebeccapurple" -> Color.rebeccapurple
            "red" -> Color.red
            "rosybrown" -> Color.rosybrown
            "royalblue" -> Color.royalblue
            "saddlebrown" -> Color.saddlebrown
            "salmon" -> Color.salmon
            "sandybrown" -> Color.sandybrown
            "seagreen" -> Color.seagreen
            "seashell" -> Color.seashell
            "sienna" -> Color.sienna
            "silver" -> Color.silver
            "skyblue" -> Color.skyblue
            "slateblue" -> Color.slateblue
            "slategray" -> Color.slategray
            "snow" -> Color.snow
            "springgreen" -> Color.springgreen
            "steelblue" -> Color.steelblue
            "tan" -> Color.tan
            "teal" -> Color.teal
            "thistle" -> Color.thistle
            "tomato" -> Color.tomato
            "turquoise" -> Color.turquoise
            "transparent" -> Color.transparent
            "violet" -> Color.violet
            "wheat" -> Color.wheat
            "white" -> Color.white
            "whitesmoke" -> Color.whitesmoke
            "yellow" -> Color.yellow
            "yellowgreen" -> Color.yellowgreen
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
    fun len(s: PoolByteArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PoolColorArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PoolIntArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PoolRealArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PoolStringArray): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PoolVector2Array): Int = s.size

    /** Returns length of Variant var */
    fun len(s: PoolVector3Array): Int = s.size

    /** Returns an integer representing the Unicode code point of the given Unicode character char. */
    fun ord(char: String): Int {
        return char[0].code
    }
}

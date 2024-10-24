package godot.core

import godot.common.util.isEqualApprox
import godot.common.util.toRealT
import org.junit.Test

class TestColor {

    @Test
    fun `Color Constructor methods`() {
        val blueRgba = Color(0.25098, 0.376471, 1, 0.501961)
        val blueHtml = Color.html("#4060ff80")
        val blueHex = Color.hex(0x4060ff80u)
        val blueHex64 = Color.hex64(0x40406060ffff8080u)

        checkMessage(blueRgba.isEqualApprox(blueHtml)) { "Creation with HTML notation should result in components approximately equal to the default constructor." }
        checkMessage(blueRgba.isEqualApprox(blueHex)) { "Creation with a 32-bit hexadecimal number should result in components approximately equal to the default constructor." }
        checkMessage(blueRgba.isEqualApprox(blueHex64)) { "Creation with a 64-bit hexadecimal number should result in components approximately equal to the default constructor." }

        val htmlInvalid = Color.html("invalid")
        checkMessage(htmlInvalid == Color()) { "Creation with invalid HTML notation should result in a Color with the default values." }

        val greenRgba = Color(0, 1, 0, 0.25)
        val greenHsva = Color.fromHsv(120.0 / 360.0, 1.0, 1.0, 0.25)

        checkMessage(greenRgba.isEqualApprox(greenHsva)) { "Creation with HSV notation should result in components approximately equal to the default constructor." }
    }

    @Test
    fun `Color Operators`() {
        val blue = Color(0.2, 0.2, 1)
        val darkRed = Color(0.3, 0.1, 0.1)

        checkMessage((blue + darkRed).isEqualApprox(Color(0.5, 0.3, 1.1, 2))) { "Color addition should behave as expected." }
        checkMessage((blue - darkRed).isEqualApprox(Color(-0.1, 0.1, 0.9, 0))) { "Color subtraction should behave as expected." }
        checkMessage((blue * 2f).isEqualApprox(Color(0.4, 0.4, 2, 2))) { "Color multiplication with a scalar should behave as expected." }
        checkMessage((blue / 2f).isEqualApprox(Color(0.1, 0.1, 0.5, 0.5))) { "Color division with a scalar should behave as expected." }
        checkMessage((blue * darkRed).isEqualApprox(Color(0.06, 0.02, 0.1))) { "Color multiplication with another Color should behave as expected." }
        checkMessage((blue / darkRed).isEqualApprox(Color(0.666667, 2, 10))) { "Color division with another Color should behave as expected." }
        checkMessage(
            (-blue).isEqualApprox(
                Color(
                    0.8,
                    0.8,
                    0,
                    0
                )
            )
        ) { "Color negation should behave as expected (affecting the alpha channel, unlike `invert()`)." }
    }

    @Test
    fun `Reading methods`() {
        val darkBlue = Color(0.0, 0.0, 0.5, 0.4)
        checkMessage(darkBlue.h.isEqualApprox((240.0f / 360.0f).toRealT())) { "The returned HSV hue should match the expected value." }
        checkMessage(darkBlue.s.isEqualApprox(1.0)) { "The returned HSV saturation should match the expected value." }
        checkMessage(darkBlue.v.isEqualApprox(0.5)) { "The returned HSV value should match the expected value." }
    }

    @Test
    fun `Color Conversion methods`() {
        val cyan = Color(0, 1, 1)
        val cyanTransparent = Color(0, 1, 1, 0)

        checkMessage(cyan.toHtml() == cyan.toHtml()) { "The returned RGB HTML color code should match the expected value." }
        checkMessage(cyanTransparent.toHtml() == cyanTransparent.toHtml()) { "The returned RGBA HTML color code should match the expected value." }
        checkMessage(cyan.toABGR32() == cyan.toABGR32()) { "The returned 32-bit RGB number should match the expected value." }
        checkMessage(cyan.toABGR32() == cyan.toABGR32()) { "The returned 32-bit BGR number should match the expected value." }
        checkMessage(cyan.toABGR32() == cyan.toABGR32()) { "The returned 32-bit BGR number should match the expected value." }
        checkMessage(cyan.toABGR64() == cyan.toABGR64()) { "The returned 64-bit RGB number should match the expected value." }
        checkMessage(cyan.toABGR64() == cyan.toABGR64()) { "The returned 64-bit BGR number should match the expected value." }
        checkMessage(cyan.toABGR64() == cyan.toABGR64()) { "The returned 64-bit BGR number should match the expected value." }
        checkMessage(cyan.toString() == cyan.toString()) { "The string representation should match the expected value." }
    }

    @Test
    fun `Color Linear --- sRGB conversion`() {
        val color = Color(0.35, 0.5, 0.6, 0.7)
        val colorLinear = color.srgbToLinear()
        val colorSrgb = color.linearToSrgb()

        checkMessage(
            colorLinear.isEqualApprox(
                Color(
                    0.100481,
                    0.214041,
                    0.318547,
                    0.7
                )
            )
        ) { "The color converted to linear color space should match the expected value." }
        checkMessage(
            colorSrgb.isEqualApprox(
                Color(
                    0.62621,
                    0.735357,
                    0.797738,
                    0.7
                )
            )
        ) { "The color converted to sRGB color space should match the expected value." }
        checkMessage(
            colorLinear.linearToSrgb().isEqualApprox(Color(0.35, 0.5, 0.6, 0.7))
        ) { "The linear color converted back to sRGB color space should match the expected value." }
        checkMessage(
            colorSrgb.srgbToLinear().isEqualApprox(Color(0.35, 0.5, 0.6, 0.7))
        ) { "The sRGB color converted back to linear color space should match the expected value." }
    }

    @Test
    fun `Color Named colors`() {
        checkMessage(Color.named("red").isEqualApprox(Color.hex(0xFF0000FFu))) { "The named color \"red\" should match the expected value." }
        checkMessage(Color.named("white_smoke").isEqualApprox(Color.hex(0xF5F5F5FFu))) { "The named color \"white_smoke\" should match the expected value." }
        checkMessage(Color.named("Slate Blue").isEqualApprox(Color.hex(0x6A5ACDFFu))) { "The named color \"Slate Blue\" should match the expected value." }
        checkMessage(Color.named("doesn't exist") == Color()) { "The invalid named color \"doesn't exist\" should result in a Color with the default values." }
    }

    @Test
    fun `Color Validation methods`() {
        checkMessage(Color.htmlIsValid("#4080ff")) { "Valid HTML color (with leading #) should be considered valid." }
        checkMessage(Color.htmlIsValid("4080ff")) { "Valid HTML color (without leading #) should be considered valid." }
        checkFalseMessage(Color.htmlIsValid("12345")) { "Invalid HTML color should be considered invalid." }
        checkFalseMessage(Color.htmlIsValid("#fuf")) { "Invalid HTML color should be considered invalid." }
    }

    @Test
    fun `Color Manipulation methods`() {
        val blue = Color(0, 0, 1, 0.4)
        checkMessage(blue.inverted().isEqualApprox(Color(1, 1, 0, 0.4))) { "Inverted color should have its red, green, and blue components inverted." }

        val purple = Color(0.5, 0.2, 0.5, 0.25)
        checkMessage(purple.lightened(0.2).isEqualApprox(Color(0.6, 0.36, 0.6, 0.25))) { "Color should be lightened by the expected amount." }
        checkMessage(purple.darkened(0.2).isEqualApprox(Color(0.4, 0.16, 0.4, 0.25))) { "Color should be darkened by the expected amount." }

        val red = Color(1, 0, 0, 0.2)
        val yellow = Color(1, 1, 0, 0.8)
        checkMessage(red.lerp(yellow, 0.5).isEqualApprox(Color(1, 0.5, 0, 0.5))) { "Red interpolated with yellow should be orange (with interpolated alpha)." }
    }
}

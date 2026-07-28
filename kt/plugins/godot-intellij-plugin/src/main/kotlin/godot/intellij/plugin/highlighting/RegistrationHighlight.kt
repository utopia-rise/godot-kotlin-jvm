package godot.intellij.plugin.highlighting

import com.intellij.openapi.editor.markup.TextAttributes
import com.intellij.ui.JBColor
import java.awt.Color
import java.awt.Font

private fun registrationAttributes(light: Color, dark: Color): TextAttributes =
    TextAttributes(null, JBColor(light, dark), null, null, Font.PLAIN)

enum class RegistrationHighlight(
    val textAttributes: TextAttributes
) {
    INELIGIBLE(
        registrationAttributes(
            light = Color(245, 234, 223),
            dark = Color(58, 45, 35)
        )
    ),
    CANDIDATE(
        registrationAttributes(
            light = Color(228, 236, 245),
            dark = Color(36, 46, 60)
        )
    ),
    REGISTERED(
        registrationAttributes(
            light = Color(228, 240, 231),
            dark = Color(36, 51, 42)
        )
    )
}

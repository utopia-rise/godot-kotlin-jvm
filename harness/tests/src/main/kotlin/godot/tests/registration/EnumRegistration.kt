package godot.tests.registration

import godot.annotation.Export
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.api.Node
import godot.api.Tween
import godot.core.Error
import godot.tests.TestEnum

// GH-835
@GodotScript
class EnumRegistration: Node() {
    // do not test enums with ordinal 0 here! On the GDScript side, failed returns are returned as NULL which will equal ordinal 0 and thus tests might pass even if they should not

    @Export
    @Visible
    var enumValue = TestEnum.ENUM_2

    @Export
    @Visible
    var godotErrorEnumValue = Error.BUG

    @Export
    @Visible
    var godotEnumValue = Tween.EaseType.IN_OUT

    @Register
    fun provideEnumValue() = enumValue

    @Register
    fun provideGodotErrorEnumValue() = godotErrorEnumValue

    @Register
    fun provideGodotEnumValue() = godotEnumValue
}
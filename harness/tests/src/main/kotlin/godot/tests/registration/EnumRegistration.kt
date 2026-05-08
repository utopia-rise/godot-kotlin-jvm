package godot.tests.registration

import godot.annotation.Export
import godot.annotation.script
import godot.annotation.Register
import godot.api.Node
import godot.api.Tween
import godot.core.Error
import godot.tests.TestEnum

// GH-835
@script
class EnumRegistration: Node() {
    // do not test enums with ordinal 0 here! On the GDScript side, failed returns are returned as NULL which will equal ordinal 0 and thus tests might pass even if they should not

    @Export
    var enumValue = TestEnum.ENUM_2

    @Export
    var godotErrorEnumValue = Error.BUG

    @Export
    var godotEnumValue = Tween.EaseType.IN_OUT

    @Register
    fun provideEnumValue() = enumValue

    @Register
    fun provideGodotErrorEnumValue() = godotErrorEnumValue

    @Register
    fun provideGodotEnumValue() = godotEnumValue
}

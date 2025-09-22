package godot.tests.registration

import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.api.Node
import godot.api.Tween
import godot.core.Error
import godot.tests.TestEnum

// GH-835
@RegisterClass
class EnumRegistration: Node() {
    // do not test enums with ordinal 0 here! On the GDScript side, failed returns are returned as NULL which will equal ordinal 0 and thus tests might pass even if they should not

    @Export
    @RegisterProperty
    var enumValue = TestEnum.ENUM_2

    @Export
    @RegisterProperty
    var godotErrorEnumValue = Error.BUG

    @Export
    @RegisterProperty
    var godotEnumValue = Tween.EaseType.IN_OUT

    @RegisterFunction
    fun provideEnumValue() = enumValue

    @RegisterFunction
    fun provideGodotErrorEnumValue() = godotErrorEnumValue

    @RegisterFunction
    fun provideGodotEnumValue() = godotEnumValue
}

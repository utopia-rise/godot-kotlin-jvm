extends "res://addons/gut/test.gd"


func test_custom_enum_property():
    var script: EnumRegistration = EnumRegistration.new()
    assert_eq(script.enum_value, 1, "Should return enum with ordinal 1")
    script.free()


func test_godot_error_enum_property():
    var script: EnumRegistration = EnumRegistration.new()
    assert_eq(script.godot_error_enum_value, ERR_BUG, "Should return GodotError enum ERR_BUG")
    script.free()


func test_godot_enum_property():
    var script: EnumRegistration = EnumRegistration.new()
    assert_eq(script.godot_enum_value, Tween.EaseType.EASE_IN_OUT, "Should return Tween.EaseType.EASE_IN_OUT")
    script.free()


func test_custom_enum_function_return():
    var script: EnumRegistration = EnumRegistration.new()
    assert_eq(script.provide_enum_value(), 1, "Should return enum with ordinal 1")
    script.free()


func test_godot_error_enum_function_return():
    var script: EnumRegistration = EnumRegistration.new()
    assert_eq(script.provide_godot_error_enum_value(), ERR_BUG, "Should return GodotError enum ERR_BUG")
    script.free()


func test_godot_enum_function_return():
    var script: EnumRegistration = EnumRegistration.new()
    assert_eq(script.provide_godot_enum_value(), Tween.EaseType.EASE_IN_OUT, "Should return Tween.EaseType.EASE_IN_OUT")
    script.free()

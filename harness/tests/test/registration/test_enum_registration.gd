extends GdUnitTestSuite

func test_custom_enum_property():
	var script := EnumRegistration.new()
	assert_that(script.enum_value).override_failure_message("Should return enum with ordinal 1").is_equal(1)
	script.free()


func test_godot_error_enum_property():
	var script := EnumRegistration.new()
	assert_that(script.godot_error_enum_value).override_failure_message("Should return GodotError enum ERR_BUG").is_equal(ERR_BUG)
	script.free()


func test_godot_enum_property():
	var script := EnumRegistration.new()
	assert_that(script.godot_enum_value).override_failure_message("Should return Tween.EaseType.EASE_IN_OUT").is_equal(Tween.EaseType.EASE_IN_OUT)
	script.free()


func test_custom_enum_function_return():
	var script := EnumRegistration.new()
	assert_that(script.provide_enum_value()).override_failure_message("Should return enum with ordinal 1").is_equal(1)
	script.free()


func test_godot_error_enum_function_return():
	var script := EnumRegistration.new()
	assert_that(script.provide_godot_error_enum_value()).override_failure_message("Should return GodotError enum ERR_BUG").is_equal(ERR_BUG)
	script.free()


func test_godot_enum_function_return():
	var script := EnumRegistration.new()
	assert_that(script.provide_godot_enum_value()).override_failure_message("Should return Tween.EaseType.EASE_IN_OUT").is_equal(Tween.EaseType.EASE_IN_OUT)
	script.free()

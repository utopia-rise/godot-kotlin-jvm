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


func test_custom_enum_round_trip_and_history():
	var script := EnumRegistration.new()
	script.store_enum_by_ordinal(0)
	assert_that(script.enum_value).override_failure_message("Enum properties should round-trip when updated from GDScript through a Kotlin helper").is_equal(0)

	script.append_enum_to_history(0)
	assert_that(script.enum_history.size()).override_failure_message("Enum-backed arrays should remain appendable from bridge-facing helpers").is_equal(3)
	assert_that(script.enum_history[2]).override_failure_message("Appended enum entry should preserve its ordinal value").is_equal(0)
	script.free()


func test_invalid_enum_ordinal_handling():
	var script := EnumRegistration.new()
	assert_bool(script.invalid_enum_ordinal_handled(99)).override_failure_message("Invalid enum ordinals should be handled predictably instead of silently mapping to a wrong enum").is_true()
	assert_that(script.bit_flag_value).override_failure_message("Bit flag style enum values should stay readable from GDScript").is_equal(0b011)
	script.free()

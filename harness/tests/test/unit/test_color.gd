extends "res://addons/gut/test.gd"


func test_color_set() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.color, Color(), "Color should be default color")
	var col = Color(10, 20, 30, 70)
	invocation_script.color = col
	assert_eq(invocation_script.color, col, "Color should be Color(10, 20, 30, 70)")
	assert_eq(invocation_script.color.r, 10.0, "Color R should be 10")
	assert_eq(invocation_script.color.g, 20.0, "Color G should be 20")
	assert_eq(invocation_script.color.b, 30.0, "Color B should be 30")
	assert_eq(invocation_script.color.a, 70.0, "Color A should be 70")
	invocation_script.free()

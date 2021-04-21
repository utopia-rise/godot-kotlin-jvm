extends "res://addons/gut/test.gd"

var short_str: String = "Short String"
var long_str: String = """"""

func test_short_string() -> void:
	var script = godot_tests_coretypes_StringTest.new()
	assert_eq(short_str, script.get_short_string(), "String on JVM side should be same as gdscript one.")
	assert_eq(short_str, script.identity(short_str), "String on JVM side should be same as gdscript one.")


func test_long_string() -> void:
	var script = godot_tests_coretypes_StringTest.new()
	assert_eq(long_str, script.get_long_string(), "String on JVM side should be same as gdscript one.")
	assert_eq(long_str, script.identity(long_str), "String on JVM side should be same as gdscript one.")

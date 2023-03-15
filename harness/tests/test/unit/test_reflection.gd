extends "res://addons/gut/test.gd"


func test_reflection_working() -> void:
	var reflection_test_script = load("res://src/main/kotlin/godot/tests/reflection/BaseReflectionTest.kt").new()
	assert_true(reflection_test_script.has_register_class_annotation(), "Should return true without throwing an exception")
	reflection_test_script.free()

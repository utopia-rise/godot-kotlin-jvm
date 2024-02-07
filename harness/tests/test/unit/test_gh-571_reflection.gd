extends "res://addons/gut/test.gd"


func test_regression_test_gh_571() -> void:
	var reflection_test_script = load("res://scripts/godot/tests/reflection/GH571_ReflectionTest.gdj").new()
	assert_eq(reflection_test_script.deserialize_json(), "data_deserialized_through_reflection", "Deserialized data did not match expected data")
	reflection_test_script.free()

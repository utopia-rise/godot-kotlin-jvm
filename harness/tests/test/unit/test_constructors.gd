extends "res://addons/gut/test.gd"


func test_script_without_zero_arg_constructor_is_not_instantiable_from_godot() -> void:
	var script := load("res://scripts/godot/tests/constructor/ConstructorRegistrationTest.gdj") as Script
	assert_not_null(script)
	assert_false(script.can_instantiate(), "Godot should not instantiate registered scripts without a zero-arg constructor")

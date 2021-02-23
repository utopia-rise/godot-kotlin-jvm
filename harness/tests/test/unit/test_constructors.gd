extends "res://addons/gut/test.gd"


func test_should_call_default_constructor() -> void:
	var test_instance = godot_tests_MultiArgsConstructorTest.new()
	assert_true(test_instance.default_constructor_has_been_called, "Default constructor should have been called")
	test_instance.free()

func test_should_call_one_arg_constructor() -> void:
	var test_instance = load("res://src/main/kotlin/godot/tests/MultiArgsConstructorTest.kt").new(42)
	assert_true(test_instance.one_arg_constructor_has_been_called, "One arg constructor should have been called")
	test_instance.free()

func test_should_call_three_args_constructor() -> void:
	var test_instance = load("res://src/main/kotlin/godot/tests/MultiArgsConstructorTest.kt").new(42, "hello")
	assert_true(test_instance.three_args_constructor_has_been_called, "Three args constructor should have been called")
	test_instance.free()

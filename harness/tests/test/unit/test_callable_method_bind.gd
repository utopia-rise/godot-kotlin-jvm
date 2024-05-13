extends "res://addons/gut/test.gd"


func test_method_bind_passing_correct_binds_with_no_args_provided() -> void:
	var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
	binds_test_script.call_with_method_with_all_binds()
	assert_eq(
		binds_test_script.method_binds[0],
		1,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[1],
		2,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[2],
		3,
		"Incorrect bind value passed"
	)
	binds_test_script.free()

func test_method_bind_passing_correct_binds_with_one_args_provided() -> void:
	var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
	binds_test_script.call_with_method_with_two_binds()
	assert_eq(
		binds_test_script.method_binds[0],
		0,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[1],
		2,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[2],
		3,
		"Incorrect bind value passed"
	)
	binds_test_script.free()

func test_method_bind_passing_correct_binds_with_two_args_provided() -> void:
	var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
	binds_test_script.call_with_method_with_one_bind()
	assert_eq(
		binds_test_script.method_binds[0],
		0,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[1],
		0,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[2],
		3,
		"Incorrect bind value passed"
	)
	binds_test_script.free()

func test_method_bind_passing_correct_binds_with_three_args_provided() -> void:
	var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
	binds_test_script.call_with_method_with_no_bind()
	assert_eq(
		binds_test_script.method_binds[0],
		0,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[1],
		0,
		"Incorrect bind value passed"
	)
	assert_eq(
		binds_test_script.method_binds[2],
		0,
		"Incorrect bind value passed"
	)
	binds_test_script.free()

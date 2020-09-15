extends "res://addons/gut/test.gd"


func test_script_is_attached() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.get_script().get_path(), "res://src/main/kotlin/godot/tests/Invocation.kt", "Scene script path should be res://src/main/kotlin/godot/tests/Invocation.kt")
	invocation_scene.free()

func test_godot_to_jvm_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.int_addition(2, 7), 9, "call to addition jvm method should return 2 + 7")
	invocation_script.free()

func test_get_int_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.x, 0, "Call to get should return value of jvm variable")
	invocation_script.free()

func test_set_int_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	invocation_script.x = 1
	assert_eq(invocation_script.x, 1, "Should have set value of jvm variable")
	invocation_script.free()

func test_get_double_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.y, 0.0, "Call to get should return value of jvm variable")
	invocation_script.free()

func test_set_double_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	invocation_script.y = 1.0
	assert_eq(invocation_script.y, 1.0, "Call to get should return value of jvm variable")
	invocation_script.free()

func test_get_float_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.z, 0.0, "Call to get should return value of jvm variable")
	invocation_script.free()

func test_set_float_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	invocation_script.z = 1.0
	assert_eq(invocation_script.z, 1.0, "Call to get should return value of jvm variable")
	invocation_script.free()

func test_get_string_call() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.custom_name, "Idonthaveanyidea", "Call to get should return value of jvm variable")
	invocation_script.free()

func test_int_value() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.int_value(2), 2, "int value cast should return exactly same value")
	invocation_script.free()

func test_long_value() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.long_value(2), 2, "long value cast should return exactly same value")
	invocation_script.free()

func test_float_value() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.float_value(2.0), 2.0, "float value cast should return exactly same value")
	invocation_script.free()

func test_double_value() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.double_value(2.0), 2.0, "double value cast should return exactly same value")
	invocation_script.free()

func test_boolean_value() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.boolean_value(true), true, "boolean value cast should return exactly same value")
	invocation_script.free()

func test_string_value() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.string_value("hello"), "hello", "string value cast should return exactly same value")
	invocation_script.free()

func test_call_to_godot() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	invocation_script.name = "Hellooo"
	assert_eq(invocation_script.name, "Hellooo", "Node::set_name should have been called.")
	invocation_script.free()

extends "res://addons/gut/test.gd"


func test_godot_to_jvm_call_using_scene() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.int_addition(2, 7), 9, "call to addition jvm method should return 2 + 7")
	invocation_scene.free()

func test_godot_to_jvm_call_using_new() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.int_addition(2, 7), 9, "call to addition jvm method should return 2 + 7")
	invocation_script.free()

func test_get_int_call_using_scene() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.x, 0, "Call to get should return value of jvm variable")
	invocation_scene.free()

func test_get_int_call_using_new() -> void:
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
	assert_eq(invocation_script.name, "Idonthaveanyidea", "Call to get should return value of jvm variable")
	invocation_script.free()

func test_int_value() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.int_value(2), 2, "int value cast should return exactly same value")
	invocation_scene.free()

func test_long_value() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.long_value(2), 2, "long value cast should return exactly same value")
	invocation_scene.free()

func test_float_value() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.float_value(2.0), 2.0, "float value cast should return exactly same value")
	invocation_scene.free()

func test_double_value() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.double_value(2.0), 2.0, "double value cast should return exactly same value")
	invocation_scene.free()

func test_boolean_value() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.boolean_value(true), true, "boolean value cast should return exactly same value")
	invocation_scene.free()

func test_string_value() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.string_value("hello"), "hello", "string value cast should return exactly same value")
	invocation_scene.free()

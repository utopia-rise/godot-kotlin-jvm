extends "res://addons/gut/test.gd"


func test_godot_to_jvm_call_using_scene() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.intAddition(2, 7), 9, "call to addition jvm method should return 2 + 7")
	invocation_scene.free()

func test_should_not_call_method_with_too_much_parameter() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_ne(invocation_scene.intAddition(2, 7, 1), 9, "Method should not be called with too much parameter")
	invocation_scene.free()

func test_int_value() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.intValue(2, 3), 2, "call to addition jvm method should return 2 + 7")
	invocation_scene.free()

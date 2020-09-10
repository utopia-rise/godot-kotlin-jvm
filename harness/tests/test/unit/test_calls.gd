extends "res://addons/gut/test.gd"


func test_godot_to_jvm_call_using_scene() -> void:
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_eq(invocation_scene.intAddition(2, 7), 9, "call to addition jvm method should return 2 + 7")
	invocation_scene.free()

extends "res://addons/gut/test.gd"

var invocation_scene = load("res://Spatial.tscn").instance()

func before_each():
	invocation_scene = load("res://Spatial.tscn").instance()

func after_each():
	print("free invocation")
	invocation_scene.free()

func test_godot_to_jvm_call_using_scene() -> void:
	assert_eq(invocation_scene.intAddition(2, 7), 9, "call to addition jvm method should return 2 + 7")

extends "res://addons/gut/test.gd"


func test_singleton_same_instance() -> void:
	var invocation = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_true(invocation.is_sent_arvr_same_instance_as_jvm_singleton(ARVRServer), "Should be same instance")
	invocation.free()

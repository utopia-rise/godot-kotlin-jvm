extends "res://addons/gut/test.gd"


func test_singleton_same_instance() -> void:
	var invocation = load("res://scripts/godot/tests/Invocation.gdj").new()
	assert_true(invocation.is_sent_xr_same_instance_as_jvm_singleton(XRServer), "Should be same instance")
	invocation.free()

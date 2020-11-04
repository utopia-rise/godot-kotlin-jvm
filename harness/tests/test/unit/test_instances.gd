extends "res://addons/gut/test.gd"


func test_parameter_still_same_instance() -> void:
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.other_jvm_id(invocation_script), invocation_script.jvm_id, "Jvm instance passed by parameter should be same instance in method call.")
	invocation_script.free()

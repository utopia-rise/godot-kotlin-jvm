extends "res://addons/gut/test.gd"


func test_parameter_still_same_instance() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.other_jvm_id(invocation_script), invocation_script.jvm_id, "Jvm instance passed by parameter should be same instance in method call.")
	invocation_script.free()

func test_script_is_attached_when_scene() -> void:
	var invocation_script = load("res://Spatial.tscn").instantiate()
	assert_eq(invocation_script.get_script(), godot_tests_Invocation, "Script should be set when creating scene.")
	invocation_script.free()

func test_script_is_attached_when_script() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.get_script(), godot_tests_Invocation, "Script should be set when creating script instance.")
	invocation_script.free()

func test_script_is_attached_when_instance_created_on_jvm_side() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.invocation.get_script(), godot_tests_subpackage_OtherScript, "Script should be set when creating instance from JVM")
	invocation_script.free()

extends "res://addons/gut/test.gd"


func test_default_rid_is_null():
	var invocation_script = load("res://scripts/godot/tests/Invocation.gdj").new()
	assert_eq(invocation_script.get_rid_id(), 0, "Default RID's id should be invalid")
	invocation_script.free()

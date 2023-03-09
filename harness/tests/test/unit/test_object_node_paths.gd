extends "res://addons/gut/test.gd"

func test_object_node_path_instantiation():
	var invocation_script = load("res://Spatial.tscn").instantiate()
	assert_not_null(invocation_script.button, "button should have been assigned in the inspector")
	assert_is(invocation_script.button, Button, "button is not of type Button")
	invocation_script.free()

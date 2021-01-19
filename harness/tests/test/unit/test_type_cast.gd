extends "res://addons/gut/test.gd"


func test_return_result_has_expected_type():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)
	assert_true(invocation_script.parent_is_spatial(), "Node::getParent method should create expected type.")
	spatial.free()
	var node = Node.new()
	invocation_script = godot_tests_Invocation.new()
	node.add_child(invocation_script)
	assert_false(invocation_script.parent_is_spatial(), "Node::getParent method should create expected type.")
	node.free()

func test_method_param_has_expected_type():
	var spatial = Spatial.new()
	var node = Node.new()
	var invocation_script = godot_tests_Invocation.new()
	assert_true(invocation_script.is_object_spatial(spatial), "Object parameter should be a Spatial.")
	assert_false(invocation_script.is_object_spatial(node), "Object parameter of type Node should not be a Spatial.")
	invocation_script.free()
	node.free()
	spatial.free()

extends "res://addons/gut/test.gd"


func test_return_result_has_expected_type():
	var node3d = Node3D.new()
	var invocation_script = Invocation.new()
	node3d.add_child(invocation_script)
	assert_true(invocation_script.parent_is_node3_d(), "Node::getParent method should create expected type.")
	node3d.free()
	var node = Node.new()
	invocation_script = Invocation.new()
	node.add_child(invocation_script)
	assert_false(invocation_script.parent_is_node3_d(), "Node::getParent method should create expected type.")
	node.free()

func test_method_param_has_expected_type():
	var node3d = Node3D.new()
	var node = Node.new()
	var invocation_script = Invocation.new()
	assert_true(invocation_script.is_object_node3_d(node3d), "Object parameter should be a Node3D.")
	assert_false(invocation_script.is_object_node3_d(node), "Object parameter of type Node should not be a Node3D.")
	invocation_script.free()
	node.free()
	node3d.free()

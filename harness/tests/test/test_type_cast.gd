extends GdUnitTestSuite


func test_return_result_has_expected_type():
    var node3d = Node3D.new()
    var invocation_script = Invocation.new()
    node3d.add_child(invocation_script)
    assert_bool(invocation_script.parent_is_node3_d()).override_failure_message("Node::getParent method should create expected type.").is_true()
    node3d.free()
    var node = Node.new()
    invocation_script = Invocation.new()
    node.add_child(invocation_script)
    assert_bool(invocation_script.parent_is_node3_d()).override_failure_message("Node::getParent method should create expected type.").is_false()
    node.free()

func test_method_param_has_expected_type():
    var node3d = Node3D.new()
    var node = Node.new()
    var invocation_script = Invocation.new()
    assert_bool(invocation_script.is_object_node3_d(node3d)).override_failure_message("Object parameter should be a Node3D.").is_true()
    assert_bool(invocation_script.is_object_node3_d(node)).override_failure_message("Object parameter of type Node should not be a Node3D.").is_false()
    invocation_script.free()
    node.free()
    node3d.free()

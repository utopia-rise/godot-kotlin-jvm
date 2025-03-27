extends GdUnitTestSuite

func test_object_node_path_instantiation():
    var invocation_script = load("res://Spatial.tscn").instantiate()
    assert_object(invocation_script.button).override_failure_message("button should have been assigned in the inspector").is_not_null()
    assert_object(invocation_script.button).override_failure_message("button is not of type Button").is_instanceof(Button)
    invocation_script.free()

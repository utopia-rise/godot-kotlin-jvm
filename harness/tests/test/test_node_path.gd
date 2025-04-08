extends GdUnitTestSuite


func test_should_find_camera_node():
    var invocation_scene = load("res://Spatial.tscn").instantiate()
    assert_bool(invocation_scene.has_camera_node()).override_failure_message("Should find Camera Node using node path").is_true()
    invocation_scene.free()

func test_should_not_find_camera_node():
    var invocation_script = Invocation.new()
    assert_bool(invocation_script.has_camera_node()).override_failure_message("Should not find camera node using node path").is_false()
    invocation_script.free()

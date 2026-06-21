extends GdUnitTestSuite

func test_godot_static_delegate():
    var test_instance := GodotStaticDelegateTest.new()

    assert_that(test_instance.loaded_scene).override_failure_message("Loaded scene should not be null").is_not_null()
    assert_that(test_instance.static_node).override_failure_message("Static node should not be null").is_not_null()

    test_instance.static_node.free()
    test_instance.free()

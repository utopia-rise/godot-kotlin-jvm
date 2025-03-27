extends GdUnitTestSuite


func test_reflection_working() -> void:
    var reflection_test_script = load("res://scripts/godot/tests/reflection/BaseReflectionTest.gdj").new()
    assert_bool(reflection_test_script.has_register_class_annotation()).override_failure_message("Should return true without throwing an exception").is_true()
    reflection_test_script.free()

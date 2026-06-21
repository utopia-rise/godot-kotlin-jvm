extends GdUnitTestSuite


func test_reflection_working() -> void:
    var reflection_script = load("res://scripts/godot/tests/runtime/BaseReflectionTest.gdj")
    var reflection_test_script = reflection_script.new()
    assert_bool(reflection_test_script.has_godot_script_annotation()).override_failure_message("Should return true without throwing an exception").is_true()
    reflection_test_script.free()
    reflection_test_script = null
    reflection_script = null

extends GdUnitTestSuite


func test_singleton_same_instance() -> void:
    var invocation = load("res://scripts/godot/tests/Invocation.gdj").new()
    assert_bool(invocation.is_sent_xr_same_instance_as_jvm_singleton(XRServer)).override_failure_message("Should be same instance").is_true()
    invocation.free()

extends GdUnitTestSuite


func test_should_call_default_constructor() -> void:
    var test_instance = MultiArgsConstructorTest.new()
    assert_bool(test_instance.default_constructor_has_been_called).override_failure_message("Default constructor should have been called").is_true()
    test_instance.free()

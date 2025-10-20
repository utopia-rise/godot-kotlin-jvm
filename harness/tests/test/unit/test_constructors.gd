extends "res://addons/gut/test.gd"


func test_should_call_default_constructor() -> void:
    var test_instance = ConstructorRegistrationTest.new()
    assert_true(test_instance.default_constructor_has_been_called, "Default constructor should have been called")
    test_instance.free()

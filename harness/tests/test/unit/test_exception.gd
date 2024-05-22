extends "res://addons/gut/test.gd"


func test_exception_printing_in_editor() -> void:
	var exception_test_script = load("res://scripts/godot/tests/exception/ExceptionTest.gdj").new()
	exception_test_script.throw_exception()
	assert_true(true) # fake assert; exception printed to console and godot editor
	exception_test_script.free()

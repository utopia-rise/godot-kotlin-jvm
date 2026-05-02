extends "res://addons/gut/test.gd"


func test_call_function_in_godot_kotlin_jvm_dependency():
	var library_test = Simple.new()
	assert_eq(library_test.test_property, "Hello from third-party-library!", "Greeting from third-party-library does not match")
	library_test.free()

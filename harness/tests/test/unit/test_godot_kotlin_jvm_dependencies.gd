extends "res://addons/gut/test.gd"


func test_call_function_in_godot_jvm_dependency():
	var library_test_scene = load("res://library_test.tscn").instantiate()
	assert_eq(library_test_scene.provide_greeting_for_hierarchical_library(), "Hello from hierarchical-library-test!", "Greeting from hierarchical library does not match")
	assert_eq(library_test_scene.provide_greeting_for_flattened_library(), "Hello from flattened-library-test!", "Greeting from flattened library does not match")
	assert_eq(library_test_scene.provide_greeting_for_fqname_library(), "Hello from fqname-library-test!", "Greeting from fqname library does not match")
	library_test_scene.free()

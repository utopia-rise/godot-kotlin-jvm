extends GdUnitTestSuite


func test_call_function_in_godot_kotlin_jvm_dependency():
	var library_test_script = load("res://scripts/third-party-library/godot/tests/library/Simple.gdj")
	var library_test = library_test_script.new()

	assert_that(library_test.provide_greeting_for_hierarchical_library()).override_failure_message("Greeting from hierarchical library does not match").is_equal("Hello from hierarchical-library-test!")
	assert_that(library_test.provide_greeting_for_flattened_library()).override_failure_message("Greeting from flattened library does not match").is_equal("Hello from flattened-library-test!")
	assert_that(library_test.provide_greeting_for_fqname_library()).override_failure_message("Greeting from fqname library does not match").is_equal("Hello from fqname-library-test!")

	library_test.free()

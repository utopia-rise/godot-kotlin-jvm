extends GdUnitTestSuite


func test_call_function_in_godot_kotlin_jvm_dependency():
    var library_test_scene = load("res://library_test.tscn").instantiate()
    assert_that(library_test_scene.provide_greeting_for_hierarchical_library()).override_failure_message("Greeting from hierarchical library does not match").is_equal("Hello from hierarchical-library-test!")
    assert_that(library_test_scene.provide_greeting_for_flattened_library()).override_failure_message("Greeting from flattened library does not match").is_equal("Hello from flattened-library-test!")
    assert_that(library_test_scene.provide_greeting_for_fqname_library()).override_failure_message("Greeting from fqname library does not match").is_equal("Hello from fqname-library-test!")
    library_test_scene.free()

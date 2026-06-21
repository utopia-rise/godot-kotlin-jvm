extends GdUnitTestSuite


func test_regression_test_gh_571() -> void:
    var reflection_test_script = load("res://scripts/godot/tests/runtime/GH571_ReflectionTest.gdj").new()
    assert_that(reflection_test_script.deserialize_json()).override_failure_message("Deserialized data did not match expected data").is_equal("data_deserialized_through_reflection")
    assert_that(reflection_test_script.read_embedded_resource()).override_failure_message("Packaged Kotlin/JVM resources should stay visible in both source-project and exported test runs").is_equal("resource-loaded-through-classloader")
    reflection_test_script.free()

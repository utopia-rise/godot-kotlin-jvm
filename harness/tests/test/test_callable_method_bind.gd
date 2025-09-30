extends GdUnitTestSuite


func test_method_bind_passing_correct_binds_with_no_args_provided() -> void:
    var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
    binds_test_script.call_with_method_with_all_binds()
    assert_that(binds_test_script.method_binds[0]).override_failure_message("Incorrect bind value passed").is_equal(1)
    assert_that(binds_test_script.method_binds[1]).override_failure_message("Incorrect bind value passed").is_equal(2)
    assert_that(binds_test_script.method_binds[2]).override_failure_message("Incorrect bind value passed").is_equal(3)
    binds_test_script.free()

func test_method_bind_passing_correct_binds_with_one_args_provided() -> void:
    var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
    binds_test_script.call_with_method_with_two_binds()
    assert_that(binds_test_script.method_binds[0]).override_failure_message("Incorrect bind value passed").is_equal(0)
    assert_that(binds_test_script.method_binds[1]).override_failure_message("Incorrect bind value passed").is_equal(2)
    assert_that(binds_test_script.method_binds[2]).override_failure_message("Incorrect bind value passed").is_equal(3)
    binds_test_script.free()

func test_method_bind_passing_correct_binds_with_two_args_provided() -> void:
    var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
    binds_test_script.call_with_method_with_one_bind()
    assert_that(binds_test_script.method_binds[0]).override_failure_message("Incorrect bind value passed").is_equal(0)
    assert_that(binds_test_script.method_binds[1]).override_failure_message("Incorrect bind value passed").is_equal(0)
    assert_that(binds_test_script.method_binds[2]).override_failure_message("Incorrect bind value passed").is_equal(3)
    binds_test_script.free()

func test_method_bind_passing_correct_binds_with_three_args_provided() -> void:
    var binds_test_script = load("res://scripts/godot/tests/callable/CallableMethodBindTest.gdj").new()
    binds_test_script.call_with_method_with_no_bind()
    assert_that(binds_test_script.method_binds[0]).override_failure_message("Incorrect bind value passed").is_equal(0)
    assert_that(binds_test_script.method_binds[1]).override_failure_message("Incorrect bind value passed").is_equal(0)
    assert_that(binds_test_script.method_binds[2]).override_failure_message("Incorrect bind value passed").is_equal(0)
    binds_test_script.free()

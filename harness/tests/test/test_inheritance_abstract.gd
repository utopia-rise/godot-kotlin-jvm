extends GdUnitTestSuite


func test_call_parent_closed_method_from_child() -> void:
    var child_script = AbstractClassInheritanceChild.new()
    child_script.closed_function()
    assert_bool(child_script.closed_function_has_been_called).is_true()
    child_script.free()

func test_call_parent_open_method_from_child() -> void:
    var child_script = AbstractClassInheritanceChild.new()
    child_script.open_function()
    assert_bool(child_script.child_open_function_has_been_called).is_true()
    child_script.free()

func test_call_parent_closed_var_from_child() -> void:
    var child_script = AbstractClassInheritanceChild.new()
    assert_that(child_script.closed_var).override_failure_message("Parent's closed var should be 0").is_equal(0)
    child_script.closed_var = 1
    assert_that(child_script.closed_var).override_failure_message("Parent's closed var should be set to 1").is_equal(1)
    child_script.free()

func test_call_parent_open_var_from_child() -> void:
    var child_script = AbstractClassInheritanceChild.new()
    assert_that(child_script.open_var).override_failure_message("Open var inherited from parent should be to 100 by default.").is_equal(100)
    child_script.open_var = 101
    assert_that(child_script.open_var).override_failure_message("Open var inherited from parent should now be 101").is_equal(101)
    child_script.free()

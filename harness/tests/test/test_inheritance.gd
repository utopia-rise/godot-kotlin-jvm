extends GdUnitTestSuite


func test_call_parent_closed_method_from_child() -> void:
    var child_script = ClassInheritanceChild.new()
    child_script.closed_function()
    assert_bool(child_script.closed_function_has_been_called)
    child_script.free()

func test_call_parent_open_method_from_parent() -> void:
    var parent_script = ClassInheritanceParent.new()
    parent_script.open_function()
    assert_bool(parent_script.parent_open_function_has_been_called).is_true()
    parent_script.free()

func test_call_parent_open_method_from_child() -> void:
    var child_script = ClassInheritanceChild.new()
    child_script.open_function()
    assert_bool(child_script.parent_open_function_has_been_called)
    assert_bool(child_script.child_open_function_has_been_called).is_true()
    child_script.free()

func test_call_parent_closed_var_from_child() -> void:
    var child_script = ClassInheritanceChild.new()
    assert_that(child_script.closed_var).override_failure_message("Parent's closed var should be 0").is_equal(0)
    child_script.closed_var = 1
    assert_that(child_script.closed_var).override_failure_message("Parent's closed var should be set to 1").is_equal(1)
    child_script.free()

func test_call_parent_open_var_from_parent() -> void:
    var parent_script = ClassInheritanceParent.new()
    assert_that(parent_script.open_var).override_failure_message("Parent's open var should be 0").is_equal(0)
    parent_script.open_var = 1
    assert_that(parent_script.open_var).override_failure_message("Parent's open var should be 1").is_equal(1)
    parent_script.free()

func test_call_parent_open_var_from_child() -> void:
    var child_script = ClassInheritanceChild.new()
    assert_that(child_script.open_var).override_failure_message("Open var inherited from parent should be to 100 by default.").is_equal(100)
    child_script.open_var = 101
    assert_that(child_script.open_var).override_failure_message("Open var inherited from parent should now be 101").is_equal(101)
    child_script.free()

func test_call_notification_without_inheritance() -> void:
    var parent_script = ClassInheritanceParent.new()
    parent_script.notification(0)
    assert_that(parent_script.notification_call_bit_flag).is_equal(1)
    parent_script.notification_call_bit_flag = 0
    parent_script.notification(0, true)
    assert_that(parent_script.notification_call_bit_flag).is_equal(1)
    parent_script.free()

func test_call_notification_with_inheritance() -> void:
    var child_script = ClassInheritanceChild.new()
    child_script.notification(0)
    assert_that(child_script.notification_call_bit_flag).is_equal(4)
    child_script.notification_call_bit_flag = 0
    child_script.notification(0, true)
    assert_that(child_script.notification_call_bit_flag).is_equal(3)
    child_script.free()
    
func test_script_is_child_of() -> void:
    var child = ClassInheritanceChild.new()
    var child_script: Script = child.get_script()
    var parent = ClassInheritanceParent.new()
    var parent_script: Script = parent.get_script()
    assert_that(child_script.get_base_script()).is_equal(parent_script)
    child.free()
    parent.free()
    
    child = godot_tests_library_fqname_FQNLSimpleChild.new()
    child_script= child.get_script()
    parent = godot_tests_library_fqname_FQNLSimple.new()
    parent_script = parent.get_script()
    assert_object(child_script.get_base_script()).is_equal(parent_script)
    child.free()
    parent.free()

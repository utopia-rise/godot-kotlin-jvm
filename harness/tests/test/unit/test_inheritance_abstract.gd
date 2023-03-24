extends "res://addons/gut/test.gd"


func test_call_parent_closed_method_from_child() -> void:
	var child_script = AbstractClassInheritanceChild.new()
	child_script.closed_function()
	assert_true(child_script.closed_function_has_been_called)
	child_script.free()

func test_call_parent_open_method_from_child() -> void:
	var child_script = AbstractClassInheritanceChild.new()
	child_script.open_function()
	assert_true(child_script.child_open_function_has_been_called)
	child_script.free()

func test_call_parent_closed_var_from_child() -> void:
	var child_script = AbstractClassInheritanceChild.new()
	assert_eq(child_script.closed_var, 0, "Parent's closed var should be 0")
	child_script.closed_var = 1
	assert_eq(child_script.closed_var, 1, "Parent's closed var should be set to 1")
	child_script.free()

func test_call_parent_open_var_from_child() -> void:
	var child_script = AbstractClassInheritanceChild.new()
	assert_eq(child_script.open_var, 100, "Open var inherited from parent should be to 100 by default.")
	child_script.open_var = 101
	assert_eq(child_script.open_var, 101, "Open var inherited from parent should now be 101")
	child_script.free()

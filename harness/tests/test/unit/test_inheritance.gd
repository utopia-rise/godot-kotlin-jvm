extends "res://addons/gut/test.gd"


func test_call_parent_closed_method_from_child() -> void:
	var child_script = godot_tests_inheritance_ClassInheritanceChild.new()
	child_script.closed_function()
	assert_true(child_script.closed_function_has_been_called)
	child_script.free()

func test_call_parent_open_method_from_parent() -> void:
	var parent_script = godot_tests_inheritance_ClassInheritanceParent.new()
	parent_script.open_function()
	assert_true(parent_script.parent_open_function_has_been_called)
	parent_script.free()

func test_call_parent_open_method_from_child() -> void:
	var child_script = godot_tests_inheritance_ClassInheritanceChild.new()
	child_script.open_function()
	assert_false(child_script.parent_open_function_has_been_called)
	assert_true(child_script.child_open_function_has_been_called)
	child_script.free()

func test_call_parent_closed_var_from_child() -> void:
	var child_script = godot_tests_inheritance_ClassInheritanceChild.new()
	assert_eq(child_script.closed_var, 0, "Parent's closed var should be 0")
	child_script.closed_var = 1
	assert_eq(child_script.closed_var, 1, "Parent's closed var should be set to 1")
	child_script.free()

func test_call_parent_open_var_from_parent() -> void:
	var parent_script = godot_tests_inheritance_ClassInheritanceParent.new()
	assert_eq(parent_script.open_var, 0, "Parent's open var should be 0")
	parent_script.open_var = 1
	assert_eq(parent_script.open_var, 1, "Parent's open var should be 1")
	parent_script.free()

func test_call_parent_open_var_from_child() -> void:
	var child_script = godot_tests_inheritance_ClassInheritanceChild.new()
	assert_eq(child_script.open_var, 100, "Open var inherited from parent should be to 100 by default.")
	child_script.open_var = 101
	assert_eq(child_script.open_var, 101, "Open var inherited from parent should now be 101")
	child_script.free()

extends "res://addons/gut/test.gd"


func test_call_parent_closed_method_from_child() -> void:
	var child_script = ClassInheritanceChild.new()
	child_script.closed_function()
	assert_true(child_script.closed_function_has_been_called)
	child_script.free()

func test_call_parent_open_method_from_parent() -> void:
	var parent_script = ClassInheritanceParent.new()
	parent_script.open_function()
	assert_true(parent_script.parent_open_function_has_been_called)
	parent_script.free()

func test_call_parent_open_method_from_child() -> void:
	var child_script = ClassInheritanceChild.new()
	child_script.open_function()
	assert_false(child_script.parent_open_function_has_been_called)
	assert_true(child_script.child_open_function_has_been_called)
	child_script.free()

func test_call_parent_closed_var_from_child() -> void:
	var child_script = ClassInheritanceChild.new()
	assert_eq(child_script.closed_var, 0, "Parent's closed var should be 0")
	child_script.closed_var = 1
	assert_eq(child_script.closed_var, 1, "Parent's closed var should be set to 1")
	child_script.free()

func test_call_parent_open_var_from_parent() -> void:
	var parent_script = ClassInheritanceParent.new()
	assert_eq(parent_script.open_var, 0, "Parent's open var should be 0")
	parent_script.open_var = 1
	assert_eq(parent_script.open_var, 1, "Parent's open var should be 1")
	parent_script.free()

func test_call_parent_open_var_from_child() -> void:
	var child_script = ClassInheritanceChild.new()
	assert_eq(child_script.open_var, 100, "Open var inherited from parent should be to 100 by default.")
	child_script.open_var = 101
	assert_eq(child_script.open_var, 101, "Open var inherited from parent should now be 101")
	child_script.free()
	
func test_script_is_child_of() -> void:
	var child = ClassInheritanceChild.new()
	var chid_script: Script = child.get_script()
	var parent = ClassInheritanceParent.new()
	var parent_script = parent.get_script()
	assert_eq(chid_script.get_base_script(), parent_script)
	child.free()
	parent.free()

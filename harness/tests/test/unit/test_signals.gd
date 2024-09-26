extends "res://addons/gut/test.gd"

func test_signal_connection_script_instantiation():
	var script = SignalTest.new()
	get_tree().root.add_child(script)
	assert_eq(script.is_connected("no_param_signal_delegate", Callable(script.other_script, "hook_no_param")), true, "signal \"no_param_signal_delegate\" should be connected to \"otherScript::hook_no_param\"")
	assert_eq(script.is_connected("one_param_signal_delegate", Callable(script.other_script, "hook_one_param")), true, "signal \"one_param_signal_delegate\" should be connected to \"otherScript::hook_one_param\"")
	assert_eq(script.is_connected("two_param_signal_delegate", Callable(script.other_script, "hook_two_param")), true, "signal \"two_param_signal_delegate\" should be connected to \"otherScript::hook_two_param\"")

	assert_eq(script.is_connected("no_param_signal_field", Callable(script.other_script, "hook_no_param")), true, "signal \"no_param_signal_field\" should be connected to \"otherScript::hook_no_param\"")
	assert_eq(script.is_connected("one_param_signal_field", Callable(script.other_script, "hook_one_param")), true, "signal \"one_param_signal_field\" should be connected to \"otherScript::hook_one_param\"")
	assert_eq(script.is_connected("two_param_signal_field", Callable(script.other_script, "hook_two_param")), true, "signal \"two_param_signal_field\" should be connected to \"otherScript::hook_two_param\"")

	script.free()

func test_signal_connection_code():
	var invocation_script = load("res://Spatial.tscn").instantiate()
	get_tree().root.add_child(invocation_script)
	assert_eq(invocation_script.button.is_connected("pressed", Callable(invocation_script.invocation, "hook_no_param")), true, "signal \"pressed\" of button should be connected to \"invocation_script.invocation::hook_no_param\"")
	invocation_script.free()

func test_signal_emitted_with_multiple_targets():
	var script = SignalTest.new()
	get_tree().root.add_child(script)
	assert_eq(script.array.size(), 16)
	assert_eq(script.array[0], Vector2(0,0))
	assert_eq(script.array[1], Vector2(1,1))
	assert_eq(script.array[2], Vector2(1,2))
	assert_eq(script.array[3], Vector2(1,3))
	assert_eq(script.array[4], Vector2(1,4))
	assert_eq(script.array[5], Vector2(1,5))
	assert_eq(script.array[6], Vector2(1,6))
	assert_eq(script.array[7], Vector2(1,7))
	assert_eq(script.array[8], Vector2(1,7))
	assert_eq(script.array[9], Vector2(1,6))
	assert_eq(script.array[10], Vector2(1,5))
	assert_eq(script.array[11], Vector2(1,4))
	assert_eq(script.array[12], Vector2(1,3))
	assert_eq(script.array[13], Vector2(1,2))
	assert_eq(script.array[14], Vector2(1,1))
	assert_eq(script.array[15], Vector2(0,0))
	script.free()

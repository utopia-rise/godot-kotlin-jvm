extends "res://addons/gut/test.gd"

func test_signal_connection_script_instantiation():
	var invocation_script = Invocation.new()
	get_tree().root.add_child(invocation_script)
	await get_tree().create_timer(1).timeout
	assert_eq(invocation_script.is_connected("no_param", Callable(invocation_script.invocation, "hook_no_param")), true, "signal \"no_param\" should be connected to \"invocation_script.invocation::hook_no_param\"")
	invocation_script.free()

func test_signal_connection_scene_instantiation():
	var invocation_script = load("res://Spatial.tscn").instantiate()
	get_tree().root.add_child(invocation_script)
	await get_tree().create_timer(1).timeout
	assert_eq(invocation_script.is_connected("no_param", Callable(invocation_script.invocation, "hook_no_param")), true, "signal \"no_param\" should be connected to \"invocation_script.invocation::hook_no_param\"")
	invocation_script.free()

func test_signal_connection_code():
	var invocation_script = load("res://Spatial.tscn").instantiate()
	get_tree().root.add_child(invocation_script)
	await get_tree().create_timer(1).timeout
	assert_eq(invocation_script.get_node("CanvasLayer/Button").is_connected("pressed", Callable(invocation_script.invocation, "hook_no_param")), true, "signal \"pressed\" of button should be connected to \"invocation_script.invocation::hook_no_param\"")
	invocation_script.free()

func test_signal_emitted_with_multiple_targets():
	var invocation_script = Invocation.new()
	get_tree().root.add_child(invocation_script)
	await get_tree().create_timer(1).timeout
	assert_eq(invocation_script.array.size(), 16)
	assert_eq(invocation_script.array[0], Vector2(0,0))
	assert_eq(invocation_script.array[1], Vector2(1,1))
	assert_eq(invocation_script.array[2], Vector2(1,2))
	assert_eq(invocation_script.array[3], Vector2(1,3))
	assert_eq(invocation_script.array[4], Vector2(1,4))
	assert_eq(invocation_script.array[5], Vector2(1,5))
	assert_eq(invocation_script.array[6], Vector2(1,6))
	assert_eq(invocation_script.array[7], Vector2(1,7))
	assert_eq(invocation_script.array[8], Vector2(1,7))
	assert_eq(invocation_script.array[9], Vector2(1,6))
	assert_eq(invocation_script.array[10], Vector2(1,5))
	assert_eq(invocation_script.array[11], Vector2(1,4))
	assert_eq(invocation_script.array[12], Vector2(1,3))
	assert_eq(invocation_script.array[13], Vector2(1,2))
	assert_eq(invocation_script.array[14], Vector2(1,1))
	assert_eq(invocation_script.array[15], Vector2(0,0))
	invocation_script.free()

extends "res://addons/gut/test.gd"

func test_nullables_are_correctly_set_from_function_lika_a_ready_call():
	var node3d = Node3D.new()
	var rpc_tests_script = RPCTests.new()
	node3d.add_child(rpc_tests_script)
	get_tree().root.add_child(node3d)
	var network_peer = ENetMultiplayerPeer.new()
	network_peer.create_server(9010)
	get_tree().network_peer = network_peer
	
	assert_eq(rpc_tests_script.remote_sync_called, false, "remote_sync_called should be false before actually calling the corresponding function")
	assert_eq(rpc_tests_script.remote_sync_property, false, "remote_sync_property should be false before actually calling the corresponding function")
	rpc_tests_script.trigger_function_remote_sync_call()
#	yield(get_tree().create_timer(1), "timeout")
	assert_eq(rpc_tests_script.remote_sync_called, true, "remote_sync_called should be true after calling the corresponding function")
	
	rpc_tests_script.trigger_property_remote_sync_call()
#	yield(get_tree().create_timer(1), "timeout")
	assert_eq(rpc_tests_script.remote_sync_property, true, "remote_sync_property should be true after calling the corresponding function")
	
	get_tree().network_peer = null
	node3d.free()



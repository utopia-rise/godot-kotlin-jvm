extends "res://addons/gut/test.gd"

func test_call_script_in_custom_src_dir():
	var node3d = Node3D.new()
	var script = ScriptInOtherSourceDir.new()
	node3d.add_child(script)
	assert_eq(script.greeting(), "HelloWorld", "greeting should return \"HelloWorld\"")
	node3d.free()

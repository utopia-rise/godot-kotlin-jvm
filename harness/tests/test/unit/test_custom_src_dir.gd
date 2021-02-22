extends "res://addons/gut/test.gd"

func test_call_script_in_custom_src_dir():
	var spatial = Spatial.new()
	var script = ScriptInOtherSourceDir.new()
	spatial.add_child(script)
	assert_eq(script.greeting(), "HelloWorld", "greeting should return \"HelloWorld\"")
	spatial.free()

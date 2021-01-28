extends "res://addons/gut/test.gd"


func test_should_find_camera_node():
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_true(invocation_scene.has_camera_node(), "Should find Camera Node using node path")
	invocation_scene.free()

func test_should_not_find_camera_node():
	var invocation_script = godot_tests_Invocation.new()
	assert_false(invocation_script.has_camera_node(), "Should not find camera node using node path")
	invocation_script.free()

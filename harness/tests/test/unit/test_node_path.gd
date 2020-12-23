extends "res://addons/gut/test.gd"


func test_should_find_camera_node():
	var invocation_scene = load("res://Spatial.tscn").instance()
	assert_true(invocation_scene.has_camera_node(), "Should find Camera Node using not path")
	invocation_scene.free()

# TODO: Leak is introduced
func test_should_not_find_camera_node():
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_false(invocation_script.has_camera_node(), "Should not find camera node using node path")
	invocation_script.free()

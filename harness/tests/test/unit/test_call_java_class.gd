extends "res://addons/gut/test.gd"


func test_call_function():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	var greeting = java_scene.greeting()
	assert_eq(greeting, "Hello from java", "Greeting from java class should match")
	java_scene.free()


func test_field_access():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	assert_eq(java_scene.exported_int, 1, "Field from java should match")
	java_scene.free()


func test_signal():
	var java_scene: JavaTestClass = load("res://java_test_scene.tscn").instantiate()
	get_tree().root.add_child(java_scene)
	await get_tree().create_timer(1).timeout
	java_scene.connect_and_trigger_signal()
	assert_true(java_scene.signal_emitted, "Signal should've been emitted in java")

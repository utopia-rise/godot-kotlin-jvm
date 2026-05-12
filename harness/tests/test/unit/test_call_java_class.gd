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


func test_field_set():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	java_scene.exported_int = 2
	assert_eq(java_scene.exported_int, 2, "Field from java should match")
	java_scene.free()


func test_signal():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	get_tree().root.add_child(java_scene)
	await get_tree().create_timer(1).timeout
	java_scene.connect_and_trigger_signal()
	assert_true(java_scene.signal_emitted, "Signal should've been emitted in java")
	get_tree().root.remove_child(java_scene)
	java_scene.free()


func test_lambda_signal_without_param():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	get_tree().root.add_child(java_scene)
	java_scene.emit_lambda_signal_no_param()
	assert_true(java_scene.has_signal_no_param_been_triggered)
	get_tree().root.remove_child(java_scene)
	java_scene.free()


func test_lambda_signal_with_param():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	get_tree().root.add_child(java_scene)

	var expected_str = "expected"
	var expected_int = randi()
	var expected_node = java_scene

	java_scene.emit_lambda_signal_with_param(expected_str, expected_int, expected_node)

	assert_eq(java_scene.signal_string, expected_str)
	assert_eq(java_scene.signal_long, expected_int)
	assert_eq(java_scene.signal_node, expected_node)
	get_tree().root.remove_child(java_scene)
	java_scene.free()


func test_lambda_callable_from_gdscript():
	var java_scene = load("res://java_test_scene.tscn").instantiate()

	var expected_str = "expected"

	java_scene.java_callable.call(expected_str)

	assert_eq(java_scene.java_callable_string, expected_str)
	java_scene.free()


func test_notification():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	java_scene.notification(0)
	assert_true(java_scene.notification_triggered, "Java _notification should be registered and invoked")
	java_scene.free()

extends "res://addons/gut/test.gd"


func test_call_function():
	var scala_scene = load("res://scala_test_scene.tscn").instantiate()
	var greeting = scala_scene.greeting()
	assert_eq(greeting, "Hello from scala", "Greeting from scala class should match")
	scala_scene.free()


func test_field_access():
	var scala_scene = load("res://scala_test_scene.tscn").instantiate()
	assert_eq(scala_scene.exported_int, 1, "Field from scala should match")
	scala_scene.free()


func test_field_set():
	var scala_scene = load("res://scala_test_scene.tscn").instantiate()
	scala_scene.exported_int = 2
	assert_eq(scala_scene.exported_int, 2, "Field from scala should match")
	scala_scene.free()

func test_signal():
	var scala_scene: ScalaTestClass = load("res://scala_test_scene.tscn").instantiate()
	get_tree().root.add_child(scala_scene)
	await get_tree().create_timer(1).timeout
	scala_scene.connect_and_trigger_signal()
	assert_true(scala_scene.signal_emitted, "Signal should've been emitted in scala")
	get_tree().root.remove_child(scala_scene)
	scala_scene.free()


func test_lambda_signal_without_param():
	var scala_scene: ScalaTestClass = load("res://scala_test_scene.tscn").instantiate()
	get_tree().root.add_child(scala_scene)
	scala_scene.emit_lambda_signal_no_param()
	assert_true(scala_scene.has_signal_no_param_been_triggered)
	get_tree().root.remove_child(scala_scene)
	scala_scene.free()


func test_lambda_signal_with_param():
	var scala_scene: ScalaTestClass = load("res://scala_test_scene.tscn").instantiate()
	get_tree().root.add_child(scala_scene)

	var expected_str = "expected"
	var expected_int = randi()
	var expected_node = scala_scene

	scala_scene.emit_lambda_signal_with_param(expected_str, expected_int, expected_node)

	assert_eq(scala_scene.signal_string, expected_str)
	assert_eq(scala_scene.signal_long, expected_int)
	assert_eq(scala_scene.signal_node, expected_node)
	get_tree().root.remove_child(scala_scene)
	scala_scene.free()


func test_lambda_callable_from_gdscript():
	var scala_scene: ScalaTestClass = load("res://scala_test_scene.tscn").instantiate()

	var expected_str = "expected"

	scala_scene.scala_callable.call(expected_str)

	assert_eq(scala_scene.scala_callable_string, expected_str)
	scala_scene.free()


func test_notification():
	var scala_scene: ScalaTestClass = load("res://scala_test_scene.tscn").instantiate()
	scala_scene.notification(0)
	assert_true(scala_scene.notification_triggered, "Scala _notification should be registered and invoked")
	scala_scene.free()

extends "res://addons/gut/test.gd"


func test_signal_without_param():
	var lambda_callable_test_script = LambdaCallableTest.new()
	get_tree().root.add_child(lambda_callable_test_script)
	lambda_callable_test_script.emit_signal_no_param()
	assert_true(lambda_callable_test_script.has_signal_no_param_been_triggered)
	get_tree().root.remove_child(lambda_callable_test_script)
	lambda_callable_test_script.free()

func test_signal_with_param():
	var lambda_callable_test_script = LambdaCallableTest.new()
	get_tree().root.add_child(lambda_callable_test_script)
	
	var expected_str = "expected"
	var expected_int = randi()
	var expected_node = lambda_callable_test_script
	
	lambda_callable_test_script.emit_signal_with_param(expected_str, expected_int, expected_node)
	
	assert_eq(lambda_callable_test_script.signal_string, expected_str)
	assert_eq(lambda_callable_test_script.signal_long, expected_int)
	assert_eq(lambda_callable_test_script.signal_node, expected_node)
	get_tree().root.remove_child(lambda_callable_test_script)
	lambda_callable_test_script.free()

func test_kotlin_lambda_call_from_gdscript():
	var lambda_callable_test_script = LambdaCallableTest.new()
	
	var expected_str = "expected"
	
	lambda_callable_test_script.kt_callable.call(expected_str)
	
	assert_eq(lambda_callable_test_script.kt_callable_string, expected_str)
	lambda_callable_test_script.free()


func test_java_signal_without_param():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	get_tree().root.add_child(java_scene)
	java_scene.emit_lambda_signal_no_param()
	assert_true(java_scene.has_signal_no_param_been_triggered)
	get_tree().root.remove_child(java_scene)
	java_scene.free()


func test_java_signal_with_param():
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


func test_java_lambda_call_from_gdscript():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	
	var expected_str = "expected"
	
	java_scene.java_callable.call(expected_str)
	
	assert_eq(java_scene.java_callable_string, expected_str)
	java_scene.free()


func test_scala_signal_without_param():
	var scala_scene = load("res://scala_test_scene.tscn").instantiate()
	get_tree().root.add_child(scala_scene)
	scala_scene.emit_lambda_signal_no_param()
	assert_true(scala_scene.has_signal_no_param_been_triggered)
	get_tree().root.remove_child(scala_scene)
	scala_scene.free()


func test_scala_signal_with_param():
	var scala_scene = load("res://scala_test_scene.tscn").instantiate()
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


func test_scala_lambda_call_from_gdscript():
	var scala_scene = load("res://scala_test_scene.tscn").instantiate()
	
	var expected_str = "expected"
	
	scala_scene.scala_callable.call(expected_str)
	
	assert_eq(scala_scene.scala_callable_string, expected_str)
	scala_scene.free()

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

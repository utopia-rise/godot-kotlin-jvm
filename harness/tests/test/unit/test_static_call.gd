extends "res://addons/gut/test.gd"


func test_static_call():
	var test_script = CallStaticTest.new()
	var dir_exists = test_script.test_static_call()
	assert_eq(dir_exists, true, "Dir should exist")
	test_script.free()

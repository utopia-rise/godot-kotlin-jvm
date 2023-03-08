extends "res://addons/gut/test.gd"


func test_call_function():
	var java_scene = load("res://java_test_scene.tscn").instantiate()
	var greeting = java_scene.greeting()
	assert_eq(greeting, "Hello from java", "Greeting from java class did not match")
	java_scene.free()
	

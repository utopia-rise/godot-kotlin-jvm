extends "res://addons/gut/test.gd"


func test_array_any_not_null_append():
	var freeform_script = FreeformRegistrationFileTestClass.new()
	
	assert_eq(
		freeform_script.greeting(),
		"Hello from class with freely moved registration file",
		"Greeting received from freeform test class does not match"
	)
	
	freeform_script.free()

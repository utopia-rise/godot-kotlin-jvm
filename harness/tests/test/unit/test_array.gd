extends "res://addons/gut/test.gd"


func test_array_append():
	var invocation_script = load("res://src/main/kotlin/godot/tests/Invocation.kt").new()
	assert_eq(invocation_script.array_any_size(), 0, "Array should be empty")
	var obj = Node.new()
	invocation_script.append_any_to_array(obj)
	invocation_script.append_any_to_array(1)
	assert_eq(invocation_script.array_any_size(), 2, "Array size should be 2")
	assert_eq(invocation_script.test_array_any[0], obj, "Should find obj at index 0")
	assert_eq(invocation_script.get_any_from_array(0), obj, "Should find obj at index 0")
	assert_eq(invocation_script.testArrayAny[1], 1, "Should find 1 at index 2")
	assert_eq(invocation_script.get_any_from_array(1), 1, "Should find 1 at index 2")
	invocation_script.free()
	obj.free()

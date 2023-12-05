extends "res://addons/gut/test.gd"


func test_memory_manager_caching() -> void:
	var memory_manager_test_script = load("res://scripts/godot/tests/memory/MemoryManagerTest.gdj").new()

	val stringName1 = memory_manager_test_script.get_or_create_string_name("test1")
	val stringName2 = memory_manager_test_script.get_or_create_string_name("test1")

	assert_true(stringName1 == stringName2, "Should return true")
	memory_manager_test_script.free()

extends "res://addons/gut/test.gd"

func test_nullables_are_correctly_set_from_function_lika_a_ready_call():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)
	get_tree().root.add_child(spatial)
	# simulate _ready call because we don't actually want to set it in ready in the Invocation script for the other tests
	invocation_script.init_nullables()
	assert_eq(invocation_script.test_nullable, 1, "test_nullable should have been set in ready to 1")
	assert_eq(invocation_script.lateinit_string, "works", "lateinit_string should have been set in ready to wokrs")
	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object != null, "register_object should have been initialized in ready to an instance of OtherScript")
	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object_nullable != null, "register_object_nullable should have been initialized in ready to an instance of OtherScript")
	spatial.free()

func test_nullables_are_correctly_set_from_inspector():
	var test_scene = load("res://Spatial.tscn").instance()
	get_tree().root.add_child(test_scene)
	assert_eq(test_scene.test_nullable, 2, "test_nullable should have been set in ready to 2")
	assert_eq(test_scene.lateinit_string, "works also from inspector", "lateinit_string should have been set in ready to works also from inspector")
	assert_true(test_scene.register_object_nullable == null, "register_object_nullable should still be null")
	assert_true(test_scene.register_object_nullable_pre_init != null, "register_object_nullable_pre_init should still not be null")
	test_scene.free()


func test_nullables_are_correctly_set_without_attaching_to_a_scene():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)
	invocation_script.init_nullables()
	assert_eq(invocation_script.test_nullable, 1, "test_nullable should have been set in ready to 1")
	assert_eq(invocation_script.lateinit_string, "works", "lateinit_string should have been set in ready to wokrs")
	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object != null, "register_object should have been initialized in ready to an instance of OtherScript")
	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object_nullable != null, "register_object_nullable should have been initialized in ready to an instance of OtherScript")
	spatial.free()


func test_set_lateinit_from_gdscript():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)
	invocation_script.lateinit_string = "huhu"
	assert_eq(invocation_script.lateinit_string, "huhu", "lateinit_string should have been set from gdScript to huhu")
	spatial.free()


func test_set_nullable_from_gdscript():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)
	assert_eq(invocation_script.test_nullable, null, "test_nullable should be null")
	invocation_script.test_nullable = 1234
	assert_eq(invocation_script.test_nullable, 1234, "test_nullable should be 1234")
	spatial.free()


func test_set_objects_from_gdscript():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)

	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object_nullable_pre_init != null, "register_object should have been initialized in ready to an instance of OtherScript")
	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object_non_nullable_pre_init != null, "register_object_nullable should have been initialized in ready to an instance of OtherScript")

	invocation_script.register_object_nullable_pre_init = godot_tests_subpackage_OtherScript.new()
	invocation_script.register_object_non_nullable_pre_init = godot_tests_subpackage_OtherScript.new()

	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object_nullable_pre_init != null, "register_object should have been initialized in ready to an instance of OtherScript")
	# TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
	assert_true(invocation_script.register_object_non_nullable_pre_init != null, "register_object_nullable should have been initialized in ready to an instance of OtherScript")
	
	invocation_script.free()
	spatial.free()

func test_function_nullable_param():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)
	assert_eq(invocation_script.nullable_string_is_null("huhu"), false, "nullable_string_is_null should return false when string is passed as arg")
	assert_eq(invocation_script.nullable_string_is_null(null), true, "nullable_string_is_null should return true when null is passed as arg")
	spatial.free()

func test_function_nullable_return():
	var spatial = Spatial.new()
	var invocation_script = godot_tests_Invocation.new()
	spatial.add_child(invocation_script)
	assert_eq(invocation_script.nullable_return_type(false), "not null", "nullable_return_type should return \"not null\"")
	assert_eq(invocation_script.nullable_return_type(true), null, "nullable_return_type should return null")
	spatial.free()

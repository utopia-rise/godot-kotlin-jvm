extends "res://addons/gut/test.gd"

func test_instance_binding():
	var test_script: BindingTest = BindingTest.new()
	var bound_obj: Object = RefCounted.new()
	var clazz = test_script.get_class_name(bound_obj)
	assert_eq(clazz, "RefCounted", "Type should be RefCounted")
	test_script.free()
	
func test_script_binding():
	var test_script: BindingTest = BindingTest.new()
	var bound_obj: RefCounted = BindingA.new()
	var clazz = test_script.get_class_name(bound_obj)
	assert_eq(clazz, "BindingA", "Type should be BindingA")
	test_script.free()

func test_add_script():
	var test_script: BindingTest = BindingTest.new()
	var bound_obj: Object = RefCounted.new()
	var script = load("res://scripts/godot/tests/binding/BindingA.gdj")
	bound_obj.set_script(script)
	var clazz = test_script.get_class_name(bound_obj)
	assert_eq(clazz, "BindingA", "Type should be BindingA")
	test_script.free()

func test_remove_script():
	var test_script: BindingTest = BindingTest.new()
	var bound_obj: Object = BindingA.new()
	bound_obj.set_script(null)
	var clazz = test_script.get_class_name(bound_obj)
	assert_eq(clazz, "RefCounted", "Type should be RefCounted")
	test_script.free()
	
func test_switch_script():
	var test_script: BindingTest = BindingTest.new()
	var bound_obj: Object = BindingA.new()
	var clazz = test_script.get_class_name(bound_obj)
	var script = load("res://scripts/godot/tests/binding/BindingB.gdj")
	bound_obj.set_script(script)
	clazz = test_script.get_class_name(bound_obj)
	assert_eq(clazz, "BindingB", "Type should be BindingB")
	test_script.free()

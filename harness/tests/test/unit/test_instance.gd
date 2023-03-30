extends "res://addons/gut/test.gd"

func test_object_instance():
	var obj: Object = ObjectInstance.new()
	assert_not_null(obj, "Object should not be null")
	obj.free()

func test_refcounted_instance():
	var obj: Object = RefCountedInstance.new()
	assert_not_null(obj, "RefCounted should not be null")
	
func test_node_instance():
	var obj: Object = Node.new()
	assert_not_null(obj, "Node should not be null")
	obj.free()

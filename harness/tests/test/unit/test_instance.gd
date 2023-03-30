extends "res://addons/gut/test.gd"

func test_object_instance():
	var obj: ObjectInstance = ObjectInstance.new()
	assert_not_null(obj, "Object should not be null")
	obj.free()

func test_refcounted_instance():
	var obj: RefCountedInstance = RefCountedInstance.new()
	assert_not_null(obj, "RefCounted should not be null")
	
func test_node_instance():
	var obj: NodeInstance = NodeInstance.new()
	assert_not_null(obj, "Node should not be null")
	obj.free()

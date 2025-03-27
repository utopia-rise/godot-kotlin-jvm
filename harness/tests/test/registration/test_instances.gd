extends GdUnitTestSuite


func test_object_instance():
	var obj: ObjectInstance = ObjectInstance.new()
	assert_that(obj.get_class()).override_failure_message("Class name should be Object").is_equal("Object")
	obj.free()

func test_refcounted_instance():
	var obj: RefCountedInstance = RefCountedInstance.new()
	assert_that(obj.get_class()).override_failure_message("Class name should be RefCounted").is_equal("RefCounted")


func test_node_instance():
	var obj: NodeInstance = NodeInstance.new()
	assert_that(obj.get_class()).override_failure_message("Class name should be Node").is_equal("Node")
	obj.free()

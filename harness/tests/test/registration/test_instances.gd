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


func test_registered_node_reference_invalidation():
	var tracker := NodeInstance.new()
	var tracked := Node.new()
	get_tree().root.add_child(tracked)

	tracker.capture_node(tracked)
	assert_bool(tracker.is_tracked_node_valid()).override_failure_message("Tracked node should start valid before queue_free").is_true()

	tracked.queue_free()
	await get_tree().process_frame
	assert_bool(tracker.is_tracked_node_valid()).override_failure_message("Tracked node references should become invalid once the Godot object is freed").is_false()

	tracker.free()

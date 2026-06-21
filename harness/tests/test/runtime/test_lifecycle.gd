extends GdUnitTestSuite


func test_free_invalidates_tracked_reference() -> void:
	var tracker = load("res://src/main/kotlin/godot/tests/runtime/LifecycleTest.kt").new()
	var tracked := Node.new()
	get_tree().root.add_child(tracked)

	tracker.capture_node(tracked)
	assert_bool(tracker.is_tracked_node_valid()).override_failure_message("Tracked node should start valid before free").is_true()

	tracked.free()
	await get_tree().process_frame
	assert_bool(tracker.is_tracked_node_valid()).override_failure_message("Tracked node should become invalid after free").is_false()

	tracker.free()


func test_queue_free_invalidates_after_frame_boundary() -> void:
	var tracker = load("res://src/main/kotlin/godot/tests/runtime/LifecycleTest.kt").new()
	var tracked := Node.new()
	get_tree().root.add_child(tracked)

	tracker.capture_node(tracked)
	tracked.queue_free()
	assert_bool(tracker.is_tracked_node_valid()).override_failure_message("queue_free should keep the instance valid until the frame boundary").is_true()

	await get_tree().process_frame
	assert_bool(tracker.is_tracked_node_valid()).override_failure_message("queue_free should invalidate the tracked reference after the frame boundary").is_false()

	tracker.free()


func test_replacing_tracked_node_in_same_frame_prefers_new_instance() -> void:
	var tracker = load("res://src/main/kotlin/godot/tests/runtime/LifecycleTest.kt").new()
	var first := Node.new()
	first.name = "first"
	get_tree().root.add_child(first)

	tracker.capture_node(first)
	first.queue_free()

	var replacement := Node.new()
	replacement.name = "replacement-before-mark"
	get_tree().root.add_child(replacement)
	tracker.replace_tracked_node(replacement)

	assert_bool(tracker.mark_tracked_node("replacement-after-mark")).override_failure_message("Replacing a tracked node in the same frame should let later writes target the new live instance").is_true()
	assert_that(replacement.name).override_failure_message("Same-frame replacement writes should apply to the replacement node, not the queued-for-free instance").is_equal("replacement-after-mark")
	assert_bool(tracker.replacement_was_writable).is_true()

	await get_tree().process_frame
	assert_bool(tracker.is_tracked_node_valid()).override_failure_message("Replacement node should still be valid after the original node is gone").is_true()

	replacement.queue_free()
	await get_tree().process_frame
	tracker.free()

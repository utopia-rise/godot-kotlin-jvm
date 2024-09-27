extends "res://addons/gut/test.gd"


func test_coroutine_await():
	var test_script: Object = CoroutineTest.new()

	assert_eq(test_script.step, 0, "Property should be 0 at first.")

	test_script.start_coroutine_without_parameter()
	await get_tree().create_timer(1).timeout
	assert_eq(test_script.step, 1, "Property should be 1 after coroutine started but waiting.")

	test_script.signal_without_parameter.emit()
	await get_tree().create_timer(1).timeout
	assert_eq(test_script.step, 2, "Property should be 2 after coroutine ran and signal triggered.")

	test_script.start_coroutine_with_one_parameter()
	await get_tree().create_timer(1).timeout
	assert_eq(test_script.step, 3, "Property should be 3 after coroutine started but waiting.")

	test_script.signal_with_one_parameter.emit(4)
	await get_tree().create_timer(1).timeout
	assert_eq(test_script.step, 4, "Property should be 4 after coroutine ran.")

	test_script.start_coroutine_with_many_parameters()
	await get_tree().create_timer(1).timeout
	assert_eq(test_script.step, 5, "Property should be 5 after coroutine started but waiting.")

	test_script.signal_with_many_parameters.emit(6, 0.1, Vector2(0,0), "test")
	await get_tree().create_timer(1).timeout
	assert_eq(test_script.step, 6, "Property should be 6 after coroutine ran.")

	test_script.start_coroutine_undispatched()
	assert_eq(test_script.step, 7, "Property should be immediately 7 when coroutine is undispatched.")

	test_script.signal_without_parameter.emit()
	await get_tree().create_timer(1).timeout
	assert_eq(test_script.step, 8, "Property should be 8 when coroutine is resumed.")

	test_script.run_on_main_thread_from_background_thread()
	var success = await test_script.run_on_main_thread_from_background_thread_finished
	assert_true(success, "Code was executed on wrong thread")

	test_script.free()

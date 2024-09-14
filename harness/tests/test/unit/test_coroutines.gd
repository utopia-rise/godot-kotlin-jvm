extends "res://addons/gut/test.gd"


func test_coroutine_await():
    var test_script: Object = CoroutineTest.new()

    test_script.start_coroutine_without_parameter()
    test_script.signal_without_parameter.emit()
    await get_tree().create_timer(1).timeout
    assert_eq(test_script.int, 1, "Property should be 1 after coroutine ran.")

    test_script.start_coroutine_with_parameters()
    test_script.signal_with_parameters.emit(13, "test")
    await get_tree().create_timer(1).timeout
    assert_eq(test_script.int, 2, "Property should be 2 after coroutine ran.")

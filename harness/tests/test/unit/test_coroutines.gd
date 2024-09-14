extends "res://addons/gut/test.gd"


func test_coroutine_await():
    var test_script: Object = CoroutineTest.new()

    assert_eq(test_script.int, 0, "Property should be 0 at first.")

    test_script.start_coroutine_without_parameter()
    assert_eq(test_script.int, 1, "Property should be 1 after coroutine started but waiting.")

    test_script.signal_without_parameter.emit()
    await get_tree().create_timer(1).timeout
    assert_eq(test_script.int, 2, "Property should be 2 after coroutine ran and signal triggered.")

    test_script.start_coroutine_with_parameters()
    assert_eq(test_script.int, 3, "Property should be 3 after coroutine started but waiting.")

    test_script.signal_with_parameters.emit()
    await get_tree().create_timer(1).timeout
    assert_eq(test_script.int, 4, "Property should be 4 after coroutine ran.")

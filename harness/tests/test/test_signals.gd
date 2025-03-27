extends GdUnitTestSuite

func test_signal_connection_script_instantiation():
    var script = SignalTest.new()
    get_tree().root.add_child(script)
    assert_that(script.is_connected("no_param_signal_delegate", Callable(script.other_script, "hook_no_param"))).override_failure_message("signal \"no_param_signal_delegate\" should be connected to \"otherScript::hook_no_param\"").is_equal(true)
    assert_that(script.is_connected("one_param_signal_delegate", Callable(script.other_script, "hook_one_param"))).override_failure_message("signal \"one_param_signal_delegate\" should be connected to \"otherScript::hook_one_param\"").is_equal(true)
    assert_that(script.is_connected("two_param_signal_delegate", Callable(script.other_script, "hook_two_param"))).override_failure_message("signal \"two_param_signal_delegate\" should be connected to \"otherScript::hook_two_param\"").is_equal(true)

    assert_that(script.is_connected("no_param_signal_field", Callable(script.other_script, "hook_no_param"))).override_failure_message("signal \"no_param_signal_field\" should be connected to \"otherScript::hook_no_param\"").is_equal(true)
    assert_that(script.is_connected("one_param_signal_field", Callable(script.other_script, "hook_one_param"))).override_failure_message("signal \"one_param_signal_field\" should be connected to \"otherScript::hook_one_param\"").is_equal(true)
    assert_that(script.is_connected("two_param_signal_field", Callable(script.other_script, "hook_two_param"))).override_failure_message("signal \"two_param_signal_field\" should be connected to \"otherScript::hook_two_param\"").is_equal(true)

    script.free()

func test_signal_connection_code():
    var invocation_script = load("res://Spatial.tscn").instantiate()
    get_tree().root.add_child(invocation_script)
    assert_that(invocation_script.button.is_connected("pressed", Callable(invocation_script.invocation, "hook_no_param"))).override_failure_message("signal \"pressed\" of button should be connected to \"invocation_script.invocation::hook_no_param\"").is_equal(true)
    invocation_script.free()

func test_signal_emitted_with_multiple_targets():
    var script = SignalTest.new()
    get_tree().root.add_child(script)
    assert_that(script.array.size()).is_equal(16)
    assert_that(script.array[0]).is_equal(Vector2(0,0))
    assert_that(script.array[1]).is_equal(Vector2(1,1))
    assert_that(script.array[2]).is_equal(Vector2(1,2))
    assert_that(script.array[3]).is_equal(Vector2(1,3))
    assert_that(script.array[4]).is_equal(Vector2(1,4))
    assert_that(script.array[5]).is_equal(Vector2(1,5))
    assert_that(script.array[6]).is_equal(Vector2(1,6))
    assert_that(script.array[7]).is_equal(Vector2(1,7))
    assert_that(script.array[8]).is_equal(Vector2(1,7))
    assert_that(script.array[9]).is_equal(Vector2(1,6))
    assert_that(script.array[10]).is_equal(Vector2(1,5))
    assert_that(script.array[11]).is_equal(Vector2(1,4))
    assert_that(script.array[12]).is_equal(Vector2(1,3))
    assert_that(script.array[13]).is_equal(Vector2(1,2))
    assert_that(script.array[14]).is_equal(Vector2(1,1))
    assert_that(script.array[15]).is_equal(Vector2(0,0))
    script.free()

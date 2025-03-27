extends GdUnitTestSuite


func test_kotlin_signals() -> void:
    var script := SignalKotlinTest.new()
    get_tree().root.add_child(script)

    assert_bool(script.other_script.hook_no_param_called).override_failure_message("Kotlin no-param signals should call OtherScript.hookNoParam").is_true()
    assert_bool(script.other_script.hook_one_param_called).override_failure_message("Kotlin one-param signals should call OtherScript.hookOneParam").is_true()
    assert_that(script.other_script.hook_one_param_value).override_failure_message("Kotlin one-param signal should forward the boolean payload").is_equal(false)
    assert_bool(script.other_script.hook_two_param_called).override_failure_message("Kotlin two-param signals should call OtherScript.hookTwoParam").is_true()
    assert_that(script.other_script.hook_two_param_value).override_failure_message("Kotlin two-param signal should forward the string payload").is_equal("My Awesome param !")
    assert_object(script.other_script.hook_two_param_node).override_failure_message("Kotlin two-param signal should forward the sender node").is_equal(script)

    assert_that(script.array.size()).is_equal(16)
    assert_that(script.array[0]).is_equal(Vector2(0, 0))
    assert_that(script.array[1]).is_equal(Vector2(1, 1))
    assert_that(script.array[2]).is_equal(Vector2(1, 2))
    assert_that(script.array[3]).is_equal(Vector2(1, 3))
    assert_that(script.array[4]).is_equal(Vector2(1, 4))
    assert_that(script.array[5]).is_equal(Vector2(1, 5))
    assert_that(script.array[6]).is_equal(Vector2(1, 6))
    assert_that(script.array[7]).is_equal(Vector2(1, 7))
    assert_that(script.array[8]).is_equal(Vector2(1, 7))
    assert_that(script.array[9]).is_equal(Vector2(1, 6))
    assert_that(script.array[10]).is_equal(Vector2(1, 5))
    assert_that(script.array[11]).is_equal(Vector2(1, 4))
    assert_that(script.array[12]).is_equal(Vector2(1, 3))
    assert_that(script.array[13]).is_equal(Vector2(1, 2))
    assert_that(script.array[14]).is_equal(Vector2(1, 1))
    assert_that(script.array[15]).is_equal(Vector2(0, 0))

    script.emit_self_connected_signal()
    await get_tree().create_timer(1).timeout
    assert_bool(script.self_connected_signal_triggered).is_true()

    get_tree().root.remove_child(script)
    script.free()


func test_java_signals() -> void:
    var script := SignalJavaTest.new()
    get_tree().root.add_child(script)

    assert_bool(script.method_signal_triggered).override_failure_message("Java method-connected signal should have fired").is_true()
    assert_bool(script.lambda_signal_triggered).override_failure_message("Java payload signal should have fired").is_true()
    assert_that(script.payload_string).override_failure_message("Java payload signal should capture the string").is_equal("java-events")
    assert_that(script.payload_int).override_failure_message("Java payload signal should capture the int").is_equal(17)

    get_tree().root.remove_child(script)
    script.free()


func test_scala_signals() -> void:
    var script := SignalScalaTest.new()
    get_tree().root.add_child(script)

    assert_bool(script.method_signal_triggered).override_failure_message("Scala method-connected signal should have fired").is_true()
    assert_bool(script.lambda_signal_triggered).override_failure_message("Scala payload signal should have fired").is_true()
    assert_that(script.payload_string).override_failure_message("Scala payload signal should capture the string").is_equal("scala-events")
    assert_that(script.payload_int).override_failure_message("Scala payload signal should capture the int").is_equal(23)

    get_tree().root.remove_child(script)
    script.free()

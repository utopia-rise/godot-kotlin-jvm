extends GdUnitTestSuite


func test_kotlin_lambda_callable() -> void:
    var script := LambdaCallableKotlinTest.new()
    get_tree().root.add_child(script)

    script.emit_signal_no_param()
    assert_bool(script.has_signal_no_param_been_triggered).is_true()

    var expected_str := "expected"
    var expected_int := 42
    script.emit_signal_with_param(expected_str, expected_int)
    assert_that(script.signal_string).is_equal(expected_str)
    assert_that(script.signal_long).is_equal(expected_int)
    assert_that(script.signal_node).is_equal(script)

    script.kt_callable.call("called-from-gdscript")
    assert_that(script.kt_callable_string).is_equal("called-from-gdscript")

    script.call_callable_no_param()
    assert_bool(script.callable_no_param_triggered).is_true()
    script.callable_no_param_triggered = false
    script.call_callable_no_param_deferred()
    await get_tree().create_timer(1).timeout
    assert_bool(script.callable_no_param_triggered).is_true()

    script.call_callable_with_param()
    assert_bool(script.callable_with_param_triggered).is_true()
    script.callable_with_param_triggered = false
    script.call_callable_with_param_deferred()
    await get_tree().create_timer(1).timeout
    assert_bool(script.callable_with_param_triggered).is_true()

    get_tree().root.remove_child(script)
    script.free()


func test_java_lambda_callable() -> void:
    var script := LambdaCallableJavaTest.new()

    script.callable_property.call("called-from-gdscript")
    assert_that(script.callable_string).override_failure_message("Java callable property should be invokable from GDScript").is_equal("called-from-gdscript")

    script.call_callable_no_param()
    assert_bool(script.callable_no_param_triggered).is_true()
    script.callable_no_param_triggered = false
    script.call_callable_no_param_deferred()
    await get_tree().create_timer(1).timeout
    assert_bool(script.callable_no_param_triggered).is_true()

    script.call_callable_with_param()
    assert_bool(script.callable_with_param_triggered).is_true()
    script.callable_with_param_triggered = false
    script.call_callable_with_param_deferred()
    await get_tree().create_timer(1).timeout
    assert_bool(script.callable_with_param_triggered).is_true()

    script.free()


func test_scala_lambda_callable() -> void:
    var script := LambdaCallableScalaTest.new()

    script.callable_property.call("called-from-gdscript")
    assert_that(script.callable_string).override_failure_message("Scala callable property should be invokable from GDScript").is_equal("called-from-gdscript")

    script.call_callable_no_param()
    assert_bool(script.callable_no_param_triggered).is_true()
    script.callable_no_param_triggered = false
    script.call_callable_no_param_deferred()
    await get_tree().create_timer(1).timeout
    assert_bool(script.callable_no_param_triggered).is_true()

    script.call_callable_with_param()
    assert_bool(script.callable_with_param_triggered).is_true()
    script.callable_with_param_triggered = false
    script.call_callable_with_param_deferred()
    await get_tree().create_timer(1).timeout
    assert_bool(script.callable_with_param_triggered).is_true()

    script.free()

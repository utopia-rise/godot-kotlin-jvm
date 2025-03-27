extends GdUnitTestSuite


func test_color_set() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.color).override_failure_message("Color should be default color").is_equal(Color())
    var col = Color(10, 20, 30, 70)
    invocation_script.color = col
    assert_that(invocation_script.color).override_failure_message("Color should be Color(10, 20, 30, 70)").is_equal(col)
    assert_that(invocation_script.color.r).override_failure_message("Color R should be 10").is_equal(10.0)
    assert_that(invocation_script.color.g).override_failure_message("Color G should be 20").is_equal(20.0)
    assert_that(invocation_script.color.b).override_failure_message("Color B should be 30").is_equal(30.0)
    assert_that(invocation_script.color.a).override_failure_message("Color A should be 70").is_equal(70.0)
    invocation_script.free()

extends GdUnitTestSuite


func test_static_call():
    var test_script = CallStaticTest.new()
    var dir_exists = test_script.test_static_call()
    assert_that(dir_exists).override_failure_message("Dir should exist").is_equal(true)
    test_script.free()

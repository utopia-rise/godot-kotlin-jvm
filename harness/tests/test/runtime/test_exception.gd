extends GdUnitTestSuite


func test_throw_exception_reports_runtime_error() -> void:
    var exception_test := ExceptionTest.new()

    await assert_error(func(): exception_test.throw_exception()) \
        .override_failure_message("Calling the JVM exception fixture should report a runtime error") \
        .is_runtime_error("Test exception")

    exception_test.free()

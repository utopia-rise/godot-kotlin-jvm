extends GdUnitTestSuite

var test_data = [
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6",
    "arg7",
    "arg8",
    "arg9",
    "arg10",
    "arg11",
    "arg12",
    "arg13",
    "arg14",
    "arg15",
    "arg16",
]

func test_function_arg_size():
    for arg_count in range(0, test_data.size()):
        var data = test_data.slice(0, arg_count)
        var test_instance = FunctionArgSizeTest.new()

        var result = test_instance.callv("arg%s" % arg_count, data)

        if arg_count != 0:
            for arg_index in range(0, arg_count):
                var expected_data = data[arg_index]
                var actual_data = result[arg_index]
                assert_that(expected_data).override_failure_message("arg with index %s did not match expected arg" % arg_index).is_equal(actual_data)
        else:
            assert_that(result.size()).override_failure_message("arg count should be 0 when calling no arg function").is_equal(0)

        test_instance.free()

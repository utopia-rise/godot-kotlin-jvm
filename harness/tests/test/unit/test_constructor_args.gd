extends "res://addons/gut/test.gd"

var test_data = [
    "arg1",
    "arg2",
    "arg3",
    "arg4",
    "arg5",
    "arg6",
    "arg7",
    "arg8",
]

func _provide_test_instance_for_arg_count(arg_count: int) -> ConstructorArgSizeTest:
    match arg_count:
        0: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new()
        1: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
        )
        2: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
        )
        2: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
            test_data[2],
        )
        3: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
            test_data[2],
            test_data[3],
        )
        4: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
            test_data[2],
            test_data[3],
            test_data[4],
        )
        5: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
            test_data[2],
            test_data[3],
            test_data[4],
            test_data[5],
        )
        6: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
            test_data[2],
            test_data[3],
            test_data[4],
            test_data[5],
            test_data[6],
        )
        7: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
            test_data[2],
            test_data[3],
            test_data[4],
            test_data[5],
            test_data[6],
            test_data[7],
        )
        8: return load("res://scripts/godot/tests/args/ConstructorArgSizeTest.gdj").new(
            test_data[0],
            test_data[1],
            test_data[2],
            test_data[3],
            test_data[4],
            test_data[5],
            test_data[6],
            test_data[7],
            test_data[8],
        )
        _: return null

func test_constructor_arg_size():
    for arg_count in range(0, test_data.size()):
        var test_instance = _provide_test_instance_for_arg_count(arg_count)

        var result = test_instance.get_received_constructor_args()

        if arg_count != 0:
            for arg_index in range(0, arg_count):
                var expected_data = test_data[arg_index]
                var actual_data = result[arg_index]
                assert_eq(expected_data, actual_data, "arg with index %s did not match expected arg" % arg_index)
        else:
            assert_eq(result.size(), 0, "arg count should be 0 when calling no arg constructor")

        test_instance.free()

extends GdUnitTestSuite


func _assert_bind_variants(script: Object, expected: Array[int], label: String) -> void:
    assert_that(script.method_binds[0]).override_failure_message("%s first bind mismatch" % label).is_equal(expected[0])
    assert_that(script.method_binds[1]).override_failure_message("%s second bind mismatch" % label).is_equal(expected[1])
    assert_that(script.method_binds[2]).override_failure_message("%s third bind mismatch" % label).is_equal(expected[2])


func _exercise_bind_suite(script: Object, expected_sets: Array, label: String) -> void:
    script.call_with_method_with_all_binds()
    _assert_bind_variants(script, expected_sets[0], label)

    script.call_with_method_with_two_binds()
    _assert_bind_variants(script, expected_sets[1], label)

    script.call_with_method_with_one_bind()
    _assert_bind_variants(script, expected_sets[2], label)

    script.call_with_method_with_no_bind()
    _assert_bind_variants(script, expected_sets[3], label)


func test_kotlin_callable_method_bind() -> void:
    var script := CallableMethodBindKotlinTest.new()
    _exercise_bind_suite(script, [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12]], "Kotlin")
    script.free()


func test_java_callable_method_bind() -> void:
    var script := CallableMethodBindJavaTest.new()
    _exercise_bind_suite(script, [[-9, -8, -7], [-6, -5, -4], [-3, -2, -1], [0, 1, 2]], "Java")
    script.free()


func test_scala_callable_method_bind() -> void:
    var script := CallableMethodBindScalaTest.new()
    _exercise_bind_suite(script, [[-9, -8, -7], [-6, -5, -4], [-3, -2, -1], [0, 1, 2]], "Scala")
    script.free()

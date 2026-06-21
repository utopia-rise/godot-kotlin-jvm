extends GdUnitTestSuite

func test_packed_byte_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_byte_array()
    var expected := [0, 1, 2, 4, 8, 16, 32, 64, 127]

    assert_that(packed.size()).override_failure_message("PackedByteArray should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedByteArray value should match the original Kotlin ByteArray").is_equal(expected[index])
        assert_that(script.get_byte_array_value(packed, index)).override_failure_message("Reading the PackedByteArray back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_int32_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_int_array()
    var expected := [0, 1, 2, 4, 8, 16, 32, 64, 127]

    assert_that(packed.size()).override_failure_message("PackedInt32Array should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedInt32Array value should match the original Kotlin IntArray").is_equal(expected[index])
        assert_that(script.get_int_array_value(packed, index)).override_failure_message("Reading the PackedInt32Array back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_int64_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_long_array()
    var expected := [0, 1, 2, 4, 8, 16, 32, 64, 127]

    assert_that(packed.size()).override_failure_message("PackedInt64Array should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedInt64Array value should match the original Kotlin LongArray").is_equal(expected[index])
        assert_that(script.get_long_array_value(packed, index)).override_failure_message("Reading the PackedInt64Array back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_float32_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_float_array()
    var expected := [0.0, 1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 127.0]

    assert_that(packed.size()).override_failure_message("PackedFloat32Array should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedFloat32Array value should match the original Kotlin FloatArray").is_equal(expected[index])
        assert_that(script.get_float_array_value(packed, index)).override_failure_message("Reading the PackedFloat32Array back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_float64_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_double_array()
    var expected := [0.0, 1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 127.0]

    assert_that(packed.size()).override_failure_message("PackedFloat64Array should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedFloat64Array value should match the original Kotlin DoubleArray").is_equal(expected[index])
        assert_that(script.get_double_array_value(packed, index)).override_failure_message("Reading the PackedFloat64Array back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_color_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_color_array()
    var expected := [
        Color(0.0, 1.0, 2.0, 3.0),
        Color(4.0, 5.0, 6.0, 7.0),
        Color(8.0, 9.0, 10.0, 11.0),
        Color(1024.0, 2048.0, 4096.0, 8092.0),
    ]

    assert_that(packed.size()).override_failure_message("PackedColorArray should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedColorArray value should match the original Kotlin collection").is_equal(expected[index])
        assert_that(script.get_color_array_value(packed, index)).override_failure_message("Reading the PackedColorArray back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_vector2_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_vector2_array()
    var expected := [
        Vector2(0.0, 1.0),
        Vector2(2.0, 3.0),
        Vector2(4.0, 5.0),
        Vector2(1024.0, 2048.0),
    ]

    assert_that(packed.size()).override_failure_message("PackedVector2Array should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedVector2Array value should match the original Kotlin collection").is_equal(expected[index])
        assert_that(script.get_vector2_array_value(packed, index)).override_failure_message("Reading the PackedVector2Array back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_vector2_array_variant_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_vector2_variant_array()

    assert_that(packed.size()).override_failure_message("PackedVector2Array created from a VariantArray should preserve its element count").is_equal(2)
    assert_that(packed[0]).override_failure_message("First PackedVector2Array value created from a VariantArray should be preserved").is_equal(Vector2(0.0, 1.0))
    assert_that(packed[1]).override_failure_message("Second PackedVector2Array value created from a VariantArray should be preserved").is_equal(Vector2(2.0, 3.0))

    script.free()


func test_packed_vector3_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_vector3_array()
    var expected := [
        Vector3(0.0, 1.0, 2.0),
        Vector3(3.0, 4.0, 5.0),
        Vector3(6.0, 7.0, 8.0),
        Vector3(1024.0, 2048.0, 4096.0),
    ]

    assert_int(packed.size()).override_failure_message("PackedVector3Array should contain at least the expected values").is_greater_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedVector3Array value should match the original Kotlin collection").is_equal(expected[index])
        assert_that(script.get_vector3_array_value(packed, index)).override_failure_message("Reading the PackedVector3Array back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()


func test_packed_vector4_array_conversion() -> void:
    var script := PackedArrayTest.new()
    var packed := script.convert_vector4_array()
    var expected := [
        Vector4(0.0, 1.0, 2.0, 3.0),
        Vector4(4.0, 5.0, 6.0, 7.0),
        Vector4(8.0, 9.0, 10.0, 11.0),
        Vector4(1024.0, 2048.0, 4096.0, 8092.0),
    ]

    assert_that(packed.size()).override_failure_message("PackedVector4Array should contain the expected number of values").is_equal(expected.size())
    for index in range(expected.size()):
        assert_that(packed[index]).override_failure_message("PackedVector4Array value should match the original Kotlin collection").is_equal(expected[index])
        assert_that(script.get_vector4_array_value(packed, index)).override_failure_message("Reading the PackedVector4Array back on the JVM side should preserve the value").is_equal(expected[index])

    script.free()

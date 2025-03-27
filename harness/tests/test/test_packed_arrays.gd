extends GdUnitTestSuite


func test_packed_byte_array_add_delete() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.packed_byte_array.size()).override_failure_message("PackedByteArray should be empty").is_equal(0)
    invocation_script.add_byte_to_packed_array(2)
    assert_that(invocation_script.packed_byte_array.size()).override_failure_message("PackedByteArray have one element").is_equal(1)
    invocation_script.add_byte_array_to_packed_array(PackedByteArray([2, 3]))
    assert_that(invocation_script.packed_byte_array.size()).override_failure_message("PackedByteArray have 3 elements").is_equal(3)
    invocation_script.delete_byte_from_packed_array(0)
    assert_that(invocation_script.packed_byte_array.size()).override_failure_message("PackedByteArray have 2 elements").is_equal(2)

    # Test resize + set in particular
    invocation_script.resize_byte_packed_array(0)
    assert_that(invocation_script.packed_byte_array.size()).override_failure_message("PackedByteArray was emptied by resize(0)").is_equal(0)
    invocation_script.resize_byte_packed_array(3)
    invocation_script.set_byte_in_packed_array(0, 1)
    invocation_script.set_byte_in_packed_array(1, 2)
    invocation_script.set_byte_in_packed_array(2, 3)
    assert_that(invocation_script.packed_byte_array.size()).override_failure_message("PackedByteArray has size 3 after resize(3) and 3x set(...)").is_equal(3)
    assert_that(invocation_script.get_byte_from_packed_array(0)).override_failure_message("First element of PackedByteArray after resize(3) and 3x set(...) should be 1.").is_equal(1)
    assert_that(invocation_script.get_byte_from_packed_array(1)).override_failure_message("Second element of PackedByteArray after resize(3) and 3x set(...) should be 2.").is_equal(2)
    assert_that(invocation_script.get_byte_from_packed_array(2)).override_failure_message("Third element of PackedByteArray after resize(3) and 3x set(...) should be 3.").is_equal(3)

    invocation_script.free()

func test_packed_color_array_add_delete() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.packed_color_array.size()).override_failure_message("PackedColorArray should be empty").is_equal(0)
    invocation_script.add_color_to_packed_array(Color())
    assert_that(invocation_script.packed_color_array.size()).override_failure_message("PackedColorArray have one element").is_equal(1)
    assert_that(invocation_script.get_color_from_packed_array(0)).override_failure_message("First element of PackedColorArray should be default color.").is_equal(Color())
    invocation_script.add_color_array_to_packed_array(PackedColorArray([Color(1, 1, 1), Color(1, 2, 3)]))
    assert_that(invocation_script.packed_color_array.size()).override_failure_message("PackedColorArray have 3 elements").is_equal(3)
    assert_that(invocation_script.get_color_from_packed_array(1)).override_failure_message("Second element of PackedColorArray should be Color(1, 1, 1).").is_equal(Color(1, 1, 1))
    assert_that(invocation_script.get_color_from_packed_array(2)).override_failure_message("Second element of PackedColorArray should be Color(1, 2, 3).").is_equal(Color(1, 2, 3))
    invocation_script.delete_color_from_packed_array(0)
    assert_that(invocation_script.packed_color_array.size()).override_failure_message("PackedColorArray have 2 elements").is_equal(2)

    # Test resize + set in particular
    invocation_script.resize_color_packed_array(0)
    assert_that(invocation_script.packed_color_array.size()).override_failure_message("PackedColorArray was emptied by resize(0)").is_equal(0)
    invocation_script.resize_color_packed_array(3)
    invocation_script.set_color_in_packed_array(0, Color(1, 1, 9))
    invocation_script.set_color_in_packed_array(1, Color(2, 2, 9))
    invocation_script.set_color_in_packed_array(2, Color(3, 3, 9))
    assert_that(invocation_script.packed_color_array.size()).override_failure_message("PackedColorArray has size 3 after resize(3) and 3x set(...)").is_equal(3)
    assert_that(invocation_script.get_color_from_packed_array(0)).override_failure_message("First element of PackedColorArray after resize(3) and 3x set(...) should be Color(1, 1, 9).").is_equal(Color(1, 1, 9))
    assert_that(invocation_script.get_color_from_packed_array(1)).override_failure_message("Second element of PackedColorArray after resize(3) and 3x set(...) should be Color(2, 2, 9).").is_equal(Color(2, 2, 9))
    assert_that(invocation_script.get_color_from_packed_array(2)).override_failure_message("Third element of PackedColorArray after resize(3) and 3x set(...) should be Color(3, 3, 9).").is_equal(Color(3, 3, 9))

    invocation_script.free()

func test_packed_int_array_add_delete() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.packed_int32_array.size()).override_failure_message("PackedInt32Array should be empty").is_equal(0)
    invocation_script.add_int_to_packed_array(2)
    assert_that(invocation_script.packed_int32_array.size()).override_failure_message("PackedInt32Array have one element").is_equal(1)
    assert_that(invocation_script.get_int_from_packed_array(0)).override_failure_message("First element of PackedInt32Array should be 2.").is_equal(2)
    invocation_script.add_int_array_to_packed_array(PackedInt32Array([2, 3]))
    assert_that(invocation_script.packed_int32_array.size()).override_failure_message("PackedInt32Array have 3 elements").is_equal(3)
    assert_that(invocation_script.get_int_from_packed_array(1)).override_failure_message("Second element of PackedInt32Array should be 2.").is_equal(2)
    assert_that(invocation_script.get_int_from_packed_array(2)).override_failure_message("Second element of PackedInt32Array should be 3.").is_equal(3)
    invocation_script.delete_int_from_packed_array(0)
    assert_that(invocation_script.packed_int32_array.size()).override_failure_message("PackedInt32Array have 2 elements").is_equal(2)

    # Test resize + set in particular
    invocation_script.resize_int_packed_array(0)
    assert_that(invocation_script.packed_int32_array.size()).override_failure_message("PackedInt32Array was emptied by resize(0)").is_equal(0)
    invocation_script.resize_int_packed_array(3)
    invocation_script.set_int_in_packed_array(0, 1)
    invocation_script.set_int_in_packed_array(1, 2)
    invocation_script.set_int_in_packed_array(2, 3)
    assert_that(invocation_script.packed_int32_array.size()).override_failure_message("PackedInt32Array has size 3 after resize(3) and 3x set(...)").is_equal(3)
    assert_that(invocation_script.get_int_from_packed_array(0)).override_failure_message("First element of PackedInt32Array after resize(3) and 3x set(...) should be 1.").is_equal(1)
    assert_that(invocation_script.get_int_from_packed_array(1)).override_failure_message("Second element of PackedInt32Array after resize(3) and 3x set(...) should be 2.").is_equal(2)
    assert_that(invocation_script.get_int_from_packed_array(2)).override_failure_message("Third element of PackedInt32Array after resize(3) and 3x set(...) should be 3.").is_equal(3)

    invocation_script.free()

func test_packed_real_array_add_delete() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.packed_float64_array.size()).override_failure_message("PackedFloat32Array should be empty").is_equal(0)
    invocation_script.add_real_to_packed_array(2.0)
    assert_that(invocation_script.packed_float64_array.size()).override_failure_message("PackedFloat32Array have one element").is_equal(1)
    assert_that(invocation_script.get_real_from_packed_array(0)).override_failure_message("First element of PackedFloat32Array should be 2.0.").is_equal(2.0)
    invocation_script.add_real_array_to_packed_array(PackedFloat64Array([2.0, 3.0]))
    assert_that(invocation_script.packed_float64_array.size()).override_failure_message("PackedFloat32Array have 3 elements").is_equal(3)
    assert_that(invocation_script.get_real_from_packed_array(1)).override_failure_message("Second element of PackedFloat32Array should be 2.0.").is_equal(2.0)
    assert_that(invocation_script.get_real_from_packed_array(2)).override_failure_message("Second element of PackedFloat32Array should be 3.0.").is_equal(3.0)
    invocation_script.delete_real_from_packed_array(0)
    assert_that(invocation_script.packed_float64_array.size()).override_failure_message("PackedFloat32Array have 2 elements").is_equal(2)

    # Test resize + set in particular
    invocation_script.resize_real_packed_array(0)
    assert_that(invocation_script.packed_float64_array.size()).override_failure_message("PackedFloat32Array was emptied by resize(0)").is_equal(0)
    invocation_script.resize_real_packed_array(3)
    invocation_script.set_real_in_packed_array(0, 1.0)
    invocation_script.set_real_in_packed_array(1, 2.0)
    invocation_script.set_real_in_packed_array(2, 3.0)
    assert_that(invocation_script.packed_float64_array.size()).override_failure_message("PackedFloat32Array has size 3 after resize(3) and 3x set(...)").is_equal(3)
    assert_that(invocation_script.get_real_from_packed_array(0)).override_failure_message("First element of PackedFloat32Array after resize(3) and 3x set(...) should be 1.0.").is_equal(1.0)
    assert_that(invocation_script.get_real_from_packed_array(1)).override_failure_message("Second element of PackedFloat32Array after resize(3) and 3x set(...) should be 2.0.").is_equal(2.0)
    assert_that(invocation_script.get_real_from_packed_array(2)).override_failure_message("Third element of PackedFloat32Array after resize(3) and 3x set(...) should be 3.0.").is_equal(3.0)

    invocation_script.free()

func test_packed_string_array_add_delete() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.packed_string_array.size()).override_failure_message("PackedStringArray should be empty").is_equal(0)
    invocation_script.add_string_to_packed_array("2")
    assert_that(invocation_script.packed_string_array.size()).override_failure_message("PackedStringArray have one element").is_equal(1)
    assert_that(invocation_script.get_string_from_packed_array(0)).override_failure_message("First element of PackedStringArray should be 2.").is_equal("2")
    invocation_script.add_string_array_to_packed_array(PackedStringArray(["2", "3"]))
    assert_that(invocation_script.packed_string_array.size()).override_failure_message("PackedStringArray have 3 elements").is_equal(3)
    assert_that(invocation_script.get_string_from_packed_array(1)).override_failure_message("Second element of PackedStringArray should be 2.").is_equal("2")
    assert_that(invocation_script.get_string_from_packed_array(2)).override_failure_message("Second element of PackedStringArray should be 3.").is_equal("3")
    invocation_script.delete_string_from_packed_array(0)
    assert_that(invocation_script.packed_string_array.size()).override_failure_message("PackedStringArray have 2 elements").is_equal(2)

    # Test resize + set in particular
    invocation_script.resize_string_packed_array(0)
    assert_that(invocation_script.packed_string_array.size()).override_failure_message("PackedStringArray was emptied by resize(0)").is_equal(0)
    invocation_script.resize_string_packed_array(3)
    invocation_script.set_string_in_packed_array(0, "1")
    invocation_script.set_string_in_packed_array(1, "2")
    invocation_script.set_string_in_packed_array(2, "3")
    assert_that(invocation_script.packed_string_array.size()).override_failure_message("PackedStringArray has size 3 after resize(3) and 3x set(...)").is_equal(3)
    assert_that(invocation_script.get_string_from_packed_array(0)).override_failure_message("First element of PackedStringArray after resize(3) and 3x set(...) should be 1.").is_equal("1")
    assert_that(invocation_script.get_string_from_packed_array(1)).override_failure_message("Second element of PackedStringArray after resize(3) and 3x set(...) should be 2.").is_equal("2")
    assert_that(invocation_script.get_string_from_packed_array(2)).override_failure_message("Third element of PackedStringArray after resize(3) and 3x set(...) should be 3.").is_equal("3")

    invocation_script.free()

func test_packed_vector2_array_add_delete() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.packed_vector2_array.size()).override_failure_message("PackedVector2Array should be empty").is_equal(0)
    invocation_script.add_vector2_to_packed_array(Vector2(2, 1))
    assert_that(invocation_script.packed_vector2_array.size()).override_failure_message("PackedVector2Array have one element").is_equal(1)
    assert_that(invocation_script.get_vector2_from_packed_array(0)).override_failure_message("First element of PackedVector2Array should be Vector2(2, 1).").is_equal(Vector2(2, 1))
    invocation_script.add_vector2_array_to_packed_array(PackedVector2Array([Vector2(2, 2), Vector2(3, 1)]))
    assert_that(invocation_script.packed_vector2_array.size()).override_failure_message("PackedVector2Array have 3 elements").is_equal(3)
    assert_that(invocation_script.get_vector2_from_packed_array(1)).override_failure_message("Second element of PackedVector2Array should be Vector2(2, 2).").is_equal(Vector2(2, 2))
    assert_that(invocation_script.get_vector2_from_packed_array(2)).override_failure_message("Second element of PackedVector2Array should be Vector2(3, 1).").is_equal(Vector2(3, 1))
    invocation_script.delete_vector2_from_packed_array(0)
    assert_that(invocation_script.packed_vector2_array.size()).override_failure_message("PackedVector2Array have 2 elements").is_equal(2)

    # Test resize + set in particular
    invocation_script.resize_vector2_packed_array(0)
    assert_that(invocation_script.packed_vector2_array.size()).override_failure_message("PackedVector2Array was emptied by resize(0)").is_equal(0)
    invocation_script.resize_vector2_packed_array(3)
    invocation_script.set_vector2_in_packed_array(0, Vector2(1, 1))
    invocation_script.set_vector2_in_packed_array(1, Vector2(2, 2))
    invocation_script.set_vector2_in_packed_array(2, Vector2(3, 3))
    assert_that(invocation_script.packed_vector2_array.size()).override_failure_message("PackedVector2Array has size 3 after resize(3) and 3x set(...)").is_equal(3)
    assert_that(invocation_script.get_vector2_from_packed_array(0)).override_failure_message("First element of PackedVector2Array after resize(3) and 3x set(...) should be Vector2(1, 1).").is_equal(Vector2(1, 1))
    assert_that(invocation_script.get_vector2_from_packed_array(1)).override_failure_message("Second element of PackedVector2Array after resize(3) and 3x set(...) should be Vector2(2, 2).").is_equal(Vector2(2, 2))
    assert_that(invocation_script.get_vector2_from_packed_array(2)).override_failure_message("Third element of PackedVector2Array after resize(3) and 3x set(...) should be Vector2(3, 3).").is_equal(Vector2(3, 3))

    invocation_script.free()

func test_packed_vector3_array_add_delete() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.packed_vector3_array.size()).override_failure_message("PackedVector3Array should be empty").is_equal(0)
    invocation_script.add_vector3_to_packed_array(Vector3(2, 1, 1))
    assert_that(invocation_script.packed_vector3_array.size()).override_failure_message("PackedVector3Array have one element").is_equal(1)
    assert_that(invocation_script.get_vector3_from_packed_array(0)).override_failure_message("First element of PackedVector3Array should be Vector3(2, 1).").is_equal(Vector3(2, 1, 1))
    invocation_script.add_vector3_array_to_packed_array(PackedVector3Array([Vector3(2, 2, 1), Vector3(3, 1, 1)]))
    assert_that(invocation_script.packed_vector3_array.size()).override_failure_message("PackedVector3Array have 3 elements").is_equal(3)
    assert_that(invocation_script.get_vector3_from_packed_array(1)).override_failure_message("Second element of PackedVector3Array should be Vector3(2, 2).").is_equal(Vector3(2, 2, 1))
    assert_that(invocation_script.get_vector3_from_packed_array(2)).override_failure_message("Second element of PackedVector3Array should be Vector3(3, 1).").is_equal(Vector3(3, 1, 1))
    invocation_script.delete_vector3_from_packed_array(0)
    assert_that(invocation_script.packed_vector3_array.size()).override_failure_message("PackedVector3Array have 2 elements").is_equal(2)

    # Test resize + set in particular
    invocation_script.resize_vector3_packed_array(0)
    assert_that(invocation_script.packed_vector3_array.size()).override_failure_message("PackedVector3Array was emptied by resize(0)").is_equal(0)
    invocation_script.resize_vector3_packed_array(3)
    invocation_script.set_vector3_in_packed_array(0, Vector3(1, 1, 9))
    invocation_script.set_vector3_in_packed_array(1, Vector3(2, 2, 9))
    invocation_script.set_vector3_in_packed_array(2, Vector3(3, 3, 9))
    assert_that(invocation_script.packed_vector3_array.size()).override_failure_message("PackedVector3Array has size 3 after resize(3) and 3x set(...)").is_equal(3)
    assert_that(invocation_script.get_vector3_from_packed_array(0)).override_failure_message("First element of PackedVector3Array after resize(3) and 3x set(...) should be Vector3(1, 1, 9).").is_equal(Vector3(1, 1, 9))
    assert_that(invocation_script.get_vector3_from_packed_array(1)).override_failure_message("Second element of PackedVector3Array after resize(3) and 3x set(...) should be Vector3(2, 2, 9).").is_equal(Vector3(2, 2, 9))
    assert_that(invocation_script.get_vector3_from_packed_array(2)).override_failure_message("Third element of PackedVector3Array after resize(3) and 3x set(...) should be Vector3(3, 3, 9).").is_equal(Vector3(3, 3, 9))

    invocation_script.free()

func test_packed_byte_array_string_conversion() -> void:
    var invocation_script = Invocation.new()
    invocation_script.read_string_from_byte_array()
    assert_that(invocation_script.test_string).override_failure_message("The ascii String read from the packed should be equal to the test String").is_equal(invocation_script.ascii_string)
    assert_that(invocation_script.test_string).override_failure_message("The utf8 String read from the packed should be equal to the test String").is_equal(invocation_script.utf8_string)
    invocation_script.free()

func test_packed_byte_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_byte_array()
    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(0)
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(1)
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(2)
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(4)
    assert_that(packed[4]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(8)
    assert_that(packed[5]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(16)
    assert_that(packed[6]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(32)
    assert_that(packed[7]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(64)
    assert_that(packed[8]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin ByteArray").is_equal(127)

    assert_that(script.get_byte_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(0)
    assert_that(script.get_byte_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(1)
    assert_that(script.get_byte_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(2)
    assert_that(script.get_byte_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(4)
    assert_that(script.get_byte_array_value(packed, 4)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(8)
    assert_that(script.get_byte_array_value(packed, 5)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(16)
    assert_that(script.get_byte_array_value(packed, 6)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(32)
    assert_that(script.get_byte_array_value(packed, 7)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(64)
    assert_that(script.get_byte_array_value(packed, 8)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin ByteArray").is_equal(127)

    script.free()

func test_packed_int_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_int_array()
    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(0)
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(1)
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(2)
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(4)
    assert_that(packed[4]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(8)
    assert_that(packed[5]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(16)
    assert_that(packed[6]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(32)
    assert_that(packed[7]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(64)
    assert_that(packed[8]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin IntArray").is_equal(127)

    assert_that(script.get_int_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(0)
    assert_that(script.get_int_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(1)
    assert_that(script.get_int_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(2)
    assert_that(script.get_int_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(4)
    assert_that(script.get_int_array_value(packed, 4)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(8)
    assert_that(script.get_int_array_value(packed, 5)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(16)
    assert_that(script.get_int_array_value(packed, 6)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(32)
    assert_that(script.get_int_array_value(packed, 7)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(64)
    assert_that(script.get_int_array_value(packed, 8)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin IntArray").is_equal(127)

    script.free()

func test_packed_long_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_long_array()
    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(0)
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(1)
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(2)
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(4)
    assert_that(packed[4]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(8)
    assert_that(packed[5]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(16)
    assert_that(packed[6]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(32)
    assert_that(packed[7]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(64)
    assert_that(packed[8]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin LongArray").is_equal(127)

    assert_that(script.get_long_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(0)
    assert_that(script.get_long_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(1)
    assert_that(script.get_long_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(2)
    assert_that(script.get_long_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(4)
    assert_that(script.get_long_array_value(packed, 4)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(8)
    assert_that(script.get_long_array_value(packed, 5)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(16)
    assert_that(script.get_long_array_value(packed, 6)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(32)
    assert_that(script.get_long_array_value(packed, 7)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(64)
    assert_that(script.get_long_array_value(packed, 8)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin LongArray").is_equal(127)

    script.free()

func test_packed_float_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_float_array()
    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(0.0)
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(1.0)
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(2.0)
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(4.0)
    assert_that(packed[4]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(8.0)
    assert_that(packed[5]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(16.0)
    assert_that(packed[6]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(32.0)
    assert_that(packed[7]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(64.0)
    assert_that(packed[8]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin FloatArray").is_equal(127.0)

    assert_that(script.get_float_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(0.0)
    assert_that(script.get_float_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(1.0)
    assert_that(script.get_float_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(2.0)
    assert_that(script.get_float_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(4.0)
    assert_that(script.get_float_array_value(packed, 4)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(8.0)
    assert_that(script.get_float_array_value(packed, 5)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(16.0)
    assert_that(script.get_float_array_value(packed, 6)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(32.0)
    assert_that(script.get_float_array_value(packed, 7)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(64.0)
    assert_that(script.get_float_array_value(packed, 8)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin FloatArray").is_equal(127.0)

    script.free()

func test_packed_double_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_double_array()
    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(0.0)
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(1.0)
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(2.0)
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(4.0)
    assert_that(packed[4]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(8.0)
    assert_that(packed[5]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(16.0)
    assert_that(packed[6]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(32.0)
    assert_that(packed[7]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(64.0)
    assert_that(packed[8]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin DoubleArray").is_equal(127.0)

    assert_that(script.get_double_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(0.0)
    assert_that(script.get_double_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(1.0)
    assert_that(script.get_double_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(2.0)
    assert_that(script.get_double_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(4.0)
    assert_that(script.get_double_array_value(packed, 4)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(8.0)
    assert_that(script.get_double_array_value(packed, 5)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(16.0)
    assert_that(script.get_double_array_value(packed, 6)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(32.0)
    assert_that(script.get_double_array_value(packed, 7)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(64.0)
    assert_that(script.get_double_array_value(packed, 8)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin DoubleArray").is_equal(127.0)

    script.free()

func test_packed_vector2_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_vector2_array()

    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector2").is_equal(Vector2(0.0, 1.0))
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector2").is_equal(Vector2(2.0, 3.0))
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector2").is_equal(Vector2(4.0, 5.0))
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector2").is_equal(Vector2(1024.0, 2048.0))

    assert_that(script.get_vector2_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector2").is_equal(Vector2(0.0, 1.0))
    assert_that(script.get_vector2_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector2").is_equal(Vector2(2.0, 3.0))
    assert_that(script.get_vector2_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector2").is_equal(Vector2(4.0, 5.0))
    assert_that(script.get_vector2_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector2").is_equal(Vector2(1024.0, 2048.0))

    script.free()

func test_packed_vector3_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_vector3_array()

    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector3").is_equal(Vector3(0.0, 1.0, 2.0))
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector3").is_equal(Vector3(3.0, 4.0, 5.0))
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector3").is_equal(Vector3(6.0, 7.0, 8.0))
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector3").is_equal(Vector3(1024.0, 2048.0, 4096.0))

    assert_that(script.get_vector3_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector3").is_equal(Vector3(0.0, 1.0, 2.0))
    assert_that(script.get_vector3_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector3").is_equal(Vector3(3.0, 4.0, 5.0))
    assert_that(script.get_vector3_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector3").is_equal(Vector3(6.0, 7.0, 8.0))
    assert_that(script.get_vector3_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector3").is_equal(Vector3(1024.0, 2048.0, 4096.0))

    script.free()

func test_packed_vector4_array_bulk_conversion() -> void:
    var script: Object = PackedArrayTest.new()
    var packed = script.convert_vector4_array()

    assert_that(packed[0]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector4").is_equal(Vector4(0.0, 1.0, 2.0, 3.0))
    assert_that(packed[1]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector4").is_equal(Vector4(4.0, 5.0, 6.0, 7.0))
    assert_that(packed[2]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector4").is_equal(Vector4(8.0, 9.0, 10.0, 11.0))
    assert_that(packed[3]).override_failure_message("The Godot PackedArray value should match the values in the original Kotlin Vector4").is_equal(Vector4(1024.0, 2048.0, 4096.0, 8092.0))
    assert_that(script.get_vector4_array_value(packed, 0)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector4").is_equal(Vector4(0.0, 1.0, 2.0, 3.0))
    assert_that(script.get_vector4_array_value(packed, 1)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector4").is_equal(Vector4(4.0, 5.0, 6.0, 7.0))
    assert_that(script.get_vector4_array_value(packed, 2)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector4").is_equal(Vector4(8.0, 9.0, 10.0, 11.0))
    assert_that(script.get_vector4_array_value(packed, 3)).override_failure_message("The original Godot PackedArray value should match the values in the Kotlin Vector4").is_equal(Vector4(1024.0, 2048.0, 4096.0, 8092.0))

    script.free()

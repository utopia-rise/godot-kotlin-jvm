extends GdUnitTestSuite


func _long_string_value() -> String:
    return "This is a deliberately long core string used for transport verification. " \
        + "It includes enough text to cross the tiny-value case and make sure the buffer " \
        + "still preserves longer payloads without trimming, reordering, or accidental reuse."


func _assert_core_round_trip(read_method: String, echo_method: String, expected: Variant) -> void:
    var instance := CoreTest.new()
    assert_that(instance.call(read_method)).override_failure_message("%s should return the expected core value" % read_method).is_equal(expected)
    assert_that(instance.callv(echo_method, [expected])).override_failure_message("%s should return the value unchanged through the buffer" % echo_method).is_equal(expected)
    instance.free()


func test_short_string_round_trip() -> void:
    _assert_core_round_trip("read_short_string", "echo_short_string", "short core string")


func test_long_string_round_trip() -> void:
    _assert_core_round_trip("read_long_string", "echo_long_string", _long_string_value())


func test_vector2_round_trip() -> void:
    _assert_core_round_trip("read_vector2", "echo_vector2", Vector2(1.25, 2.5))


func test_vector2i_round_trip() -> void:
    _assert_core_round_trip("read_vector2i", "echo_vector2i", Vector2i(11, 22))


func test_rect2_round_trip() -> void:
    _assert_core_round_trip("read_rect2", "echo_rect2", Rect2(1.5, 2.5, 3.5, 4.5))


func test_rect2i_round_trip() -> void:
    _assert_core_round_trip("read_rect2i", "echo_rect2i", Rect2i(3, 4, 5, 6))


func test_vector3_round_trip() -> void:
    _assert_core_round_trip("read_vector3", "echo_vector3", Vector3(1.25, 2.5, 3.75))


func test_vector3i_round_trip() -> void:
    _assert_core_round_trip("read_vector3i", "echo_vector3i", Vector3i(7, 8, 9))


func test_transform2d_round_trip() -> void:
    _assert_core_round_trip("read_transform2_d", "echo_transform2_d", Transform2D(Vector2(1, 2), Vector2(3, 4), Vector2(5, 6)))


func test_vector4_round_trip() -> void:
    _assert_core_round_trip("read_vector4", "echo_vector4", Vector4(1.25, 2.5, 3.75, 4.125))


func test_vector4i_round_trip() -> void:
    _assert_core_round_trip("read_vector4i", "echo_vector4i", Vector4i(10, 11, 12, 13))


func test_plane_round_trip() -> void:
    _assert_core_round_trip("read_plane", "echo_plane", Plane(1.5, 2.5, 3.5, 4.5))


func test_quaternion_round_trip() -> void:
    _assert_core_round_trip("read_quaternion", "echo_quaternion", Quaternion(0.5, 1.5, 2.5, 3.5))


func test_aabb_round_trip() -> void:
    _assert_core_round_trip("read_aabb", "echo_aabb", AABB(Vector3(1, 2, 3), Vector3(4, 5, 6)))


func test_basis_round_trip() -> void:
    _assert_core_round_trip("read_basis", "echo_basis", Basis(Vector3(1, 2, 3), Vector3(4, 5, 6), Vector3(7, 8, 9)))


func test_transform3d_round_trip() -> void:
    _assert_core_round_trip("read_transform3_d", "echo_transform3_d", Transform3D(Vector3(1, 2, 3), Vector3(4, 5, 6), Vector3(7, 8, 9), Vector3(10, 11, 12)))


func test_projection_round_trip() -> void:
    _assert_core_round_trip("read_projection", "echo_projection", Projection.create_perspective(75.0, 1.6, 0.2, 250.0))


func test_color_round_trip() -> void:
    _assert_core_round_trip("read_color", "echo_color", Color(0.11, 0.22, 0.33, 0.44))


func test_string_name_round_trip() -> void:
    _assert_core_round_trip("read_string_name", "echo_string_name", &"core_test_string_name")


func test_node_path_round_trip() -> void:
    _assert_core_round_trip("read_node_path", "echo_node_path", NodePath("Root/Branch:leaf"))


func test_rid_round_trip() -> void:
    _assert_core_round_trip("read_rid", "echo_rid", RID())


func test_packed_byte_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_byte_array", "echo_packed_byte_array", PackedByteArray([1, 3, 5, 7]))


func test_packed_int32_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_int32_array", "echo_packed_int32_array", PackedInt32Array([11, 22, 33]))


func test_packed_int64_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_int64_array", "echo_packed_int64_array", PackedInt64Array([101, 202, 303]))


func test_packed_float32_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_float32_array", "echo_packed_float32_array", PackedFloat32Array([1.25, 2.5, 3.75]))


func test_packed_float64_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_float64_array", "echo_packed_float64_array", PackedFloat64Array([1.125, 2.25, 3.375]))


func test_packed_string_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_string_array", "echo_packed_string_array", PackedStringArray(["alpha", "beta", "gamma"]))


func test_packed_vector2_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_vector2_array", "echo_packed_vector2_array", PackedVector2Array([Vector2(1, 2), Vector2(3, 4)]))


func test_packed_vector3_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_vector3_array", "echo_packed_vector3_array", PackedVector3Array([Vector3(1, 2, 3), Vector3(4, 5, 6)]))


func test_packed_color_array_round_trip() -> void:
    _assert_core_round_trip("read_packed_color_array", "echo_packed_color_array", PackedColorArray([Color(0.1, 0.2, 0.3, 0.4), Color(0.5, 0.6, 0.7, 0.8)]))

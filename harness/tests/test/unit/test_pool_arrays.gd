extends "res://addons/gut/test.gd"


func test_pool_byte_array_add_delete() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.pool_byte_array.size(), 0, "PoolByteArray should be empty")
	invocation_script.add_byte_to_pool_array(2)
	assert_eq(invocation_script.pool_byte_array.size(), 1, "PoolByteArray have one element")
	invocation_script.add_byte_array_to_pool_array(PoolByteArray([2, 3]))
	assert_eq(invocation_script.pool_byte_array.size(), 3, "PoolByteArray have 3 elements")
	invocation_script.delete_byte_from_pool_array(0)
	assert_eq(invocation_script.pool_byte_array.size(), 2, "PoolByteArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_byte_pool_array(0)
	assert_eq(invocation_script.pool_byte_array.size(), 0, "PoolByteArray was emptied by resize(0)")
	invocation_script.resize_byte_pool_array(3)
	invocation_script.set_byte_in_pool_array(0, 1)
	invocation_script.set_byte_in_pool_array(1, 2)
	invocation_script.set_byte_in_pool_array(2, 3)
	assert_eq(invocation_script.pool_byte_array.size(), 3, "PoolByteArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_byte_from_pool_array(0), 1, "First element of PoolByteArray after resize(3) and 3x set(...) should be 1.")
	assert_eq(invocation_script.get_byte_from_pool_array(1), 2, "Second element of PoolByteArray after resize(3) and 3x set(...) should be 2.")
	assert_eq(invocation_script.get_byte_from_pool_array(2), 3, "Third element of PoolByteArray after resize(3) and 3x set(...) should be 3.")

	invocation_script.free()

func test_pool_color_array_add_delete() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.pool_color_array.size(), 0, "PoolColorArray should be empty")
	invocation_script.add_color_to_pool_array(Color())
	assert_eq(invocation_script.pool_color_array.size(), 1, "PoolColorArray have one element")
	assert_eq(invocation_script.get_color_from_pool_array(0), Color(), "First element of PoolColorArray should be default color.")
	invocation_script.add_color_array_to_pool_array(PoolColorArray([Color(1, 1, 1), Color(1, 2, 3)]))
	assert_eq(invocation_script.pool_color_array.size(), 3, "PoolColorArray have 3 elements")
	assert_eq(invocation_script.get_color_from_pool_array(1), Color(1, 1, 1), "Second element of PoolColorArray should be Color(1, 1, 1).")
	assert_eq(invocation_script.get_color_from_pool_array(2), Color(1, 2, 3), "Second element of PoolColorArray should be Color(1, 2, 3).")
	invocation_script.delete_color_from_pool_array(0)
	assert_eq(invocation_script.pool_color_array.size(), 2, "PoolColorArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_color_pool_array(0)
	assert_eq(invocation_script.pool_color_array.size(), 0, "PoolColorArray was emptied by resize(0)")
	invocation_script.resize_color_pool_array(3)
	invocation_script.set_color_in_pool_array(0, Color(1, 1, 9))
	invocation_script.set_color_in_pool_array(1, Color(2, 2, 9))
	invocation_script.set_color_in_pool_array(2, Color(3, 3, 9))
	assert_eq(invocation_script.pool_color_array.size(), 3, "PoolColorArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_color_from_pool_array(0), Color(1, 1, 9), "First element of PoolColorArray after resize(3) and 3x set(...) should be Color(1, 1, 9).")
	assert_eq(invocation_script.get_color_from_pool_array(1), Color(2, 2, 9), "Second element of PoolColorArray after resize(3) and 3x set(...) should be Color(2, 2, 9).")
	assert_eq(invocation_script.get_color_from_pool_array(2), Color(3, 3, 9), "Third element of PoolColorArray after resize(3) and 3x set(...) should be Color(3, 3, 9).")

	invocation_script.free()

func test_pool_int_array_add_delete() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.pool_int_array.size(), 0, "PoolIntArray should be empty")
	invocation_script.add_int_to_pool_array(2)
	assert_eq(invocation_script.pool_int_array.size(), 1, "PoolIntArray have one element")
	assert_eq(invocation_script.get_int_from_pool_array(0), 2, "First element of PoolIntArray should be 2.")
	invocation_script.add_int_array_to_pool_array(PoolIntArray([2, 3]))
	assert_eq(invocation_script.pool_int_array.size(), 3, "PoolIntArray have 3 elements")
	assert_eq(invocation_script.get_int_from_pool_array(1), 2, "Second element of PoolIntArray should be 2.")
	assert_eq(invocation_script.get_int_from_pool_array(2), 3, "Second element of PoolIntArray should be 3.")
	invocation_script.delete_int_from_pool_array(0)
	assert_eq(invocation_script.pool_int_array.size(), 2, "PoolIntArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_int_pool_array(0)
	assert_eq(invocation_script.pool_int_array.size(), 0, "PoolIntArray was emptied by resize(0)")
	invocation_script.resize_int_pool_array(3)
	invocation_script.set_int_in_pool_array(0, 1)
	invocation_script.set_int_in_pool_array(1, 2)
	invocation_script.set_int_in_pool_array(2, 3)
	assert_eq(invocation_script.pool_int_array.size(), 3, "PoolIntArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_int_from_pool_array(0), 1, "First element of PoolIntArray after resize(3) and 3x set(...) should be 1.")
	assert_eq(invocation_script.get_int_from_pool_array(1), 2, "Second element of PoolIntArray after resize(3) and 3x set(...) should be 2.")
	assert_eq(invocation_script.get_int_from_pool_array(2), 3, "Third element of PoolIntArray after resize(3) and 3x set(...) should be 3.")

	invocation_script.free()

func test_pool_real_array_add_delete() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.pool_real_array.size(), 0, "PoolRealArray should be empty")
	invocation_script.add_real_to_pool_array(2.0)
	assert_eq(invocation_script.pool_real_array.size(), 1, "PoolRealArray have one element")
	assert_eq(invocation_script.get_real_from_pool_array(0), 2.0, "First element of PoolRealArray should be 2.0.")
	invocation_script.add_real_array_to_pool_array(PoolRealArray([2.0, 3.0]))
	assert_eq(invocation_script.pool_real_array.size(), 3, "PoolRealArray have 3 elements")
	assert_eq(invocation_script.get_real_from_pool_array(1), 2.0, "Second element of PoolRealArray should be 2.0.")
	assert_eq(invocation_script.get_real_from_pool_array(2), 3.0, "Second element of PoolRealArray should be 3.0.")
	invocation_script.delete_real_from_pool_array(0)
	assert_eq(invocation_script.pool_real_array.size(), 2, "PoolRealArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_real_pool_array(0)
	assert_eq(invocation_script.pool_real_array.size(), 0, "PoolRealArray was emptied by resize(0)")
	invocation_script.resize_real_pool_array(3)
	invocation_script.set_real_in_pool_array(0, 1.0)
	invocation_script.set_real_in_pool_array(1, 2.0)
	invocation_script.set_real_in_pool_array(2, 3.0)
	assert_eq(invocation_script.pool_real_array.size(), 3, "PoolRealArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_real_from_pool_array(0), 1.0, "First element of PoolRealArray after resize(3) and 3x set(...) should be 1.0.")
	assert_eq(invocation_script.get_real_from_pool_array(1), 2.0, "Second element of PoolRealArray after resize(3) and 3x set(...) should be 2.0.")
	assert_eq(invocation_script.get_real_from_pool_array(2), 3.0, "Third element of PoolRealArray after resize(3) and 3x set(...) should be 3.0.")

	invocation_script.free()

func test_pool_string_array_add_delete() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.pool_string_array.size(), 0, "PoolStringArray should be empty")
	invocation_script.add_string_to_pool_array("2")
	assert_eq(invocation_script.pool_string_array.size(), 1, "PoolStringArray have one element")
	assert_eq(invocation_script.get_string_from_pool_array(0), "2", "First element of PoolStringArray should be 2.")
	invocation_script.add_string_array_to_pool_array(PoolStringArray(["2", "3"]))
	assert_eq(invocation_script.pool_string_array.size(), 3, "PoolStringArray have 3 elements")
	assert_eq(invocation_script.get_string_from_pool_array(1), "2", "Second element of PoolStringArray should be 2.")
	assert_eq(invocation_script.get_string_from_pool_array(2), "3", "Second element of PoolStringArray should be 3.")
	invocation_script.delete_string_from_pool_array(0)
	assert_eq(invocation_script.pool_string_array.size(), 2, "PoolStringArray have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_string_pool_array(0)
	assert_eq(invocation_script.pool_string_array.size(), 0, "PoolStringArray was emptied by resize(0)")
	invocation_script.resize_string_pool_array(3)
	invocation_script.set_string_in_pool_array(0, "1")
	invocation_script.set_string_in_pool_array(1, "2")
	invocation_script.set_string_in_pool_array(2, "3")
	assert_eq(invocation_script.pool_string_array.size(), 3, "PoolStringArray has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_string_from_pool_array(0), "1", "First element of PoolStringArray after resize(3) and 3x set(...) should be 1.")
	assert_eq(invocation_script.get_string_from_pool_array(1), "2", "Second element of PoolStringArray after resize(3) and 3x set(...) should be 2.")
	assert_eq(invocation_script.get_string_from_pool_array(2), "3", "Third element of PoolStringArray after resize(3) and 3x set(...) should be 3.")

	invocation_script.free()

func test_pool_vector2_array_add_delete() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.pool_vector2_array.size(), 0, "PoolVector2Array should be empty")
	invocation_script.add_vector2_to_pool_array(Vector2(2, 1))
	assert_eq(invocation_script.pool_vector2_array.size(), 1, "PoolVector2Array have one element")
	assert_eq(invocation_script.get_vector2_from_pool_array(0), Vector2(2, 1), "First element of PoolVector2Array should be Vector2(2, 1).")
	invocation_script.add_vector2_array_to_pool_array(PoolVector2Array([Vector2(2, 2), Vector2(3, 1)]))
	assert_eq(invocation_script.pool_vector2_array.size(), 3, "PoolVector2Array have 3 elements")
	assert_eq(invocation_script.get_vector2_from_pool_array(1), Vector2(2, 2), "Second element of PoolVector2Array should be Vector2(2, 2).")
	assert_eq(invocation_script.get_vector2_from_pool_array(2), Vector2(3, 1), "Second element of PoolVector2Array should be Vector2(3, 1).")
	invocation_script.delete_vector2_from_pool_array(0)
	assert_eq(invocation_script.pool_vector2_array.size(), 2, "PoolVector2Array have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_vector2_pool_array(0)
	assert_eq(invocation_script.pool_vector2_array.size(), 0, "PoolVector2Array was emptied by resize(0)")
	invocation_script.resize_vector2_pool_array(3)
	invocation_script.set_vector2_in_pool_array(0, Vector2(1, 1))
	invocation_script.set_vector2_in_pool_array(1, Vector2(2, 2))
	invocation_script.set_vector2_in_pool_array(2, Vector2(3, 3))
	assert_eq(invocation_script.pool_vector2_array.size(), 3, "PoolVector2Array has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_vector2_from_pool_array(0), Vector2(1, 1), "First element of PoolVector2Array after resize(3) and 3x set(...) should be Vector2(1, 1).")
	assert_eq(invocation_script.get_vector2_from_pool_array(1), Vector2(2, 2), "Second element of PoolVector2Array after resize(3) and 3x set(...) should be Vector2(2, 2).")
	assert_eq(invocation_script.get_vector2_from_pool_array(2), Vector2(3, 3), "Third element of PoolVector2Array after resize(3) and 3x set(...) should be Vector2(3, 3).")

	invocation_script.free()

func test_pool_vector3_array_add_delete() -> void:
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.pool_vector3_array.size(), 0, "PoolVector3Array should be empty")
	invocation_script.add_vector3_to_pool_array(Vector3(2, 1, 1))
	assert_eq(invocation_script.pool_vector3_array.size(), 1, "PoolVector3Array have one element")
	assert_eq(invocation_script.get_vector3_from_pool_array(0), Vector3(2, 1, 1), "First element of PoolVector3Array should be Vector3(2, 1).")
	invocation_script.add_vector3_array_to_pool_array(PoolVector3Array([Vector3(2, 2, 1), Vector3(3, 1, 1)]))
	assert_eq(invocation_script.pool_vector3_array.size(), 3, "PoolVector3Array have 3 elements")
	assert_eq(invocation_script.get_vector3_from_pool_array(1), Vector3(2, 2, 1), "Second element of PoolVector3Array should be Vector3(2, 2).")
	assert_eq(invocation_script.get_vector3_from_pool_array(2), Vector3(3, 1, 1), "Second element of PoolVector3Array should be Vector3(3, 1).")
	invocation_script.delete_vector3_from_pool_array(0)
	assert_eq(invocation_script.pool_vector3_array.size(), 2, "PoolVector3Array have 2 elements")

	# Test resize + set in particular
	invocation_script.resize_vector3_pool_array(0)
	assert_eq(invocation_script.pool_vector3_array.size(), 0, "PoolVector3Array was emptied by resize(0)")
	invocation_script.resize_vector3_pool_array(3)
	invocation_script.set_vector3_in_pool_array(0, Vector3(1, 1, 9))
	invocation_script.set_vector3_in_pool_array(1, Vector3(2, 2, 9))
	invocation_script.set_vector3_in_pool_array(2, Vector3(3, 3, 9))
	assert_eq(invocation_script.pool_vector3_array.size(), 3, "PoolVector3Array has size 3 after resize(3) and 3x set(...)")
	assert_eq(invocation_script.get_vector3_from_pool_array(0), Vector3(1, 1, 9), "First element of PoolVector3Array after resize(3) and 3x set(...) should be Vector3(1, 1, 9).")
	assert_eq(invocation_script.get_vector3_from_pool_array(1), Vector3(2, 2, 9), "Second element of PoolVector3Array after resize(3) and 3x set(...) should be Vector3(2, 2, 9).")
	assert_eq(invocation_script.get_vector3_from_pool_array(2), Vector3(3, 3, 9), "Third element of PoolVector3Array after resize(3) and 3x set(...) should be Vector3(3, 3, 9).")

	invocation_script.free()

func test_pool_byte_array_string_conversion() -> void:
	var invocation_script = godot_tests_Invocation.new()
	invocation_script.read_string_from_byte_array()
	assert_eq(invocation_script.test_string, invocation_script.ascii_string, "The ascii String read from the pool should be equal to the test String")
	assert_eq(invocation_script.test_string, invocation_script.utf8_string, "The utf8 String read from the pool should be equal to the test String")
	invocation_script.free()

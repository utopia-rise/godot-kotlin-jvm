extends "res://addons/gut/test.gd"


func test_should_return_right_aabb():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))
	assert_eq(instance.aabb, expected_aabb, "Should get same aabb")
	assert_eq(instance.aabb(expected_aabb), expected_aabb, "Buffer should not change Aabb")
	instance.free()

func test_should_return_right_basis():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_basis = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))
	assert_eq(instance.basis, expected_basis, "Should get same basis")
	assert_eq(instance.basis(expected_basis), expected_basis, "Buffer should not change Basis")
	instance.free()

func test_should_return_right_color():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_color = Color(0.1, 0.2, 0.3, 0.4)
	assert_eq(instance.color, expected_color, "Should get same color")
	assert_eq(instance.color(expected_color), expected_color, "Buffer should not change Color")
	instance.free()

func test_should_return_right_plane():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_plane = Plane(1, 2, 3, 4)
	assert_eq(instance.plane, expected_plane, "Should get same plane")
	assert_eq(instance.plane(expected_plane), expected_plane, "Buffer should not change Plane")
	instance.free()

func test_should_return_right_quat():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_quat = Quat(1, 2, 3, 4)
	assert_eq(instance.quat, expected_quat, "Should get same quat")
	assert_eq(instance.quat(expected_quat), expected_quat, "Buffer should not change Quat")
	instance.free()

func test_should_return_right_rect2():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_rect2 = Rect2(1.0, 2.0, 3.0, 4.0)
	assert_eq(instance.rect2, expected_rect2, "Should get same rect2")
	assert_eq(instance.rect2(expected_rect2), expected_rect2, "Buffer should not change Rect2")
	instance.free()

func test_should_return_right_transform():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_transform = Transform(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))
	assert_eq(instance.transform, expected_transform, "Should get same transform")
	assert_eq(instance.transform(expected_transform), expected_transform, "Buffer should not change Transform")
	instance.free()

func test_should_return_right_transform2d():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_transform2d = Transform2D(Vector2(0, 1), Vector2(2, 3), Vector2(4, 5))
	assert_eq(instance.transform2_d, expected_transform2d, "Should get same transform2d")
	assert_eq(instance.transform2_d(expected_transform2d), expected_transform2d, "Buffer should not change Transform2D")
	instance.free()

func test_should_return_right_vector2():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_vector2 = Vector2(1, 2)
	assert_eq(instance.vector2, expected_vector2, "Should get same vector2")
	assert_eq(instance.vector2(expected_vector2), expected_vector2, "Buffer should not change Vector2")
	instance.free()

func test_should_return_right_vector3():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_vector3 = Vector3(1, 2, 3)
	assert_eq(instance.vector3, expected_vector3, "Should get same vector3")
	assert_eq(instance.vector3(expected_vector3), expected_vector3, "Buffer should not change Vector3")
	instance.free()

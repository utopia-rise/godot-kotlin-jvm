extends "res://addons/gut/test.gd"


func test_should_return_right_aabb():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))
	assert_eq(instance.aabb, expected_aabb, "Should get same aabb")
	instance.free()

func test_should_return_right_basis():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_basis = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))
	assert_eq(instance.basis, expected_basis, "Should get same basis")
	instance.free()

func test_should_return_right_color():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_color = Color(0.1, 0.2, 0.3, 0.4)
	assert_eq(instance.color, expected_color, "Should get same color")
	instance.free()

func test_should_return_right_plane():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_plane = Plane(1, 2, 3, 4)
	assert_eq(instance.plane, expected_plane, "Should get same plane")
	instance.free()

func test_should_return_right_quat():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_quat = Quat(1, 2, 3, 4)
	assert_eq(instance.quat, expected_quat, "Should get same quat")
	instance.free()

func test_should_return_right_rect2():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_rect2 = Rect2(1.0, 2.0, 3.0, 4.0)
	assert_eq(instance.rect2, expected_rect2, "Should get same rect2")
	instance.free()

func test_should_return_right_transform():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_transform = Transform(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))
	assert_eq(instance.transform, expected_transform, "Should get same transform")
	instance.free()

func test_should_return_right_transform2d():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_transform2d = Transform2D(Vector2(0, 1), Vector2(2, 3), Vector2(4, 5))
	assert_eq(instance.transform2_d, expected_transform2d, "Should get same transform2d")
	instance.free()

func test_should_return_right_vector2():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_vector2 = Vector2(1, 2)
	assert_eq(instance.vector2, expected_vector2, "Should get same vector2")
	instance.free()

func test_should_return_right_vector3():
	var instance = godot_tests_CoreTypesIdentityTest.new()
	var expected_vector3 = Vector3(1, 2, 3)
	assert_eq(instance.vector3, expected_vector3, "Should get same vector3")
	instance.free()

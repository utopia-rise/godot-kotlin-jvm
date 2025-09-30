extends GdUnitTestSuite


func test_should_return_right_aabb():
    var instance = CoreTypesIdentityTest.new()
    var expected_aabb = AABB(Vector3(1, 1, 1), Vector3(2, 2, 2))
    assert_that(instance.aabb).override_failure_message("Should get same aabb").is_equal(expected_aabb)
    assert_that(instance.aabb(expected_aabb)).override_failure_message("Buffer should not change Aabb").is_equal(expected_aabb)
    instance.free()

func test_should_return_right_basis():
    var instance = CoreTypesIdentityTest.new()
    var expected_basis = Basis(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8))
    assert_that(instance.basis).override_failure_message("Should get same basis").is_equal(expected_basis)
    assert_that(instance.basis(expected_basis)).override_failure_message("Buffer should not change Basis").is_equal(expected_basis)
    instance.free()

func test_should_return_right_color():
    var instance = CoreTypesIdentityTest.new()
    var expected_color = Color(0.1, 0.2, 0.3, 0.4)
    assert_that(instance.color).override_failure_message("Should get same color").is_equal(expected_color)
    assert_that(instance.color(expected_color)).override_failure_message("Buffer should not change Color").is_equal(expected_color)
    instance.free()

func test_should_return_right_plane():
    var instance = CoreTypesIdentityTest.new()
    var expected_plane = Plane(1, 2, 3, 4)
    assert_that(instance.plane).override_failure_message("Should get same plane").is_equal(expected_plane)
    assert_that(instance.plane(expected_plane)).override_failure_message("Buffer should not change Plane").is_equal(expected_plane)
    instance.free()

func test_should_return_right_quat():
    var instance = CoreTypesIdentityTest.new()
    var expected_quat = Quaternion(1, 2, 3, 4)
    assert_that(instance.quaternion).override_failure_message("Should get same quat").is_equal(expected_quat)
    assert_that(instance.quat(expected_quat)).override_failure_message("Buffer should not change Quat").is_equal(expected_quat)
    instance.free()

func test_should_return_right_rect2():
    var instance = CoreTypesIdentityTest.new()
    var expected_rect2 = Rect2(1.0, 2.0, 3.0, 4.0)
    assert_that(instance.rect2).override_failure_message("Should get same rect2").is_equal(expected_rect2)
    assert_that(instance.rect2(expected_rect2)).override_failure_message("Buffer should not change Rect2").is_equal(expected_rect2)
    instance.free()

func test_should_return_right_transform():
    var instance = CoreTypesIdentityTest.new()
    var expected_transform = Transform3D(Vector3(0, 1, 2), Vector3(3, 4, 5), Vector3(6, 7, 8), Vector3(9, 10, 11))
    assert_that(instance.transform3_d).override_failure_message("Should get same transform").is_equal(expected_transform)
    assert_that(instance.transform(expected_transform)).override_failure_message("Buffer should not change Transform").is_equal(expected_transform)
    instance.free()

func test_should_return_right_transform2d():
    var instance = CoreTypesIdentityTest.new()
    var expected_transform2d = Transform2D(Vector2(0, 1), Vector2(2, 3), Vector2(4, 5))
    assert_that(instance.transform2_d).override_failure_message("Should get same transform2d").is_equal(expected_transform2d)
    assert_that(instance.transform2_d(expected_transform2d)).override_failure_message("Buffer should not change Transform2D").is_equal(expected_transform2d)
    instance.free()

func test_should_return_right_vector2():
    var instance = CoreTypesIdentityTest.new()
    var expected_vector2 = Vector2(1, 2)
    assert_that(instance.vector2).override_failure_message("Should get same vector2").is_equal(expected_vector2)
    assert_that(instance.vector2(expected_vector2)).override_failure_message("Buffer should not change Vector2").is_equal(expected_vector2)
    instance.free()

func test_should_return_right_vector3():
    var instance = CoreTypesIdentityTest.new()
    var expected_vector3 = Vector3(1, 2, 3)
    assert_that(instance.vector3).override_failure_message("Should get same vector3").is_equal(expected_vector3)
    assert_that(instance.vector3(expected_vector3)).override_failure_message("Buffer should not change Vector3").is_equal(expected_vector3)
    instance.free()

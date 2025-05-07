extends GdUnitTestSuite


func test_array_any_not_null_append():
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.array_any_size()).override_failure_message("Array should be empty").is_equal(0)
    var obj: Node = Node.new()
    invocation_script.append_any_to_array(obj)
    invocation_script.append_any_to_array(1)
    assert_that(invocation_script.array_any_size()).override_failure_message("Array size should be 2").is_equal(2)
    assert_that(invocation_script.test_array_any[0]).override_failure_message("Should find obj at index 0").is_equal(obj)
    assert_that(invocation_script.get_any_from_array(0)).override_failure_message("Should find obj at index 0").is_equal(obj)
    assert_that(invocation_script.test_array_any[1]).override_failure_message("Should find 1 at index 2").is_equal(1)
    assert_that(invocation_script.get_any_from_array(1)).override_failure_message("Should find 1 at index 2").is_equal(1)
    invocation_script.free()
    obj.free()

func test_array_any_not_null_remove():
    var invocation_script: Object = Invocation.new()
    invocation_script.append_any_to_array(1)
    assert_that(invocation_script.array_any_size()).override_failure_message("Array size should be 1").is_equal(1)
    invocation_script.remove_any_from_array(1)
    assert_that(invocation_script.array_any_size()).override_failure_message("Array size should be 0").is_equal(0)
    var obj = Node.new()
    invocation_script.append_any_to_array(obj)
    assert_that(invocation_script.array_any_size()).override_failure_message("Array size should be 1").is_equal(1)
    invocation_script.remove_any_from_array(obj)
    assert_that(invocation_script.array_any_size()).override_failure_message("Array size should be 0").is_equal(0)
    invocation_script.free()
    obj.free()

func test_array_typed_not_null_append():
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.nav_meshes_size()).override_failure_message("Array size should be 1").is_equal(1)
    var nav_mesh = NavigationMesh.new()
    invocation_script.append_nav_mesh(nav_mesh)
    assert_that(invocation_script.nav_meshes_size()).override_failure_message("Array size should be 2").is_equal(2)
    assert_that(invocation_script.nav_meshes[1]).override_failure_message("Should find nav_mesh at index 1").is_equal(nav_mesh)
    assert_that(invocation_script.get_nav_mesh_from_array(1)).override_failure_message("Should find nav_mesh at index 1").is_equal(nav_mesh)
    invocation_script.free()

func test_array_typed_not_null_remove():
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.nav_meshes_size()).override_failure_message("Array size should be 1").is_equal(1)
    invocation_script.remove_nav_mesh_with_index(0)
    assert_that(invocation_script.nav_meshes_size()).override_failure_message("Array size should be 0").is_equal(0)
    var nav_mesh = NavigationMesh.new()
    invocation_script.append_nav_mesh(nav_mesh)
    assert_that(invocation_script.nav_meshes_size()).override_failure_message("Array size should be 1").is_equal(1)
    invocation_script.remove_nav_mesh(nav_mesh)
    assert_that(invocation_script.nav_meshes_size()).override_failure_message("Array size should be 0").is_equal(0)
    invocation_script.free()

func test_create_user_type_variant_array():
    var invocation_script = Invocation.new()
    var user_type_variant_array = invocation_script.create_variant_array_of_user_type()
    assert_array(user_type_variant_array).override_failure_message("Should return an empty user typed variant array.").is_not_null()
    invocation_script.free()

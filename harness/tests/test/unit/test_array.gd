extends "res://addons/gut/test.gd"


func test_array_any_not_null_append():
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.array_any_size(), 0, "Array should be empty")
	var obj = Node.new()
	invocation_script.append_any_to_array(obj)
	invocation_script.append_any_to_array(1)
	assert_eq(invocation_script.array_any_size(), 2, "Array size should be 2")
	assert_eq(invocation_script.test_array_any[0], obj, "Should find obj at index 0")
	assert_eq(invocation_script.get_any_from_array(0), obj, "Should find obj at index 0")
	assert_eq(invocation_script.test_array_any[1], 1, "Should find 1 at index 2")
	assert_eq(invocation_script.get_any_from_array(1), 1, "Should find 1 at index 2")
	invocation_script.free()
	obj.free()

func test_array_any_not_null_remove():
	var invocation_script = godot_tests_Invocation.new()
	invocation_script.append_any_to_array(1)
	assert_eq(invocation_script.array_any_size(), 1, "Array size should be 1")
	invocation_script.remove_any_from_array(1)
	assert_eq(invocation_script.array_any_size(), 0, "Array size should be 0")
	var obj = Node.new()
	invocation_script.append_any_to_array(obj)
	assert_eq(invocation_script.array_any_size(), 1, "Array size should be 1")
	invocation_script.remove_any_from_array(obj)
	assert_eq(invocation_script.array_any_size(), 0, "Array size should be 0")
	invocation_script.free()
	obj.free()

func test_array_typed_not_null_append():
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.nav_meshes_size(), 1, "Array size should be 1")
	var nav_mesh = NavigationMesh.new()
	invocation_script.append_nav_mesh(nav_mesh)
	assert_eq(invocation_script.nav_meshes_size(), 2, "Array size should be 2")
	assert_eq(invocation_script.nav_meshes[1], nav_mesh, "Should find nav_mesh at index 1")
	assert_eq(invocation_script.get_nav_mesh_from_array(1), nav_mesh, "Should find nav_mesh at index 1")
	invocation_script.free()

func test_array_typed_not_null_remove():
	var invocation_script = godot_tests_Invocation.new()
	assert_eq(invocation_script.nav_meshes_size(), 1, "Array size should be 1")
	invocation_script.remove_nav_mesh_with_index(0)
	assert_eq(invocation_script.nav_meshes_size(), 0, "Array size should be 0")
	var nav_mesh = NavigationMesh.new()
	invocation_script.append_nav_mesh(nav_mesh)
	assert_eq(invocation_script.nav_meshes_size(), 1, "Array size should be 1")
	invocation_script.remove_nav_mesh(nav_mesh)
	assert_eq(invocation_script.nav_meshes_size(), 0, "Array size should be 0")
	invocation_script.free()

func test_create_user_type_variant_array():
	var invocation_script = godot_tests_Invocation.new()
	var user_type_variant_array = invocation_script.create_variant_array_of_user_type()
	assert_not_null(user_type_variant_array, "Should return an empty user typed variant array.")
	invocation_script.free()

#TODO : Should be uncommented when registering nullable is done
#func test_array_nullable_append():
#	var invocation_script = godot_tests_Invocation.new()
#	assert_eq(invocation_script.nullable_nav_meshes_size(), 2, "Array size should be 2")
#	assert_eq(invocation_script.nullable_array[1], null, "Element at index 1 should be null")
#	var nav_mesh = NavigationMesh.new()
#	invocation_script.append_nullable_nav_mesh(nav_mesh)
#	invocation_script.append_nullable_nav_mesh(null)
#	assert_eq(invocation_script.nullable_nav_meshes_size(), 4, "Array size should be 4")
#	assert_eq(invocation_script.nullable_array[2], nav_mesh, "Should find nav_mesh at index 2")
#	assert_eq(invocation_script.nullable_array[3], null, "Element at index 3 should be null")
#	invocation_script.free()

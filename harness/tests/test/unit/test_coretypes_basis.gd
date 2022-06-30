extends "res://addons/gut/test.gd"


func test_should_get_right_vector3_using_operator_get():
	var basis_test = godot_tests_coretypes_BasisTest.new()
	var engine_basis = Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))
	var jvm_basis = Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))
	assert_eq(engine_basis[0], basis_test.get(jvm_basis, 0), "Basis get operator on JVM side should be same as gdscript one.")
	assert_eq(engine_basis[1], basis_test.get(jvm_basis, 1), "Basis get operator on JVM side should be same as gdscript one.")
	assert_eq(engine_basis[2], basis_test.get(jvm_basis, 2), "Basis get operator on JVM side should be same as gdscript one.")
	basis_test.free()

func test_should_set_right_vector3_using_operator_set():
	var basis_test = godot_tests_coretypes_BasisTest.new()
	var engine_basis = Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))
	var jvm_basis = Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))
	engine_basis[0] = Vector3(10, 20, 30)
	engine_basis[1] = Vector3(60, 80, 100)
	engine_basis[2] = Vector3(50, 90, 70)
	jvm_basis = basis_test.set(jvm_basis, 0, Vector3(10, 20, 30))
	jvm_basis = basis_test.set(jvm_basis, 1, Vector3(60, 80, 100))
	jvm_basis = basis_test.set(jvm_basis, 2, Vector3(50, 90, 70))
	assert_eq(engine_basis, jvm_basis, "Basis set operator on JVM side should be same as gdscript one.")
	basis_test.free()

func test_jvm_basis_get_rotation_quat():
	# Tests previous issues with Basis#getQuat()
	# see https://github.com/utopia-rise/godot-kotlin-jvm/pull/330
	var basis_test = godot_tests_coretypes_BasisTest.new()
	var basis = Basis.IDENTITY \
		.rotated(Vector3(1, 0, 0), 5.0 * PI / 180.0) \
		.rotated(Vector3(0, 1, 0), 5.0 * PI / 180.0) \
		.rotated(Vector3(0, 0, 1), 5.0 * PI / 180.0) \
		.scaled(Vector3(1, 2, 3))

	var jvm_quat = basis.get_rotation_quat()
	var engine_quat = basis_test.get_rotation_quat(basis)
	assert_true(engine_quat.is_equal_approx(jvm_quat), "Quat from Basis in JVM should equal expected Quat")
	basis_test.free()

func test_new_jvm_basis_should_be_unity():
	# Tests previous issues with Basis#getQuat()
	# see https://github.com/utopia-rise/godot-kotlin-jvm/pull/330
	var basis_test = godot_tests_coretypes_BasisTest.new()
	var jvm_basis = basis_test.new_jvm_basis()
	var engine_basis = Basis(Vector3(1, 0, 0), Vector3(0, 1, 0), Vector3(0, 0, 1))
	assert_eq(engine_basis, jvm_basis, "Basis() on JVM side should be same as unity gdscript one.")
	basis_test.free()

func test_jvm_basis_is_equal_approx():
	# Tests previous issues with Basis#getQuat()
	# see https://github.com/utopia-rise/godot-kotlin-jvm/pull/330
	var basis_test = godot_tests_coretypes_BasisTest.new()
	var ref = Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))
	assert_true(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(0, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 0, 3), Vector3(6, 8, 10), Vector3(5, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 0), Vector3(6, 8, 10), Vector3(5, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 3), Vector3(0, 8, 10), Vector3(5, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 3), Vector3(6, 0, 10), Vector3(5, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 3), Vector3(6, 8,  0), Vector3(5, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(0, 9, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 0, 7))))
	assert_false(basis_test.is_equal_approx_jvm(ref, Basis(Vector3(1, 2, 3), Vector3(6, 8, 10), Vector3(5, 9, 0))))
	basis_test.free()


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

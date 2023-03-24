extends "res://addons/gut/test.gd"


func test_operator_get_on_jvm_side_should_return_right_axis():
	var vector3_test = Vector3Test.new()
	var engine_vector = Vector3(1, 2, 3)
	var jvm_vector = Vector3(1, 2, 3)
	assert_eq(engine_vector[0], vector3_test.get_from_vector3(jvm_vector, 0), "Vector3 operator get on jvm side should act the same as gdscript one.")
	assert_eq(engine_vector[1], vector3_test.get_from_vector3(jvm_vector, 1), "Vector3 operator get on jvm side should act the same as gdscript one.")
	assert_eq(engine_vector[2], vector3_test.get_from_vector3(jvm_vector, 2), "Vector3 operator get on jvm side should act the same as gdscript one.")
	vector3_test.free()

func test_operator_set_on_jvm_side_should_set_right_axis():
	var vector3_test = Vector3Test.new()
	var engine_vector = Vector3(1, 2, 3)
	var jvm_vector = Vector3(1, 2, 3)
	engine_vector[0] = 10
	engine_vector[1] = 20
	engine_vector[2] = 30
	jvm_vector = vector3_test.set_in_vector3(jvm_vector, 0, 10.0)
	jvm_vector = vector3_test.set_in_vector3(jvm_vector, 1, 20.0)
	jvm_vector = vector3_test.set_in_vector3(jvm_vector, 2, 30.0)
	assert_eq(engine_vector, jvm_vector, "Vector3 operator set on jvm side should act the same as gdscript one.")
	vector3_test.free()

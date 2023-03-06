extends "res://addons/gut/test.gd"

func test_enum_list_getting():
	var invocation_script = Invocation.new()
	var enum_list = invocation_script.enum_list
	assert_eq(enum_list.size(), 1, "Retreived enum list should contain 1 enum")
	assert_eq(enum_list[0], 0, "Retreived enum should be of ordinal 0")
	var enum_list_mutable = invocation_script.enum_list_mutable
	assert_eq(enum_list_mutable.size(), 2, "Retreived enum list mutable should contain 2 enum")
	assert_eq(enum_list_mutable[0], 0, "First enum should be of ordinal 0")
	assert_eq(enum_list_mutable[1], 1, "Second enum should be of ordinal 1")
	
	invocation_script.free()

func test_enum_list_setting():
	var invocation_script = Invocation.new()
	
	invocation_script.enum_list = [0, 1]
	
	var enum_list = invocation_script.enum_list
	assert_eq(enum_list.size(), 2, "Retreived enum list should contain 2 enums")
	assert_eq(enum_list[0], 0, "First enum should be of ordinal 0")
	assert_eq(enum_list[1], 1, "Second enum should be of ordinal 1")
	
	invocation_script.enum_list_mutable = [0, 1, 0]
	
	var enum_list_mutable = invocation_script.enum_list_mutable
	assert_eq(enum_list_mutable.size(), 3, "Retreived enum list should contain 3 enums")
	assert_eq(enum_list_mutable[0], 0, "First enum should be of ordinal 0")
	assert_eq(enum_list_mutable[1], 1, "Second enum should be of ordinal 1")
	assert_eq(enum_list_mutable[2], 0, "Third enum should be of ordinal 0")
	
	invocation_script.free()

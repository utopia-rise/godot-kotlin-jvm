extends GdUnitTestSuite

func test_enum_list_getting():
    var invocation_script = Invocation.new()
    var enum_list = invocation_script.enum_list
    assert_that(enum_list.size()).override_failure_message("Retreived enum list should contain 1 enum").is_equal(1)
    assert_that(enum_list[0]).override_failure_message("Retreived enum should be of ordinal 0").is_equal(0)
    var enum_list_mutable = invocation_script.enum_list_mutable
    assert_that(enum_list_mutable.size()).override_failure_message("Retreived enum list mutable should contain 2 enum").is_equal(2)
    assert_that(enum_list_mutable[0]).override_failure_message("First enum should be of ordinal 0").is_equal(0)
    assert_that(enum_list_mutable[1]).override_failure_message("Second enum should be of ordinal 1").is_equal(1)
    
    invocation_script.free()

func test_enum_list_setting():
    var invocation_script = Invocation.new()
    
    invocation_script.enum_list = [0, 1]
    
    var enum_list = invocation_script.enum_list
    assert_that(enum_list.size()).override_failure_message("Retreived enum list should contain 2 enums").is_equal(2)
    assert_that(enum_list[0]).override_failure_message("First enum should be of ordinal 0").is_equal(0)
    assert_that(enum_list[1]).override_failure_message("Second enum should be of ordinal 1").is_equal(1)
    
    invocation_script.enum_list_mutable = [0, 1, 0]
    
    var enum_list_mutable = invocation_script.enum_list_mutable
    assert_that(enum_list_mutable.size()).override_failure_message("Retreived enum list should contain 3 enums").is_equal(3)
    assert_that(enum_list_mutable[0]).override_failure_message("First enum should be of ordinal 0").is_equal(0)
    assert_that(enum_list_mutable[1]).override_failure_message("Second enum should be of ordinal 1").is_equal(1)
    assert_that(enum_list_mutable[2]).override_failure_message("Third enum should be of ordinal 0").is_equal(0)
    
    invocation_script.free()

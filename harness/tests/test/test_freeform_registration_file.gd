extends GdUnitTestSuite


func test_array_any_not_null_append():
    var freeform_script = FreeformRegistrationFileTestClass.new()
    
    assert_that(freeform_script.greeting()).override_failure_message("Greeting received from freeform test class does not match").is_equal("Hello from class with freely moved registration file")
    
    freeform_script.free()

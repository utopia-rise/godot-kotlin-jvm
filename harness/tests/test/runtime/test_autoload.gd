extends GdUnitTestSuite


func test_kotlin_autoloads_are_accessible() -> void:
    assert_that(KotlinScriptAutoload).override_failure_message("The direct Kotlin script autoload should be accessible").is_not_null()
    assert_that(KotlinScriptAutoload.property_value).is_equal("script-autoload-property")
    assert_that(KotlinScriptAutoload.read_value()).is_equal("script-autoload-method")

    assert_that(KotlinSceneAutoload).override_failure_message("The scene Kotlin autoload should be accessible").is_not_null()
    assert_that(KotlinSceneAutoload.property_value).is_equal("scene-autoload-property")
    assert_that(KotlinSceneAutoload.read_value()).is_equal("scene-autoload-method")

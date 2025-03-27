extends GdUnitTestSuite


func test_kotlin_test_class() -> void:
    var kotlin_scene: KotlinTestClass = load("res://kotlin_test_scene.tscn").instantiate()
    get_tree().root.add_child(kotlin_scene)

    assert_that(kotlin_scene.exported_int).override_failure_message("Field from kotlin should match").is_equal(1)
    kotlin_scene.exported_int = 2
    assert_that(kotlin_scene.exported_int).override_failure_message("Field from kotlin should be writable").is_equal(2)
    assert_that(kotlin_scene.greeting()).override_failure_message("Greeting from kotlin should match").is_equal("Hello from kotlin")
    assert_bool(kotlin_scene.entered_tree).override_failure_message("_enter_tree should've been invoked in kotlin").is_true()

    kotlin_scene.notification(0)
    assert_bool(kotlin_scene.notification_triggered).override_failure_message("_notification should be registered and invoked in kotlin").is_true()

    get_tree().root.remove_child(kotlin_scene)
    kotlin_scene.free()


func test_java_test_class() -> void:
    var java_scene: JavaTestClass = load("res://java_test_scene.tscn").instantiate()
    get_tree().root.add_child(java_scene)

    assert_that(java_scene.exported_int).override_failure_message("Field from java should match").is_equal(1)
    java_scene.exported_int = 2
    assert_that(java_scene.exported_int).override_failure_message("Field from java should be writable").is_equal(2)
    assert_that(java_scene.greeting()).override_failure_message("Greeting from java should match").is_equal("Hello from java")
    assert_bool(java_scene.entered_tree).override_failure_message("_enter_tree should've been invoked in java").is_true()

    java_scene.notification(0)
    assert_bool(java_scene.notification_triggered).override_failure_message("_notification should be registered and invoked in java").is_true()

    get_tree().root.remove_child(java_scene)
    java_scene.free()


func test_scala_test_class() -> void:
    var scala_scene: ScalaTestClass = load("res://scala_test_scene.tscn").instantiate()
    get_tree().root.add_child(scala_scene)

    assert_that(scala_scene.exported_int).override_failure_message("Field from scala should match").is_equal(1)
    scala_scene.exported_int = 2
    assert_that(scala_scene.exported_int).override_failure_message("Field from scala should be writable").is_equal(2)
    assert_that(scala_scene.greeting()).override_failure_message("Greeting from scala should match").is_equal("Hello from scala")
    assert_bool(scala_scene.entered_tree).override_failure_message("_enter_tree should've been invoked in scala").is_true()

    scala_scene.notification(0)
    assert_bool(scala_scene.notification_triggered).override_failure_message("_notification should be registered and invoked in scala").is_true()

    get_tree().root.remove_child(scala_scene)
    scala_scene.free()

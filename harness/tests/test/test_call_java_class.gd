extends GdUnitTestSuite


func test_call_function():
    var java_scene = load("res://java_test_scene.tscn").instantiate()
    var greeting = java_scene.greeting()
    assert_that(greeting).override_failure_message("Greeting from java class should match").is_equal("Hello from java")
    java_scene.free()


func test_field_access():
    var java_scene = load("res://java_test_scene.tscn").instantiate()
    assert_that(java_scene.exported_int).override_failure_message("Field from java should match").is_equal(1)
    java_scene.free()


func test_field_set():
    var java_scene = load("res://java_test_scene.tscn").instantiate()
    java_scene.exported_int = 2
    assert_that(java_scene.exported_int).override_failure_message("Field from java should match").is_equal(2)
    java_scene.free()


func test_signal():
    var java_scene: JavaTestClass = load("res://java_test_scene.tscn").instantiate()
    get_tree().root.add_child(java_scene)
    await get_tree().create_timer(1).timeout
    java_scene.connect_and_trigger_signal()
    assert_bool(java_scene.signal_emitted).override_failure_message("Signal should've been emitted in java").is_true()

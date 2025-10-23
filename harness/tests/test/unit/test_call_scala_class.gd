extends "res://addons/gut/test.gd"


func test_call_function():
    var scala_scene = load("res://scala_test_scene.tscn").instantiate()
    var greeting = scala_scene.greeting()
    assert_eq(greeting, "Hello from scala", "Greeting from scala class should match")
    scala_scene.free()


func test_field_access():
    var scala_scene = load("res://scala_test_scene.tscn").instantiate()
    assert_eq(scala_scene.exported_int, 1, "Field from scala should match")
    scala_scene.free()


func test_field_set():
    var scala_scene = load("res://scala_test_scene.tscn").instantiate()
    scala_scene.exported_int = 2
    assert_eq(scala_scene.exported_int, 2, "Field from scala should match")
    scala_scene.free()

##func test_signal():
##    var scala_scene: ScalaTestClass = load("res://scala_test_scene.tscn").instantiate()
##    get_tree().root.add_child(scala_scene)
##    await get_tree().create_timer(1).timeout
##    scala_scene.connect_and_trigger_signal()
##    assert_true(scala_scene.signal_emitted, "Signal should've been emitted in scala")

extends GdUnitTestSuite


func test_script_is_attached() -> void:
    var invocation_scene = load("res://Spatial.tscn").instantiate()
    assert_that(invocation_scene.get_script().get_path()).override_failure_message("Scene script path should be res://scripts/godot/tests/Invocation.gdj").is_equal("res://scripts/godot/tests/Invocation.gdj")
    invocation_scene.free()

func test_godot_to_jvm_call() -> void:
    var invocation_script = load("res://scripts/godot/tests/Invocation.gdj").new()
    assert_that(invocation_script.int_addition(2, 7)).override_failure_message("call to addition jvm method should return 2 + 7").is_equal(9)
    invocation_script.free()

func test_get_int_call() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.x).override_failure_message("Call to get should return value of jvm variable").is_equal(0)
    invocation_script.free()

func test_set_int_call() -> void:
    var invocation_script = Invocation.new()
    invocation_script.x = 1
    assert_that(invocation_script.x).override_failure_message("Should have set value of jvm variable").is_equal(1)
    invocation_script.free()

func test_get_double_call() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.y).override_failure_message("Call to get should return value of jvm variable").is_equal(0.0)
    invocation_script.free()

func test_set_double_call() -> void:
    var invocation_script = Invocation.new()
    invocation_script.y = 1.0
    assert_that(invocation_script.y).override_failure_message("Call to get should return value of jvm variable").is_equal(1.0)
    invocation_script.free()

func test_get_float_call() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.z).override_failure_message("Call to get should return value of jvm variable").is_equal(0.0)
    invocation_script.free()

func test_set_float_call() -> void:
    var invocation_script = Invocation.new()
    invocation_script.z = 1.0
    assert_that(invocation_script.z).override_failure_message("Call to get should return value of jvm variable").is_equal(1.0)
    invocation_script.free()

func test_get_string_call() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.custom_name).override_failure_message("Call to get should return value of jvm variable").is_equal("Idonthaveanyidea")
    invocation_script.free()

func test_int_value() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.int_value(2)).override_failure_message("int value cast should return exactly same value").is_equal(2)
    invocation_script.free()

func test_long_value() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.long_value(2)).override_failure_message("long value cast should return exactly same value").is_equal(2)
    invocation_script.free()

func test_float_value() -> void:
    var invocation_script: Object = Invocation.new()
    assert_that(invocation_script.float_value(2.0)).override_failure_message("float value cast should return exactly same value").is_equal(2.0)
    invocation_script.free()

func test_double_value() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.double_value(2.0)).override_failure_message("double value cast should return exactly same value").is_equal(2.0)
    invocation_script.free()

func test_boolean_value() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.boolean_value(true)).override_failure_message("boolean value cast should return exactly same value").is_equal(true)
    invocation_script.free()

func test_string_value() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.string_value("hello")).override_failure_message("string value cast should return exactly same value").is_equal("hello")
    invocation_script.free()

func test_call_to_godot() -> void:
    var invocation_script = Invocation.new()
    invocation_script.name = "Hellooo"
    assert_that(invocation_script.name).override_failure_message("Node::set_name should have been called.").is_equal("Hellooo")
    invocation_script.free()

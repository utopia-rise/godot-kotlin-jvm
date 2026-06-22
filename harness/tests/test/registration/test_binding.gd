extends GdUnitTestSuite

func test_instance_binding():
    var test_script: Object = BindingTest.new()
    var bound_obj: Node = Node.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be Node").is_equal("Node")
    
    bound_obj.free()
    test_script.free()
 
func test_script_binding():
    var test_script: Object = BindingTest.new()
    var bound_obj: Node = BindingA.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be BindingA").is_equal("BindingA")
    
    bound_obj.free()
    test_script.free()

func test_add_script():
    var test_script: Object = BindingTest.new()
    var bound_obj: Node = Node.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be Node").is_equal("Node")
    
    bound_obj.set_script(BindingA)
    clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be BindingA").is_equal("BindingA")
    
    bound_obj.free()
    test_script.free()

func test_remove_script():
    var test_script: Object = BindingTest.new()
    var bound_obj: Node = BindingA.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be BindingA").is_equal("BindingA")
    
    bound_obj.set_script(null)
    clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be Node").is_equal("Node")
    
    bound_obj.free()
    test_script.free()
    
func test_add_then_remove_script():
    var test_script: Object = BindingTest.new()
    var bound_obj: Node = Node.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be Node").is_equal("Node")
    
    bound_obj.set_script(BindingA)
    clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be BindingA").is_equal("BindingA")
    
    bound_obj.set_script(null)
    clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be Node").is_equal("Node")
    
    bound_obj.free()
    test_script.free()

func test_switch_script():
    var test_script: Object = BindingTest.new()
    var bound_obj: Object = BindingA.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be BindingA").is_equal("BindingA")
        
    bound_obj.set_script(BindingB)
    clazz = test_script.get_class_name(bound_obj)
    assert_that(clazz).override_failure_message("Type should be BindingB").is_equal("BindingB")
    
    bound_obj.free()
    test_script.free()
    
func test_path_script():
    var test_script: Object = load("res://src/main/kotlin/godot/tests/registration/BindingTest.kt").new()

    var kotlin_script: Object = BindingA.new()
    var clazz = test_script.get_class_name(kotlin_script)
    assert_that(clazz).override_failure_message("Type should be BindingA").is_equal("BindingA")

    var java_script: Object = load("res://src/main/java/godot/tests/syntax/JavaTestClass.java").new()
    clazz = test_script.get_class_name(java_script)
    assert_that(clazz).override_failure_message("Type should be JavaTestClass").is_equal("JavaTestClass")
    
    kotlin_script.free()
    java_script.free()
    test_script.free()
    
func test_path_script_and_named_script_equality():
    var path_script: Script = load("res://src/main/kotlin/godot/tests/registration/BindingTest.kt")
    var named_script: Script = BindingTest
    assert_object(named_script).override_failure_message("Path and Named version of script shouldn't be equal").is_not_same(path_script)


func test_registered_property_getter_setter_behavior():
    var test_script: Object = BindingTest.new()

    test_script.validated_name_backing = "  bridge value  "
    assert_that(test_script.validated_name_backing).override_failure_message("Registered property getters/setters should preserve their Kotlin-side behavior when accessed from GDScript").is_equal("BRIDGE VALUE")
    assert_that(test_script.setter_calls).override_failure_message("GDScript property writes should go through the Kotlin setter").is_equal(1)
    assert_that(test_script.getter_calls).override_failure_message("GDScript property reads should go through the Kotlin getter").is_equal(1)

    test_script.free()


func test_registered_property_name_and_variant_collections():
    var test_script: Object = BindingTest.new()

    test_script.set("is_enabled", true)
    assert_bool(test_script.get("is_enabled")).override_failure_message("Boolean registered properties should remain reachable through their Godot-facing property name").is_true()

    test_script.typed_int_array = [4, 5, 6]
    assert_that(test_script.sum_typed_int_array()).override_failure_message("Typed VariantArray properties assigned from GDScript should remain readable on the Kotlin side").is_equal(15)

    test_script.nullable_variant_array = ["beta", 9]
    assert_that(test_script.read_nullable_array_entry(0)).is_equal("beta")
    assert_that(test_script.read_nullable_array_entry(1)).is_equal("9")

    test_script.write_mixed_dictionary_entry("from_gdscript", "ok")
    assert_that(test_script.mixed_dictionary["from_gdscript"]).override_failure_message("Dictionary-like registered properties should stay mutable across the bridge").is_equal("ok")

    test_script.free()

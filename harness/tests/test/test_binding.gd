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
    var test_script: Object = load("res://src/main/kotlin/godot/tests/binding/BindingTest.kt").new()

    var kotlin_script: Object = load("res://src/main/kotlin/godot/tests/binding/BindingA.kt").new()
    var clazz = test_script.get_class_name(kotlin_script)
    assert_that(clazz).override_failure_message("Type should be BindingA").is_equal("BindingA")

    var java_script: Object = load("res://src/main/java/godot/tests/JavaTestClass.java").new()
    clazz = test_script.get_class_name(java_script)
    assert_that(clazz).override_failure_message("Type should be JavaTestClass").is_equal("JavaTestClass")
    
    kotlin_script.free()
    java_script.free()
    test_script.free()
    
func test_path_script_and_named_script_equality():
    var path_script: Script = load("res://src/main/kotlin/godot/tests/binding/BindingA.kt")
    var named_script: Script = BindingA
    assert_object(named_script).override_failure_message("Path and Named version of script shouldn't be equal").is_not_same(path_script)

extends "res://addons/gut/test.gd"

func test_instance_binding():
    var test_script: BindingTest = BindingTest.new()
    var bound_obj: Node = Node.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "Node", "Type should be Node")
    
    bound_obj.free()
    test_script.free()
 
func test_script_binding():
    var test_script: BindingTest = BindingTest.new()
    var bound_obj: Node = BindingA.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "BindingA", "Type should be BindingA")
    
    bound_obj.free()
    test_script.free()

func test_add_script():
    var test_script: BindingTest = BindingTest.new()
    var bound_obj: Node = Node.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "Node", "Type should be Node")
    
    bound_obj.set_script(BindingA)
    clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "BindingA", "Type should be BindingA")
    
    bound_obj.free()
    test_script.free()

func test_remove_script():
    var test_script: BindingTest = BindingTest.new()
    var bound_obj: Node = BindingA.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "BindingA", "Type should be BindingA")
    
    bound_obj.set_script(null)
    clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "Node", "Type should be Node")
    
    bound_obj.free()
    test_script.free()
    
func test_add_then_remove_script():
    var test_script: BindingTest = BindingTest.new()
    var bound_obj: Node = Node.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "Node", "Type should be Node")
    
    bound_obj.set_script(BindingA)
    clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "BindingA", "Type should be BindingA")
    
    bound_obj.set_script(null)
    clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "Node", "Type should be Node")
    
    bound_obj.free()
    test_script.free()

func test_switch_script():
    var test_script: BindingTest = BindingTest.new()
    var bound_obj: Object = BindingA.new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "BindingA", "Type should be BindingA")
        
    bound_obj.set_script(BindingB)
    clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "BindingB", "Type should be BindingB")
    
    bound_obj.free()
    test_script.free()
    
func test_path_script():
    var test_script: BindingTest = load("res://src/main/kotlin/godot/tests/binding/BindingTest.kt").new()
    var bound_obj: Object = load("res://src/main/kotlin/godot/tests/binding/BindingA.kt").new()
    
    var clazz = test_script.get_class_name(bound_obj)
    assert_eq(clazz, "BindingA", "Type should be BindingA")
    
    bound_obj.free()
    test_script.free()
    
func test_path_script_and_named_script_equality():
    var path_script: Script = load("res://src/main/kotlin/godot/tests/binding/BindingA.kt")
    var named_script: Script = BindingA
    assert_not_same(named_script, path_script, "Path and Named version of script shouldn't be equal")

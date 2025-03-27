extends GdUnitTestSuite

func test_object_instance():
    var obj: ObjectInstance = ObjectInstance.new()
    assert_that(obj.get_class()).override_failure_message("Class name should be Object").is_equal("Object")
    obj.free()

func test_refcounted_instance():
    var obj: RefCountedInstance = RefCountedInstance.new()
    assert_that(obj.get_class()).override_failure_message("Class name should be RefCounted").is_equal("RefCounted")
    
func test_node_instance():
    var obj: NodeInstance = NodeInstance.new()
    assert_that(obj.get_class()).override_failure_message("Class name should be Node").is_equal("Node")
    obj.free()

func test_parameter_still_same_instance() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.other_jvm_id(invocation_script)).override_failure_message("Jvm instance passed by parameter should be same instance in method call.").is_equal(invocation_script.jvm_id)
    invocation_script.free()

func test_script_is_attached_when_scene() -> void:
    var invocation_script = load("res://Spatial.tscn").instantiate()
    assert_that(invocation_script.get_script()).override_failure_message("Script should be set when creating scene.").is_equal(Invocation)
    invocation_script.free()

func test_script_is_attached_when_script() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.get_script()).override_failure_message("Script should be set when creating script instance.").is_equal(Invocation)
    invocation_script.free()

func test_script_is_attached_when_instance_created_on_jvm_side() -> void:
    var invocation_script = Invocation.new()
    assert_that(invocation_script.invocation.get_script()).override_failure_message("Script should be set when creating instance from JVM").is_equal(OtherScript)
    invocation_script.free()

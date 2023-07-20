extends "res://addons/gut/test.gd"

func test_object_instance():
	var obj: ObjectInstance = ObjectInstance.new()
	assert_eq(obj.get_class(), "Object", "Class name should be Object")
	obj.free()

func test_refcounted_instance():
	var obj: RefCountedInstance = RefCountedInstance.new()
	assert_eq(obj.get_class(), "RefCounted", "Class name should be RefCounted")
	
func test_node_instance():
	var obj: NodeInstance = NodeInstance.new()
	assert_eq(obj.get_class(), "Node", "Class name should be Node")
	obj.free()

func test_parameter_still_same_instance() -> void:
	var invocation_script = Invocation.new()
	assert_eq(invocation_script.other_jvm_id(invocation_script), invocation_script.jvm_id, "Jvm instance passed by parameter should be same instance in method call.")
	invocation_script.free()

func test_script_is_attached_when_scene() -> void:
	var invocation_script = load("res://Spatial.tscn").instantiate()
	assert_eq(invocation_script.get_script(), Invocation, "Script should be set when creating scene.")
	invocation_script.free()

func test_script_is_attached_when_script() -> void:
	var invocation_script = Invocation.new()
	assert_eq(invocation_script.get_script(), Invocation, "Script should be set when creating script instance.")
	invocation_script.free()

func test_script_is_attached_when_instance_created_on_jvm_side() -> void:
	var invocation_script = Invocation.new()
	assert_eq(invocation_script.invocation.get_script(), OtherScript, "Script should be set when creating instance from JVM")
	invocation_script.free()

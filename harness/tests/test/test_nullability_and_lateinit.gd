extends GdUnitTestSuite

func test_nullables_are_correctly_set_from_function_lika_a_ready_call():
    var node3d = Node3D.new()
    var invocation_script = Invocation.new()
    node3d.add_child(invocation_script)
    get_tree().root.add_child(node3d)
    # simulate _ready call because we don't actually want to set it in ready in the Invocation script for the other tests
    invocation_script.init_nullables()
    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object != null).override_failure_message("register_object should have been initialized in ready to an instance of OtherScript").is_true()
    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object_nullable != null).override_failure_message("register_object_nullable should have been initialized in ready to an instance of OtherScript").is_true()
    invocation_script.free()
    node3d.free()

func test_nullables_are_correctly_set_from_inspector():
    var test_scene = load("res://Spatial.tscn").instantiate()
    get_tree().root.add_child(test_scene)
    assert_bool(test_scene.register_object_nullable == null).override_failure_message("register_object_nullable should still be null").is_true()
    assert_bool(test_scene.register_object_nullable_pre_init != null).override_failure_message("register_object_nullable_pre_init should still not be null").is_true()
    test_scene.free()


func test_nullables_are_correctly_set_without_attaching_to_a_scene():
    var node3d = Node3D.new()
    var invocation_script = Invocation.new()
    node3d.add_child(invocation_script)
    invocation_script.init_nullables()
    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object != null).override_failure_message("register_object should have been initialized in ready to an instance of OtherScript").is_true()
    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object_nullable != null).override_failure_message("register_object_nullable should have been initialized in ready to an instance of OtherScript").is_true()
    node3d.free()

func test_set_objects_from_gdscript():
    var node3d = Node3D.new()
    var invocation_script = Invocation.new()
    node3d.add_child(invocation_script)

    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object_nullable_pre_init != null).override_failure_message("register_object should have been initialized in ready to an instance of OtherScript").is_true()
    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object_non_nullable_pre_init != null).override_failure_message("register_object_nullable should have been initialized in ready to an instance of OtherScript").is_true()

    invocation_script.register_object_nullable_pre_init = OtherScript.new()
    invocation_script.register_object_non_nullable_pre_init = OtherScript.new()

    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object_nullable_pre_init != null).override_failure_message("register_object should have been initialized in ready to an instance of OtherScript").is_true()
    # TODO: check type once bug is fixed where with `kotlin_script_Name.new()` does not set the script on the object
    assert_bool(invocation_script.register_object_non_nullable_pre_init != null).override_failure_message("register_object_nullable should have been initialized in ready to an instance of OtherScript").is_true()

    invocation_script.free()
    node3d.free()

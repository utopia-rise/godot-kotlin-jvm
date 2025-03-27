extends GdUnitTestSuite

func test_call_script_in_custom_src_dir():
    var node3d = Node3D.new()
    var script = ScriptInOtherSourceDir.new()
    node3d.add_child(script)
    assert_that(script.greeting()).override_failure_message("greeting should return \"HelloWorld\"").is_equal("HelloWorld")
    node3d.free()

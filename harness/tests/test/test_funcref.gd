extends GdUnitTestSuite


func test_call_without_param():
    var func_ref_test_script = FuncRefTest.new()
    func_ref_test_script.test_call_without_param()
    assert_bool(func_ref_test_script.call_flag).is_true()
    func_ref_test_script.free()

func test_call_deferred_without_param():
    var func_ref_test_script = FuncRefTest.new()
    func_ref_test_script.test_call_deferred_without_param()
    await get_tree().create_timer(1).timeout
    assert_bool(func_ref_test_script.call_flag).is_true()
    func_ref_test_script.free()

func test_call_with_param():
    var func_ref_test_script = FuncRefTest.new()
    func_ref_test_script.test_call_with_param()
    assert_bool(func_ref_test_script.call_with_param_flag).is_true()
    func_ref_test_script.free()

func test_call_deferred_with_param():
    var func_ref_test_script = FuncRefTest.new()
    func_ref_test_script.test_call_deferred_with_param()
    await get_tree().create_timer(3).timeout
    assert_bool(func_ref_test_script.call_with_param_flag).is_true()
    func_ref_test_script.free()

func test_signal_call():
    var func_ref_test_script = FuncRefTest.new()
    get_tree().root.add_child(func_ref_test_script)
    func_ref_test_script.test_signal_call()
    await get_tree().create_timer(1).timeout
    assert_bool(func_ref_test_script.signal_call_flag).is_true()
    get_tree().root.remove_child(func_ref_test_script)
    func_ref_test_script.free()

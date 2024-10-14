package godot.tests

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.annotation.Rpc
import godot.core.signal0
import godot.extensions.call
import godot.extensions.callDeferred

@GodotScript
class FuncRefTest : Node() {

    val test by signal0()

    @GodotMember
    var blubb: Boolean = false

    @GodotMember
    var callFlag = false

    @GodotMember
    var callWithParamFlag = false

    @GodotMember
    var signalCallFlag = false

    @GodotMember
    override fun _ready() {
        test.connect(this, FuncRefTest::testSignalCallback)
    }

    @Rpc
    @GodotMember
    fun testSignalCallback() {
        signalCallFlag = true
    }

    @GodotMember
    fun testSignalCall() {
        test.emit()
    }

    @GodotMember
    fun withoutParamCallback() {
        callFlag = true
    }

    @GodotMember
    fun testCallWithoutParam() {
        call(this::withoutParamCallback)
    }

    @GodotMember
    fun testCallDeferredWithoutParam() {
        callDeferred(this::withoutParamCallback)
    }

    @GodotMember
    fun withParamCallback(flag: Boolean) {
        callWithParamFlag = flag
    }

    @GodotMember
    fun testCallWithParam() {
        call(this::withParamCallback, true)
    }

    @GodotMember
    fun testCallDeferredWithParam() {
        callDeferred(this::withParamCallback, true)
    }
}

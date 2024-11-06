package godot.tests

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.annotation.Rpc
import godot.core.signal0
import godot.extensions.call
import godot.extensions.callDeferred

@GodotScript
class FuncRefTest : Node() {

    val test by signal0()

    @Member
    var blubb: Boolean = false

    @Member
    var callFlag = false

    @Member
    var callWithParamFlag = false

    @Member
    var signalCallFlag = false

    @Member
    override fun _ready() {
        test.connect(this, FuncRefTest::testSignalCallback)
    }

    @Rpc
    @Member
    fun testSignalCallback() {
        signalCallFlag = true
    }

    @Member
    fun testSignalCall() {
        test.emit()
    }

    @Member
    fun withoutParamCallback() {
        callFlag = true
    }

    @Member
    fun testCallWithoutParam() {
        call(this::withoutParamCallback)
    }

    @Member
    fun testCallDeferredWithoutParam() {
        callDeferred(this::withoutParamCallback)
    }

    @Member
    fun withParamCallback(flag: Boolean) {
        callWithParamFlag = flag
    }

    @Member
    fun testCallWithParam() {
        call(this::withParamCallback, true)
    }

    @Member
    fun testCallDeferredWithParam() {
        callDeferred(this::withParamCallback, true)
    }
}

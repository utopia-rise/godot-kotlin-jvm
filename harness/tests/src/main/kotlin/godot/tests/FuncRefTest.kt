package godot.tests

import godot.api.Node
import godot.annotation.script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.core.callable0
import godot.core.callable1
import godot.core.signal0
import godot.extension.connectMethod

@script
class FuncRefTest : Node() {

    @RegisterSignal
    val test by signal0()

    @Visible
    var blubb: Boolean = false

    @Visible
    var callFlag = false

    @Visible
    var callWithParamFlag = false

    @Visible
    var signalCallFlag = false

    @Register
    override fun _ready() {
        test.connectMethod(this, FuncRefTest::testSignalCallback)
    }

    @Rpc
    fun testSignalCallback() {
        signalCallFlag = true
    }

    @Register
    fun testSignalCall() {
        test.emit()
    }

    @Register
    fun withoutParamCallback() {
        callFlag = true
    }

    @Register
    fun testCallWithoutParam() {
        callable0(this::withoutParamCallback).call()
    }

    @Register
    fun testCallDeferredWithoutParam() {
        callable0(this::withoutParamCallback).callDeferred()
    }

    @Register
    fun withParamCallback(flag: Boolean) {
        callWithParamFlag = flag
    }

    @Register
    fun testCallWithParam() {
        callable1(this::withParamCallback).call(true)
    }

    @Register
    fun testCallDeferredWithParam() {
        callable1(this::withParamCallback).callDeferred(true)
    }
}

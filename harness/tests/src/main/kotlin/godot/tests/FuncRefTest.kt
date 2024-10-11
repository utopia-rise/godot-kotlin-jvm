package godot.tests

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.core.signal0
import godot.extension.call
import godot.extension.callDeferred

@RegisterClass
class FuncRefTest : Node() {

    @RegisterSignal
    val test by signal0()

    @RegisterProperty
    var blubb: Boolean = false

    @RegisterProperty
    var callFlag = false

    @RegisterProperty
    var callWithParamFlag = false

    @RegisterProperty
    var signalCallFlag = false

    @RegisterFunction
    override fun _ready() {
        test.connect(this, FuncRefTest::testSignalCallback)
    }

    @Rpc
    @RegisterFunction
    fun testSignalCallback() {
        signalCallFlag = true
    }

    @RegisterFunction
    fun testSignalCall() {
        test.emit()
    }

    @RegisterFunction
    fun withoutParamCallback() {
        callFlag = true
    }

    @RegisterFunction
    fun testCallWithoutParam() {
        call(this::withoutParamCallback)
    }

    @RegisterFunction
    fun testCallDeferredWithoutParam() {
        callDeferred(this::withoutParamCallback)
    }

    @RegisterFunction
    fun withParamCallback(flag: Boolean) {
        callWithParamFlag = flag
    }

    @RegisterFunction
    fun testCallWithParam() {
        call(this::withParamCallback, true)
    }

    @RegisterFunction
    fun testCallDeferredWithParam() {
        callDeferred(this::withParamCallback, true)
    }
}

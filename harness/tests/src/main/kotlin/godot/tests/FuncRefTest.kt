package godot.tests

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.annotation.RegisterSignal
import godot.annotation.Rpc
import godot.core.callable0
import godot.core.callable1
import godot.core.signal0
import godot.extension.connectMethod

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
        test.connectMethod(this, FuncRefTest::testSignalCallback)
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
        callable0(this::withoutParamCallback).call()
    }

    @RegisterFunction
    fun testCallDeferredWithoutParam() {
        callable0(this::withoutParamCallback).callDeferred()
    }

    @RegisterFunction
    fun withParamCallback(flag: Boolean) {
        callWithParamFlag = flag
    }

    @RegisterFunction
    fun testCallWithParam() {
        callable1(this::withParamCallback).call(true)
    }

    @RegisterFunction
    fun testCallDeferredWithParam() {
        callable1(this::withParamCallback).callDeferred(true)
    }
}

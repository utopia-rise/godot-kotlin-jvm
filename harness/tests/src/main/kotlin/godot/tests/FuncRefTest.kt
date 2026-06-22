package godot.tests

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.annotation.Emit
import godot.annotation.Rpc
import godot.core.lambdaCallable0
import godot.core.lambdaCallable1
import godot.core.signal0
import godot.extension.connectMethod

@Script
class FuncRefTest : Node() {

    @Emit
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
    @Register
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
        lambdaCallable0(this::withoutParamCallback).call()
    }

    @Register
    fun testCallDeferredWithoutParam() {
        lambdaCallable0(this::withoutParamCallback).callDeferred()
    }

    @Register
    fun withParamCallback(flag: Boolean) {
        callWithParamFlag = flag
    }

    @Register
    fun testCallWithParam() {
        lambdaCallable1(this::withParamCallback).call(true)
    }

    @Register
    fun testCallDeferredWithParam() {
        lambdaCallable1(this::withParamCallback).callDeferred(true)
    }
}



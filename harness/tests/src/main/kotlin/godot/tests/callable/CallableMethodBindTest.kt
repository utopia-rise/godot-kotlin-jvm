package godot.tests.callable

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.NativeCallable
import godot.core.VariantArray
import godot.core.variantArrayOf
import godot.global.GD

@RegisterClass
class CallableMethodBindTest: Node() {
    @RegisterProperty
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @RegisterFunction
    fun callWithMethodWithAllBinds() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).unsafeBind(1, 2, 3).unsafeCall()
    }

    @RegisterFunction
    fun callWithMethodWithTwoBinds() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).unsafeBind(2, 3).unsafeCall(0)
    }

    @RegisterFunction
    fun callWithMethodWithOneBind() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).unsafeBind(3).unsafeCall(0, 0)
    }

    @RegisterFunction
    fun callWithMethodWithNoBind() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).unsafeBind().unsafeCall(0, 0, 0)
    }

    @RegisterFunction
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }
}

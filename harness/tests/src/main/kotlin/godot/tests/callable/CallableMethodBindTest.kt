package godot.tests.callable

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.NativeCallable
import godot.core.VariantArray
import godot.core.variantArrayOf
import godot.global.GD

@GodotScript
class CallableMethodBindTest: Node() {
    @Member
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @Member
    fun callWithMethodWithAllBinds() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(1, 2, 3).call()
    }

    @Member
    fun callWithMethodWithTwoBinds() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(2, 3).call(0)
    }

    @Member
    fun callWithMethodWithOneBind() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(3).call(0, 0)
    }

    @Member
    fun callWithMethodWithNoBind() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind().call(0, 0, 0)
    }

    @Member
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }
}

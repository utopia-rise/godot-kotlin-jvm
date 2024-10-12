package godot.tests.callable

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.NativeCallable
import godot.core.VariantArray
import godot.core.variantArrayOf
import godot.global.GD

@GodotScript
class CallableMethodBindTest: Node() {
    @GodotMember
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @GodotMember
    fun callWithMethodWithAllBinds() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(1, 2, 3).call()
    }

    @GodotMember
    fun callWithMethodWithTwoBinds() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(2, 3).call(0)
    }

    @GodotMember
    fun callWithMethodWithOneBind() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(3).call(0, 0)
    }

    @GodotMember
    fun callWithMethodWithNoBind() {
        NativeCallable(this, CallableMethodBindTest::readySignalMethodBindTest).bind().call(0, 0, 0)
    }

    @GodotMember
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }
}

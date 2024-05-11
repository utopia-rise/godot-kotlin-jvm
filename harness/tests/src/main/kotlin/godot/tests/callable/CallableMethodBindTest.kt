package godot.tests.callable

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.Callable
import godot.core.VariantArray
import godot.core.variantArrayOf
import godot.global.GD

@RegisterClass
class CallableMethodBindTest: Node() {
    @RegisterProperty
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @RegisterFunction
    fun callWithMethodWithAllBinds() {
        Callable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(1, 2, 3).call()
    }

    @RegisterFunction
    fun callWithMethodWithTwoBinds() {
        Callable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(2, 3).call(0)
    }

    @RegisterFunction
    fun callWithMethodWithOneBind() {
        Callable(this, CallableMethodBindTest::readySignalMethodBindTest).bind(3).call(0, 0)
    }

    @RegisterFunction
    fun callWithMethodWithNoBind() {
        Callable(this, CallableMethodBindTest::readySignalMethodBindTest).bind().call(0, 0, 0)
    }

    @RegisterFunction
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }
}

package godot.tests.callable

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.VariantArray
import godot.core.variantArrayOf
import godot.extensions.toCallable
import godot.global.GD

@RegisterClass
class CallableMethodBindTest: Node() {
    @RegisterProperty
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @RegisterFunction
    fun callWithMethodWithAllBinds() {
        CallableMethodBindTest::readySignalMethodBindTest.toCallable(this).bind(1, 2, 3).call()
    }

    @RegisterFunction
    fun callWithMethodWithTwoBinds() {
        CallableMethodBindTest::readySignalMethodBindTest.toCallable(this).bind(2, 3).call(0)
    }

    @RegisterFunction
    fun callWithMethodWithOneBind() {
        CallableMethodBindTest::readySignalMethodBindTest.toCallable(this).bind(3).call(0, 0)
    }

    @RegisterFunction
    fun callWithMethodWithNoBind() {
        CallableMethodBindTest::readySignalMethodBindTest.toCallable(this).bind().call(0, 0, 0)
    }

    @RegisterFunction
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }
}

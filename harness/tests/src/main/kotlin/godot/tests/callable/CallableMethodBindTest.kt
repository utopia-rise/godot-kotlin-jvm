package godot.tests.callable

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.Callable0
import godot.core.Callable1
import godot.core.Callable2
import godot.core.Callable3
import godot.core.VariantArray
import godot.core.callable3
import godot.core.variantArrayOf
import godot.global.GD

@RegisterClass
class CallableMethodBindTest: Node() {
    @RegisterProperty
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @RegisterFunction
    fun callWithMethodWithAllBinds() {
        val unboundCallable: Callable3<Unit, Int, Int, Int> = callable3(CallableMethodBindTest::readySignalMethodBindTest)
        val boundCallable: Callable0<Unit> = unboundCallable.bind(1, 2, 3)
        boundCallable.call()
    }

    @RegisterFunction
    fun callWithMethodWithTwoBinds() {
        val unboundCallable: Callable3<Unit, Int, Int, Int> = callable3(CallableMethodBindTest::readySignalMethodBindTest)
        val boundCallable: Callable1<Unit, Int> = unboundCallable.bind(5, 6)
        boundCallable.call(4)
    }

    @RegisterFunction
    fun callWithMethodWithOneBind() {
        val unboundCallable: Callable3<Unit, Int, Int, Int> = callable3(CallableMethodBindTest::readySignalMethodBindTest)
        val boundCallable: Callable2<Unit, Int, Int> = unboundCallable.bind(9)
        boundCallable.call(7, 8)
    }

    @RegisterFunction
    fun callWithMethodWithNoBind() {
        callable3(CallableMethodBindTest::readySignalMethodBindTest).call(10, 11, 12)
    }

    @RegisterFunction
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }
}

package godot.tests.events

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible
import godot.core.Callable0
import godot.core.Callable1
import godot.core.Callable2
import godot.core.Callable3
import godot.core.VariantArray
import godot.core.methodCallable3
import godot.core.StringName
import godot.core.variantArrayOf
import godot.global.GD

@Script
class CallableMethodBindKotlinTest : Node() {
    @Visible
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @Visible
    var directCallResult = ""

    @Register
    fun callWithMethodWithAllBinds() {
        val unboundCallable: Callable3<Unit, Int, Int, Int> = methodCallable3(this, CallableMethodBindKotlinTest::readySignalMethodBindTest)
        val boundCallable: Callable0<Unit> = unboundCallable.bind(1, 2, 3)
        boundCallable.call()
    }

    @Register
    fun callWithMethodWithTwoBinds() {
        val unboundCallable: Callable3<Unit, Int, Int, Int> = methodCallable3(this, CallableMethodBindKotlinTest::readySignalMethodBindTest)
        val boundCallable: Callable1<Unit, Int> = unboundCallable.bind(5, 6)
        boundCallable.call(4)
    }

    @Register
    fun callWithMethodWithOneBind() {
        val unboundCallable: Callable3<Unit, Int, Int, Int> = methodCallable3(this, CallableMethodBindKotlinTest::readySignalMethodBindTest)
        val boundCallable: Callable2<Unit, Int, Int> = unboundCallable.bind(9)
        boundCallable.call(7, 8)
    }

    @Register
    fun callWithMethodWithNoBind() {
        methodCallable3(this, CallableMethodBindKotlinTest::readySignalMethodBindTest).call(10, 11, 12)
    }

    @Register
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }

    @Register
    fun recordDirectCall(label: String) {
        directCallResult = label
    }

    @Register
    fun invokeDirectCallBySnakeCase() {
        call(StringName("record_direct_call"), "snake_case")
    }
}


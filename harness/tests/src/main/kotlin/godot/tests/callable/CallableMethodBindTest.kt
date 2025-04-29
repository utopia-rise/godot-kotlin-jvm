package godot.tests.callable

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty
import godot.core.MethodCallable
import godot.core.VariantArray
import godot.core.toGodotName
import godot.core.variantArrayOf
import godot.global.GD

@RegisterClass
class CallableMethodBindTest: Node() {
    @RegisterProperty
    var methodBinds: VariantArray<Int> = variantArrayOf(-1, -1, -1)

    @RegisterFunction
    fun callWithMethodWithAllBinds() {
        MethodCallable(this, CallableMethodBindTest::readySignalMethodBindTest.toGodotName()).bindUnsafe(1, 2, 3).callUnsafe()
    }

    @RegisterFunction
    fun callWithMethodWithTwoBinds() {
        MethodCallable(this, CallableMethodBindTest::readySignalMethodBindTest.toGodotName()).bindUnsafe(2, 3).callUnsafe(0)
    }

    @RegisterFunction
    fun callWithMethodWithOneBind() {
        MethodCallable(this, CallableMethodBindTest::readySignalMethodBindTest.toGodotName()).bindUnsafe(3).callUnsafe(0, 0)
    }

    @RegisterFunction
    fun callWithMethodWithNoBind() {
        MethodCallable(this, CallableMethodBindTest::readySignalMethodBindTest.toGodotName()).bindUnsafe().callUnsafe(0, 0, 0)
    }

    @RegisterFunction
    fun readySignalMethodBindTest(a: Int, b: Int, c: Int) {
        GD.print("Called with args: $a, $b, $c")
        methodBinds = variantArrayOf(a, b, c)
    }
}

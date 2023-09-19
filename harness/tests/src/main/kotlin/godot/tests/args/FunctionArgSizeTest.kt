package godot.tests.args

import godot.Node
import godot.Resource
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.variantArrayOf

@RegisterClass
class FunctionArgSizeTest : Node() {

    @RegisterFunction
    fun arg0(): VariantArray<Any> {
        return variantArrayOf()
    }

    @RegisterFunction
    fun arg1(
        p1: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
        )
    }

    @RegisterFunction
    fun arg2(
        p1: String,
        p2: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
        )
    }

    @RegisterFunction
    fun arg3(
        p1: String,
        p2: String,
        p3: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
            p3,
        )
    }

    @RegisterFunction
    fun arg4(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
            p3,
            p4,
        )
    }

    @RegisterFunction
    fun arg5(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
            p3,
            p4,
            p5,
        )
    }

    @RegisterFunction
    fun arg6(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
        )
    }

    @RegisterFunction
    fun arg7(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
        )
    }

    @RegisterFunction
    fun arg8(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
            p3,
            p4,
            p5,
            p6,
            p7,
            p8,
        )
    }
}

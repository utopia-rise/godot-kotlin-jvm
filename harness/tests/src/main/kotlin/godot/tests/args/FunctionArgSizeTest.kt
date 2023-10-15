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

    @RegisterFunction
    fun arg9(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String
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
            p9
        )
    }

    @RegisterFunction
    fun arg10(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String
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
            p9,
            p10
        )
    }

    @RegisterFunction
    fun arg11(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String,
        p11: String
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
            p9,
            p10,
            p11
        )
    }

    @RegisterFunction
    fun arg12(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String,
        p11: String,
        p12: String
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
            p9,
            p10,
            p11,
            p12
        )
    }

    @RegisterFunction
    fun arg13(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String,
        p11: String,
        p12: String,
        p13: String
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
            p9,
            p10,
            p11,
            p12,
            p13
        )
    }

    @RegisterFunction
    fun arg14(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String,
        p11: String,
        p12: String,
        p13: String,
        p14: String
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
            p9,
            p10,
            p11,
            p12,
            p13,
            p14
        )
    }

    @RegisterFunction
    fun arg15(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String,
        p11: String,
        p12: String,
        p13: String,
        p14: String,
        p15: String
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
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15
        )
    }

    @RegisterFunction
    fun arg16(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String,
        p11: String,
        p12: String,
        p13: String,
        p14: String,
        p15: String,
        p16: String
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
            p9,
            p10,
            p11,
            p12,
            p13,
            p14,
            p15,
            p16
        )
    }
}

package godot.tests.args

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.core.VariantArray
import godot.core.variantArrayOf

@GodotScript
class FunctionArgSizeTest : Node() {

    @Register
    fun arg0(): VariantArray<Any> {
        return variantArrayOf()
    }

    @Register
    fun arg1(
        p1: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
        )
    }

    @Register
    fun arg2(
        p1: String,
        p2: String,
    ): VariantArray<Any> {
        return variantArrayOf(
            p1,
            p2,
        )
    }

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

    @Register
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

package godot.tests.args

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.VariantArray
import godot.core.variantArrayOf

@GodotScript
class ConstructorArgSizeTest(): Node() {
    private val receivedConstructorArgs: VariantArray<Any> = variantArrayOf()

    @Member
    constructor(
        p1: String,
    ): this() {
        receivedConstructorArgs.add(p1)
    }

    @Member
    constructor(
        p1: String,
        p2: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
        }
    }

    @Member
    constructor(
        p1: String,
        p2: String,
        p3: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
            add(p3)
        }
    }

    @Member
    constructor(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
            add(p3)
            add(p4)
        }
    }

    @Member
    constructor(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
            add(p3)
            add(p4)
            add(p5)
        }
    }

    @Member
    constructor(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
            add(p3)
            add(p4)
            add(p5)
            add(p6)
        }
    }

    @Member
    constructor(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
            add(p3)
            add(p4)
            add(p5)
            add(p6)
            add(p7)
        }
    }

    @Member
    constructor(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
            add(p3)
            add(p4)
            add(p5)
            add(p6)
            add(p7)
            add(p8)
        }
    }

    @Member
    fun getReceivedConstructorArgs(): VariantArray<Any> {
        return receivedConstructorArgs
    }
}

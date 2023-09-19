package godot.tests.args

import godot.Node
import godot.Resource
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.annotation.RegisterFunction
import godot.core.Dictionary
import godot.core.VariantArray
import godot.core.variantArrayOf

@RegisterClass
class ConstructorArgSizeTest(): Node() {
    private val receivedConstructorArgs: VariantArray<Any> = variantArrayOf()

    @RegisterConstructor
    constructor(
        p1: String,
    ): this() {
        receivedConstructorArgs.add(p1)
    }

    @RegisterConstructor
    constructor(
        p1: String,
        p2: String,
    ): this() {
        receivedConstructorArgs.apply {
            add(p1)
            add(p2)
        }
    }

    @RegisterConstructor
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

    @RegisterConstructor
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

    @RegisterConstructor
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

    @RegisterConstructor
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

    @RegisterConstructor
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

    @RegisterConstructor
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

    @RegisterFunction
    fun getReceivedConstructorArgs(): VariantArray<Any> {
        return receivedConstructorArgs
    }
}

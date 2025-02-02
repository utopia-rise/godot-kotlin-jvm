package godot.tests.constructor

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
import godot.core.Dictionary
import godot.core.VariantArray

@RegisterClass
class ConstructorRegistrationTest(): Node() {

    @RegisterConstructor
    constructor(param1: Dictionary<Any, Any?>, param2: VariantArray<Long>): this()
}

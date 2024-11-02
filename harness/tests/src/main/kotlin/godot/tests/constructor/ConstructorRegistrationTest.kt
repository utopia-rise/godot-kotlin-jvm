package godot.tests.constructor

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.Dictionary
import godot.core.VariantArray

@GodotScript
class ConstructorRegistrationTest(): Node() {

    @Member
    constructor(param1: Dictionary<Any, Any?>, param2: VariantArray<Long>): this()
}

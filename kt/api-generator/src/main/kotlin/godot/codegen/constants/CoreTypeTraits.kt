package godot.codegen.constants

import godot.codegen.traits.TypedTrait
import godot.tools.common.constants.GodotTypes

object CoreTypeTraits {
    val VECTOR3 = object : TypedTrait {
        override val type = GodotTypes.vector3
    }
}

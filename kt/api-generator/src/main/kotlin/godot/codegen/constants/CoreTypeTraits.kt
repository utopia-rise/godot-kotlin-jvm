package godot.codegen.constants

import godot.codegen.traits.TypedTrait

object CoreTypeTraits {
    val VECTOR3 = object : TypedTrait {
        override val type = "Vector3"
    }
}
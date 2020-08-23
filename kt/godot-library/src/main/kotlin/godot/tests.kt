package godot

import godot.core.KtObject
import godot.core.Godot
import godot.util.VoidPtr

open class Object : KtObject() {
    override fun __new(): VoidPtr {
        return Godot.invokeConstructor("Object")
    }
}

open class Node : Object() {
    override fun __new(): VoidPtr {
        return Godot.invokeConstructor("Node")
    }
}

open class Spatial : Node() {
    override fun __new(): VoidPtr {
        return Godot.invokeConstructor("Spatial")
    }
}
package godot.core

import godot.util.VoidPtr

interface KtReference {
    val referencePtr: VoidPtr

    fun unreference(): Boolean
}
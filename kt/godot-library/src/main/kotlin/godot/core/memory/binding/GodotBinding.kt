package godot.core.memory.binding

import godot.core.KtObject

internal class GodotBinding {
    internal var wrapper: KtObject? = null
    internal var scriptInstance: KtObject? = null

    inline val value: KtObject
        get() = scriptInstance?: wrapper!!
}

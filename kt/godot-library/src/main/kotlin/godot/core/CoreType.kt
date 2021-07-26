package godot.core

import godot.util.VoidPtr

internal interface CoreType

abstract class NativeCoreType: CoreType {
    internal var _handle: VoidPtr = 0
}

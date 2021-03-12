package godot.core

import godot.util.VoidPtr

interface CoreType

abstract class NativeCoreType: CoreType {
    internal var _handle: VoidPtr = 0
}

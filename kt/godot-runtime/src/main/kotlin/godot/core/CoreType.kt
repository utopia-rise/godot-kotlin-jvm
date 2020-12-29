package godot.core

import godot.util.VoidPtr

interface CoreType

abstract class NativeCoreType: CoreType {
    internal abstract val coreVariantType: VariantType
    internal var _handle: VoidPtr = 0
}
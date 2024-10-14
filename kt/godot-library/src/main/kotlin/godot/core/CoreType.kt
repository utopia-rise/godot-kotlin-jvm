package godot.core

import godot.common.interop.ValuePointer
import godot.common.interop.VoidPtr
import godot.common.interop.nullptr

/**
 * This interface should not be inherited within user code.
 * Inheriting this interface should only be done in godot-library.
 * This interface is public so that one can easily identify godot's core types.
 */
interface CoreType

abstract class NativeCoreType : CoreType, ValuePointer {
    override var ptr: VoidPtr = nullptr
}

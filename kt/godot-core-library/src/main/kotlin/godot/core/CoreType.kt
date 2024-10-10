package godot.core

import godot.util.VoidPtr

/**
 * This interface should not be inherited within user code.
 * Inheriting this interface should only be done in godot-library.
 * This interface is public so that one can easily identify godot's core types.
 */
interface CoreType

abstract class NativeCoreType : CoreType {
    internal var _handle: VoidPtr = 0
}

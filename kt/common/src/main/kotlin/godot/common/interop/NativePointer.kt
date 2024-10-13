package godot.common.interop

typealias VoidPtr = Long
const val nullptr: VoidPtr = 0L

interface ValuePointer {
    val ptr: VoidPtr
}

interface IdentityPointer: ValuePointer {
    val objectID: ObjectID
}

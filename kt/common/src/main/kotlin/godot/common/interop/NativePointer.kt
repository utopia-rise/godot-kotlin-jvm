package godot.common.interop

typealias VoidPtr = Long
const val nullptr: VoidPtr = 0L

interface NativePointer {
    val ptr: VoidPtr
}

interface NativeWrapper: NativePointer {
    val objectID: ObjectID
}

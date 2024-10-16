package godot.common.interop

typealias VoidPtr = Long
const val nullptr: VoidPtr = 0L

interface NativePointer {
    val ptr: VoidPtr
}

interface Binding {
    val objectID: ObjectID
    val instance: NativeWrapper?
}

interface NativeWrapper: NativePointer {
    val memoryBinding: Binding
}

package godot.tests.packedarray

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.PackedByteArray

@RegisterClass
class PackedArrayTest : Node() {

    @RegisterFunction
    fun convertByteArray() : PackedByteArray {
        val arr = byteArrayOf(0, 1, 2, 4, 8, 16, 32, 64, 127)
        return PackedByteArray(arr);
    }
}

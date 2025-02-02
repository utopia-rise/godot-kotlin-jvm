package godot.tests.packedarray

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.PackedByteArray
import godot.core.PackedFloat32Array
import godot.core.PackedFloat64Array
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array

@RegisterClass
class PackedArrayTest : Node() {

    @RegisterFunction
    fun convertByteArray() : PackedByteArray {
        val arr = byteArrayOf(0, 1, 2, 4, 8, 16, 32, 64, 127)
        return PackedByteArray(arr);
    }

    @RegisterFunction
    fun convertIntArray() : PackedInt32Array {
        val arr = intArrayOf(0, 1, 2, 4, 8, 16, 32, 64, 127)
        return PackedInt32Array(arr);
    }

    @RegisterFunction
    fun convertLongArray() : PackedInt64Array {
        val arr = longArrayOf(0L, 1L, 2L, 4L, 8L, 16L, 32L, 64L, 127L)
        return PackedInt64Array(arr);
    }

    @RegisterFunction
    fun convertFloatArray() : PackedFloat32Array {
        val arr = floatArrayOf(0f, 1f, 2f, 4f, 8f, 16f, 32f, 64f, 127f)
        return PackedFloat32Array(arr);
    }

    @RegisterFunction
    fun convertDoubleArray() : PackedFloat64Array {
        val arr = doubleArrayOf(0.0, 1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 127.0)
        return PackedFloat64Array(arr);
    }

    @RegisterFunction
    fun getByteArrayValue(arr: PackedByteArray, index: Int) : Byte {
        val kotlinArr = arr.toByteArray()
        return kotlinArr[index];
    }

    @RegisterFunction
    fun getIntArrayValue(arr: PackedInt32Array, index: Int) : Int {
        val kotlinArr = arr.toIntArray()
        return kotlinArr[index];
    }

    @RegisterFunction
    fun getLongArrayValue(arr: PackedInt64Array, index: Int) : Long {
        val kotlinArr = arr.toLongArray()
        return kotlinArr[index];
    }

    @RegisterFunction
    fun getFloatArrayValue(arr: PackedFloat32Array, index: Int) : Float {
        val kotlinArr = arr.toFloatArray()
        return kotlinArr[index];
    }

    @RegisterFunction
    fun getDoubleArrayValue(arr: PackedFloat64Array, index: Int) : Double {
        val kotlinArr = arr.toDoubleArray()
        return kotlinArr[index];
    }
}

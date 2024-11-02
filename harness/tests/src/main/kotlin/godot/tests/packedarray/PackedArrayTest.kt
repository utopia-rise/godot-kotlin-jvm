package godot.tests.packedarray

import godot.Node
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.PackedByteArray
import godot.core.PackedFloat32Array
import godot.core.PackedFloat64Array
import godot.core.PackedInt32Array
import godot.core.PackedInt64Array

@GodotScript
class PackedArrayTest : Node() {

    @Member
    fun convertByteArray() : PackedByteArray {
        val arr = byteArrayOf(0, 1, 2, 4, 8, 16, 32, 64, 127)
        return PackedByteArray(arr);
    }

    @Member
    fun convertIntArray() : PackedInt32Array {
        val arr = intArrayOf(0, 1, 2, 4, 8, 16, 32, 64, 127)
        return PackedInt32Array(arr);
    }

    @Member
    fun convertLongArray() : PackedInt64Array {
        val arr = longArrayOf(0L, 1L, 2L, 4L, 8L, 16L, 32L, 64L, 127L)
        return PackedInt64Array(arr);
    }

    @Member
    fun convertFloatArray() : PackedFloat32Array {
        val arr = floatArrayOf(0f, 1f, 2f, 4f, 8f, 16f, 32f, 64f, 127f)
        return PackedFloat32Array(arr);
    }

    @Member
    fun convertDoubleArray() : PackedFloat64Array {
        val arr = doubleArrayOf(0.0, 1.0, 2.0, 4.0, 8.0, 16.0, 32.0, 64.0, 127.0)
        return PackedFloat64Array(arr);
    }

    @Member
    fun getByteArrayValue(arr: PackedByteArray, index: Int) : Byte {
        val kotlinArr = arr.toByteArray()
        return kotlinArr[index];
    }

    @Member
    fun getIntArrayValue(arr: PackedInt32Array, index: Int) : Int {
        val kotlinArr = arr.toIntArray()
        return kotlinArr[index];
    }

    @Member
    fun getLongArrayValue(arr: PackedInt64Array, index: Int) : Long {
        val kotlinArr = arr.toLongArray()
        return kotlinArr[index];
    }

    @Member
    fun getFloatArrayValue(arr: PackedFloat32Array, index: Int) : Float {
        val kotlinArr = arr.toFloatArray()
        return kotlinArr[index];
    }

    @Member
    fun getDoubleArrayValue(arr: PackedFloat64Array, index: Int) : Double {
        val kotlinArr = arr.toDoubleArray()
        return kotlinArr[index];
    }
}

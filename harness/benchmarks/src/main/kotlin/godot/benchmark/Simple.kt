package godot.benchmark

import godot.Object
import godot.core.Transform
import godot.core.Vector2
import godot.core.Vector3

class Simple : Object() {
    fun benchmarkSimpleAdd(): Int {
        val a = 1
        val b = 2
        return a + b
    }

    fun benchmarkAvg(): Int {
        val size = 10000
        var total = 0
        for (i in 0 until size) {
            total += i
        }
        return total / size
    }

    fun benchmarkVectors(): Vector3 {
        var b = Transform()
        b = b.rotated(Vector3.UP, Math.toRadians(60.0))
        b = b.scaled(Vector3(0.5, 0.5, 0.5))

        var s = Vector3()
        for (i in 0 until 1000) {
            var v = Vector3(i, i, i)
            v = b.xform(v)
            s += v
        }

        return s
    }


    fun benchmarkVectors2Only(): Vector2 {
        var s = Vector2()
        for(i in 0 until 1000) {
            val v = Vector2(i, i)
            s += v
        }

        return s
    }

}
package godot.benchmark

import godot.Node
import godot.Object
import godot.annotation.GodotScript
import godot.annotation.GodotMember
import godot.core.Transform3D
import godot.core.Vector2
import godot.core.Vector3

@GodotScript
class Simple : Object() {

    @GodotMember
    fun benchmarkSimpleAdd(): Int {
        val a = 1
        val b = 2
        return a + b
    }

    @GodotMember
    fun benchmarkAvg(): Int {
        val size = 10000
        var total = 0
        for (i in 0 until size) {
            total += i
        }
        return total / size
    }

    @GodotMember
    fun benchmarkVectors(): Vector3 {
        var b = Transform3D()
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

    @GodotMember
    fun benchmarkVectors2Only(): Vector2 {
        var s = Vector2()
        for(i in 0 until 1000) {
            val v = Vector2(i, i)
            s += v
        }

        return s
    }

    @GodotMember
    fun benchmarkIcall() {
        val node = Node()
        node.getInstanceId()
        node.free()
    }

    @GodotMember
    fun benchmarkIcallWithLoop() {
        val node = Node()
        for (i in 0 until 100) {
            val child = Node()
            node.addChild(child)
            node.removeChild(child)
            child.free()
        }
        node.free()
    }

    @GodotMember
    fun benchmarkMethodCall() {
    }
}

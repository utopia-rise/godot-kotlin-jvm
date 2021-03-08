package godot.benchmark

import godot.File
import godot.Node
import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.VariantArray
import godot.global.GD

@RegisterClass
class Memory : Object() {

    val objs = VariantArray<Node>()
    val refs = VariantArray<File?>()
    val size = 100

    var rand_index = VariantArray<Int>()


    init {
        for (i in 0 until size) {
            objs.append(Node())
            refs.append(File())
            rand_index.append(GD.randRange(0, size - 1))
        }
    }

    @RegisterFunction
    fun benchmarkObjAccess() {
        var obj: Node
        for (i in 0 until size) {
            obj = objs[rand_index[i]]
        }
    }

    @RegisterFunction
    fun benchmark_refs_access() {
        var ref: File?
        for (i in 0 until size) {
            ref = refs[rand_index[i]]
        }
    }

    @RegisterFunction
    fun benchmarkStressObject() {
        for (i in 0 until size) {
            objs[i].free()
            objs[i] = Node()
        }
    }

    @RegisterFunction
    fun benchmarkStressReference() {
        for (i in 0 until size) {
            refs[i] = null
            refs[i] = File()
        }
    }
}

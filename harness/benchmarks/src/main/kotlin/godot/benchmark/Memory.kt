package godot.benchmark

import godot.File
import godot.Node
import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.core.RID
import godot.core.VariantArray
import godot.global.GD

@RegisterClass
class Memory : Object() {

    val objs = VariantArray<Node>()
    val refs = VariantArray<File?>()
    val cores = VariantArray<RID?>()
    val size = 100

    var rand_index = Array(size) {
        GD.randRange(0, size - 1)
    }
    
    init {
        for (i in 0 until size) {
            objs.append(Node())
            refs.append(File())
            cores.append(RID())
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
    fun benchmarkRefAccess() {
        var ref: File?
        for (i in 0 until size) {
            ref = refs[rand_index[i]]
        }
    }

    @RegisterFunction
    fun benchmarkCoreAccess() {
        var core: RID?
        for (i in 0 until size) {
            core = cores[rand_index[i]]
        }
    }

    @RegisterFunction
    fun benchmarkStressObject() {
        var obj: Object?
        for (i in 0 until size) {
            obj = Node()
            obj.free()
        }
    }

    @RegisterFunction
    fun benchmarkStressReference() {
        var ref: File?
        for (i in 0 until size) {
            ref = File()
        }
    }

    @RegisterFunction
    fun benchmarkStressCore() {
        var core: RID?
        for (i in 0 until size) {
            core = RID()
        }
    }
}

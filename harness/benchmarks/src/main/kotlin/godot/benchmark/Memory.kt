package godot.benchmark

import godot.Node
import godot.Object
import godot.RefCounted
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.core.RID
import godot.core.VariantArray

@GodotScript
class Memory : Object() {

    private val objs = VariantArray<Node>()
    private val refs = VariantArray<RefCounted>()
    private val cores = VariantArray<RID>()
    private val accessSize = 1000
    private val stressSize = 100

    init {
        for (i in 0 until accessSize) {
            objs.append(Node())
            refs.append(RefCounted())
            cores.append(RID())
        }
    }

    override fun _onDestroy() {
        for (i in 0 until accessSize) {
            objs[i].free()
        }
        refs.clear()
        cores.clear()
    }

    @Register
    fun benchmarkAccessObj() {
        var obj: Node
        for (i in 0 until accessSize) {
            obj = objs[i]
        }
    }

    @Register
    fun benchmarkAccessRef() {
        var ref: RefCounted
        for (i in 0 until accessSize) {
            ref = refs[i]
        }
    }

    @Register
    fun benchmarkAccessCore() {
        var core: RID
        for (i in 0 until accessSize) {
            core = cores[i]
        }
    }

    @Register
    fun benchmarkStressObject() {
        var obj: Node
        for (i in 0 until stressSize) {
            obj = Node()
            obj.free()
        }
    }

    @Register
    fun benchmarkStressReference() {
        var ref: RefCounted
        for (i in 0 until stressSize) {
            ref = RefCounted()
        }
    }

    @Register
    fun benchmarkStressCore() {
        var core: RID?
        for (i in 0 until stressSize) {
            core = RID()
        }
    }

    @Register
    fun benchmarkStressZMix() {
        var core: RID?
        var obj: Node
        var ref: RefCounted?
        for (i in 0 until stressSize) {
            obj = Node()
            obj.free()
            core = RID()
            ref = RefCounted()
        }
    }
}

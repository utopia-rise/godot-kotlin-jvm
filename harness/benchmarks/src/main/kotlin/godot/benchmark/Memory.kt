package godot.benchmark

import godot.Node
import godot.Object
import godot.RefCounted
import godot.annotation.GodotScript
import godot.annotation.GodotMember
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

    @GodotMember
    fun benchmarkAccessObj() {
        var obj: Node
        for (i in 0 until accessSize) {
            obj = objs[i]
        }
    }

    @GodotMember
    fun benchmarkAccessRef() {
        var ref: RefCounted
        for (i in 0 until accessSize) {
            ref = refs[i]
        }
    }

    @GodotMember
    fun benchmarkAccessCore() {
        var core: RID
        for (i in 0 until accessSize) {
            core = cores[i]
        }
    }

    @GodotMember
    fun benchmarkStressObject() {
        var obj: Node
        for (i in 0 until stressSize) {
            obj = Node()
            obj.free()
        }
    }

    @GodotMember
    fun benchmarkStressReference() {
        var ref: RefCounted
        for (i in 0 until stressSize) {
            ref = RefCounted()
        }
    }

    @GodotMember
    fun benchmarkStressCore() {
        var core: RID?
        for (i in 0 until stressSize) {
            core = RID()
        }
    }

    @GodotMember
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

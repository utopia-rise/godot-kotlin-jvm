import godot.api.Node
import godot.annotation.Export
import godot.annotation.Script
import godot.annotation.Visible
import godot.core.Vector3

@Script
class CoreTypePropertyChecks: Node() {
    // not allowed cases are commented out so that the compilation runs. Otherwise, our compiler checks trigger a build failure
    // to test out these checks, uncomment the cases

    // not allowed
//    @Export
//    @Visible
//    lateinit var exportedLateinitCoreType: Vector3

    // allowed
    @Export
    @Visible
    var exportedNormalCoreType: Vector3 = Vector3.ZERO

    // not allowed
//    @Visible
//    lateinit var lateinitCoreType: Vector3

    // allowed
    @Visible
    var normalCoreType: Vector3 = Vector3.ZERO
}



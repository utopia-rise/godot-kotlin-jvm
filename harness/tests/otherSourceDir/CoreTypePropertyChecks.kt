import godot.api.Node
import godot.annotation.Export
import godot.annotation.script
import godot.annotation.Visible
import godot.core.Vector3

@script
class CoreTypePropertyChecks: Node() {
    // not allowed cases are commented out so that the compilation runs. Otherwise, our compiler checks trigger a build failure
    // to test out these checks, uncomment the cases

    // not allowed
//    @Export
//    @Register
//    lateinit var exportedLateinitCoreType: Vector3

    // allowed
    @Export
    var exportedNormalCoreType: Vector3 = Vector3.ZERO

    // not allowed
//    @Register
//    lateinit var lateinitCoreType: Vector3

    // allowed
    @Visible
    var normalCoreType: Vector3 = Vector3.ZERO
}

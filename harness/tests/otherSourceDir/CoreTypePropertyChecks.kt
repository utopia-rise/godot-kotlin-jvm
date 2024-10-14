import godot.Node
import godot.annotation.Export
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.Vector3

@GodotScript
class CoreTypePropertyChecks: Node() {
    // not allowed cases are commented out so that the compilation runs. Otherwise, our compiler checks trigger a build failure
    // to test out these checks, uncomment the cases

    // not allowed
//    @Export
//    lateinit var exportedLateinitCoreType: Vector3

    // allowed
    @Export
    var exportedNormalCoreType: Vector3 = Vector3.ZERO

    // not allowed
//    @GodotMember
//    lateinit var lateinitCoreType: Vector3

    // allowed
    @GodotMember
    var normalCoreType: Vector3 = Vector3.ZERO
}

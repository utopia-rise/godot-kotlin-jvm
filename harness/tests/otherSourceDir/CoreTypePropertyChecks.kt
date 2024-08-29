import godot.Node
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.core.Vector3

@RegisterClass
class CoreTypePropertyChecks: Node() {
    // not allowed cases are commented out so that the compilation runs. Otherwise, our compiler checks trigger a build failure
    // to test out these checks, uncomment the cases

    // not allowed
//    @Export
//    @RegisterProperty
//    lateinit var exportedLateinitCoreType: Vector3

    // allowed
    @Export
    @RegisterProperty
    var exportedNormalCoreType: Vector3 = Vector3.ZERO

    // not allowed
//    @RegisterProperty
//    lateinit var lateinitCoreType: Vector3

    // allowed
    @RegisterProperty
    var normalCoreType: Vector3 = Vector3.ZERO

    // not allowed
//    @Export
//    @RegisterProperty
//    var exportedNullableCoreType: Vector3? = null

    // not allowed
//    @RegisterProperty
//    var normalNullableCoreType: Vector3? = Vector3.ZERO

    // allowed
    @RegisterProperty
    var normalNonNullCoreType: Vector3 = Vector3.ZERO
}

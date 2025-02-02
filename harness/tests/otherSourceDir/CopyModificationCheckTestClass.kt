import godot.api.Node3D
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.core.*

@RegisterClass
class CopyModificationCheckTestClass: Node3D() {

    @Export
    @RegisterProperty
    lateinit var node3D: Node3D

    class Blubb {
        val transform: Transform3D = Transform3D()
    }
    private val blubb = Blubb()

    fun newCoreTypeCases() {
        position += Vector3.FORWARD // allowed
        position += Vector3.FORWARD // allowed
        position.x += 1 // not allowed

        val intermediate = position
        intermediate.x += 1 // allowed

        val intermediate2 = position
        intermediate.x += 1 // allowed
        position = intermediate2

        transform.basis.x { y = 1.0 } // not allowed
        transform.basis.x { y = 1.0 } // not allowed
        transform.basis { x = Vector3.ZERO } // not allowed
        
        transformMutate { basis = Basis.IDENTITY } // allowed
        transformMutate { basis.x = Vector3.ZERO } // not allowed
        transformMutate { basis.x.x = 1.0 } // not allowed
        

        transform = transform.apply { basis { x { y = 1.0 } } } // allowed
        transform = transform.apply { basis { x = Vector3.ZERO } } // allowed

        node3D.globalPosition = globalPosition // allowed
        node3D.position.x = 1.0 // not allowed
        blubb.transform.basis.x.x = 1.0 // not allowed


        val vector3 = Vector3.ZERO
        vector3.x = 1.0 // allowed

        val testBasis = Basis.IDENTITY
        testBasis.x.x = 1.0 // not allowed

        val testTransform3D = Transform3D()
        testTransform3D.basis.x.x = 1.0 // not allowed
    }
}

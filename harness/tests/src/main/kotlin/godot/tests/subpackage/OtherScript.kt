package godot.tests.subpackage

import godot.Node
import godot.Node3D
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class OtherScript : Node() {
    @RegisterFunction
    fun hookNoParam() {
        println("Hook was called with no param.")
    }

    @RegisterFunction
    fun hookOneParam(b: Boolean) {
        println("Hook was called with parameter: $b")
    }

    @RegisterFunction
    fun hookTwoParam(str: String, inv: Node3D) {
        println("Hook was called with parameters: $str, $inv")
    }

//		This will fail with:
//		class godot.Spatial cannot be cast to class godot.tests.Invocation.
//		This needs the use of user defined constructors when crossing boundaries
//		see: KtVariant::asObject() and Bootstrap::registerManagedEngineTypes methods.
//
//	fun hookTwoParam(str: String, inv: Invocation) {
//		println("Hook was calles with parameters: $str, $inv")
//	}

}

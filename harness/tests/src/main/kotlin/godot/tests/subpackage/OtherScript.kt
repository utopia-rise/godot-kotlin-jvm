package godot.tests.subpackage

import godot.api.Node
import godot.annotation.GodotScript
import godot.annotation.Register

@GodotScript
class OtherScript : Node() {
    @Register
    fun hookNoParam() {
        println("Hook was called with no param.")
    }

    @Register
    fun hookOneParam(b: Boolean) {
        println("Hook was called with parameter: $b")
    }

    @Register
    fun hookTwoParam(str: String, inv: Node) {
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

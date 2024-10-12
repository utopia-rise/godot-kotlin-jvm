package godot.tests.subpackage

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript

@GodotScript
class OtherScript : Node() {
    @GodotMember
    fun hookNoParam() {
        println("Hook was called with no param.")
    }

    @GodotMember
    fun hookOneParam(b: Boolean) {
        println("Hook was called with parameter: $b")
    }

    @GodotMember
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

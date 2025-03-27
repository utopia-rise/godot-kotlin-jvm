package godot.tests.registration

import godot.api.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction
import godot.annotation.RegisterProperty

@RegisterClass
class OtherScript : Node() {
    @RegisterProperty
    var hookNoParamCalled = false

    @RegisterProperty
    var hookOneParamCalled = false

    @RegisterProperty
    var hookOneParamValue = false

    @RegisterProperty
    var hookTwoParamCalled = false

    @RegisterProperty
    var hookTwoParamValue = ""

    @RegisterProperty
    lateinit var hookTwoParamNode: Node

    @RegisterFunction
    fun hookNoParam() {
        hookNoParamCalled = true
        println("Hook was called with no param.")
    }

    @RegisterFunction
    fun hookOneParam(b: Boolean) {
        hookOneParamCalled = true
        hookOneParamValue = b
        println("Hook was called with parameter: $b")
    }

    @RegisterFunction
    fun hookTwoParam(str: String, inv: Node) {
        hookTwoParamCalled = true
        hookTwoParamValue = str
        hookTwoParamNode = inv
        println("Hook was called with parameters: $str, $inv")
    }
}

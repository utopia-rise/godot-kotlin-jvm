package godot.tests.registration

import godot.api.Node
import godot.annotation.Script
import godot.annotation.Register
import godot.annotation.Visible

@Script
class OtherScript : Node() {
    @Visible
    var hookNoParamCalled = false

    @Visible
    var hookOneParamCalled = false

    @Visible
    var hookOneParamValue = false

    @Visible
    var hookTwoParamCalled = false

    @Visible
    var hookTwoParamValue = ""

    @Visible
    lateinit var hookTwoParamNode: Node

    @Register
    fun hookNoParam() {
        hookNoParamCalled = true
        println("Hook was called with no param.")
    }

    @Register
    fun hookOneParam(b: Boolean) {
        hookOneParamCalled = true
        hookOneParamValue = b
        println("Hook was called with parameter: $b")
    }

    @Register
    fun hookTwoParam(str: String, inv: Node) {
        hookTwoParamCalled = true
        hookTwoParamValue = str
        hookTwoParamNode = inv
        println("Hook was called with parameters: $str, $inv")
    }
}


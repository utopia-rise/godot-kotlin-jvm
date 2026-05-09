package godot.tests.inheritance

import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible

@GodotScript
class AbstractClassInheritanceChild : AbstractClassInheritanceParent() {

    //---------------- Here to check ------------------

    @Visible
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    @Register
    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}


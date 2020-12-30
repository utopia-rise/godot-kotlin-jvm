package godot.tests.inheritance

import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty

@RegisterClass
class ClassInheritanceChild : ClassInheritanceParent() {

    //---------------- Here to check ------------------

    @RegisterProperty
    var childOpenFunctionHasBeenCalled = false

    //-------------------------------------------------

    override var openVar: Int = 100

    override fun openFunction() {
        childOpenFunctionHasBeenCalled = true
    }
}
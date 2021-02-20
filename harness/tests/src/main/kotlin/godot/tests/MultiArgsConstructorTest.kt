package godot.tests

import godot.Node
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty

@RegisterClass
class MultiArgsConstructorTest : Node {

    @RegisterProperty
    var defaultConstructorHasBeenCalled = false

    @RegisterProperty
    var oneArgConstructorHasBeenCalled = false

    @RegisterProperty
    var threeArgsConstructorHasBeenCalled = false

    constructor() : super() {
        defaultConstructorHasBeenCalled = true
    }

//    constructor(i: Int) : this() {
//        oneArgConstructorHasBeenCalled = true
//    }
//
//    constructor(i: Int, s: String) : this() {
//        threeArgsConstructorHasBeenCalled = true
//    }
}
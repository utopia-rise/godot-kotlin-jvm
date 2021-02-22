package godot.tests

import godot.NavigationMesh
import godot.Node
import godot.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.core.VariantArray

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

    constructor(i: Int) : this() {
        oneArgConstructorHasBeenCalled = true
    }

    constructor(i: Int, s: String) : this() {
        threeArgsConstructorHasBeenCalled = true
    }

    constructor(i: Int, s: String, obj: Object?) : this()
    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>) : this()
    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh) : this()

    // constructors which should fail:
//    constructor(iShouldFailAsOverloadingIsNotSupported: String, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh) : this()
//    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh, tooManyArgs: String) : this()
}

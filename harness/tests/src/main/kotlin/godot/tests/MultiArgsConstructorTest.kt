package godot.tests

import godot.NavigationMesh
import godot.Node
import godot.Object
import godot.annotation.Member
import godot.annotation.GodotScript
import godot.core.VariantArray

@GodotScript
class MultiArgsConstructorTest : Node {

    @Member
    var defaultConstructorHasBeenCalled = false

    @Member
    var oneArgConstructorHasBeenCalled = false

    @Member
    var threeArgsConstructorHasBeenCalled = false

    @Member
    constructor() : super() {
        defaultConstructorHasBeenCalled = true
    }

    @Member
    constructor(i: Int) : this() {
        oneArgConstructorHasBeenCalled = true
    }

    @Member
    constructor(i: Int, s: String) : this() {
        threeArgsConstructorHasBeenCalled = true
    }

    @Member
    constructor(i: Int, s: String, obj: Object?) : this()

    @Member
    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>) : this()

    @Member
    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh) : this()

    constructor(
        iShouldNOTFailAsImNotRegistered: String,
        s: Int,
        obj: Object?,
        variantArray: VariantArray<Any?>?,
        navMesh: NavigationMesh
    ) : this()

    constructor(
        i: Int,
        s: String,
        obj: Object?,
        variantArray: VariantArray<Any?>?,
        navMesh: NavigationMesh,
        tooManyArgsShouldWorkIfNotRegistered: String
    ) : this()

    // constructors which should fail:
//    @Member
//    constructor(iShouldFailAsOverloadingIsNotSupported: String, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh) : this()
//    @Member
//    constructor(i: Int, s: Int, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh, tooManyArgs: String) : this()
}

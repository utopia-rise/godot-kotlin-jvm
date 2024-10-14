package godot.tests

import godot.NavigationMesh
import godot.Node
import godot.Object
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.VariantArray

@GodotScript
class MultiArgsConstructorTest : Node {

    @GodotMember
    var defaultConstructorHasBeenCalled = false

    @GodotMember
    var oneArgConstructorHasBeenCalled = false

    @GodotMember
    var threeArgsConstructorHasBeenCalled = false

    @GodotMember
    constructor() : super() {
        defaultConstructorHasBeenCalled = true
    }

    @GodotMember
    constructor(i: Int) : this() {
        oneArgConstructorHasBeenCalled = true
    }

    @GodotMember
    constructor(i: Int, s: String) : this() {
        threeArgsConstructorHasBeenCalled = true
    }

    @GodotMember
    constructor(i: Int, s: String, obj: Object?) : this()

    @GodotMember
    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>) : this()

    @GodotMember
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
//    @GodotMember
//    constructor(iShouldFailAsOverloadingIsNotSupported: String, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh) : this()
//    @GodotMember
//    constructor(i: Int, s: Int, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh, tooManyArgs: String) : this()
}

package godot.tests

import godot.api.NavigationMesh
import godot.api.Node
import godot.api.Object
import godot.annotation.RegisterClass
import godot.annotation.RegisterConstructor
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

    @RegisterConstructor
    constructor() : super() {
        defaultConstructorHasBeenCalled = true
    }

    @RegisterConstructor
    constructor(i: Int) : this() {
        oneArgConstructorHasBeenCalled = true
    }

    @RegisterConstructor
    constructor(i: Int, s: String) : this() {
        threeArgsConstructorHasBeenCalled = true
    }

    @RegisterConstructor
    constructor(i: Int, s: String, obj: Object?) : this()

    @RegisterConstructor
    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>) : this()

    @RegisterConstructor
    constructor(i: Int, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh) : this()

    constructor(
        i: Int,
        s: String,
        obj: Object?,
        variantArray: VariantArray<Any?>?,
        navMesh: NavigationMesh,
        tooManyArgsShouldWorkIfNotRegistered: String
    ) : this()

    // constructors which should fail:
//    @RegisterConstructor
//    constructor(iShouldFailAsOverloadingIsNotSupported: String, s: String, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh) : this()
//    @RegisterConstructor
//    constructor(i: Int, s: Int, obj: Object?, variantArray: VariantArray<Any?>?, navMesh: NavigationMesh, tooManyArgs: String) : this()
//    constructor(
//        iShouldFailAsImDuplicate5param: String,
//        s: Int,
//        obj: Object?,
//        variantArray: VariantArray<Any?>?,
//        navMesh: NavigationMesh
//    ) : this()
}

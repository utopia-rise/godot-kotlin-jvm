package godot.tests.registration

import godot.Button
import godot.Node
import godot.Texture
import godot.annotation.Export
import godot.annotation.RegisterClass
import godot.annotation.RegisterProperty
import godot.core.VariantArray
import godot.core.variantArrayOf

@RegisterClass
class TypedVariantArrayRegistration: Node() {

    @Export
    @RegisterProperty
    var intVariantArray: VariantArray<Int> = variantArrayOf()

    @Export
    @RegisterProperty
    var buttonVariantArray: VariantArray<Button> = variantArrayOf()

    @Export
    @RegisterProperty
    var textureVariantArray: VariantArray<Texture> = variantArrayOf()
}

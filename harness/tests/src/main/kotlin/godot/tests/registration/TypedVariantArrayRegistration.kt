package godot.tests.registration

import godot.api.Button
import godot.api.Node
import godot.api.Texture
import godot.annotation.Export
import godot.annotation.script
import godot.core.VariantArray
import godot.core.variantArrayOf

@script
class TypedVariantArrayRegistration: Node() {

    @Export
    var intVariantArray: VariantArray<Int> = variantArrayOf()

    @Export
    var buttonVariantArray: VariantArray<Button> = variantArrayOf()

    @Export
    var textureVariantArray: VariantArray<Texture> = variantArrayOf()
}

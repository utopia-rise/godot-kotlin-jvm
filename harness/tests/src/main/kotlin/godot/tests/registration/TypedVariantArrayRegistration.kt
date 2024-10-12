package godot.tests.registration

import godot.Button
import godot.Node
import godot.Texture
import godot.annotation.Export
import godot.annotation.GodotScript
import godot.core.VariantArray
import godot.core.variantArrayOf

@GodotScript
class TypedVariantArrayRegistration: Node() {

    @Export
    var intVariantArray: VariantArray<Int> = variantArrayOf()

    @Export
    var buttonVariantArray: VariantArray<Button> = variantArrayOf()

    @Export
    var textureVariantArray: VariantArray<Texture> = variantArrayOf()
}

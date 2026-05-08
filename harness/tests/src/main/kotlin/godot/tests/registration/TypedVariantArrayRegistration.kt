package godot.tests.registration

import godot.api.Button
import godot.api.Node
import godot.api.Texture
import godot.annotation.Export
import godot.annotation.GodotScript
import godot.annotation.Register
import godot.annotation.Visible
import godot.core.VariantArray
import godot.core.variantArrayOf

@GodotScript
class TypedVariantArrayRegistration: Node() {

    @Export
    @Visible
    var intVariantArray: VariantArray<Int> = variantArrayOf()

    @Export
    @Visible
    var buttonVariantArray: VariantArray<Button> = variantArrayOf()

    @Export
    @Visible
    var textureVariantArray: VariantArray<Texture> = variantArrayOf()
}
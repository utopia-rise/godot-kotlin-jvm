// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture with 3 dimensions.
 *
 * Texture3D is a 3-dimensional [godot.Texture] that has a width, height, and depth. See also [godot.TextureArray].
 *
 * **Note:** [godot.Texture3D]s can only be sampled in shaders in the GLES3 backend. In GLES2, their data can be accessed via scripting, but there is no way to render them in a hardware-accelerated manner.
 */
@GodotBaseType
public open class Texture3D : TextureLayered() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTURE3D)
  }

  /**
   * Creates the Texture3D with specified `width`, `height`, and `depth`. See [enum Image.Format] for `format` options. See [enum TextureLayered.Flags] enumerator for `flags` options.
   */
  public open fun create(
    width: Long,
    height: Long,
    depth: Long,
    format: Long,
    flags: Long = 4
  ): Unit {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to depth, LONG to format,
        LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_CREATE, NIL)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Texture with 3 dimensions.
 *
 * [godot.ImageTexture3D] is a 3-dimensional [godot.ImageTexture] that has a width, height, and depth. See also [godot.ImageTextureLayered].
 *
 * 3D textures are typically used to store density maps for [godot.FogMaterial], color correction LUTs for [godot.Environment], vector fields for [godot.GPUParticlesAttractorVectorField3D] and collision maps for [godot.GPUParticlesCollisionSDF3D]. 3D textures can also be used in custom shaders.
 */
@GodotBaseType
public open class ImageTexture3D : Texture3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGETEXTURE3D, scriptIndex)
    return true
  }

  /**
   * Creates the [godot.ImageTexture3D] with specified [width], [height], and [depth]. See [enum Image.Format] for [format] options. If [useMipmaps] is `true`, then generate mipmaps for the [godot.ImageTexture3D].
   */
  public fun create(
    format: Image.Format,
    width: Int,
    height: Int,
    depth: Int,
    useMipmaps: Boolean,
    `data`: VariantArray<Image>,
  ): GodotError {
    TransferContext.writeArguments(LONG to format.id, LONG to width.toLong(), LONG to height.toLong(), LONG to depth.toLong(), BOOL to useMipmaps, ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE3D_CREATE, LONG)
    return GodotError.values()[(TransferContext.readReturnValue(LONG) as Long).toInt()]
  }

  /**
   * Replaces the texture's existing data with the layers specified in `data`. The size of `data` must match the parameters that were used for [create]. In other words, the texture cannot be resized or have its format changed by calling [update].
   */
  public fun update(`data`: VariantArray<Image>): Unit {
    TransferContext.writeArguments(ARRAY to data)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_IMAGETEXTURE3D_UPDATE, NIL)
  }

  public companion object
}

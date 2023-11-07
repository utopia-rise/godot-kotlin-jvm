// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [ImageTexture3D] is a 3-dimensional [ImageTexture] that has a width, height, and depth. See also
 * [ImageTextureLayered].
 * 3D textures are typically used to store density maps for [FogMaterial], color correction LUTs for
 * [Environment], vector fields for [GPUParticlesAttractorVectorField3D] and collision maps for
 * [GPUParticlesCollisionSDF3D]. 3D textures can also be used in custom shaders.
 */
@GodotBaseType
public open class ImageTexture3D : Texture3D() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_IMAGETEXTURE3D, scriptIndex)
    return true
  }

  /**
   * Creates the [ImageTexture3D] with specified [param width], [param height], and [param depth].
   * See [enum Image.Format] for [param format] options. If [param use_mipmaps] is `true`, then
   * generate mipmaps for the [ImageTexture3D].
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
    TransferContext.callMethod(rawPtr, MethodBindings.createPtr, LONG)
    return GodotError.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Replaces the texture's existing data with the layers specified in [param data]. The size of
   * [param data] must match the parameters that were used for [create]. In other words, the texture
   * cannot be resized or have its format changed by calling [update].
   */
  public fun update(`data`: VariantArray<Image>): Unit {
    TransferContext.writeArguments(ARRAY to data)
    TransferContext.callMethod(rawPtr, MethodBindings.updatePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val createPtr: VoidPtr = TypeManager.getMethodBindPtr("ImageTexture3D", "create")

    public val updatePtr: VoidPtr = TypeManager.getMethodBindPtr("ImageTexture3D", "update")
  }
}

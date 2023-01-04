// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Base class for 3-dimensionnal textures.
 *
 * Base class for [godot.ImageTexture3D] and [godot.CompressedTexture3D]. Cannot be used directly, but contains all the functions necessary for accessing the derived resource types. [godot.Texture3D] is the base class for all 3-dimensional texture types. See also [godot.TextureLayered].
 *
 * All images need to have the same width, height and number of mipmap levels.
 *
 * To create such a texture file yourself, reimport your image files using the Godot Editor import presets.
 */
@GodotBaseType
public open class Texture3D : Texture() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_TEXTURE3D, scriptIndex)
    return true
  }

  /**
   * Called when the [godot.Texture3D]'s format is queried.
   */
  public open fun _getFormat(): Image.Format {
    throw NotImplementedError("_get_format is not implemented for Texture3D")
  }

  /**
   * Called when the [godot.Texture3D]'s width is queried.
   */
  public open fun _getWidth(): Long {
    throw NotImplementedError("_get_width is not implemented for Texture3D")
  }

  /**
   * Called when the [godot.Texture3D]'s height is queried.
   */
  public open fun _getHeight(): Long {
    throw NotImplementedError("_get_height is not implemented for Texture3D")
  }

  /**
   * Called when the [godot.Texture3D]'s depth is queried.
   */
  public open fun _getDepth(): Long {
    throw NotImplementedError("_get_depth is not implemented for Texture3D")
  }

  /**
   * Called when the presence of mipmaps in the [godot.Texture3D] is queried.
   */
  public open fun _hasMipmaps(): Boolean {
    throw NotImplementedError("_has_mipmaps is not implemented for Texture3D")
  }

  /**
   * Called when the [godot.Texture3D]'s data is queried.
   */
  public open fun _getData(): VariantArray<Image> {
    throw NotImplementedError("_get_data is not implemented for Texture3D")
  }

  /**
   * Returns the current format being used by this texture. See [enum Image.Format] for details.
   */
  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the [godot.Texture3D]'s width in pixels. Width is typically represented by the X axis.
   */
  public fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Texture3D]'s height in pixels. Width is typically represented by the Y axis.
   */
  public fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the [godot.Texture3D]'s depth in pixels. Depth is typically represented by the Z axis (a dimension not present in [godot.Texture2D]).
   */
  public fun getDepth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_DEPTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if the [godot.Texture3D] has generated mipmaps.
   */
  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_HAS_MIPMAPS, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.Texture3D]'s data as an array of [godot.Image]s. Each [godot.Image] represents a *slice* of the [godot.Texture3D], with different slices mapping to different depth (Z axis) levels.
   */
  public fun getData(): VariantArray<Image> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURE3D_GET_DATA, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>
  }

  public companion object
}

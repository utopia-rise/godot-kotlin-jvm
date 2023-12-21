// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress

/**
 * Base class for 3-dimensional textures.
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
  public open fun _getWidth(): Int {
    throw NotImplementedError("_get_width is not implemented for Texture3D")
  }

  /**
   * Called when the [godot.Texture3D]'s height is queried.
   */
  public open fun _getHeight(): Int {
    throw NotImplementedError("_get_height is not implemented for Texture3D")
  }

  /**
   * Called when the [godot.Texture3D]'s depth is queried.
   */
  public open fun _getDepth(): Int {
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
   * Returns the current format being used by this texture. See [Image.Format] for details.
   */
  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [godot.Texture3D]'s width in pixels. Width is typically represented by the X axis.
   */
  public fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.Texture3D]'s height in pixels. Width is typically represented by the Y axis.
   */
  public fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the [godot.Texture3D]'s depth in pixels. Depth is typically represented by the Z axis (a dimension not present in [godot.Texture2D]).
   */
  public fun getDepth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDepthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the [godot.Texture3D] has generated mipmaps.
   */
  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [godot.Texture3D]'s data as an array of [godot.Image]s. Each [godot.Image] represents a *slice* of the [godot.Texture3D], with different slices mapping to different depth (Z axis) levels.
   */
  public fun getData(): VariantArray<Image> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDataPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Image>)
  }

  /**
   * Creates a placeholder version of this resource ([godot.PlaceholderTexture3D]).
   */
  public fun createPlaceholder(): Resource? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Resource?)
  }

  public companion object

  internal object MethodBindings {
    public val _getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "_get_format")

    public val _getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "_get_width")

    public val _getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "_get_height")

    public val _getDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "_get_depth")

    public val _hasMipmapsPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "_has_mipmaps")

    public val _getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "_get_data")

    public val getFormatPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "get_format")

    public val getWidthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "get_width")

    public val getHeightPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "get_height")

    public val getDepthPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "get_depth")

    public val hasMipmapsPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "has_mipmaps")

    public val getDataPtr: VoidPtr = TypeManager.getMethodBindPtr("Texture3D", "get_data")

    public val createPlaceholderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Texture3D", "create_placeholder")
  }
}

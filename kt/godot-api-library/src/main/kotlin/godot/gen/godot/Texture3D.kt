// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

private const val ENGINE_CLASS_TEXTURE3D_INDEX: Int = 652

/**
 * Base class for [ImageTexture3D] and [CompressedTexture3D]. Cannot be used directly, but contains
 * all the functions necessary for accessing the derived resource types. [Texture3D] is the base class
 * for all 3-dimensional texture types. See also [TextureLayered].
 * All images need to have the same width, height and number of mipmap levels.
 * To create such a texture file yourself, reimport your image files using the Godot Editor import
 * presets.
 */
@GodotBaseType
public open class Texture3D : Texture() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_TEXTURE3D_INDEX, scriptIndex)
  }

  /**
   * Called when the [Texture3D]'s format is queried.
   */
  public open fun _getFormat(): Image.Format {
    throw NotImplementedError("_get_format is not implemented for Texture3D")
  }

  /**
   * Called when the [Texture3D]'s width is queried.
   */
  public open fun _getWidth(): Int {
    throw NotImplementedError("_get_width is not implemented for Texture3D")
  }

  /**
   * Called when the [Texture3D]'s height is queried.
   */
  public open fun _getHeight(): Int {
    throw NotImplementedError("_get_height is not implemented for Texture3D")
  }

  /**
   * Called when the [Texture3D]'s depth is queried.
   */
  public open fun _getDepth(): Int {
    throw NotImplementedError("_get_depth is not implemented for Texture3D")
  }

  /**
   * Called when the presence of mipmaps in the [Texture3D] is queried.
   */
  public open fun _hasMipmaps(): Boolean {
    throw NotImplementedError("_has_mipmaps is not implemented for Texture3D")
  }

  /**
   * Called when the [Texture3D]'s data is queried.
   */
  public open fun _getData(): VariantArray<Image> {
    throw NotImplementedError("_get_data is not implemented for Texture3D")
  }

  /**
   * Returns the current format being used by this texture. See [Image.Format] for details.
   */
  public final fun getFormat(): Image.Format {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [Texture3D]'s width in pixels. Width is typically represented by the X axis.
   */
  public final fun getWidth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [Texture3D]'s height in pixels. Width is typically represented by the Y axis.
   */
  public final fun getHeight(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the [Texture3D]'s depth in pixels. Depth is typically represented by the Z axis (a
   * dimension not present in [Texture2D]).
   */
  public final fun getDepth(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the [Texture3D] has generated mipmaps.
   */
  public final fun hasMipmaps(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.hasMipmapsPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [Texture3D]'s data as an array of [Image]s. Each [Image] represents a *slice* of
   * the [Texture3D], with different slices mapping to different depth (Z axis) levels.
   */
  public final fun getData(): VariantArray<Image> {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDataPtr, ARRAY)
    return (Internals.readReturnValue(ARRAY) as VariantArray<Image>)
  }

  /**
   * Creates a placeholder version of this resource ([PlaceholderTexture3D]).
   */
  public final fun createPlaceholder(): Resource? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.createPlaceholderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Resource?)
  }

  public companion object

  public object MethodBindings {
    internal val getFormatPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture3D", "get_format", 3847873762)

    internal val getWidthPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture3D", "get_width", 3905245786)

    internal val getHeightPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture3D", "get_height", 3905245786)

    internal val getDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture3D", "get_depth", 3905245786)

    internal val hasMipmapsPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture3D", "has_mipmaps", 36873697)

    internal val getDataPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture3D", "get_data", 3995934104)

    internal val createPlaceholderPtr: VoidPtr =
        Internals.getMethodBindPtr("Texture3D", "create_placeholder", 121922552)
  }
}

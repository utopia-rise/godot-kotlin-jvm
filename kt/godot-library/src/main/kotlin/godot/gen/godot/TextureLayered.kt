// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.Image
import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.TransferContext
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Any
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for 3D texture types.
 *
 * Base class for [godot.Texture3D] and [godot.TextureArray]. Cannot be used directly, but contains all the functions necessary for accessing and using [godot.Texture3D] and [godot.TextureArray]. Data is set on a per-layer basis. For [godot.Texture3D]s, the layer specifies the depth or Z-index, they can be treated as a bunch of 2D slices. Similarly, for [godot.TextureArray]s, the layer specifies the array layer.
 */
@GodotBaseType
public open class TextureLayered : Resource() {
  /**
   * Specifies which [enum Flags] apply to this texture.
   */
  public open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_FLAGS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTURELAYERED)
  }

  public open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for TextureLayered")
  }

  public open fun _setData(`data`: Dictionary<Any?, Any?>): Unit {
  }

  /**
   * Returns the depth of the texture. Depth is the 3rd dimension (typically Z-axis).
   */
  public open fun getDepth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_DEPTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current format being used by this texture. See [enum Image.Format] for details.
   */
  public open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the height of the texture. Height is typically represented by the Y-axis.
   */
  public open fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an [godot.Image] resource with the data from specified `layer`.
   */
  public open fun getLayerData(layer: Long): Image? {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_LAYER_DATA,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Returns the width of the texture. Width is typically represented by the X-axis.
   */
  public open fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Partially sets the data for a specified `layer` by overwriting using the data of the specified `image`. `x_offset` and `y_offset` determine where the [godot.Image] is "stamped" over the texture. The `image` must fit within the texture.
   */
  public open fun setDataPartial(
    image: Image,
    xOffset: Long,
    yOffset: Long,
    layer: Long,
    mipmap: Long = 0
  ): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to xOffset, LONG to yOffset, LONG to layer,
        LONG to mipmap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_DATA_PARTIAL,
        NIL)
  }

  /**
   * Sets the data for the specified layer. Data takes the form of a 2-dimensional [godot.Image] resource.
   */
  public open fun setLayerData(image: Image, layer: Long): Unit {
    TransferContext.writeArguments(OBJECT to image, LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_LAYER_DATA, NIL)
  }

  public enum class Flags(
    id: Long
  ) {
    /**
     * Texture will generate mipmaps on creation.
     */
    FLAG_MIPMAPS(1),
    /**
     * Texture will repeat when UV used is outside the 0-1 range.
     */
    FLAG_REPEAT(2),
    /**
     * Default flags for [godot.Texture3D]. [FLAG_FILTER] is enabled.
     */
    FLAGS_DEFAULT_TEXTURE_3D(4),
    /**
     * Use filtering when reading from texture. Filtering smooths out pixels. Turning filtering off is slightly faster and more appropriate when you need access to individual pixels.
     */
    FLAG_FILTER(4),
    /**
     * Default flags for [godot.TextureArray]. [FLAG_MIPMAPS], [FLAG_REPEAT] and [FLAG_FILTER] are enabled.
     */
    FLAGS_DEFAULT_TEXTURE_ARRAY(7),
    /**
     * Uses anisotropic mipmap filtering. Generates smaller versions of the same texture with different aspect ratios.
     *
     * This results in better-looking textures when viewed from oblique angles.
     */
    FLAG_ANISOTROPIC_FILTER(8),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object {
    /**
     * Default flags for [godot.Texture3D]. [FLAG_FILTER] is enabled.
     */
    public final const val FLAGS_DEFAULT_TEXTURE_3D: Long = 4

    /**
     * Default flags for [godot.TextureArray]. [FLAG_MIPMAPS], [FLAG_REPEAT] and [FLAG_FILTER] are enabled.
     */
    public final const val FLAGS_DEFAULT_TEXTURE_ARRAY: Long = 7

    /**
     * Uses anisotropic mipmap filtering. Generates smaller versions of the same texture with different aspect ratios.
     *
     * This results in better-looking textures when viewed from oblique angles.
     */
    public final const val FLAG_ANISOTROPIC_FILTER: Long = 8

    /**
     * Use filtering when reading from texture. Filtering smooths out pixels. Turning filtering off is slightly faster and more appropriate when you need access to individual pixels.
     */
    public final const val FLAG_FILTER: Long = 4

    /**
     * Texture will generate mipmaps on creation.
     */
    public final const val FLAG_MIPMAPS: Long = 1

    /**
     * Texture will repeat when UV used is outside the 0-1 range.
     */
    public final const val FLAG_REPEAT: Long = 2
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.Image
import godot.annotation.GodotBaseType
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

/**
 * Base class for 3D texture types.
 *
 * Base class for [godot.Texture3D] and [godot.TextureArray]. Cannot be used directly, but contains all the functions necessary for accessing and using [godot.Texture3D] and [godot.TextureArray]. Data is set on a per-layer basis. For [godot.Texture3D]s, the layer sepcifies the depth or Z-index, they can be treated as a bunch of 2D slices. Similarly, for [godot.TextureArray]s, the layer specifies the array layer.
 */
@GodotBaseType
open class TextureLayered : Resource() {
  /**
   * Specifies which [enum Flags] apply to this texture.
   */
  open var flags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_FLAGS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_FLAGS, NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_TEXTURELAYERED)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    id = buffer.long
    buffer.rewind()
  }

  open fun _getData(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_data is not implemented for TextureLayered")
  }

  open fun _setData(data: Dictionary<Any?, Any?>) {
  }

  /**
   * Creates the [godot.Texture3D] or [godot.TextureArray] with specified `width`, `height`, and `depth`. See [enum Image.Format] for `format` options. See [enum Flags] enumerator for `flags` options.
   */
  open fun create(
    width: Long,
    height: Long,
    depth: Long,
    format: Long,
    flags: Long = 4
  ) {
    TransferContext.writeArguments(LONG to width, LONG to height, LONG to depth, LONG to format,
        LONG to flags)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_CREATE, NIL)
  }

  /**
   * Returns the depth of the texture. Depth is the 3rd dimension (typically Z-axis).
   */
  open fun getDepth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_DEPTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current format being used by this texture. See [enum Image.Format] for details.
   */
  open fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_FORMAT, LONG)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the height of the texture. Height is typically represented by the Y-axis.
   */
  open fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_HEIGHT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns an [godot.Image] resource with the data from specified `layer`.
   */
  open fun getLayerData(layer: Long): Image? {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_LAYER_DATA,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Returns the width of the texture. Width is typically represented by the X-axis.
   */
  open fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Partially sets the data for a specified `layer` by overwriting using the data of the specified `image`. `x_offset` and `y_offset` determine where the [godot.Image] is "stamped" over the texture. The `image` must fit within the texture.
   */
  open fun setDataPartial(
    image: Image,
    xOffset: Long,
    yOffset: Long,
    layer: Long,
    mipmap: Long = 0
  ) {
    TransferContext.writeArguments(OBJECT to image, LONG to xOffset, LONG to yOffset, LONG to layer,
        LONG to mipmap)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_DATA_PARTIAL,
        NIL)
  }

  /**
   * Sets the data for the specified layer. Data takes the form of a 2-dimensional [godot.Image] resource.
   */
  open fun setLayerData(image: Image, layer: Long) {
    TransferContext.writeArguments(OBJECT to image, LONG to layer)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_SET_LAYER_DATA, NIL)
  }

  enum class Flags(
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
     * Use filtering when reading from texture. Filtering smooths out pixels. Turning filtering off is slightly faster and more appropriate when you need access to individual pixels.
     */
    FLAG_FILTER(4),

    /**
     * Equivalent to [FLAG_FILTER].
     */
    FLAGS_DEFAULT(4);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * Equivalent to [FLAG_FILTER].
     */
    final const val FLAGS_DEFAULT: Long = 4

    /**
     * Use filtering when reading from texture. Filtering smooths out pixels. Turning filtering off is slightly faster and more appropriate when you need access to individual pixels.
     */
    final const val FLAG_FILTER: Long = 4

    /**
     * Texture will generate mipmaps on creation.
     */
    final const val FLAG_MIPMAPS: Long = 1

    /**
     * Texture will repeat when UV used is outside the 0-1 range.
     */
    final const val FLAG_REPEAT: Long = 2
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.Image
import godot.TextureLayered
import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for 3D texture types.
 *
 * Base class for [godot.Texture2DArray], [godot.Cubemap] and [godot.CubemapArray]. Cannot be used directly, but contains all the functions necessary for accessing the derived resource types. Data is set on a per-layer basis. For [godot.Texture2DArray]s, the layer specifies the array layer.
 */
@GodotBaseType
public open class TextureLayered : Texture() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_TEXTURELAYERED)
  }

  /**
   *
   */
  public open fun _getFormat(): Image.Format {
    throw NotImplementedError("_get_format is not implemented for TextureLayered")
  }

  /**
   *
   */
  public open fun _getLayeredType(): Long {
    throw NotImplementedError("_get_layered_type is not implemented for TextureLayered")
  }

  /**
   *
   */
  public open fun _getWidth(): Long {
    throw NotImplementedError("_get_width is not implemented for TextureLayered")
  }

  /**
   *
   */
  public open fun _getHeight(): Long {
    throw NotImplementedError("_get_height is not implemented for TextureLayered")
  }

  /**
   *
   */
  public open fun _getLayers(): Long {
    throw NotImplementedError("_get_layers is not implemented for TextureLayered")
  }

  /**
   *
   */
  public open fun _hasMipmaps(): Boolean {
    throw NotImplementedError("_has_mipmaps is not implemented for TextureLayered")
  }

  /**
   *
   */
  public open fun _getLayerData(layerIndex: Long): Image? {
    throw NotImplementedError("_get_layer_data is not implemented for TextureLayered")
  }

  /**
   * Returns the current format being used by this texture. See [enum Image.Format] for details.
   */
  public fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_FORMAT, LONG.ordinal)
    return Image.Format.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   *
   */
  public fun getLayeredType(): TextureLayered.LayeredType {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_LAYERED_TYPE,
        LONG.ordinal)
    return TextureLayered.LayeredType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns the width of the texture. Width is typically represented by the X-axis.
   */
  public fun getWidth(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_WIDTH, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the height of the texture. Height is typically represented by the Y-axis.
   */
  public fun getHeight(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_HEIGHT, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun getLayers(): Long {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_LAYERS, LONG.ordinal)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   *
   */
  public fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_HAS_MIPMAPS, BOOL.ordinal)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns an [godot.Image] resource with the data from specified `layer`.
   */
  public fun getLayerData(layer: Long): Image? {
    TransferContext.writeArguments(LONG to layer)
    TransferContext.icall(rawPtr, ENGINEMETHOD_ENGINECLASS_TEXTURELAYERED_GET_LAYER_DATA,
        OBJECT.ordinal)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  public enum class LayeredType(
    id: Long
  ) {
    /**
     *
     */
    LAYERED_TYPE_2D_ARRAY(0),
    /**
     *
     */
    LAYERED_TYPE_CUBEMAP(1),
    /**
     *
     */
    LAYERED_TYPE_CUBEMAP_ARRAY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

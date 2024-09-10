// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
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
import kotlin.Unit

/**
 * Base class for [ImageTextureLayered] and [CompressedTextureLayered]. Cannot be used directly, but
 * contains all the functions necessary for accessing the derived resource types. See also [Texture3D].
 * Data is set on a per-layer basis. For [Texture2DArray]s, the layer specifies the array layer.
 * All images need to have the same width, height and number of mipmap levels.
 * A [TextureLayered] can be loaded with [ResourceLoader.load].
 * Internally, Godot maps these files to their respective counterparts in the target rendering
 * driver (Vulkan, OpenGL3).
 */
@GodotBaseType
public open class TextureLayered : Texture() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TEXTURELAYERED, scriptIndex)
  }

  /**
   * Called when the [TextureLayered]'s format is queried.
   */
  public open fun _getFormat(): Image.Format {
    throw NotImplementedError("_get_format is not implemented for TextureLayered")
  }

  /**
   * Called when the layers' type in the [TextureLayered] is queried.
   */
  public open fun _getLayeredType(): Long {
    throw NotImplementedError("_get_layered_type is not implemented for TextureLayered")
  }

  /**
   * Called when the [TextureLayered]'s width queried.
   */
  public open fun _getWidth(): Int {
    throw NotImplementedError("_get_width is not implemented for TextureLayered")
  }

  /**
   * Called when the [TextureLayered]'s height is queried.
   */
  public open fun _getHeight(): Int {
    throw NotImplementedError("_get_height is not implemented for TextureLayered")
  }

  /**
   * Called when the number of layers in the [TextureLayered] is queried.
   */
  public open fun _getLayers(): Int {
    throw NotImplementedError("_get_layers is not implemented for TextureLayered")
  }

  /**
   * Called when the presence of mipmaps in the [TextureLayered] is queried.
   */
  public open fun _hasMipmaps(): Boolean {
    throw NotImplementedError("_has_mipmaps is not implemented for TextureLayered")
  }

  /**
   * Called when the data for a layer in the [TextureLayered] is queried.
   */
  public open fun _getLayerData(layerIndex: Int): Image? {
    throw NotImplementedError("_get_layer_data is not implemented for TextureLayered")
  }

  /**
   * Returns the current format being used by this texture. See [Image.Format] for details.
   */
  public final fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [TextureLayered]'s type. The type determines how the data is accessed, with
   * cubemaps having special types.
   */
  public final fun getLayeredType(): LayeredType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayeredTypePtr, LONG)
    return TextureLayered.LayeredType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the width of the texture in pixels. Width is typically represented by the X axis.
   */
  public final fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the height of the texture in pixels. Height is typically represented by the Y axis.
   */
  public final fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the number of referenced [Image]s.
   */
  public final fun getLayers(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the layers have generated mipmaps.
   */
  public final fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns an [Image] resource with the data from specified [layer].
   */
  public final fun getLayerData(layer: Int): Image? {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getLayerDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Image?)
  }

  public enum class LayeredType(
    id: Long,
  ) {
    /**
     * Texture is a generic [Texture2DArray].
     */
    LAYERED_TYPE_2D_ARRAY(0),
    /**
     * Texture is a [Cubemap], with each side in its own layer (6 in total).
     */
    LAYERED_TYPE_CUBEMAP(1),
    /**
     * Texture is a [CubemapArray], with each cubemap being made of 6 layers.
     */
    LAYERED_TYPE_CUBEMAP_ARRAY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayeredType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_format", 3847873762)

    public val getLayeredTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layered_type", 518123893)

    public val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_width", 3905245786)

    public val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_height", 3905245786)

    public val getLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layers", 3905245786)

    public val hasMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "has_mipmaps", 36873697)

    public val getLayerDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layer_data", 3655284255)
  }
}

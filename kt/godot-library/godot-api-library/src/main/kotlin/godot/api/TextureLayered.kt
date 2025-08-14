// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmField

/**
 * Base class for [ImageTextureLayered] and [CompressedTextureLayered]. Cannot be used directly, but
 * contains all the functions necessary for accessing the derived resource types. See also [Texture3D].
 *
 * Data is set on a per-layer basis. For [Texture2DArray]s, the layer specifies the array layer.
 *
 * All images need to have the same width, height and number of mipmap levels.
 *
 * A [TextureLayered] can be loaded with [ResourceLoader.load].
 *
 * Internally, Godot maps these files to their respective counterparts in the target rendering
 * driver (Vulkan, OpenGL3).
 */
@GodotBaseType
public open class TextureLayered : Texture() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(674, scriptIndex)
  }

  /**
   * Called when the [TextureLayered]'s format is queried.
   */
  public open fun _getFormat(): Image.Format {
    throw NotImplementedError("_getFormat is not implemented for TextureLayered")
  }

  /**
   * Called when the layers' type in the [TextureLayered] is queried.
   */
  public open fun _getLayeredType(): Long {
    throw NotImplementedError("_getLayeredType is not implemented for TextureLayered")
  }

  /**
   * Called when the [TextureLayered]'s width queried.
   */
  public open fun _getWidth(): Int {
    throw NotImplementedError("_getWidth is not implemented for TextureLayered")
  }

  /**
   * Called when the [TextureLayered]'s height is queried.
   */
  public open fun _getHeight(): Int {
    throw NotImplementedError("_getHeight is not implemented for TextureLayered")
  }

  /**
   * Called when the number of layers in the [TextureLayered] is queried.
   */
  public open fun _getLayers(): Int {
    throw NotImplementedError("_getLayers is not implemented for TextureLayered")
  }

  /**
   * Called when the presence of mipmaps in the [TextureLayered] is queried.
   */
  public open fun _hasMipmaps(): Boolean {
    throw NotImplementedError("_hasMipmaps is not implemented for TextureLayered")
  }

  /**
   * Called when the data for a layer in the [TextureLayered] is queried.
   */
  public open fun _getLayerData(layerIndex: Int): Image? {
    throw NotImplementedError("_getLayerData is not implemented for TextureLayered")
  }

  /**
   * Returns the current format being used by this texture. See [Image.Format] for details.
   */
  public final fun getFormat(): Image.Format {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatPtr, LONG)
    return Image.Format.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the [TextureLayered]'s type. The type determines how the data is accessed, with
   * cubemaps having special types.
   */
  public final fun getLayeredType(): LayeredType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayeredTypePtr, LONG)
    return LayeredType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the width of the texture in pixels. Width is typically represented by the X axis.
   */
  public final fun getWidth(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getWidthPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the height of the texture in pixels. Height is typically represented by the Y axis.
   */
  public final fun getHeight(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHeightPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the number of referenced [Image]s.
   */
  public final fun getLayers(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getLayersPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns `true` if the layers have generated mipmaps.
   */
  public final fun hasMipmaps(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.hasMipmapsPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns an [Image] resource with the data from specified [layer].
   */
  public final fun getLayerData(layer: Int): Image? {
    TransferContext.writeArguments(LONG to layer.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLayerDataPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Image?)
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
    CUBEMAP(1),
    /**
     * Texture is a [CubemapArray], with each cubemap being made of 6 layers.
     */
    CUBEMAP_ARRAY(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): LayeredType = entries.single { it.id == `value` }
    }
  }

  public companion object {
    @JvmField
    public val getFormatName: MethodStringName0<TextureLayered, Image.Format> =
        MethodStringName0<TextureLayered, Image.Format>("get_format")

    @JvmField
    public val getLayeredTypeName: MethodStringName0<TextureLayered, LayeredType> =
        MethodStringName0<TextureLayered, LayeredType>("get_layered_type")

    @JvmField
    public val getWidthName: MethodStringName0<TextureLayered, Int> =
        MethodStringName0<TextureLayered, Int>("get_width")

    @JvmField
    public val getHeightName: MethodStringName0<TextureLayered, Int> =
        MethodStringName0<TextureLayered, Int>("get_height")

    @JvmField
    public val getLayersName: MethodStringName0<TextureLayered, Int> =
        MethodStringName0<TextureLayered, Int>("get_layers")

    @JvmField
    public val hasMipmapsName: MethodStringName0<TextureLayered, Boolean> =
        MethodStringName0<TextureLayered, Boolean>("has_mipmaps")

    @JvmField
    public val getLayerDataName: MethodStringName1<TextureLayered, Image?, Int> =
        MethodStringName1<TextureLayered, Image?, Int>("get_layer_data")
  }

  public object MethodBindings {
    internal val getFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_format", 3847873762)

    internal val getLayeredTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layered_type", 518123893)

    internal val getWidthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_width", 3905245786)

    internal val getHeightPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_height", 3905245786)

    internal val getLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layers", 3905245786)

    internal val hasMipmapsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "has_mipmaps", 36873697)

    internal val getLayerDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TextureLayered", "get_layer_data", 3655284255)
  }
}

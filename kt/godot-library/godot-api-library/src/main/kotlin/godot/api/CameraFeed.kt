// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Dictionary
import godot.core.Signal0
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantParser.ARRAY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DICTIONARY
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.TRANSFORM2D
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A camera feed gives you access to a single physical camera attached to your device. When enabled,
 * Godot will start capturing frames from the camera which can then be used. See also [CameraServer].
 * **Note:** Many cameras will return YCbCr images which are split into two textures and need to be
 * combined in a shader. Godot does this automatically for you if you set the environment to show the
 * camera image in the background.
 * **Note:** This class is currently only implemented on Linux, macOS, and iOS. On other platforms
 * no [CameraFeed]s will be available. To get a [CameraFeed] on iOS, the camera plugin from
 * [url=https://github.com/godotengine/godot-ios-plugins]godot-ios-plugins[/url] is required.
 */
@GodotBaseType
public open class CameraFeed : RefCounted() {
  /**
   * Emitted when a new frame is available.
   */
  public val frameChanged: Signal0 by Signal0

  /**
   * Emitted when the format has changed.
   */
  public val formatChanged: Signal0 by Signal0

  /**
   * If `true`, the feed is active.
   */
  public final inline var feedIsActive: Boolean
    @JvmName("feedIsActiveProperty")
    get() = isActive()
    @JvmName("feedIsActiveProperty")
    set(`value`) {
      setActive(value)
    }

  /**
   * The transform applied to the camera's image.
   */
  @CoreTypeLocalCopy
  public final inline var feedTransform: Transform2D
    @JvmName("feedTransformProperty")
    get() = getTransform()
    @JvmName("feedTransformProperty")
    set(`value`) {
      setTransform(value)
    }

  /**
   * Formats supported by the feed. Each entry is a [Dictionary] describing format parameters.
   */
  public final inline val formats: VariantArray<Any?>
    @JvmName("formatsProperty")
    get() = getFormats()

  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(132, scriptIndex)
  }

  /**
   * The transform applied to the camera's image.
   *
   * This is a helper function to make dealing with local copies easier.
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = camerafeed.feedTransform
   * //Your changes
   * camerafeed.feedTransform = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public final fun feedTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      feedTransform.apply{
      block(this)
      feedTransform = this
  }


  /**
   * Called when the camera feed is activated.
   */
  public open fun _activateFeed(): Boolean {
    throw NotImplementedError("_activateFeed is not implemented for CameraFeed")
  }

  /**
   * Called when the camera feed is deactivated.
   */
  public open fun _deactivateFeed(): Unit {
  }

  /**
   * Returns the unique ID for this feed.
   */
  public final fun getId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  public final fun isActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.isActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public final fun setActive(active: Boolean): Unit {
    TransferContext.writeArguments(BOOL to active)
    TransferContext.callMethod(ptr, MethodBindings.setActivePtr, NIL)
  }

  /**
   * Returns the camera's name.
   */
  public final fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  /**
   * Sets the camera's name.
   */
  public final fun setName(name: String): Unit {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(ptr, MethodBindings.setNamePtr, NIL)
  }

  /**
   * Returns the position of camera on the device.
   */
  public final fun getPosition(): FeedPosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, LONG)
    return CameraFeed.FeedPosition.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the position of this camera.
   */
  public final fun setPosition(position: FeedPosition): Unit {
    TransferContext.writeArguments(LONG to position.id)
    TransferContext.callMethod(ptr, MethodBindings.setPositionPtr, NIL)
  }

  public final fun getTransform(): Transform2D {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTransformPtr, TRANSFORM2D)
    return (TransferContext.readReturnValue(TRANSFORM2D) as Transform2D)
  }

  public final fun setTransform(transform: Transform2D): Unit {
    TransferContext.writeArguments(TRANSFORM2D to transform)
    TransferContext.callMethod(ptr, MethodBindings.setTransformPtr, NIL)
  }

  /**
   * Sets RGB image for this feed.
   */
  public final fun setRgbImage(rgbImage: Image?): Unit {
    TransferContext.writeArguments(OBJECT to rgbImage)
    TransferContext.callMethod(ptr, MethodBindings.setRgbImagePtr, NIL)
  }

  /**
   * Sets YCbCr image for this feed.
   */
  public final fun setYcbcrImage(ycbcrImage: Image?): Unit {
    TransferContext.writeArguments(OBJECT to ycbcrImage)
    TransferContext.callMethod(ptr, MethodBindings.setYcbcrImagePtr, NIL)
  }

  /**
   * Sets the feed as external feed provided by another library.
   */
  public final fun setExternal(width: Int, height: Int): Unit {
    TransferContext.writeArguments(LONG to width.toLong(), LONG to height.toLong())
    TransferContext.callMethod(ptr, MethodBindings.setExternalPtr, NIL)
  }

  /**
   * Returns the texture backend ID (usable by some external libraries that need a handle to a
   * texture to write data).
   */
  public final fun getTextureTexId(feedImageType: CameraServer.FeedImage): Long {
    TransferContext.writeArguments(LONG to feedImageType.id)
    TransferContext.callMethod(ptr, MethodBindings.getTextureTexIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns feed image data type.
   */
  public final fun getDatatype(): FeedDataType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDatatypePtr, LONG)
    return CameraFeed.FeedDataType.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun getFormats(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getFormatsPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY) as VariantArray<Any?>)
  }

  /**
   * Sets the feed format parameters for the given index in the [formats] array. Returns `true` on
   * success. By default YUYV encoded stream is transformed to FEED_RGB. YUYV encoded stream output
   * format can be changed with [parameters].output value:
   * `separate` will result in FEED_YCBCR_SEP
   * `grayscale` will result in desaturated FEED_RGB
   * `copy` will result in FEED_YCBCR
   */
  public final fun setFormat(index: Int, parameters: Dictionary<Any?, Any?>): Boolean {
    TransferContext.writeArguments(LONG to index.toLong(), DICTIONARY to parameters)
    TransferContext.callMethod(ptr, MethodBindings.setFormatPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public enum class FeedDataType(
    id: Long,
  ) {
    /**
     * No image set for the feed.
     */
    FEED_NOIMAGE(0),
    /**
     * Feed supplies RGB images.
     */
    FEED_RGB(1),
    /**
     * Feed supplies YCbCr images that need to be converted to RGB.
     */
    FEED_YCBCR(2),
    /**
     * Feed supplies separate Y and CbCr images that need to be combined and converted to RGB.
     */
    FEED_YCBCR_SEP(3),
    /**
     * Feed supplies external image.
     */
    FEED_EXTERNAL(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FeedDataType = entries.single { it.id == `value` }
    }
  }

  public enum class FeedPosition(
    id: Long,
  ) {
    /**
     * Unspecified position.
     */
    FEED_UNSPECIFIED(0),
    /**
     * Camera is mounted at the front of the device.
     */
    FEED_FRONT(1),
    /**
     * Camera is mounted at the back of the device.
     */
    FEED_BACK(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): FeedPosition = entries.single { it.id == `value` }
    }
  }

  public companion object

  public object MethodBindings {
    internal val getIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_id", 3905245786)

    internal val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "is_active", 36873697)

    internal val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_active", 2586408642)

    internal val getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_name", 201670096)

    internal val setNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_name", 83702148)

    internal val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_position", 2711679033)

    internal val setPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_position", 611162623)

    internal val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_transform", 3814499831)

    internal val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_transform", 2761652528)

    internal val setRgbImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_rgb_image", 532598488)

    internal val setYcbcrImagePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_ycbcr_image", 532598488)

    internal val setExternalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_external", 3937882851)

    internal val getTextureTexIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_texture_tex_id", 1135699418)

    internal val getDatatypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_datatype", 1477782850)

    internal val getFormatsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_formats", 3995934104)

    internal val setFormatPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_format", 31872775)
  }
}

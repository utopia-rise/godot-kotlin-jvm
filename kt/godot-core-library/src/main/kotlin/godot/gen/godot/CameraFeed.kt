// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Transform2D
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.STRING
import godot.core.VariantParser.TRANSFORM2D
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
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
 */
@GodotBaseType
public open class CameraFeed : RefCounted() {
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

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_CAMERAFEED, this, scriptIndex)
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
   * Returns the position of camera on the device.
   */
  public final fun getPosition(): FeedPosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, LONG)
    return CameraFeed.FeedPosition.from(TransferContext.readReturnValue(LONG) as Long)
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
   * Returns feed image data type.
   */
  public final fun getDatatype(): FeedDataType {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDatatypePtr, LONG)
    return CameraFeed.FeedDataType.from(TransferContext.readReturnValue(LONG) as Long)
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

  internal object MethodBindings {
    public val getIdPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraFeed", "get_id", 3905245786)

    public val isActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "is_active", 36873697)

    public val setActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_active", 2586408642)

    public val getNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_name", 201670096)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_position", 2711679033)

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_transform", 3814499831)

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_transform", 2761652528)

    public val getDatatypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_datatype", 1477782850)
  }
}

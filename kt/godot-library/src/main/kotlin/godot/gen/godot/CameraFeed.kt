// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

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
  public var feedIsActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isActivePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setActivePtr, NIL)
    }

  /**
   * The transform applied to the camera's image.
   */
  @CoreTypeLocalCopy
  public var feedTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTransformPtr, TRANSFORM2D)
      return (TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTransformPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAFEED, scriptIndex)
    return true
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
  public open fun feedTransformMutate(block: Transform2D.() -> Unit): Transform2D =
      feedTransform.apply{
      block(this)
      feedTransform = this
  }


  /**
   * Returns the unique ID for this feed.
   */
  public fun getId(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the camera's name.
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNamePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns the position of camera on the device.
   */
  public fun getPosition(): FeedPosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPositionPtr, LONG)
    return CameraFeed.FeedPosition.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns feed image data type.
   */
  public fun getDatatype(): FeedDataType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDatatypePtr, LONG)
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
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
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getIdPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraFeed", "get_id")

    public val isActivePtr: VoidPtr = TypeManager.getMethodBindPtr("CameraFeed", "is_active")

    public val setActivePtr: VoidPtr = TypeManager.getMethodBindPtr("CameraFeed", "set_active")

    public val getNamePtr: VoidPtr = TypeManager.getMethodBindPtr("CameraFeed", "get_name")

    public val getPositionPtr: VoidPtr = TypeManager.getMethodBindPtr("CameraFeed", "get_position")

    public val getTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "get_transform")

    public val setTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CameraFeed", "set_transform")

    public val getDatatypePtr: VoidPtr = TypeManager.getMethodBindPtr("CameraFeed", "get_datatype")
  }
}

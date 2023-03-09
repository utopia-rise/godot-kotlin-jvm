// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Transform2D
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A camera feed gives you access to a single physical camera attached to your device.
 *
 * A camera feed gives you access to a single physical camera attached to your device. When enabled, Godot will start capturing frames from the camera which can then be used. See also [godot.CameraServer].
 *
 * **Note:** Many cameras will return YCbCr images which are split into two textures and need to be combined in a shader. Godot does this automatically for you if you set the environment to show the camera image in the background.
 */
@GodotBaseType
public open class CameraFeed : RefCounted() {
  /**
   * If `true`, the feed is active.
   */
  public var feedIsActive: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_IS_ACTIVE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_SET_ACTIVE, NIL)
    }

  /**
   * The transform applied to the camera's image.
   */
  public var feedTransform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_GET_TRANSFORM,
          TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_SET_TRANSFORM, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_CAMERAFEED, scriptIndex)
    return true
  }

  /**
   * Returns the unique ID for this feed.
   */
  public fun getId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_GET_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the camera's name.
   */
  public fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_GET_NAME, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the position of camera on the device.
   */
  public fun getPosition(): FeedPosition {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_GET_POSITION, LONG)
    return CameraFeed.FeedPosition.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns feed image data type.
   */
  public fun getDatatype(): FeedDataType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CAMERAFEED_GET_DATATYPE, LONG)
    return CameraFeed.FeedDataType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
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
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}

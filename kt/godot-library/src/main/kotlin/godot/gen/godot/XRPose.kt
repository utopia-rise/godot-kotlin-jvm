// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM3D
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This object contains all data related to a pose on a tracked object.
 *
 * XR runtimes often identify multiple locations on devices such as controllers that are spatially tracked.
 *
 * Orientation, location, linear velocity and angular velocity are all provided for each pose by the XR runtime. This object contains this state of a pose.
 */
@GodotBaseType
public open class XRPose : RefCounted() {
  /**
   * If `true` our tracking data is up to date. If `false` we're no longer receiving new tracking data and our state is whatever that last valid state was.
   */
  public var hasTrackingData: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_GET_HAS_TRACKING_DATA,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_SET_HAS_TRACKING_DATA, NIL)
    }

  /**
   * The name of this pose. Pose names are often driven by an action map setup by the user. Godot does suggest a number of pose names that it expects [godot.XRInterface]s to implement:
   *
   * - `root` defines a root location, often used for tracked objects that do not have further nodes.
   *
   * - `aim` defines the tip of a controller with the orientation pointing outwards, for example: add your raycasts to this.
   *
   * - `grip` defines the location where the user grips the controller
   *
   * - `skeleton` defines the root location a hand mesh should be placed when using hand tracking and the animated skeleton supplied by the XR runtime.
   */
  public var name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_GET_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_SET_NAME, NIL)
    }

  /**
   * The transform containing the original and transform as reported by the XR runtime.
   */
  public var transform: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_GET_TRANSFORM, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_SET_TRANSFORM, NIL)
    }

  /**
   * The linear velocity of this pose.
   */
  public var linearVelocity: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_GET_LINEAR_VELOCITY,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_SET_LINEAR_VELOCITY, NIL)
    }

  /**
   * The angular velocity for this pose.
   */
  public var angularVelocity: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_GET_ANGULAR_VELOCITY,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_SET_ANGULAR_VELOCITY, NIL)
    }

  /**
   * The tracking confidence for this pose, provides insight on how accurate the spatial positioning of this record is.
   */
  public var trackingConfidence: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_GET_TRACKING_CONFIDENCE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_SET_TRACKING_CONFIDENCE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_XRPOSE)
  }

  /**
   * Returns the [transform] with world scale and our reference frame applied. This is the transform used to position [godot.XRNode3D] objects.
   */
  public fun getAdjustedTransform(): Transform3D {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSE_GET_ADJUSTED_TRANSFORM,
        TRANSFORM3D)
    return TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D
  }

  public enum class TrackingConfidence(
    id: Long
  ) {
    /**
     * No tracking information is available for this pose.
     */
    XR_TRACKING_CONFIDENCE_NONE(0),
    /**
     * Tracking information may be inaccurate or estimated. For example, with inside out tracking this would indicate a controller may be (partially) obscured.
     */
    XR_TRACKING_CONFIDENCE_LOW(1),
    /**
     * Tracking information is deemed accurate and up to date.
     */
    XR_TRACKING_CONFIDENCE_HIGH(2),
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

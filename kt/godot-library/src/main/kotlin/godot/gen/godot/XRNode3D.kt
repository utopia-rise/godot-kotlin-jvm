// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A spatial node that has its position automatically updated by the [godot.XRServer].
 *
 * This node can be bound to a specific pose of a [godot.XRPositionalTracker] and will automatically have its [godot.Node3D.transform] updated by the [godot.XRServer]. Nodes of this type must be added as children of the [godot.XROrigin3D] node.
 */
@GodotBaseType
public open class XRNode3D internal constructor() : Node3D() {
  /**
   * The name of the tracker we're bound to. Which trackers are available is not known during design time.
   *
   * Godot defines a number of standard trackers such as `left_hand` and `right_hand` but others may be configured within a given [godot.XRInterface].
   */
  public var tracker: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_GET_TRACKER, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_SET_TRACKER, NIL)
    }

  /**
   * The name of the pose we're bound to. Which poses a tracker supports is not known during design time.
   *
   * Godot defines number of standard pose names such as `aim` and `grip` but other may be configured within a given [godot.XRInterface].
   */
  public var pose: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_GET_POSE_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_SET_POSE_NAME, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_XRNODE3D)
  }

  /**
   * Returns `true` if the [tracker] has been registered and the [pose] is being tracked.
   */
  public fun getIsActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_GET_IS_ACTIVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if the [tracker] has current tracking data for the [pose] being tracked.
   */
  public fun getHasTrackingData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_GET_HAS_TRACKING_DATA,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the [godot.XRPose] containing the current state of the pose being tracked. This gives access to additional properties of this pose.
   */
  public fun getPose(): XRPose? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_GET_POSE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRPose?
  }

  /**
   * Triggers a haptic pulse on a device associated with this interface.
   *
   * `action_name` is the name of the action for this pulse.
   */
  public fun triggerHapticPulse(
    actionName: String,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double
  ): Unit {
    TransferContext.writeArguments(STRING to actionName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRNODE3D_TRIGGER_HAPTIC_PULSE, NIL)
  }

  public companion object
}

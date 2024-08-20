// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * This node can be bound to a specific pose of a [XRPositionalTracker] and will automatically have
 * its [Node3D.transform] updated by the [XRServer]. Nodes of this type must be added as children of
 * the [XROrigin3D] node.
 */
@GodotBaseType
public open class XRNode3D : Node3D() {
  /**
   * Emitted when the [tracker] starts or stops receiving updated tracking data for the [pose] being
   * tracked. The [tracking] argument indicates whether the tracker is getting updated tracking data.
   */
  public val trackingChanged: Signal1<Boolean> by signal("tracking")

  /**
   * The name of the tracker we're bound to. Which trackers are available is not known during design
   * time.
   * Godot defines a number of standard trackers such as `left_hand` and `right_hand` but others may
   * be configured within a given [XRInterface].
   */
  public var tracker: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTrackerPtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTrackerPtr, NIL)
    }

  /**
   * The name of the pose we're bound to. Which poses a tracker supports is not known during design
   * time.
   * Godot defines number of standard pose names such as `aim` and `grip` but other may be
   * configured within a given [XRInterface].
   */
  public var pose: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPoseNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPoseNamePtr, NIL)
    }

  /**
   * Enables showing the node when tracking starts, and hiding the node when tracking is lost.
   */
  public var showWhenTracked: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShowWhenTrackedPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShowWhenTrackedPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_XRNODE3D, scriptIndex)
    return true
  }

  /**
   * Returns `true` if the [tracker] has been registered and the [pose] is being tracked.
   */
  public fun getIsActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the [tracker] has current tracking data for the [pose] being tracked.
   */
  public fun getHasTrackingData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [XRPose] containing the current state of the pose being tracked. This gives access
   * to additional properties of this pose.
   */
  public fun getPose(): XRPose? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPosePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRPose?)
  }

  /**
   * Triggers a haptic pulse on a device associated with this interface.
   * [actionName] is the name of the action for this pulse.
   * [frequency] is the frequency of the pulse, set to `0.0` to have the system use a default
   * frequency.
   * [amplitude] is the amplitude of the pulse between `0.0` and `1.0`.
   * [durationSec] is the duration of the pulse in seconds.
   * [delaySec] is a delay in seconds before the pulse is given.
   */
  public fun triggerHapticPulse(
    actionName: String,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double,
  ): Unit {
    TransferContext.writeArguments(STRING to actionName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    TransferContext.callMethod(rawPtr, MethodBindings.triggerHapticPulsePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "set_tracker")

    public val getTrackerPtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_tracker")

    public val setPoseNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "set_pose_name")

    public val getPoseNamePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_pose_name")

    public val setShowWhenTrackedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "set_show_when_tracked")

    public val getShowWhenTrackedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_show_when_tracked")

    public val getIsActivePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_is_active")

    public val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_has_tracking_data")

    public val getPosePtr: VoidPtr = TypeManager.getMethodBindPtr("XRNode3D", "get_pose")

    public val triggerHapticPulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "trigger_haptic_pulse")
  }
}

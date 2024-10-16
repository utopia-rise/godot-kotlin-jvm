// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.MemoryManager
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.Signal1
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

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
  public val trackingChanged: Signal1<Boolean> by Signal1

  /**
   * The name of the tracker we're bound to. Which trackers are available is not known during design
   * time.
   * Godot defines a number of standard trackers such as `left_hand` and `right_hand` but others may
   * be configured within a given [XRInterface].
   */
  public final inline var tracker: StringName
    @JvmName("trackerProperty")
    get() = getTracker()
    @JvmName("trackerProperty")
    set(`value`) {
      setTracker(value)
    }

  /**
   * The name of the pose we're bound to. Which poses a tracker supports is not known during design
   * time.
   * Godot defines number of standard pose names such as `aim` and `grip` but other may be
   * configured within a given [XRInterface].
   */
  public final inline var pose: StringName
    @JvmName("poseProperty")
    get() = getPoseName()
    @JvmName("poseProperty")
    set(`value`) {
      setPoseName(value)
    }

  /**
   * Enables showing the node when tracking starts, and hiding the node when tracking is lost.
   */
  public final inline var showWhenTracked: Boolean
    @JvmName("showWhenTrackedProperty")
    get() = getShowWhenTracked()
    @JvmName("showWhenTrackedProperty")
    set(`value`) {
      setShowWhenTracked(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    MemoryManager.createNativeObject(ENGINECLASS_XRNODE3D, this, scriptIndex)
  }

  public final fun setTracker(trackerName: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to trackerName)
    TransferContext.callMethod(ptr, MethodBindings.setTrackerPtr, NIL)
  }

  public final fun getTracker(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrackerPtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setPoseName(pose: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to pose)
    TransferContext.callMethod(ptr, MethodBindings.setPoseNamePtr, NIL)
  }

  public final fun getPoseName(): StringName {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPoseNamePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setShowWhenTracked(show: Boolean): Unit {
    TransferContext.writeArguments(BOOL to show)
    TransferContext.callMethod(ptr, MethodBindings.setShowWhenTrackedPtr, NIL)
  }

  public final fun getShowWhenTracked(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getShowWhenTrackedPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the [tracker] has been registered and the [pose] is being tracked.
   */
  public final fun getIsActive(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getIsActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the [tracker] has current tracking data for the [pose] being tracked.
   */
  public final fun getHasTrackingData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [XRPose] containing the current state of the pose being tracked. This gives access
   * to additional properties of this pose.
   */
  public final fun getPose(): XRPose? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getPosePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as XRPose?)
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
  public final fun triggerHapticPulse(
    actionName: String,
    frequency: Double,
    amplitude: Double,
    durationSec: Double,
    delaySec: Double,
  ): Unit {
    TransferContext.writeArguments(STRING to actionName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    TransferContext.callMethod(ptr, MethodBindings.triggerHapticPulsePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "set_tracker", 3304788590)

    public val getTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_tracker", 2002593661)

    public val setPoseNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "set_pose_name", 3304788590)

    public val getPoseNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_pose_name", 2002593661)

    public val setShowWhenTrackedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "set_show_when_tracked", 2586408642)

    public val getShowWhenTrackedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_show_when_tracked", 36873697)

    public val getIsActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_is_active", 36873697)

    public val getHasTrackingDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_has_tracking_data", 36873697)

    public val getPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "get_pose", 2806551826)

    public val triggerHapticPulsePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRNode3D", "trigger_haptic_pulse", 508576839)
  }
}

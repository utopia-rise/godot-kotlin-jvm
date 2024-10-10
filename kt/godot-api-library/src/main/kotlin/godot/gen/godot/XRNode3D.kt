// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Signal1
import godot.core.StringName
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_XRNODE3D_INDEX: Int = 848

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
    Internals.callConstructor(this, ENGINE_CLASS_XRNODE3D_INDEX, scriptIndex)
  }

  public final fun setTracker(trackerName: StringName): Unit {
    Internals.writeArguments(STRING_NAME to trackerName)
    Internals.callMethod(rawPtr, MethodBindings.setTrackerPtr, NIL)
  }

  public final fun getTracker(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTrackerPtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setPoseName(pose: StringName): Unit {
    Internals.writeArguments(STRING_NAME to pose)
    Internals.callMethod(rawPtr, MethodBindings.setPoseNamePtr, NIL)
  }

  public final fun getPoseName(): StringName {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPoseNamePtr, STRING_NAME)
    return (Internals.readReturnValue(STRING_NAME) as StringName)
  }

  public final fun setShowWhenTracked(show: Boolean): Unit {
    Internals.writeArguments(BOOL to show)
    Internals.callMethod(rawPtr, MethodBindings.setShowWhenTrackedPtr, NIL)
  }

  public final fun getShowWhenTracked(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShowWhenTrackedPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the [tracker] has been registered and the [pose] is being tracked.
   */
  public final fun getIsActive(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getIsActivePtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns `true` if the [tracker] has current tracking data for the [pose] being tracked.
   */
  public final fun getHasTrackingData(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getHasTrackingDataPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the [XRPose] containing the current state of the pose being tracked. This gives access
   * to additional properties of this pose.
   */
  public final fun getPose(): XRPose? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPosePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as XRPose?)
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
    Internals.writeArguments(STRING to actionName, DOUBLE to frequency, DOUBLE to amplitude, DOUBLE to durationSec, DOUBLE to delaySec)
    Internals.callMethod(rawPtr, MethodBindings.triggerHapticPulsePtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "set_tracker", 3304788590)

    public val getTrackerPtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "get_tracker", 2002593661)

    public val setPoseNamePtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "set_pose_name", 3304788590)

    public val getPoseNamePtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "get_pose_name", 2002593661)

    public val setShowWhenTrackedPtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "set_show_when_tracked", 2586408642)

    public val getShowWhenTrackedPtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "get_show_when_tracked", 36873697)

    public val getIsActivePtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "get_is_active", 36873697)

    public val getHasTrackingDataPtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "get_has_tracking_data", 36873697)

    public val getPosePtr: VoidPtr = Internals.getMethodBindPtr("XRNode3D", "get_pose", 2806551826)

    public val triggerHapticPulsePtr: VoidPtr =
        Internals.getMethodBindPtr("XRNode3D", "trigger_haptic_pulse", 508576839)
  }
}

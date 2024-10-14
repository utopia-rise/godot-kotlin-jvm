// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.Signal1
import godot.core.Signal2
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantCaster.ANY
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.STRING
import godot.core.VariantParser.STRING_NAME
import godot.core.VariantParser.TRANSFORM3D
import godot.core.VariantParser.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An instance of this object represents a device that is tracked, such as a controller or anchor
 * point. HMDs aren't represented here as they are handled internally.
 * As controllers are turned on and the [XRInterface] detects them, instances of this object are
 * automatically added to this list of active tracking objects accessible through the [XRServer].
 * The [XRNode3D] and [XRAnchor3D] both consume objects of this type and should be used in your
 * project. The positional trackers are just under-the-hood objects that make this all work. These are
 * mostly exposed so that GDExtension-based interfaces can interact with them.
 */
@GodotBaseType
public open class XRPositionalTracker : XRTracker() {
  /**
   * Emitted when the state of a pose tracked by this tracker changes.
   */
  public val poseChanged: Signal1<XRPose> by Signal1

  /**
   * Emitted when a pose tracked by this tracker stops getting updated tracking data.
   */
  public val poseLostTracking: Signal1<XRPose> by Signal1

  /**
   * Emitted when a button on this tracker is pressed. Note that many XR runtimes allow other inputs
   * to be mapped to buttons.
   */
  public val buttonPressed: Signal1<String> by Signal1

  /**
   * Emitted when a button on this tracker is released.
   */
  public val buttonReleased: Signal1<String> by Signal1

  /**
   * Emitted when a trigger or similar input on this tracker changes value.
   */
  public val inputFloatChanged: Signal2<String, Double> by Signal2

  /**
   * Emitted when a thumbstick or thumbpad on this tracker moves.
   */
  public val inputVector2Changed: Signal2<String, Vector2> by Signal2

  /**
   * Emitted when the profile of our tracker changes.
   */
  public val profileChanged: Signal1<String> by Signal1

  /**
   * The profile associated with this tracker, interface dependent but will indicate the type of
   * controller being tracked.
   */
  public final inline var profile: String
    @JvmName("profileProperty")
    get() = getTrackerProfile()
    @JvmName("profileProperty")
    set(`value`) {
      setTrackerProfile(value)
    }

  /**
   * Defines which hand this tracker relates to.
   */
  public final inline var hand: TrackerHand
    @JvmName("handProperty")
    get() = getTrackerHand()
    @JvmName("handProperty")
    set(`value`) {
      setTrackerHand(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_XRPOSITIONALTRACKER, scriptIndex)
  }

  public final fun getTrackerProfile(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrackerProfilePtr, STRING)
    return (TransferContext.readReturnValue(STRING) as String)
  }

  public final fun setTrackerProfile(profile: String): Unit {
    TransferContext.writeArguments(STRING to profile)
    TransferContext.callMethod(ptr, MethodBindings.setTrackerProfilePtr, NIL)
  }

  public final fun getTrackerHand(): TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTrackerHandPtr, LONG)
    return XRPositionalTracker.TrackerHand.from(TransferContext.readReturnValue(LONG) as Long)
  }

  public final fun setTrackerHand(hand: TrackerHand): Unit {
    TransferContext.writeArguments(LONG to hand.id)
    TransferContext.callMethod(ptr, MethodBindings.setTrackerHandPtr, NIL)
  }

  /**
   * Returns `true` if the tracker is available and is currently tracking the bound [name] pose.
   */
  public final fun hasPose(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.hasPosePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the current [XRPose] state object for the bound [name] pose.
   */
  public final fun getPose(name: StringName): XRPose? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.getPosePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as XRPose?)
  }

  /**
   * Marks this pose as invalid, we don't clear the last reported state but it allows users to
   * decide if trackers need to be hidden if we lose tracking or just remain at their last known
   * position.
   */
  public final fun invalidatePose(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.invalidatePosePtr, NIL)
  }

  /**
   * Sets the transform, linear velocity, angular velocity and tracking confidence for the given
   * pose. This method is called by a [XRInterface] implementation and should not be used directly.
   */
  public final fun setPose(
    name: StringName,
    transform: Transform3D,
    linearVelocity: Vector3,
    angularVelocity: Vector3,
    trackingConfidence: XRPose.TrackingConfidence,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, TRANSFORM3D to transform, VECTOR3 to linearVelocity, VECTOR3 to angularVelocity, LONG to trackingConfidence.id)
    TransferContext.callMethod(ptr, MethodBindings.setPosePtr, NIL)
  }

  /**
   * Returns an input for this tracker. It can return a boolean, float or [Vector2] value depending
   * on whether the input is a button, trigger or thumbstick/thumbpad.
   */
  public final fun getInput(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(ptr, MethodBindings.getInputPtr, ANY)
    return (TransferContext.readReturnValue(ANY) as Any?)
  }

  /**
   * Changes the value for the given input. This method is called by a [XRInterface] implementation
   * and should not be used directly.
   */
  public final fun setInput(name: StringName, `value`: Any?): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(ptr, MethodBindings.setInputPtr, NIL)
  }

  public enum class TrackerHand(
    id: Long,
  ) {
    /**
     * The hand this tracker is held in is unknown or not applicable.
     */
    TRACKER_HAND_UNKNOWN(0),
    /**
     * This tracker is the left hand controller.
     */
    TRACKER_HAND_LEFT(1),
    /**
     * This tracker is the right hand controller.
     */
    TRACKER_HAND_RIGHT(2),
    /**
     * Represents the size of the [TrackerHand] enum.
     */
    TRACKER_HAND_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TrackerHand = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getTrackerProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_profile", 201670096)

    public val setTrackerProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_profile", 83702148)

    public val getTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_hand", 4181770860)

    public val setTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_hand", 3904108980)

    public val hasPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "has_pose", 2619796661)

    public val getPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_pose", 4099720006)

    public val invalidatePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "invalidate_pose", 3304788590)

    public val setPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_pose", 3451230163)

    public val getInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_input", 2760726917)

    public val setInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_input", 3776071444)
  }
}

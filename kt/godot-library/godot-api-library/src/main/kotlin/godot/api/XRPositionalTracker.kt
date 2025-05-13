// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.MethodStringName0
import godot.core.MethodStringName1
import godot.core.MethodStringName2
import godot.core.MethodStringName5
import godot.core.Signal1
import godot.core.Signal2
import godot.core.StringName
import godot.core.Transform3D
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
import godot.core.asCachedStringName
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import kotlin.jvm.JvmStatic

/**
 * An instance of this object represents a device that is tracked, such as a controller or anchor
 * point. HMDs aren't represented here as they are handled internally.
 *
 * As controllers are turned on and the [XRInterface] detects them, instances of this object are
 * automatically added to this list of active tracking objects accessible through the [XRServer].
 *
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
    createNativeObject(873, scriptIndex)
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
    return TrackerHand.from(TransferContext.readReturnValue(LONG) as Long)
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

  /**
   * Returns `true` if the tracker is available and is currently tracking the bound [name] pose.
   */
  public final fun hasPose(name: String): Boolean = hasPose(name.asCachedStringName())

  /**
   * Returns the current [XRPose] state object for the bound [name] pose.
   */
  public final fun getPose(name: String): XRPose? = getPose(name.asCachedStringName())

  /**
   * Marks this pose as invalid, we don't clear the last reported state but it allows users to
   * decide if trackers need to be hidden if we lose tracking or just remain at their last known
   * position.
   */
  public final fun invalidatePose(name: String) = invalidatePose(name.asCachedStringName())

  /**
   * Sets the transform, linear velocity, angular velocity and tracking confidence for the given
   * pose. This method is called by a [XRInterface] implementation and should not be used directly.
   */
  public final fun setPose(
    name: String,
    transform: Transform3D,
    linearVelocity: Vector3,
    angularVelocity: Vector3,
    trackingConfidence: XRPose.TrackingConfidence,
  ) =
      setPose(name.asCachedStringName(), transform, linearVelocity, angularVelocity, trackingConfidence)

  /**
   * Returns an input for this tracker. It can return a boolean, float or [Vector2] value depending
   * on whether the input is a button, trigger or thumbstick/thumbpad.
   */
  public final fun getInput(name: String): Any? = getInput(name.asCachedStringName())

  /**
   * Changes the value for the given input. This method is called by a [XRInterface] implementation
   * and should not be used directly.
   */
  public final fun setInput(name: String, `value`: Any?) =
      setInput(name.asCachedStringName(), value)

  public enum class TrackerHand(
    id: Long,
  ) {
    /**
     * The hand this tracker is held in is unknown or not applicable.
     */
    UNKNOWN(0),
    /**
     * This tracker is the left hand controller.
     */
    LEFT(1),
    /**
     * This tracker is the right hand controller.
     */
    RIGHT(2),
    /**
     * Represents the size of the [TrackerHand] enum.
     */
    MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TrackerHand = entries.single { it.id == `value` }
    }
  }

  public companion object {
    @JvmStatic
    public val getTrackerProfileName: MethodStringName0<XRPositionalTracker, String> =
        MethodStringName0<XRPositionalTracker, String>("get_tracker_profile")

    @JvmStatic
    public val setTrackerProfileName: MethodStringName1<XRPositionalTracker, Unit, String> =
        MethodStringName1<XRPositionalTracker, Unit, String>("set_tracker_profile")

    @JvmStatic
    public val getTrackerHandName: MethodStringName0<XRPositionalTracker, TrackerHand> =
        MethodStringName0<XRPositionalTracker, TrackerHand>("get_tracker_hand")

    @JvmStatic
    public val setTrackerHandName: MethodStringName1<XRPositionalTracker, Unit, TrackerHand> =
        MethodStringName1<XRPositionalTracker, Unit, TrackerHand>("set_tracker_hand")

    @JvmStatic
    public val hasPoseName: MethodStringName1<XRPositionalTracker, Boolean, StringName> =
        MethodStringName1<XRPositionalTracker, Boolean, StringName>("has_pose")

    @JvmStatic
    public val getPoseName: MethodStringName1<XRPositionalTracker, XRPose?, StringName> =
        MethodStringName1<XRPositionalTracker, XRPose?, StringName>("get_pose")

    @JvmStatic
    public val invalidatePoseName: MethodStringName1<XRPositionalTracker, Unit, StringName> =
        MethodStringName1<XRPositionalTracker, Unit, StringName>("invalidate_pose")

    @JvmStatic
    public val setPoseName:
        MethodStringName5<XRPositionalTracker, Unit, StringName, Transform3D, Vector3, Vector3, XRPose.TrackingConfidence>
        =
        MethodStringName5<XRPositionalTracker, Unit, StringName, Transform3D, Vector3, Vector3, XRPose.TrackingConfidence>("set_pose")

    @JvmStatic
    public val getInputName: MethodStringName1<XRPositionalTracker, Any?, StringName> =
        MethodStringName1<XRPositionalTracker, Any?, StringName>("get_input")

    @JvmStatic
    public val setInputName: MethodStringName2<XRPositionalTracker, Unit, StringName, Any?> =
        MethodStringName2<XRPositionalTracker, Unit, StringName, Any?>("set_input")
  }

  public object MethodBindings {
    internal val getTrackerProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_profile", 201670096)

    internal val setTrackerProfilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_profile", 83702148)

    internal val getTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_tracker_hand", 4181770860)

    internal val setTrackerHandPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_tracker_hand", 3904108980)

    internal val hasPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "has_pose", 2619796661)

    internal val getPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_pose", 4099720006)

    internal val invalidatePosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "invalidate_pose", 3304788590)

    internal val setPosePtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_pose", 3451230163)

    internal val getInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "get_input", 2760726917)

    internal val setInputPtr: VoidPtr =
        TypeManager.getMethodBindPtr("XRPositionalTracker", "set_input", 3776071444)
  }
}

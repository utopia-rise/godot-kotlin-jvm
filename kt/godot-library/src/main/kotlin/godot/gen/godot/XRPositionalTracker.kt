// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.Transform3D
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A tracked object.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/vr/index.html]($DOCS_URL/tutorials/vr/index.html)
 *
 * An instance of this object represents a device that is tracked, such as a controller or anchor point. HMDs aren't represented here as they are handled internally.
 *
 * As controllers are turned on and the [godot.XRInterface] detects them, instances of this object are automatically added to this list of active tracking objects accessible through the [godot.XRServer].
 *
 * The [godot.XRController3D] and [godot.XRAnchor3D] both consume objects of this type and should be used in your project. The positional trackers are just under-the-hood objects that make this all work. These are mostly exposed so that GDExtension-based interfaces can interact with them.
 */
@GodotBaseType
public open class XRPositionalTracker : RefCounted() {
  /**
   * Emitted when a thumbstick or thumbpad on this tracker moves.
   */
  public val inputAxisChanged: Signal2<String, Vector2> by signal("name", "vector")

  /**
   * Emitted when a trigger or similar input on this tracker changes value.
   */
  public val inputValueChanged: Signal2<String, Double> by signal("name", "value")

  /**
   * Emitted when a button on this tracker is released.
   */
  public val buttonReleased: Signal1<String> by signal("name")

  /**
   * Emitted when the state of a pose tracked by this tracker changes.
   */
  public val poseChanged: Signal1<XRPose> by signal("pose")

  /**
   * Emitted when a button on this tracker is pressed. Note that many XR runtimes allow other inputs to be mapped to buttons.
   */
  public val buttonPressed: Signal1<String> by signal("name")

  /**
   * The type of tracker.
   */
  public open var type: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_GET_TYPE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_SET_TYPE, NIL)
    }

  /**
   * The unique name of this tracker. The trackers that are available differ between various XR runtimes and can often be configured by the user. Godot maintains a number of reserved names that it expects the [godot.XRInterface] to implement if applicable:
   *
   * - `left_hand` identifies the controller held in the players left hand
   *
   * - `right_hand` identifies the controller held in the players right hand
   */
  public open var name: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_GET_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_SET_NAME, NIL)
    }

  /**
   * The description of this tracker.
   */
  public open var description: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_GET_DESCRIPTION, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_SET_DESCRIPTION, NIL)
    }

  /**
   * Defines which hand this tracker relates to.
   */
  public open var hand: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_GET_HAND,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_SET_HAND, NIL)
    }

  /**
   * The degree to which the tracker rumbles. Ranges from `0.0` to `1.0` with precision `.01`.
   */
  public open var rumble: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_GET_RUMBLE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_SET_RUMBLE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_XRPOSITIONALTRACKER)
  }

  /**
   * Returns `true` if the bound `tracker` is available and is currently tracking the bound `pose`.
   */
  public open fun hasPose(name: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_HAS_POSE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the current [godot.XRPose] state object for the bound `pose`.
   */
  public open fun getPose(name: StringName): XRPose? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_GET_POSE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as XRPose?
  }

  /**
   * Marks this pose as invalid, we don't clear the last reported state but it allows users to decide if trackers need to be hidden if we loose tracking or just remain at their last known position.
   */
  public open fun invalidatePose(name: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_INVALIDATE_POSE,
        NIL)
  }

  /**
   * Sets the transform, linear velocity, angular velocity and tracking confidence for the given pose. This method is called by a [godot.XRInterface] implementation and should not be used directly.
   */
  public open fun setPose(
    name: StringName,
    transform: Transform3D,
    linearVelocity: Vector3,
    angularVelocity: Vector3,
    trackingConfidence: XRPose.TrackingConfidence
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, TRANSFORM3D to transform, VECTOR3 to
        linearVelocity, VECTOR3 to angularVelocity, LONG to trackingConfidence.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_SET_POSE, NIL)
  }

  /**
   * Returns an input for this tracker. It can return a boolean, float or [godot.core.Vector2] value depending on whether the input is a button, trigger or thumbstick/thumbpad.
   */
  public open fun getInput(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_GET_INPUT, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  /**
   * Changes the value for the given input. This method is called by a [godot.XRInterface] implementation and should not be used directly.
   */
  public open fun setInput(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_XRPOSITIONALTRACKER_SET_INPUT, NIL)
  }

  public enum class TrackerHand(
    id: Long
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

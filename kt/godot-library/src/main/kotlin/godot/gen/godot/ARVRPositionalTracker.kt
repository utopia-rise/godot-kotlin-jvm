// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.ARVRPositionalTracker
import godot.ARVRServer
import godot.annotation.GodotBaseType
import godot.core.Basis
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BASIS
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

/**
 * A tracked object.
 *
 * Tutorials:
 * [https://docs.godotengine.org/en/latest/tutorials/vr/index.html](https://docs.godotengine.org/en/latest/tutorials/vr/index.html)
 *
 * An instance of this object represents a device that is tracked, such as a controller or anchor point. HMDs aren't represented here as they are handled internally.
 *
 * As controllers are turned on and the AR/VR interface detects them, instances of this object are automatically added to this list of active tracking objects accessible through the [godot.ARVRServer].
 *
 * The [godot.ARVRController] and [godot.ARVRAnchor] both consume objects of this type and should be used in your project. The positional trackers are just under-the-hood objects that make this all work. These are mostly exposed so that GDNative-based interfaces can interact with them.
 */
@GodotBaseType
open class ARVRPositionalTracker : Object() {
  /**
   * The degree to which the tracker rumbles. Ranges from `0.0` to `1.0` with precision `.01`.
   */
  open var rumble: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_RUMBLE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_SET_RUMBLE,
          NIL)
    }

  override fun __new() {
    TransferContext.invokeConstructor(ENGINECLASS_ARVRPOSITIONALTRACKER)
    val buffer = TransferContext.buffer
    rawPtr = buffer.long
    __id = buffer.long
    buffer.rewind()
  }

  open fun _setJoyId(joyId: Long) {
  }

  open fun _setMesh(mesh: Mesh) {
  }

  open fun _setName(name: String) {
  }

  open fun _setOrientation(orientation: Basis) {
  }

  open fun _setRwPosition(rwPosition: Vector3) {
  }

  open fun _setType(type: Long) {
  }

  /**
   * Returns the hand holding this tracker, if known. See [enum TrackerHand] constants.
   */
  open fun getHand(): ARVRPositionalTracker.TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_HAND,
        LONG)
    return ARVRPositionalTracker.TrackerHand.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * If this is a controller that is being tracked, the controller will also be represented by a joystick entry with this ID.
   */
  open fun getJoyId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_JOY_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the mesh related to a controller or anchor point if one is available.
   */
  open fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_MESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  /**
   * Returns the controller or anchor point's name if available.
   */
  open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the controller's orientation matrix.
   */
  open fun getOrientation(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_ORIENTATION, BASIS)
    return TransferContext.readReturnValue(BASIS, false) as Basis
  }

  /**
   * Returns the world-space controller position.
   */
  open fun getPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_POSITION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the internal tracker ID. This uniquely identifies the tracker per tracker type and matches the ID you need to specify for nodes such as the [godot.ARVRController] and [godot.ARVRAnchor] nodes.
   */
  open fun getTrackerId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRACKER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns `true` if this device tracks orientation.
   */
  open fun getTracksOrientation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRACKS_ORIENTATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns `true` if this device tracks position.
   */
  open fun getTracksPosition(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRACKS_POSITION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the transform combining this device's orientation and position.
   */
  open fun getTransform(adjustByReferenceFrame: Boolean): Transform {
    TransferContext.writeArguments(BOOL to adjustByReferenceFrame)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  /**
   * Returns the tracker's type.
   */
  open fun getType(): ARVRServer.TrackerType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TYPE,
        LONG)
    return ARVRServer.TrackerType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class TrackerHand(
    id: Long
  ) {
    /**
     * The hand this tracker is held in is unknown or not applicable.
     */
    TRACKER_HAND_UNKNOWN(0),

    /**
     * This tracker is the left hand controller.
     */
    TRACKER_LEFT_HAND(1),

    /**
     * This tracker is the right hand controller.
     */
    TRACKER_RIGHT_HAND(2);

    val id: Long
    init {
      this.id = id
    }

    companion object {
      fun from(value: Long) = values().single { it.id == value }
    }
  }

  companion object {
    /**
     * The hand this tracker is held in is unknown or not applicable.
     */
    final const val TRACKER_HAND_UNKNOWN: Long = 0

    /**
     * This tracker is the left hand controller.
     */
    final const val TRACKER_LEFT_HAND: Long = 1

    /**
     * This tracker is the right hand controller.
     */
    final const val TRACKER_RIGHT_HAND: Long = 2
  }
}

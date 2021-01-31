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
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress

@GodotBaseType
open class ARVRPositionalTracker : Object() {
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

  override fun __new(): VoidPtr =
      TransferContext.invokeConstructor(ENGINECLASS_ARVRPOSITIONALTRACKER)

  open fun _set_joy_id(joyId: Long) {
  }

  open fun _set_mesh(mesh: Mesh) {
  }

  open fun _set_name(name: String) {
  }

  open fun _set_orientation(orientation: Basis) {
  }

  open fun _set_rw_position(rwPosition: Vector3) {
  }

  open fun _set_type(type: Long) {
  }

  open fun getHand(): ARVRPositionalTracker.TrackerHand {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_HAND,
        LONG)
    return ARVRPositionalTracker.TrackerHand.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  open fun getJoyId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_JOY_ID,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getMesh(): Mesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_MESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Mesh?
  }

  open fun getName(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  open fun getOrientation(): Basis {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_ORIENTATION, BASIS)
    return TransferContext.readReturnValue(BASIS, false) as Basis
  }

  open fun getPosition(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_POSITION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getTrackerId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRACKER_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getTracksOrientation(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRACKS_ORIENTATION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getTracksPosition(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRACKS_POSITION, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun getTransform(adjustByReferenceFrame: Boolean): Transform {
    TransferContext.writeArguments(BOOL to adjustByReferenceFrame)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TRANSFORM,
        TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun getType(): ARVRServer.TrackerType {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ARVRPOSITIONALTRACKER_GET_TYPE,
        LONG)
    return ARVRServer.TrackerType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  enum class TrackerHand(
    id: Long
  ) {
    TRACKER_HAND_UNKNOWN(0),

    TRACKER_LEFT_HAND(1),

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
    final const val TRACKER_HAND_UNKNOWN: Long = 0

    final const val TRACKER_LEFT_HAND: Long = 1

    final const val TRACKER_RIGHT_HAND: Long = 2
  }
}

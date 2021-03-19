// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Suppress

/**
 * 
 * 
 * 
 */
@GodotBaseType
open class SpatialVelocityTracker : Reference() {
  /**
   *
   */
  open var trackPhysicsStep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_GET_TRACK_PHYSICS_STEP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_SET_TRACK_PHYSICS_STEP, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SPATIALVELOCITYTRACKER)
  }

  /**
   *
   */
  open fun getTrackedLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_GET_TRACKED_LINEAR_VELOCITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   *
   */
  open fun reset(position: Vector3) {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_RESET, NIL)
  }

  /**
   *
   */
  open fun updatePosition(position: Vector3) {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_UPDATE_POSITION, NIL)
  }
}

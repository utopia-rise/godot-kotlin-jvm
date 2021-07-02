// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit

/**
 *
 */
@GodotBaseType
public open class SpatialVelocityTracker : Reference() {
  /**
   *
   */
  public open var trackPhysicsStep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_GET_TRACK_PHYSICS_STEP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_SET_TRACK_PHYSICS_STEP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPATIALVELOCITYTRACKER)
  }

  /**
   *
   */
  public open fun getTrackedLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_GET_TRACKED_LINEAR_VELOCITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   *
   */
  public open fun reset(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_RESET, NIL)
  }

  /**
   *
   */
  public open fun updatePosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_SPATIALVELOCITYTRACKER_UPDATE_POSITION, NIL)
  }
}

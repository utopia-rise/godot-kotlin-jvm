// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

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

@GodotBaseType
public open class VelocityTracker3D : RefCounted() {
  public var trackPhysicsStep: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VELOCITYTRACKER3D_IS_TRACKING_PHYSICS_STEP, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VELOCITYTRACKER3D_SET_TRACK_PHYSICS_STEP, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VELOCITYTRACKER3D)
  }

  public fun updatePosition(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VELOCITYTRACKER3D_UPDATE_POSITION,
        NIL)
  }

  public fun getTrackedLinearVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_VELOCITYTRACKER3D_GET_TRACKED_LINEAR_VELOCITY, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public fun reset(position: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VELOCITYTRACKER3D_RESET, NIL)
  }

  public companion object
}

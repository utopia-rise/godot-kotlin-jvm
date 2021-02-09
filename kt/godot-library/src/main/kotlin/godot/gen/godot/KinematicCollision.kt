// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class KinematicCollision : Reference() {
  open val collider: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  open val colliderId: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_ID, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  open val colliderMetadata: Any?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_METADATA, ANY)
      return TransferContext.readReturnValue(ANY, true) as Any?
    }

  open val colliderShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  open val colliderShapeIndex: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_SHAPE_INDEX, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }

  open val colliderVelocity: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_COLLIDER_VELOCITY, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  open val localShape: Object?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_LOCAL_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Object?
    }

  open val normal: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_NORMAL,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  open val position: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_POSITION,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  open val remainder: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_REMAINDER,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  open val travel: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICCOLLISION_GET_TRAVEL,
          VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_KINEMATICCOLLISION)
}

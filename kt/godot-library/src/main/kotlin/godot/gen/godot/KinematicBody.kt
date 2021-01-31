// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class KinematicBody : PhysicsBody() {
  open var collision_safeMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_COLLISION_SAFE_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_COLLISION_SAFE_MARGIN, NIL)
    }

  open var moveLockX: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_MOVE_LOCK_X,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_MOVE_LOCK_X,
          NIL)
    }

  open var moveLockY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_MOVE_LOCK_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_MOVE_LOCK_Y,
          NIL)
    }

  open var moveLockZ: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_MOVE_LOCK_Z,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_SET_MOVE_LOCK_Z,
          NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_KINEMATICBODY)

  open fun getFloorNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_FLOOR_NORMAL,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getFloorVelocity(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_FLOOR_VELOCITY,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun getSlideCollision(slideIdx: Long): KinematicCollision? {
    TransferContext.writeArguments(LONG to slideIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_SLIDE_COLLISION,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision?
  }

  open fun getSlideCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_GET_SLIDE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun isOnCeiling(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_IS_ON_CEILING, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isOnFloor(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_IS_ON_FLOOR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isOnWall(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_IS_ON_WALL, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun moveAndCollide(
    relVec: Vector3,
    infiniteInertia: Boolean = true,
    excludeRaycastShapes: Boolean = true,
    testOnly: Boolean = false
  ): KinematicCollision? {
    TransferContext.writeArguments(VECTOR3 to relVec, BOOL to infiniteInertia, BOOL to
        excludeRaycastShapes, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_MOVE_AND_COLLIDE,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as KinematicCollision?
  }

  open fun moveAndSlide(
    linearVelocity: Vector3,
    upDirection: Vector3 = Vector3(0.0, 0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to linearVelocity, VECTOR3 to upDirection, BOOL to
        stopOnSlope, LONG to maxSlides, DOUBLE to floorMaxAngle, BOOL to infiniteInertia)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_MOVE_AND_SLIDE,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun moveAndSlideWithSnap(
    linearVelocity: Vector3,
    snap: Vector3,
    upDirection: Vector3 = Vector3(0.0, 0.0, 0.0),
    stopOnSlope: Boolean = false,
    maxSlides: Long = 4,
    floorMaxAngle: Double = 0.785398,
    infiniteInertia: Boolean = true
  ): Vector3 {
    TransferContext.writeArguments(VECTOR3 to linearVelocity, VECTOR3 to snap, VECTOR3 to
        upDirection, BOOL to stopOnSlope, LONG to maxSlides, DOUBLE to floorMaxAngle, BOOL to
        infiniteInertia)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_MOVE_AND_SLIDE_WITH_SNAP, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  open fun testMove(
    from: Transform,
    relVec: Vector3,
    infiniteInertia: Boolean = true
  ): Boolean {
    TransferContext.writeArguments(TRANSFORM to from, VECTOR3 to relVec, BOOL to infiniteInertia)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_KINEMATICBODY_TEST_MOVE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}

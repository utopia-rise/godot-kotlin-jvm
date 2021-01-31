// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.Signal3
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class CollisionObject2D : Node2D() {
  val inputEvent: Signal3<Node, InputEvent, Long> by signal("viewport", "event", "shape_idx")

  val mouseEntered: Signal0 by signal()

  val mouseExited: Signal0 by signal()

  open var inputPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_INPUT_PICKABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SET_INPUT_PICKABLE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_COLLISIONOBJECT2D)

  open fun _input_event(
    viewport: Object,
    event: InputEvent,
    shapeIdx: Long
  ) {
  }

  open fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_CREATE_SHAPE_OWNER, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getShapeOwnerOneWayCollisionMargin(ownerId: Long): Double {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_SHAPE_OWNER_ONE_WAY_COLLISION_MARGIN, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun getShapeOwners(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_GET_SHAPE_OWNERS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_IS_SHAPE_OWNER_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun isShapeOwnerOneWayCollisionEnabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_IS_SHAPE_OWNER_ONE_WAY_COLLISION_ENABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeShapeOwner(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_REMOVE_SHAPE_OWNER, NIL)
  }

  open fun shapeFindOwner(shapeIndex: Long): Long {
    TransferContext.writeArguments(LONG to shapeIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_FIND_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun shapeOwnerAddShape(ownerId: Long, shape: Shape2D) {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_ADD_SHAPE, NIL)
  }

  open fun shapeOwnerClearShapes(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_CLEAR_SHAPES, NIL)
  }

  open fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape2D? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
  }

  open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun shapeOwnerGetTransform(ownerId: Long): Transform2D {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_GET_TRANSFORM, TRANSFORM2D)
    return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
  }

  open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long) {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_REMOVE_SHAPE, NIL)
  }

  open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_DISABLED, NIL)
  }

  open fun shapeOwnerSetOneWayCollision(ownerId: Long, enable: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to enable)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_ONE_WAY_COLLISION, NIL)
  }

  open fun shapeOwnerSetOneWayCollisionMargin(ownerId: Long, margin: Double) {
    TransferContext.writeArguments(LONG to ownerId, DOUBLE to margin)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_ONE_WAY_COLLISION_MARGIN, NIL)
  }

  open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform2D) {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM2D to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT2D_SHAPE_OWNER_SET_TRANSFORM, NIL)
  }
}

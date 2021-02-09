// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.Transform
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.TRANSFORM
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.signals.Signal0
import godot.signals.Signal5
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class CollisionObject : Spatial() {
  val inputEvent: Signal5<Node, InputEvent, Vector3, Vector3, Long> by signal("camera", "event",
      "click_position", "click_normal", "shape_idx")

  val mouseEntered: Signal0 by signal()

  val mouseExited: Signal0 by signal()

  open var inputCaptureOnDrag: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_INPUT_CAPTURE_ON_DRAG, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_INPUT_CAPTURE_ON_DRAG, NIL)
    }

  open var inputRayPickable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_INPUT_RAY_PICKABLE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SET_INPUT_RAY_PICKABLE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_COLLISIONOBJECT)

  open fun _input_event(
    camera: Object,
    event: InputEvent,
    clickPosition: Vector3,
    clickNormal: Vector3,
    shapeIdx: Long
  ) {
  }

  open fun createShapeOwner(owner: Object): Long {
    TransferContext.writeArguments(OBJECT to owner)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_CREATE_SHAPE_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  open fun getShapeOwners(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_GET_SHAPE_OWNERS,
        ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  open fun isShapeOwnerDisabled(ownerId: Long): Boolean {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_IS_SHAPE_OWNER_DISABLED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  open fun removeShapeOwner(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_REMOVE_SHAPE_OWNER,
        NIL)
  }

  open fun shapeFindOwner(shapeIndex: Long): Long {
    TransferContext.writeArguments(LONG to shapeIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_FIND_OWNER,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun shapeOwnerAddShape(ownerId: Long, shape: Shape) {
    TransferContext.writeArguments(LONG to ownerId, OBJECT to shape)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_ADD_SHAPE, NIL)
  }

  open fun shapeOwnerClearShapes(ownerId: Long) {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_CLEAR_SHAPES, NIL)
  }

  open fun shapeOwnerGetOwner(ownerId: Long): Object? {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_OWNER, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Object?
  }

  open fun shapeOwnerGetShape(ownerId: Long, shapeId: Long): Shape? {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Shape?
  }

  open fun shapeOwnerGetShapeCount(ownerId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun shapeOwnerGetShapeIndex(ownerId: Long, shapeId: Long): Long {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_SHAPE_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  open fun shapeOwnerGetTransform(ownerId: Long): Transform {
    TransferContext.writeArguments(LONG to ownerId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_GET_TRANSFORM, TRANSFORM)
    return TransferContext.readReturnValue(TRANSFORM, false) as Transform
  }

  open fun shapeOwnerRemoveShape(ownerId: Long, shapeId: Long) {
    TransferContext.writeArguments(LONG to ownerId, LONG to shapeId)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_REMOVE_SHAPE, NIL)
  }

  open fun shapeOwnerSetDisabled(ownerId: Long, disabled: Boolean) {
    TransferContext.writeArguments(LONG to ownerId, BOOL to disabled)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_SET_DISABLED, NIL)
  }

  open fun shapeOwnerSetTransform(ownerId: Long, transform: Transform) {
    TransferContext.writeArguments(LONG to ownerId, TRANSFORM to transform)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_COLLISIONOBJECT_SHAPE_OWNER_SET_TRANSFORM, NIL)
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress

@GodotBaseType
open class CollisionShape2D : Node2D() {
  open var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_GET_DISABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_DISABLED,
          NIL)
    }

  open var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_GET_ONE_WAY_COLLISION, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(value) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_ONE_WAY_COLLISION, NIL)
    }

  open var oneWayCollisionMargin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_GET_ONE_WAY_COLLISION_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_ONE_WAY_COLLISION_MARGIN, NIL)
    }

  open var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_GET_SHAPE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shape2D?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_COLLISIONSHAPE2D_SET_SHAPE, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_COLLISIONSHAPE2D)

  open fun _shapeChanged() {
  }
}

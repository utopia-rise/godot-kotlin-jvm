// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName")

package godot

import godot.annotation.GodotBaseType
import godot.core.RID
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
open class SpringArm : Spatial() {
  open var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_COLLISION_MASK,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(value) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_COLLISION_MASK, NIL)
    }

  open var margin: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_MARGIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_MARGIN, NIL)
    }

  open var shape: Shape?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_SHAPE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Shape?
    }
    set(value) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_SHAPE, NIL)
    }

  open var springLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_SPRING_LENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(value) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_SET_SPRING_LENGTH, NIL)
    }

  override fun __new(): VoidPtr = TransferContext.invokeConstructor(ENGINECLASS_SPRINGARM)

  open fun addExcludedObject(RID: RID) {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_ADD_EXCLUDED_OBJECT, NIL)
  }

  open fun clearExcludedObjects() {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_CLEAR_EXCLUDED_OBJECTS,
        NIL)
  }

  open fun getHitLength(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_GET_HIT_LENGTH, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  open fun removeExcludedObject(RID: RID): Boolean {
    TransferContext.writeArguments(_RID to RID)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRINGARM_REMOVE_EXCLUDED_OBJECT,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }
}

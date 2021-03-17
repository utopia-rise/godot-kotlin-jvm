// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE")

package godot

import godot.annotation.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Suppress
import kotlin.Unit

/**
 * Segment shape for 2D collisions.
 *
 * Segment shape for 2D collisions. Consists of two points, `a` and `b`.
 */
@GodotBaseType
open class SegmentShape2D : Shape2D() {
  /**
   * The segment's first point position.
   */
  open var a: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_GET_A, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_SET_A, NIL)
    }

  /**
   * The segment's second point position.
   */
  open var b: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_GET_B, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(value) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_SET_B, NIL)
    }

  override fun __new() {
    callConstructor(ENGINECLASS_SEGMENTSHAPE2D)
  }

  open fun a(schedule: Vector2.() -> Unit): Vector2 = a.apply{
      schedule(this)
      a = this
  }


  open fun b(schedule: Vector2.() -> Unit): Vector2 = b.apply{
      schedule(this)
      b = this
  }

}

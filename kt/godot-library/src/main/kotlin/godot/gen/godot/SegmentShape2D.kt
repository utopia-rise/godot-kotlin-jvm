// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress

/**
 * Segment shape resource for 2D physics.
 *
 * 2D segment shape to be added as a *direct* child of a [godot.PhysicsBody2D] or [godot.Area2D] using a [godot.CollisionShape2D] node. Consists of two points, `a` and `b`.
 *
 * **Performance:** Being a primitive collision shape, [godot.SegmentShape2D] is fast to check collisions against (though not as fast as [godot.CircleShape2D]).
 */
@GodotBaseType
public open class SegmentShape2D : Shape2D() {
  /**
   * The segment's first point position.
   */
  public var a: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_GET_A, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_SET_A, NIL)
    }

  /**
   * The segment's second point position.
   */
  public var b: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_GET_B, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SEGMENTSHAPE2D_SET_B, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_SEGMENTSHAPE2D, scriptIndex)
    return true
  }

  public companion object
}

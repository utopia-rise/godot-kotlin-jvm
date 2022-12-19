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
 * Rectangle shape resource for 2D physics.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * 2D rectangle shape to be added as a *direct* child of a [godot.PhysicsBody2D] or [godot.Area2D] using a [godot.CollisionShape2D] node. This shape is useful for modeling box-like 2D objects.
 *
 * **Performance:** Being a primitive collision shape, [godot.RectangleShape2D] is fast to check collisions against (though not as fast as [godot.CircleShape2D]).
 */
@GodotBaseType
public open class RectangleShape2D : Shape2D() {
  /**
   * The rectangle's width and height.
   */
  public var size: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RECTANGLESHAPE2D_GET_SIZE,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RECTANGLESHAPE2D_SET_SIZE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_RECTANGLESHAPE2D, scriptIndex)
    return true
  }

  public companion object
}

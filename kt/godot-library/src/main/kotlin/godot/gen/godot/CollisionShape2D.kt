// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A node that provides a [godot.Shape2D] to a [godot.CollisionObject2D] parent.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/113](https://godotengine.org/asset-library/asset/113)
 *
 * A node that provides a [godot.Shape2D] to a [godot.CollisionObject2D] parent and allows to edit it. This can give a detection shape to an [godot.Area2D] or turn a [godot.PhysicsBody2D] into a solid object.
 */
@GodotBaseType
public open class CollisionShape2D : Node2D() {
  /**
   * The actual shape owned by this collision shape.
   */
  public var shape: Shape2D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Shape2D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  /**
   * A disabled collision shape has no effect in the world. This property should be changed with [godot.Object.setDeferred].
   */
  public var disabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
    }

  /**
   * Sets whether this collision shape should only detect collision on one side (top or bottom).
   *
   * **Note:** This property has no effect if this [godot.CollisionShape2D] is a child of an [godot.Area2D] node.
   */
  public var oneWayCollision: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOneWayCollisionEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionPtr, NIL)
    }

  /**
   * The margin used for one-way collision (in pixels). Higher values will make the shape thicker, and work better for colliders that enter the shape at a high velocity.
   */
  public var oneWayCollisionMargin: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOneWayCollisionMarginPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setOneWayCollisionMarginPtr, NIL)
    }

  /**
   * The collision shape debug color.
   *
   * **Note:** The default value is [godot.ProjectSettings.debug/shapes/collision/shapeColor]. The `Color(0, 0, 0, 1)` value documented here is a placeholder, and not the actual default debug color.
   */
  @CoreTypeLocalCopy
  public var debugColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugColorPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_COLLISIONSHAPE2D, scriptIndex)
    return true
  }

  /**
   * The collision shape debug color.
   *
   * **Note:** The default value is [godot.ProjectSettings.debug/shapes/collision/shapeColor]. The `Color(0, 0, 0, 1)` value documented here is a placeholder, and not the actual default debug color.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = collisionshape2d.debugColor
   * //Your changes
   * collisionshape2d.debugColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun debugColorMutate(block: Color.() -> Unit): Color = debugColor.apply{
      block(this)
      debugColor = this
  }


  public companion object

  internal object MethodBindings {
    public val setShapePtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionShape2D", "set_shape")

    public val getShapePtr: VoidPtr = TypeManager.getMethodBindPtr("CollisionShape2D", "get_shape")

    public val setDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_disabled")

    public val isDisabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "is_disabled")

    public val setOneWayCollisionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_one_way_collision")

    public val isOneWayCollisionEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "is_one_way_collision_enabled")

    public val setOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_one_way_collision_margin")

    public val getOneWayCollisionMarginPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "get_one_way_collision_margin")

    public val setDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "set_debug_color")

    public val getDebugColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("CollisionShape2D", "get_debug_color")
  }
}

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
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.COLOR
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.NIL
import godot.core.VariantParser.OBJECT
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

private const val ENGINE_CLASS_COLLISIONSHAPE2D_INDEX: Int = 177

/**
 * A node that provides a [Shape2D] to a [CollisionObject2D] parent and allows to edit it. This can
 * give a detection shape to an [Area2D] or turn a [PhysicsBody2D] into a solid object.
 */
@GodotBaseType
public open class CollisionShape2D : Node2D() {
  /**
   * The actual shape owned by this collision shape.
   */
  public final inline var shape: Shape2D?
    @JvmName("shapeProperty")
    get() = getShape()
    @JvmName("shapeProperty")
    set(`value`) {
      setShape(value)
    }

  /**
   * A disabled collision shape has no effect in the world. This property should be changed with
   * [Object.setDeferred].
   */
  public final inline var disabled: Boolean
    @JvmName("disabledProperty")
    get() = isDisabled()
    @JvmName("disabledProperty")
    set(`value`) {
      setDisabled(value)
    }

  /**
   * Sets whether this collision shape should only detect collision on one side (top or bottom).
   * **Note:** This property has no effect if this [CollisionShape2D] is a child of an [Area2D]
   * node.
   */
  public final inline var oneWayCollision: Boolean
    @JvmName("oneWayCollisionProperty")
    get() = isOneWayCollisionEnabled()
    @JvmName("oneWayCollisionProperty")
    set(`value`) {
      setOneWayCollision(value)
    }

  /**
   * The margin used for one-way collision (in pixels). Higher values will make the shape thicker,
   * and work better for colliders that enter the shape at a high velocity.
   */
  public final inline var oneWayCollisionMargin: Float
    @JvmName("oneWayCollisionMarginProperty")
    get() = getOneWayCollisionMargin()
    @JvmName("oneWayCollisionMarginProperty")
    set(`value`) {
      setOneWayCollisionMargin(value)
    }

  /**
   * The collision shape debug color.
   * **Note:** The default value is [ProjectSettings.debug/shapes/collision/shapeColor]. The
   * `Color(0, 0, 0, 1)` value documented here is a placeholder, and not the actual default debug
   * color.
   */
  @CoreTypeLocalCopy
  public final inline var debugColor: Color
    @JvmName("debugColorProperty")
    get() = getDebugColor()
    @JvmName("debugColorProperty")
    set(`value`) {
      setDebugColor(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_COLLISIONSHAPE2D_INDEX, scriptIndex)
  }

  /**
   * The collision shape debug color.
   * **Note:** The default value is [ProjectSettings.debug/shapes/collision/shapeColor]. The
   * `Color(0, 0, 0, 1)` value documented here is a placeholder, and not the actual default debug
   * color.
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
  public final fun debugColorMutate(block: Color.() -> Unit): Color = debugColor.apply{
      block(this)
      debugColor = this
  }


  public final fun setShape(shape: Shape2D?): Unit {
    Internals.writeArguments(OBJECT to shape)
    Internals.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
  }

  public final fun getShape(): Shape2D? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Shape2D?)
  }

  public final fun setDisabled(disabled: Boolean): Unit {
    Internals.writeArguments(BOOL to disabled)
    Internals.callMethod(rawPtr, MethodBindings.setDisabledPtr, NIL)
  }

  public final fun isDisabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isDisabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOneWayCollision(enabled: Boolean): Unit {
    Internals.writeArguments(BOOL to enabled)
    Internals.callMethod(rawPtr, MethodBindings.setOneWayCollisionPtr, NIL)
  }

  public final fun isOneWayCollisionEnabled(): Boolean {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.isOneWayCollisionEnabledPtr, BOOL)
    return (Internals.readReturnValue(BOOL) as Boolean)
  }

  public final fun setOneWayCollisionMargin(margin: Float): Unit {
    Internals.writeArguments(DOUBLE to margin.toDouble())
    Internals.callMethod(rawPtr, MethodBindings.setOneWayCollisionMarginPtr, NIL)
  }

  public final fun getOneWayCollisionMargin(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getOneWayCollisionMarginPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public final fun setDebugColor(color: Color): Unit {
    Internals.writeArguments(COLOR to color)
    Internals.callMethod(rawPtr, MethodBindings.setDebugColorPtr, NIL)
  }

  public final fun getDebugColor(): Color {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDebugColorPtr, COLOR)
    return (Internals.readReturnValue(COLOR) as Color)
  }

  public companion object

  internal object MethodBindings {
    public val setShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "set_shape", 771364740)

    public val getShapePtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "get_shape", 522005891)

    public val setDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "set_disabled", 2586408642)

    public val isDisabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "is_disabled", 36873697)

    public val setOneWayCollisionPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "set_one_way_collision", 2586408642)

    public val isOneWayCollisionEnabledPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "is_one_way_collision_enabled", 36873697)

    public val setOneWayCollisionMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "set_one_way_collision_margin", 373806689)

    public val getOneWayCollisionMarginPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "get_one_way_collision_margin", 1740695150)

    public val setDebugColorPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "set_debug_color", 2920490490)

    public val getDebugColorPtr: VoidPtr =
        Internals.getMethodBindPtr("CollisionShape2D", "get_debug_color", 3444240500)
  }
}

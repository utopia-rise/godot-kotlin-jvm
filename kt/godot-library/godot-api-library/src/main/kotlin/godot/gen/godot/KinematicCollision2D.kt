// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_KINEMATICCOLLISION2D_INDEX: Int = 342

/**
 * Holds collision data from the movement of a [PhysicsBody2D], usually from
 * [PhysicsBody2D.moveAndCollide]. When a [PhysicsBody2D] is moved, it stops if it detects a collision
 * with another body. If a collision is detected, a [KinematicCollision2D] object is returned.
 * The collision data includes the colliding object, the remaining motion, and the collision
 * position. This data can be used to determine a custom response to the collision.
 */
@GodotBaseType
public open class KinematicCollision2D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_KINEMATICCOLLISION2D_INDEX, scriptIndex)
  }

  /**
   * Returns the point of collision in global coordinates.
   */
  public final fun getPosition(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision.
   */
  public final fun getNormal(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getNormalPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public final fun getTravel(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTravelPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public final fun getRemainder(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRemainderPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the collision angle according to [upDirection], which is [Vector2.UP] by default. This
   * value is always positive.
   */
  @JvmOverloads
  public final fun getAngle(upDirection: Vector2 = Vector2(0, -1)): Float {
    Internals.writeArguments(VECTOR2 to upDirection)
    Internals.callMethod(rawPtr, MethodBindings.getAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the colliding body's length of overlap along the collision normal.
   */
  public final fun getDepth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the moving object's colliding shape.
   */
  public final fun getLocalShape(): Object? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getLocalShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's attached [Object].
   */
  public final fun getCollider(): Object? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object]. See
   * [Object.getInstanceId].
   */
  public final fun getColliderId(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer2D].
   */
  public final fun getColliderRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's shape.
   */
  public final fun getColliderShape(): Object? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index. See [CollisionObject2D].
   */
  public final fun getColliderShapeIndex(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderShapeIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the colliding body's velocity.
   */
  public final fun getColliderVelocity(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  public companion object

  public object MethodBindings {
    internal val getPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_position", 3341600327)

    internal val getNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_normal", 3341600327)

    internal val getTravelPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_travel", 3341600327)

    internal val getRemainderPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_remainder", 3341600327)

    internal val getAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_angle", 2841063350)

    internal val getDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_depth", 1740695150)

    internal val getLocalShapePtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_local_shape", 1981248198)

    internal val getColliderPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_collider", 1981248198)

    internal val getColliderIdPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_collider_id", 3905245786)

    internal val getColliderRidPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_collider_rid", 2944877500)

    internal val getColliderShapePtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_collider_shape", 1981248198)

    internal val getColliderShapeIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_collider_shape_index", 3905245786)

    internal val getColliderVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision2D", "get_collider_velocity", 3341600327)
  }
}

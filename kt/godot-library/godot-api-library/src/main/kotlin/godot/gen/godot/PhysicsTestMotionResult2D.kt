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

private const val ENGINE_CLASS_PHYSICSTESTMOTIONRESULT2D_INDEX: Int = 480

/**
 * Describes the motion and collision result from [PhysicsServer2D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionResult2D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSTESTMOTIONRESULT2D_INDEX, scriptIndex)
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
   * Returns the point of collision in global coordinates, if a collision occurred.
   */
  public final fun getCollisionPoint(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision, if a collision occurred.
   */
  public final fun getCollisionNormal(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the colliding body's velocity, if a collision occurred.
   */
  public final fun getColliderVelocity(): Vector2 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderVelocityPtr, VECTOR2)
    return (Internals.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object], if a collision
   * occurred. See [Object.getInstanceId].
   */
  public final fun getColliderId(): Long {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer2D], if a collision occurred.
   */
  public final fun getColliderRid(): RID {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's attached [Object], if a collision occurred.
   */
  public final fun getCollider(): Object? {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index, if a collision occurred. See [CollisionObject2D].
   */
  public final fun getColliderShape(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the moving object's colliding shape, if a collision occurred.
   */
  public final fun getCollisionLocalShape(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLocalShapePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the length of overlap along the collision normal, if a collision occurred.
   */
  public final fun getCollisionDepth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionDepthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the maximum fraction of the motion that can occur without a collision, between `0` and
   * `1`.
   */
  public final fun getCollisionSafeFraction(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionSafeFractionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the minimum fraction of the motion needed to collide, if a collision occurred, between
   * `0` and `1`.
   */
  public final fun getCollisionUnsafeFraction(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionUnsafeFractionPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val getTravelPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_travel", 3341600327)

    internal val getRemainderPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_remainder", 3341600327)

    internal val getCollisionPointPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_point", 3341600327)

    internal val getCollisionNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_normal", 3341600327)

    internal val getColliderVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_velocity", 3341600327)

    internal val getColliderIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_id", 3905245786)

    internal val getColliderRidPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_rid", 2944877500)

    internal val getColliderPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider", 1981248198)

    internal val getColliderShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_shape", 3905245786)

    internal val getCollisionLocalShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_local_shape", 3905245786)

    internal val getCollisionDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_depth", 1740695150)

    internal val getCollisionSafeFractionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_safe_fraction", 1740695150)

    internal val getCollisionUnsafeFractionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_unsafe_fraction", 1740695150)
  }
}

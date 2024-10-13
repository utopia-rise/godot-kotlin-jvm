// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR2
import godot.core.VariantParser._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Describes the motion and collision result from [PhysicsServer2D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionResult2D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONRESULT2D, scriptIndex)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public final fun getTravel(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTravelPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public final fun getRemainder(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRemainderPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the point of collision in global coordinates, if a collision occurred.
   */
  public final fun getCollisionPoint(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPointPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision, if a collision occurred.
   */
  public final fun getCollisionNormal(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionNormalPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the colliding body's velocity, if a collision occurred.
   */
  public final fun getColliderVelocity(): Vector2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColliderVelocityPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2) as Vector2)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object], if a collision
   * occurred. See [Object.getInstanceId].
   */
  public final fun getColliderId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer2D], if a collision occurred.
   */
  public final fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's attached [Object], if a collision occurred.
   */
  public final fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index, if a collision occurred. See [CollisionObject2D].
   */
  public final fun getColliderShape(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the moving object's colliding shape, if a collision occurred.
   */
  public final fun getCollisionLocalShape(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLocalShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the length of overlap along the collision normal, if a collision occurred.
   */
  public final fun getCollisionDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the maximum fraction of the motion that can occur without a collision, between `0` and
   * `1`.
   */
  public final fun getCollisionSafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionSafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the minimum fraction of the motion needed to collide, if a collision occurred, between
   * `0` and `1`.
   */
  public final fun getCollisionUnsafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionUnsafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val getTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_travel", 3341600327)

    public val getRemainderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_remainder", 3341600327)

    public val getCollisionPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_point", 3341600327)

    public val getCollisionNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_normal", 3341600327)

    public val getColliderVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_velocity", 3341600327)

    public val getColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_id", 3905245786)

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_rid", 2944877500)

    public val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider", 1981248198)

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collider_shape", 3905245786)

    public val getCollisionLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_local_shape", 3905245786)

    public val getCollisionDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_depth", 1740695150)

    public val getCollisionSafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_safe_fraction", 1740695150)

    public val getCollisionUnsafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult2D", "get_collision_unsafe_fraction", 1740695150)
  }
}

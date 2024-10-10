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
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.util.Internals
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

private const val ENGINE_CLASS_PHYSICSTESTMOTIONRESULT3D_INDEX: Int = 432

/**
 * Describes the motion and collision result from [PhysicsServer3D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionResult3D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    Internals.callConstructor(this, ENGINE_CLASS_PHYSICSTESTMOTIONRESULT3D_INDEX, scriptIndex)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public final fun getTravel(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getTravelPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public final fun getRemainder(): Vector3 {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getRemainderPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
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

  /**
   * Returns the number of detected collisions.
   */
  public final fun getCollisionCount(): Int {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getCollisionCountPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the point of collision in global coordinates given a collision index (the deepest
   * collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionPoint(collisionIndex: Int = 0): Vector3 {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index
   * (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionNormal(collisionIndex: Int = 0): Vector3 {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by
   * default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getColliderVelocity(collisionIndex: Int = 0): Vector3 {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderVelocityPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object] given a collision
   * index (the deepest collision by default), if a collision occurred. See [Object.getInstanceId].
   */
  @JvmOverloads
  public final fun getColliderId(collisionIndex: Int = 0): Long {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer3D] given a collision index (the
   * deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getColliderRid(collisionIndex: Int = 0): RID {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's attached [Object] given a collision index (the deepest collision
   * by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollider(collisionIndex: Int = 0): Object? {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by
   * default), if a collision occurred. See [CollisionObject3D].
   */
  @JvmOverloads
  public final fun getColliderShape(collisionIndex: Int = 0): Int {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by
   * default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionLocalShape(collisionIndex: Int = 0): Int {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionLocalShapePtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the length of overlap along the collision normal given a collision index (the deepest
   * collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionDepth(collisionIndex: Int = 0): Float {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getCollisionDepthPtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val getTravelPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_travel", 3360562783)

    public val getRemainderPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_remainder", 3360562783)

    public val getCollisionSafeFractionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_safe_fraction", 1740695150)

    public val getCollisionUnsafeFractionPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_unsafe_fraction", 1740695150)

    public val getCollisionCountPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_count", 3905245786)

    public val getCollisionPointPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_point", 1914908202)

    public val getCollisionNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_normal", 1914908202)

    public val getColliderVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_velocity", 1914908202)

    public val getColliderIdPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_id", 1591665591)

    public val getColliderRidPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_rid", 1231817359)

    public val getColliderPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider", 2639523548)

    public val getColliderShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_shape", 1591665591)

    public val getCollisionLocalShapePtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_local_shape", 1591665591)

    public val getCollisionDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_depth", 218038398)
  }
}

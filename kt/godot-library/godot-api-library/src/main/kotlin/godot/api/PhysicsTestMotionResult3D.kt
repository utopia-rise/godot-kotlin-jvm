// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot.api

import godot.`annotation`.GodotBaseType
import godot.`internal`.memory.TransferContext
import godot.`internal`.reflection.TypeManager
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Describes the motion and collision result from [PhysicsServer3D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionResult3D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    createNativeObject(481, scriptIndex)
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public final fun getTravel(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getTravelPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public final fun getRemainder(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getRemainderPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
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

  /**
   * Returns the number of detected collisions.
   */
  public final fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the point of collision in global coordinates given a collision index (the deepest
   * collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionPoint(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index
   * (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionNormal(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by
   * default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getColliderVelocity(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object] given a collision
   * index (the deepest collision by default), if a collision occurred. See [Object.getInstanceId].
   */
  @JvmOverloads
  public final fun getColliderId(collisionIndex: Int = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer3D] given a collision index (the
   * deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getColliderRid(collisionIndex: Int = 0): RID {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's attached [Object] given a collision index (the deepest collision
   * by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollider(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by
   * default), if a collision occurred. See [CollisionObject3D].
   */
  @JvmOverloads
  public final fun getColliderShape(collisionIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by
   * default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionLocalShape(collisionIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionLocalShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the length of overlap along the collision normal given a collision index (the deepest
   * collision by default), if a collision occurred.
   */
  @JvmOverloads
  public final fun getCollisionDepth(collisionIndex: Int = 0): Float {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getCollisionDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  public companion object

  public object MethodBindings {
    internal val getTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_travel", 3360562783)

    internal val getRemainderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_remainder", 3360562783)

    internal val getCollisionSafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_safe_fraction", 1740695150)

    internal val getCollisionUnsafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_unsafe_fraction", 1740695150)

    internal val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_count", 3905245786)

    internal val getCollisionPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_point", 1914908202)

    internal val getCollisionNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_normal", 1914908202)

    internal val getColliderVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_velocity", 1914908202)

    internal val getColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_id", 1591665591)

    internal val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_rid", 1231817359)

    internal val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider", 2639523548)

    internal val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_shape", 1591665591)

    internal val getCollisionLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_local_shape", 1591665591)

    internal val getCollisionDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_depth", 218038398)
  }
}

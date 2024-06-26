// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.jvm.JvmOverloads

/**
 * Describes the motion and collision result from [godot.PhysicsServer3D.bodyTestMotion].
 *
 * Describes the motion and collision result from [godot.PhysicsServer3D.bodyTestMotion].
 */
@GodotBaseType
public open class PhysicsTestMotionResult3D : RefCounted() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_PHYSICSTESTMOTIONRESULT3D, scriptIndex)
    return true
  }

  /**
   * Returns the moving object's travel before collision.
   */
  public fun getTravel(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTravelPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the moving object's remaining movement vector.
   */
  public fun getRemainder(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRemainderPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the maximum fraction of the motion that can occur without a collision, between `0` and `1`.
   */
  public fun getCollisionSafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionSafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the minimum fraction of the motion needed to collide, if a collision occurred, between `0` and `1`.
   */
  public fun getCollisionUnsafeFraction(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionUnsafeFractionPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the number of detected collisions.
   */
  public fun getCollisionCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the point of collision in global coordinates given a collision index (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public fun getCollisionPoint(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public fun getCollisionNormal(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public fun getColliderVelocity(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [godot.Object] given a collision index (the deepest collision by default), if a collision occurred. See [godot.Object.getInstanceId].
   */
  @JvmOverloads
  public fun getColliderId(collisionIndex: Int = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [godot.PhysicsServer3D] given a collision index (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public fun getColliderRid(collisionIndex: Int = 0): RID {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the colliding body's attached [godot.Object] given a collision index (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public fun getCollider(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by default), if a collision occurred. See [godot.CollisionObject3D].
   */
  @JvmOverloads
  public fun getColliderShape(collisionIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public fun getCollisionLocalShape(collisionIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionLocalShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the length of overlap along the collision normal given a collision index (the deepest collision by default), if a collision occurred.
   */
  @JvmOverloads
  public fun getCollisionDepth(collisionIndex: Int = 0): Float {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionDepthPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  public companion object

  internal object MethodBindings {
    public val getTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_travel")

    public val getRemainderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_remainder")

    public val getCollisionSafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_safe_fraction")

    public val getCollisionUnsafeFractionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_unsafe_fraction")

    public val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_count")

    public val getCollisionPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_point")

    public val getCollisionNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_normal")

    public val getColliderVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_velocity")

    public val getColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_id")

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_rid")

    public val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider")

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collider_shape")

    public val getCollisionLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_local_shape")

    public val getCollisionDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("PhysicsTestMotionResult3D", "get_collision_depth")
  }
}

// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.common.interop.VoidPtr
import godot.core.RID
import godot.internal.reflection.TypeManager
import godot.core.VariantParser.DOUBLE
import godot.core.VariantParser.LONG
import godot.core.VariantParser.OBJECT
import godot.core.VariantParser.VECTOR3
import godot.core.VariantParser._RID
import godot.core.Vector3
import godot.internal.memory.TransferContext
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * Holds collision data from the movement of a [PhysicsBody3D], usually from
 * [PhysicsBody3D.moveAndCollide]. When a [PhysicsBody3D] is moved, it stops if it detects a collision
 * with another body. If a collision is detected, a [KinematicCollision3D] object is returned.
 * The collision data includes the colliding object, the remaining motion, and the collision
 * position. This data can be used to determine a custom response to the collision.
 */
@GodotBaseType
public open class KinematicCollision3D : RefCounted() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_KINEMATICCOLLISION3D, scriptIndex)
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
   * Returns the colliding body's length of overlap along the collision normal.
   */
  public final fun getDepth(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(ptr, MethodBindings.getDepthPtr, DOUBLE)
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
   * collision by default).
   */
  @JvmOverloads
  public final fun getPosition(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getPositionPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index
   * (the deepest collision by default).
   */
  @JvmOverloads
  public final fun getNormal(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the collision angle according to [upDirection], which is [Vector3.UP] by default. This
   * value is always positive.
   */
  @JvmOverloads
  public final fun getAngle(collisionIndex: Int = 0, upDirection: Vector3 = Vector3(0, 1, 0)):
      Float {
    TransferContext.writeArguments(LONG to collisionIndex.toLong(), VECTOR3 to upDirection)
    TransferContext.callMethod(ptr, MethodBindings.getAnglePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by
   * default).
   */
  @JvmOverloads
  public final fun getLocalShape(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getLocalShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's attached [Object] given a collision index (the deepest collision
   * by default).
   */
  @JvmOverloads
  public final fun getCollider(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object] given a collision
   * index (the deepest collision by default). See [Object.getInstanceId].
   */
  @JvmOverloads
  public final fun getColliderId(collisionIndex: Int = 0): Long {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer3D] given a collision index (the
   * deepest collision by default).
   */
  @JvmOverloads
  public final fun getColliderRid(collisionIndex: Int = 0): RID {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's shape given a collision index (the deepest collision by default).
   */
  @JvmOverloads
  public final fun getColliderShape(collisionIndex: Int = 0): Object? {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderShapePtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by
   * default). See [CollisionObject3D].
   */
  @JvmOverloads
  public final fun getColliderShapeIndex(collisionIndex: Int = 0): Int {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderShapeIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by
   * default).
   */
  @JvmOverloads
  public final fun getColliderVelocity(collisionIndex: Int = 0): Vector3 {
    TransferContext.writeArguments(LONG to collisionIndex.toLong())
    TransferContext.callMethod(ptr, MethodBindings.getColliderVelocityPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3) as Vector3)
  }

  public companion object

  internal object MethodBindings {
    public val getTravelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_travel", 3360562783)

    public val getRemainderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_remainder", 3360562783)

    public val getDepthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_depth", 1740695150)

    public val getCollisionCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collision_count", 3905245786)

    public val getPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_position", 1914908202)

    public val getNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_normal", 1914908202)

    public val getAnglePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_angle", 1242741860)

    public val getLocalShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_local_shape", 2639523548)

    public val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider", 2639523548)

    public val getColliderIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_id", 1591665591)

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_rid", 1231817359)

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_shape", 2639523548)

    public val getColliderShapeIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_shape_index", 1591665591)

    public val getColliderVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("KinematicCollision3D", "get_collider_velocity", 1914908202)
  }
}

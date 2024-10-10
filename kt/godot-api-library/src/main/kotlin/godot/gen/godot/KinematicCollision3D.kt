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

private const val ENGINE_CLASS_KINEMATICCOLLISION3D_INDEX: Int = 311

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
    Internals.callConstructor(this, ENGINE_CLASS_KINEMATICCOLLISION3D_INDEX, scriptIndex)
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
   * Returns the colliding body's length of overlap along the collision normal.
   */
  public final fun getDepth(): Float {
    Internals.writeArguments()
    Internals.callMethod(rawPtr, MethodBindings.getDepthPtr, DOUBLE)
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
   * collision by default).
   */
  @JvmOverloads
  public final fun getPosition(collisionIndex: Int = 0): Vector3 {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getPositionPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the colliding body's shape's normal at the point of collision given a collision index
   * (the deepest collision by default).
   */
  @JvmOverloads
  public final fun getNormal(collisionIndex: Int = 0): Vector3 {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getNormalPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  /**
   * Returns the collision angle according to [upDirection], which is [Vector3.UP] by default. This
   * value is always positive.
   */
  @JvmOverloads
  public final fun getAngle(collisionIndex: Int = 0, upDirection: Vector3 = Vector3(0, 1, 0)):
      Float {
    Internals.writeArguments(LONG to collisionIndex.toLong(), VECTOR3 to upDirection)
    Internals.callMethod(rawPtr, MethodBindings.getAnglePtr, DOUBLE)
    return (Internals.readReturnValue(DOUBLE) as Double).toFloat()
  }

  /**
   * Returns the moving object's colliding shape given a collision index (the deepest collision by
   * default).
   */
  @JvmOverloads
  public final fun getLocalShape(collisionIndex: Int = 0): Object? {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getLocalShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's attached [Object] given a collision index (the deepest collision
   * by default).
   */
  @JvmOverloads
  public final fun getCollider(collisionIndex: Int = 0): Object? {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the unique instance ID of the colliding body's attached [Object] given a collision
   * index (the deepest collision by default). See [Object.getInstanceId].
   */
  @JvmOverloads
  public final fun getColliderId(collisionIndex: Int = 0): Long {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderIdPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the colliding body's [RID] used by the [PhysicsServer3D] given a collision index (the
   * deepest collision by default).
   */
  @JvmOverloads
  public final fun getColliderRid(collisionIndex: Int = 0): RID {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (Internals.readReturnValue(_RID) as RID)
  }

  /**
   * Returns the colliding body's shape given a collision index (the deepest collision by default).
   */
  @JvmOverloads
  public final fun getColliderShape(collisionIndex: Int = 0): Object? {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderShapePtr, OBJECT)
    return (Internals.readReturnValue(OBJECT) as Object?)
  }

  /**
   * Returns the colliding body's shape index given a collision index (the deepest collision by
   * default). See [CollisionObject3D].
   */
  @JvmOverloads
  public final fun getColliderShapeIndex(collisionIndex: Int = 0): Int {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderShapeIndexPtr, LONG)
    return (Internals.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the colliding body's velocity given a collision index (the deepest collision by
   * default).
   */
  @JvmOverloads
  public final fun getColliderVelocity(collisionIndex: Int = 0): Vector3 {
    Internals.writeArguments(LONG to collisionIndex.toLong())
    Internals.callMethod(rawPtr, MethodBindings.getColliderVelocityPtr, VECTOR3)
    return (Internals.readReturnValue(VECTOR3) as Vector3)
  }

  public companion object

  internal object MethodBindings {
    public val getTravelPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_travel", 3360562783)

    public val getRemainderPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_remainder", 3360562783)

    public val getDepthPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_depth", 1740695150)

    public val getCollisionCountPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_collision_count", 3905245786)

    public val getPositionPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_position", 1914908202)

    public val getNormalPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_normal", 1914908202)

    public val getAnglePtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_angle", 1242741860)

    public val getLocalShapePtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_local_shape", 2639523548)

    public val getColliderPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_collider", 2639523548)

    public val getColliderIdPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_collider_id", 1591665591)

    public val getColliderRidPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_collider_rid", 1231817359)

    public val getColliderShapePtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_collider_shape", 2639523548)

    public val getColliderShapeIndexPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_collider_shape_index", 1591665591)

    public val getColliderVelocityPtr: VoidPtr =
        Internals.getMethodBindPtr("KinematicCollision3D", "get_collider_velocity", 1914908202)
  }
}
